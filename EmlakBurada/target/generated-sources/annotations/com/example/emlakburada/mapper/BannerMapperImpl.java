package com.example.emlakburada.mapper;

import com.example.emlakburada.client.dto.AddressDTO;
import com.example.emlakburada.client.dto.BannerDTO;
import com.example.emlakburada.model.Address;
import com.example.emlakburada.model.Advert;
import com.example.emlakburada.model.RealEstate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-20T23:02:34+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class BannerMapperImpl implements BannerMapper {

    @Override
    public BannerDTO toDTO(Advert entity) {
        if ( entity == null ) {
            return null;
        }

        BannerDTO bannerDTO = new BannerDTO();

        if ( entity.getAdvertNo() != null ) {
            bannerDTO.setAdvertNo( entity.getAdvertNo() );
        }
        bannerDTO.setAddress( addressToAddressDTO( entityRealEstatesAddress( entity ) ) );

        return bannerDTO;
    }

    private Address entityRealEstatesAddress(Advert advert) {
        if ( advert == null ) {
            return null;
        }
        RealEstate realEstates = advert.getRealEstates();
        if ( realEstates == null ) {
            return null;
        }
        Address address = realEstates.getAddress();
        if ( address == null ) {
            return null;
        }
        return address;
    }

    protected AddressDTO addressToAddressDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( address.getId() );
        if ( address.getCreationDate() != null ) {
            addressDTO.setCreationDate( ZonedDateTime.ofInstant( address.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( address.getModificationDate() != null ) {
            addressDTO.setModificationDate( ZonedDateTime.ofInstant( address.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        addressDTO.setProvince( address.getProvince() );
        addressDTO.setDistrict( address.getDistrict() );
        addressDTO.setFullAddress( address.getFullAddress() );

        return addressDTO;
    }
}
