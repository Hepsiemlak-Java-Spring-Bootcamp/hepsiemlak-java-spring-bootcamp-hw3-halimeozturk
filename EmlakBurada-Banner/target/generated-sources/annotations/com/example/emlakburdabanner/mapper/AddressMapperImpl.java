package com.example.emlakburdabanner.mapper;

import com.example.emlakburdabanner.dto.AddressDTO;
import com.example.emlakburdabanner.model.Address;
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
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address toEntity(AddressDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( dto.getId() );
        if ( dto.getModificationDate() != null ) {
            address.setModificationDate( Date.from( dto.getModificationDate().toInstant() ) );
        }
        address.setProvince( dto.getProvince() );
        address.setDistrict( dto.getDistrict() );
        address.setFullAddress( dto.getFullAddress() );

        return address;
    }

    @Override
    public AddressDTO toDTO(Address entity) {
        if ( entity == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( entity.getId() );
        if ( entity.getCreationDate() != null ) {
            addressDTO.setCreationDate( ZonedDateTime.ofInstant( entity.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( entity.getModificationDate() != null ) {
            addressDTO.setModificationDate( ZonedDateTime.ofInstant( entity.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        addressDTO.setProvince( entity.getProvince() );
        addressDTO.setDistrict( entity.getDistrict() );
        addressDTO.setFullAddress( entity.getFullAddress() );

        return addressDTO;
    }

    @Override
    public List<Address> toEntityList(List<AddressDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Address> list = new ArrayList<Address>( dtoList.size() );
        for ( AddressDTO addressDTO : dtoList ) {
            list.add( toEntity( addressDTO ) );
        }

        return list;
    }

    @Override
    public List<AddressDTO> toDTOList(List<Address> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AddressDTO> list = new ArrayList<AddressDTO>( entityList.size() );
        for ( Address address : entityList ) {
            list.add( toDTO( address ) );
        }

        return list;
    }
}
