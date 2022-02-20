package com.example.emlakburada.mapper;

import com.example.emlakburada.dto.AdvertDTO;
import com.example.emlakburada.dto.MessageDTO;
import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.model.Advert;
import com.example.emlakburada.model.Message;
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
public class AdvertMapperImpl implements AdvertMapper {

    @Autowired
    private RealEstateMapper realEstateMapper;

    @Override
    public Advert toEntity(AdvertDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Advert advert = new Advert();

        advert.setId( dto.getId() );
        if ( dto.getModificationDate() != null ) {
            advert.setModificationDate( Date.from( dto.getModificationDate().toInstant() ) );
        }
        advert.setAdvertNo( dto.getAdvertNo() );
        advert.setTitle( dto.getTitle() );
        advert.setDescription( dto.getDescription() );
        advert.setDuration( dto.getDuration() );
        advert.setPutFordward( dto.getPutFordward() );
        advert.setActive( dto.getActive() );
        advert.setOwner( userDTOToUser( dto.getOwner() ) );
        advert.setRealEstates( dto.getRealEstates() );

        return advert;
    }

    @Override
    public AdvertDTO toDTO(Advert entity) {
        if ( entity == null ) {
            return null;
        }

        AdvertDTO advertDTO = new AdvertDTO();

        advertDTO.setId( entity.getId() );
        if ( entity.getCreationDate() != null ) {
            advertDTO.setCreationDate( ZonedDateTime.ofInstant( entity.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( entity.getModificationDate() != null ) {
            advertDTO.setModificationDate( ZonedDateTime.ofInstant( entity.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        advertDTO.setAdvertNo( entity.getAdvertNo() );
        advertDTO.setTitle( entity.getTitle() );
        advertDTO.setDescription( entity.getDescription() );
        advertDTO.setDuration( entity.getDuration() );
        advertDTO.setPutFordward( entity.getPutFordward() );
        advertDTO.setActive( entity.getActive() );
        advertDTO.setOwner( userToUserDTO( entity.getOwner() ) );
        advertDTO.setRealEstates( entity.getRealEstates() );

        return advertDTO;
    }

    @Override
    public List<Advert> toEntityList(List<AdvertDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Advert> list = new ArrayList<Advert>( dtoList.size() );
        for ( AdvertDTO advertDTO : dtoList ) {
            list.add( toEntity( advertDTO ) );
        }

        return list;
    }

    @Override
    public List<AdvertDTO> toDTOList(List<Advert> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AdvertDTO> list = new ArrayList<AdvertDTO>( entityList.size() );
        for ( Advert advert : entityList ) {
            list.add( toDTO( advert ) );
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

    protected Message messageDTOToMessage(MessageDTO messageDTO) {
        if ( messageDTO == null ) {
            return null;
        }

        Message message = new Message();

        message.setId( messageDTO.getId() );
        if ( messageDTO.getCreationDate() != null ) {
            message.setCreationDate( Date.from( messageDTO.getCreationDate().toInstant() ) );
        }
        if ( messageDTO.getModificationDate() != null ) {
            message.setModificationDate( Date.from( messageDTO.getModificationDate().toInstant() ) );
        }
        message.setSender( userDTOToUser( messageDTO.getSender() ) );
        message.setReceiver( userDTOToUser( messageDTO.getReceiver() ) );
        message.setContent( messageDTO.getContent() );
        message.setTitle( messageDTO.getTitle() );
        message.setSeen( messageDTO.getSeen() );
        message.setSentDate( messageDTO.getSentDate() );
        message.setReadDate( messageDTO.getReadDate() );

        return message;
    }

    protected List<Message> messageDTOListToMessageList(List<MessageDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Message> list1 = new ArrayList<Message>( list.size() );
        for ( MessageDTO messageDTO : list ) {
            list1.add( messageDTOToMessage( messageDTO ) );
        }

        return list1;
    }

    protected User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        if ( userDTO.getCreationDate() != null ) {
            user.setCreationDate( Date.from( userDTO.getCreationDate().toInstant() ) );
        }
        if ( userDTO.getModificationDate() != null ) {
            user.setModificationDate( Date.from( userDTO.getModificationDate().toInstant() ) );
        }
        user.setUserType( userDTO.getUserType() );
        user.setName( userDTO.getName() );
        user.setSurname( userDTO.getSurname() );
        user.setEmail( userDTO.getEmail() );
        user.setPath( userDTO.getPath() );
        user.setPhoneNumber( userDTO.getPhoneNumber() );
        user.setOfficePhone( userDTO.getOfficePhone() );
        user.setVkn( userDTO.getVkn() );
        user.setRealEstateList( realEstateMapper.toEntityList( userDTO.getRealEstateList() ) );
        user.setFavorite( advertDTOSetToRealEstateSet( userDTO.getFavorite() ) );
        user.setMessageList( messageDTOListToMessageList( userDTO.getMessageList() ) );

        return user;
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

    protected MessageDTO messageToMessageDTO(Message message) {
        if ( message == null ) {
            return null;
        }

        MessageDTO messageDTO = new MessageDTO();

        messageDTO.setId( message.getId() );
        if ( message.getCreationDate() != null ) {
            messageDTO.setCreationDate( ZonedDateTime.ofInstant( message.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( message.getModificationDate() != null ) {
            messageDTO.setModificationDate( ZonedDateTime.ofInstant( message.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        messageDTO.setSender( userToUserDTO( message.getSender() ) );
        messageDTO.setReceiver( userToUserDTO( message.getReceiver() ) );
        messageDTO.setContent( message.getContent() );
        messageDTO.setTitle( message.getTitle() );
        messageDTO.setSeen( message.getSeen() );
        messageDTO.setSentDate( message.getSentDate() );
        messageDTO.setReadDate( message.getReadDate() );

        return messageDTO;
    }

    protected List<MessageDTO> messageListToMessageDTOList(List<Message> list) {
        if ( list == null ) {
            return null;
        }

        List<MessageDTO> list1 = new ArrayList<MessageDTO>( list.size() );
        for ( Message message : list ) {
            list1.add( messageToMessageDTO( message ) );
        }

        return list1;
    }

    protected UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        if ( user.getCreationDate() != null ) {
            userDTO.setCreationDate( ZonedDateTime.ofInstant( user.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( user.getModificationDate() != null ) {
            userDTO.setModificationDate( ZonedDateTime.ofInstant( user.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        userDTO.setUserType( user.getUserType() );
        userDTO.setName( user.getName() );
        userDTO.setSurname( user.getSurname() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPath( user.getPath() );
        userDTO.setPhoneNumber( user.getPhoneNumber() );
        userDTO.setOfficePhone( user.getOfficePhone() );
        userDTO.setVkn( user.getVkn() );
        userDTO.setRealEstateList( realEstateMapper.toDTOList( user.getRealEstateList() ) );
        userDTO.setFavorite( realEstateSetToAdvertDTOSet( user.getFavorite() ) );
        userDTO.setMessageList( messageListToMessageDTOList( user.getMessageList() ) );

        return userDTO;
    }
}
