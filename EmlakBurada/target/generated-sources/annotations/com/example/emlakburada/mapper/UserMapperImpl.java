package com.example.emlakburada.mapper;

import com.example.emlakburada.dto.AdvertDTO;
import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.model.RealEstate;
import com.example.emlakburada.model.User;
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
    date = "2022-02-20T23:02:34+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private RealEstateMapper realEstateMapper;
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        if ( dto.getModificationDate() != null ) {
            user.setModificationDate( Date.from( dto.getModificationDate().toInstant() ) );
        }
        user.setUserType( dto.getUserType() );
        user.setName( dto.getName() );
        user.setSurname( dto.getSurname() );
        user.setEmail( dto.getEmail() );
        user.setPath( dto.getPath() );
        user.setPhoneNumber( dto.getPhoneNumber() );
        user.setOfficePhone( dto.getOfficePhone() );
        user.setVkn( dto.getVkn() );
        user.setRealEstateList( realEstateMapper.toEntityList( dto.getRealEstateList() ) );
        user.setFavorite( advertDTOSetToRealEstateSet( dto.getFavorite() ) );
        user.setMessageList( messageMapper.toEntityList( dto.getMessageList() ) );

        return user;
    }

    @Override
    public UserDTO toDTO(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( entity.getId() );
        if ( entity.getCreationDate() != null ) {
            userDTO.setCreationDate( ZonedDateTime.ofInstant( entity.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( entity.getModificationDate() != null ) {
            userDTO.setModificationDate( ZonedDateTime.ofInstant( entity.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        userDTO.setUserType( entity.getUserType() );
        userDTO.setName( entity.getName() );
        userDTO.setSurname( entity.getSurname() );
        userDTO.setEmail( entity.getEmail() );
        userDTO.setPath( entity.getPath() );
        userDTO.setPhoneNumber( entity.getPhoneNumber() );
        userDTO.setOfficePhone( entity.getOfficePhone() );
        userDTO.setVkn( entity.getVkn() );
        userDTO.setRealEstateList( realEstateMapper.toDTOList( entity.getRealEstateList() ) );
        userDTO.setFavorite( realEstateSetToAdvertDTOSet( entity.getFavorite() ) );
        userDTO.setMessageList( messageMapper.toDTOList( entity.getMessageList() ) );

        return userDTO;
    }

    @Override
    public List<User> toEntityList(List<UserDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtoList.size() );
        for ( UserDTO userDTO : dtoList ) {
            list.add( toEntity( userDTO ) );
        }

        return list;
    }

    @Override
    public List<UserDTO> toDTOList(List<User> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( entityList.size() );
        for ( User user : entityList ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    protected RealEstate advertDTOToRealEstate(AdvertDTO advertDTO) {
        if ( advertDTO == null ) {
            return null;
        }

        RealEstate realEstate = new RealEstate();

        realEstate.setId( advertDTO.getId() );
        if ( advertDTO.getCreationDate() != null ) {
            realEstate.setCreationDate( Date.from( advertDTO.getCreationDate().toInstant() ) );
        }
        if ( advertDTO.getModificationDate() != null ) {
            realEstate.setModificationDate( Date.from( advertDTO.getModificationDate().toInstant() ) );
        }
        realEstate.setDescription( advertDTO.getDescription() );

        return realEstate;
    }

    protected Set<RealEstate> advertDTOSetToRealEstateSet(Set<AdvertDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<RealEstate> set1 = new HashSet<RealEstate>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( AdvertDTO advertDTO : set ) {
            set1.add( advertDTOToRealEstate( advertDTO ) );
        }

        return set1;
    }

    protected AdvertDTO realEstateToAdvertDTO(RealEstate realEstate) {
        if ( realEstate == null ) {
            return null;
        }

        AdvertDTO advertDTO = new AdvertDTO();

        advertDTO.setId( realEstate.getId() );
        if ( realEstate.getCreationDate() != null ) {
            advertDTO.setCreationDate( ZonedDateTime.ofInstant( realEstate.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( realEstate.getModificationDate() != null ) {
            advertDTO.setModificationDate( ZonedDateTime.ofInstant( realEstate.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        advertDTO.setDescription( realEstate.getDescription() );

        return advertDTO;
    }

    protected Set<AdvertDTO> realEstateSetToAdvertDTOSet(Set<RealEstate> set) {
        if ( set == null ) {
            return null;
        }

        Set<AdvertDTO> set1 = new HashSet<AdvertDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RealEstate realEstate : set ) {
            set1.add( realEstateToAdvertDTO( realEstate ) );
        }

        return set1;
    }
}
