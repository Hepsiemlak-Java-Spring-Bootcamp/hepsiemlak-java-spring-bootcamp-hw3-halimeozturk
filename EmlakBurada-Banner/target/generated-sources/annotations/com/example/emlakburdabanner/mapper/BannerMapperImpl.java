package com.example.emlakburdabanner.mapper;

import com.example.emlakburdabanner.dto.AddressDTO;
import com.example.emlakburdabanner.dto.BannerDTO;
import com.example.emlakburdabanner.model.Address;
import com.example.emlakburdabanner.model.Banner;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-20T16:44:33+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class BannerMapperImpl implements BannerMapper {

    @Override
    public Banner toEntity(BannerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Banner banner = new Banner();

        banner.setId( dto.getId() );
        if ( dto.getModificationDate() != null ) {
            banner.setModificationDate( Date.from( dto.getModificationDate().toInstant() ) );
        }
        banner.setAdvertNo( dto.getAdvertNo() );
        banner.setPhone( dto.getPhone() );
        banner.setTotal( dto.getTotal() );
        banner.setAddress( addressDTOToAddress( dto.getAddress() ) );

        return banner;
    }

    @Override
    public BannerDTO toDTO(Banner entity) {
        if ( entity == null ) {
            return null;
        }

        BannerDTO bannerDTO = new BannerDTO();

        bannerDTO.setId( entity.getId() );
        if ( entity.getCreationDate() != null ) {
            bannerDTO.setCreationDate( ZonedDateTime.ofInstant( entity.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( entity.getModificationDate() != null ) {
            bannerDTO.setModificationDate( ZonedDateTime.ofInstant( entity.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        bannerDTO.setAdvertNo( entity.getAdvertNo() );
        bannerDTO.setPhone( entity.getPhone() );
        bannerDTO.setTotal( entity.getTotal() );
        bannerDTO.setAddress( addressToAddressDTO( entity.getAddress() ) );

        return bannerDTO;
    }

    @Override
    public List<Banner> toEntityList(List<BannerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Banner> list = new ArrayList<Banner>( dtoList.size() );
        for ( BannerDTO bannerDTO : dtoList ) {
            list.add( toEntity( bannerDTO ) );
        }

        return list;
    }

    @Override
    public List<BannerDTO> toDTOList(List<Banner> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<BannerDTO> list = new ArrayList<BannerDTO>( entityList.size() );
        for ( Banner banner : entityList ) {
            list.add( toDTO( banner ) );
        }

        return list;
    }

    protected Address addressDTOToAddress(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDTO.getId() );
        if ( addressDTO.getCreationDate() != null ) {
            address.setCreationDate( Date.from( addressDTO.getCreationDate().toInstant() ) );
        }
        if ( addressDTO.getModificationDate() != null ) {
            address.setModificationDate( Date.from( addressDTO.getModificationDate().toInstant() ) );
        }
        address.setProvince( addressDTO.getProvince() );
        address.setDistrict( addressDTO.getDistrict() );
        address.setFullAddress( addressDTO.getFullAddress() );

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
