package com.example.emlakburada.mapper;

import com.example.emlakburada.dto.AddressDTO;
import com.example.emlakburada.dto.CategoryDTO;
import com.example.emlakburada.dto.RealEstateDTO;
import com.example.emlakburada.model.Address;
import com.example.emlakburada.model.Category;
import com.example.emlakburada.model.RealEstate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-20T23:02:33+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class RealEstateMapperImpl implements RealEstateMapper {

    @Autowired
    private ImageMapper imageMapper;

    @Override
    public RealEstate toEntity(RealEstateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        RealEstate realEstate = new RealEstate();

        realEstate.setId( dto.getId() );
        if ( dto.getModificationDate() != null ) {
            realEstate.setModificationDate( Date.from( dto.getModificationDate().toInstant() ) );
        }
        realEstate.setCurrency( dto.getCurrency() );
        realEstate.setPrice( dto.getPrice() );
        realEstate.setDescription( dto.getDescription() );
        realEstate.setRoom( dto.getRoom() );
        realEstate.setLivingRoom( dto.getLivingRoom() );
        realEstate.setAge( dto.getAge() );
        realEstate.setBathRoom( dto.getBathRoom() );
        realEstate.setImageList( imageMapper.toEntityList( dto.getImageList() ) );
        realEstate.setFloor( dto.getFloor() );
        realEstate.setNumberOfFloor( dto.getNumberOfFloor() );
        realEstate.setNetSquareMeters( dto.getNetSquareMeters() );
        realEstate.setSquareMeters( dto.getSquareMeters() );
        realEstate.setPublicationType( dto.getPublicationType() );
        realEstate.setBuildType( dto.getBuildType() );
        realEstate.setBuildState( dto.getBuildState() );
        realEstate.setAddress( addressDTOToAddress( dto.getAddress() ) );
        realEstate.setMainCategory( categoryDTOToCategory( dto.getMainCategory() ) );
        realEstate.setSubCategory( categoryDTOToCategory( dto.getSubCategory() ) );
        realEstate.setRoomAndLivingRoom( dto.getRoomAndLivingRoom() );

        return realEstate;
    }

    @Override
    public RealEstateDTO toDTO(RealEstate entity) {
        if ( entity == null ) {
            return null;
        }

        RealEstateDTO realEstateDTO = new RealEstateDTO();

        realEstateDTO.setId( entity.getId() );
        if ( entity.getCreationDate() != null ) {
            realEstateDTO.setCreationDate( ZonedDateTime.ofInstant( entity.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( entity.getModificationDate() != null ) {
            realEstateDTO.setModificationDate( ZonedDateTime.ofInstant( entity.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        realEstateDTO.setCurrency( entity.getCurrency() );
        realEstateDTO.setPrice( entity.getPrice() );
        realEstateDTO.setDescription( entity.getDescription() );
        realEstateDTO.setRoom( entity.getRoom() );
        realEstateDTO.setLivingRoom( entity.getLivingRoom() );
        realEstateDTO.setAge( entity.getAge() );
        realEstateDTO.setBathRoom( entity.getBathRoom() );
        realEstateDTO.setImageList( imageMapper.toDTOList( entity.getImageList() ) );
        realEstateDTO.setFloor( entity.getFloor() );
        realEstateDTO.setNumberOfFloor( entity.getNumberOfFloor() );
        realEstateDTO.setNetSquareMeters( entity.getNetSquareMeters() );
        realEstateDTO.setSquareMeters( entity.getSquareMeters() );
        realEstateDTO.setPublicationType( entity.getPublicationType() );
        realEstateDTO.setBuildType( entity.getBuildType() );
        realEstateDTO.setBuildState( entity.getBuildState() );
        realEstateDTO.setAddress( addressToAddressDTO( entity.getAddress() ) );
        realEstateDTO.setMainCategory( categoryToCategoryDTO( entity.getMainCategory() ) );
        realEstateDTO.setSubCategory( categoryToCategoryDTO( entity.getSubCategory() ) );
        realEstateDTO.setRoomAndLivingRoom( entity.getRoomAndLivingRoom() );

        return realEstateDTO;
    }

    @Override
    public List<RealEstate> toEntityList(List<RealEstateDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<RealEstate> list = new ArrayList<RealEstate>( dtoList.size() );
        for ( RealEstateDTO realEstateDTO : dtoList ) {
            list.add( toEntity( realEstateDTO ) );
        }

        return list;
    }

    @Override
    public List<RealEstateDTO> toDTOList(List<RealEstate> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RealEstateDTO> list = new ArrayList<RealEstateDTO>( entityList.size() );
        for ( RealEstate realEstate : entityList ) {
            list.add( toDTO( realEstate ) );
        }

        return list;
    }

    @Override
    public RealEstateDTO toAdvertDTO(RealEstate entity) {
        if ( entity == null ) {
            return null;
        }

        RealEstateDTO realEstateDTO = new RealEstateDTO();

        realEstateDTO.setId( entity.getId() );
        if ( entity.getCreationDate() != null ) {
            realEstateDTO.setCreationDate( ZonedDateTime.ofInstant( entity.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( entity.getModificationDate() != null ) {
            realEstateDTO.setModificationDate( ZonedDateTime.ofInstant( entity.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        realEstateDTO.setCurrency( entity.getCurrency() );
        realEstateDTO.setPrice( entity.getPrice() );
        realEstateDTO.setDescription( entity.getDescription() );
        realEstateDTO.setRoom( entity.getRoom() );
        realEstateDTO.setLivingRoom( entity.getLivingRoom() );
        realEstateDTO.setAge( entity.getAge() );
        realEstateDTO.setBathRoom( entity.getBathRoom() );
        realEstateDTO.setImageList( imageMapper.toDTOList( entity.getImageList() ) );
        realEstateDTO.setFloor( entity.getFloor() );
        realEstateDTO.setNumberOfFloor( entity.getNumberOfFloor() );
        realEstateDTO.setNetSquareMeters( entity.getNetSquareMeters() );
        realEstateDTO.setSquareMeters( entity.getSquareMeters() );
        realEstateDTO.setPublicationType( entity.getPublicationType() );
        realEstateDTO.setBuildType( entity.getBuildType() );
        realEstateDTO.setBuildState( entity.getBuildState() );
        realEstateDTO.setAddress( addressToAddressDTO( entity.getAddress() ) );
        realEstateDTO.setMainCategory( categoryToCategoryDTO( entity.getMainCategory() ) );
        realEstateDTO.setSubCategory( categoryToCategoryDTO( entity.getSubCategory() ) );
        realEstateDTO.setRoomAndLivingRoom( entity.getRoomAndLivingRoom() );

        return realEstateDTO;
    }

    @Override
    public Set<RealEstateDTO> toAdvertDTOList(Set<RealEstate> entityList) {
        if ( entityList == null ) {
            return null;
        }

        Set<RealEstateDTO> set = new HashSet<RealEstateDTO>( Math.max( (int) ( entityList.size() / .75f ) + 1, 16 ) );
        for ( RealEstate realEstate : entityList ) {
            set.add( toAdvertDTO( realEstate ) );
        }

        return set;
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

    protected Category categoryDTOToCategory(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryDTO.getId() );
        if ( categoryDTO.getCreationDate() != null ) {
            category.setCreationDate( Date.from( categoryDTO.getCreationDate().toInstant() ) );
        }
        if ( categoryDTO.getModificationDate() != null ) {
            category.setModificationDate( Date.from( categoryDTO.getModificationDate().toInstant() ) );
        }
        category.setParent_id( categoryDTO.getParent_id() );
        category.setName( categoryDTO.getName() );

        return category;
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

    protected CategoryDTO categoryToCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId( category.getId() );
        if ( category.getCreationDate() != null ) {
            categoryDTO.setCreationDate( ZonedDateTime.ofInstant( category.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( category.getModificationDate() != null ) {
            categoryDTO.setModificationDate( ZonedDateTime.ofInstant( category.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        categoryDTO.setParent_id( category.getParent_id() );
        categoryDTO.setName( category.getName() );

        return categoryDTO;
    }
}
