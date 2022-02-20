package com.example.emlakburada.mapper;

import com.example.emlakburada.dto.AddressDTO;
import com.example.emlakburada.dto.AdvertDTO;
import com.example.emlakburada.dto.CategoryDTO;
import com.example.emlakburada.dto.ImageDTO;
import com.example.emlakburada.dto.MessageDTO;
import com.example.emlakburada.dto.RealEstateDTO;
import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.model.Address;
import com.example.emlakburada.model.Category;
import com.example.emlakburada.model.Image;
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
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-20T23:02:34+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

    @Override
    public Message toEntity(MessageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Message message = new Message();

        message.setId( dto.getId() );
        if ( dto.getModificationDate() != null ) {
            message.setModificationDate( Date.from( dto.getModificationDate().toInstant() ) );
        }
        message.setSender( userDTOToUser( dto.getSender() ) );
        message.setReceiver( userDTOToUser( dto.getReceiver() ) );
        message.setContent( dto.getContent() );
        message.setTitle( dto.getTitle() );
        message.setSeen( dto.getSeen() );
        message.setSentDate( dto.getSentDate() );
        message.setReadDate( dto.getReadDate() );

        return message;
    }

    @Override
    public MessageDTO toDTO(Message entity) {
        if ( entity == null ) {
            return null;
        }

        MessageDTO messageDTO = new MessageDTO();

        messageDTO.setId( entity.getId() );
        if ( entity.getCreationDate() != null ) {
            messageDTO.setCreationDate( ZonedDateTime.ofInstant( entity.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( entity.getModificationDate() != null ) {
            messageDTO.setModificationDate( ZonedDateTime.ofInstant( entity.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        messageDTO.setSender( userToUserDTO( entity.getSender() ) );
        messageDTO.setReceiver( userToUserDTO( entity.getReceiver() ) );
        messageDTO.setContent( entity.getContent() );
        messageDTO.setTitle( entity.getTitle() );
        messageDTO.setSeen( entity.getSeen() );
        messageDTO.setSentDate( entity.getSentDate() );
        messageDTO.setReadDate( entity.getReadDate() );

        return messageDTO;
    }

    @Override
    public List<Message> toEntityList(List<MessageDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Message> list = new ArrayList<Message>( dtoList.size() );
        for ( MessageDTO messageDTO : dtoList ) {
            list.add( toEntity( messageDTO ) );
        }

        return list;
    }

    @Override
    public List<MessageDTO> toDTOList(List<Message> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MessageDTO> list = new ArrayList<MessageDTO>( entityList.size() );
        for ( Message message : entityList ) {
            list.add( toDTO( message ) );
        }

        return list;
    }

    protected Image imageDTOToImage(ImageDTO imageDTO) {
        if ( imageDTO == null ) {
            return null;
        }

        Image image = new Image();

        image.setId( imageDTO.getId() );
        if ( imageDTO.getCreationDate() != null ) {
            image.setCreationDate( Date.from( imageDTO.getCreationDate().toInstant() ) );
        }
        if ( imageDTO.getModificationDate() != null ) {
            image.setModificationDate( Date.from( imageDTO.getModificationDate().toInstant() ) );
        }
        image.setPath( imageDTO.getPath() );
        image.setSort( imageDTO.getSort() );

        return image;
    }

    protected List<Image> imageDTOListToImageList(List<ImageDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Image> list1 = new ArrayList<Image>( list.size() );
        for ( ImageDTO imageDTO : list ) {
            list1.add( imageDTOToImage( imageDTO ) );
        }

        return list1;
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

    protected RealEstate realEstateDTOToRealEstate(RealEstateDTO realEstateDTO) {
        if ( realEstateDTO == null ) {
            return null;
        }

        RealEstate realEstate = new RealEstate();

        realEstate.setId( realEstateDTO.getId() );
        if ( realEstateDTO.getCreationDate() != null ) {
            realEstate.setCreationDate( Date.from( realEstateDTO.getCreationDate().toInstant() ) );
        }
        if ( realEstateDTO.getModificationDate() != null ) {
            realEstate.setModificationDate( Date.from( realEstateDTO.getModificationDate().toInstant() ) );
        }
        realEstate.setCurrency( realEstateDTO.getCurrency() );
        realEstate.setPrice( realEstateDTO.getPrice() );
        realEstate.setDescription( realEstateDTO.getDescription() );
        realEstate.setRoom( realEstateDTO.getRoom() );
        realEstate.setLivingRoom( realEstateDTO.getLivingRoom() );
        realEstate.setAge( realEstateDTO.getAge() );
        realEstate.setBathRoom( realEstateDTO.getBathRoom() );
        realEstate.setImageList( imageDTOListToImageList( realEstateDTO.getImageList() ) );
        realEstate.setFloor( realEstateDTO.getFloor() );
        realEstate.setNumberOfFloor( realEstateDTO.getNumberOfFloor() );
        realEstate.setNetSquareMeters( realEstateDTO.getNetSquareMeters() );
        realEstate.setSquareMeters( realEstateDTO.getSquareMeters() );
        realEstate.setPublicationType( realEstateDTO.getPublicationType() );
        realEstate.setBuildType( realEstateDTO.getBuildType() );
        realEstate.setBuildState( realEstateDTO.getBuildState() );
        realEstate.setAddress( addressDTOToAddress( realEstateDTO.getAddress() ) );
        realEstate.setMainCategory( categoryDTOToCategory( realEstateDTO.getMainCategory() ) );
        realEstate.setSubCategory( categoryDTOToCategory( realEstateDTO.getSubCategory() ) );
        realEstate.setRoomAndLivingRoom( realEstateDTO.getRoomAndLivingRoom() );

        return realEstate;
    }

    protected List<RealEstate> realEstateDTOListToRealEstateList(List<RealEstateDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<RealEstate> list1 = new ArrayList<RealEstate>( list.size() );
        for ( RealEstateDTO realEstateDTO : list ) {
            list1.add( realEstateDTOToRealEstate( realEstateDTO ) );
        }

        return list1;
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
        user.setRealEstateList( realEstateDTOListToRealEstateList( userDTO.getRealEstateList() ) );
        user.setFavorite( advertDTOSetToRealEstateSet( userDTO.getFavorite() ) );
        user.setMessageList( toEntityList( userDTO.getMessageList() ) );

        return user;
    }

    protected ImageDTO imageToImageDTO(Image image) {
        if ( image == null ) {
            return null;
        }

        ImageDTO imageDTO = new ImageDTO();

        imageDTO.setId( image.getId() );
        if ( image.getCreationDate() != null ) {
            imageDTO.setCreationDate( ZonedDateTime.ofInstant( image.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( image.getModificationDate() != null ) {
            imageDTO.setModificationDate( ZonedDateTime.ofInstant( image.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        imageDTO.setPath( image.getPath() );
        imageDTO.setSort( image.getSort() );

        return imageDTO;
    }

    protected List<ImageDTO> imageListToImageDTOList(List<Image> list) {
        if ( list == null ) {
            return null;
        }

        List<ImageDTO> list1 = new ArrayList<ImageDTO>( list.size() );
        for ( Image image : list ) {
            list1.add( imageToImageDTO( image ) );
        }

        return list1;
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

    protected RealEstateDTO realEstateToRealEstateDTO(RealEstate realEstate) {
        if ( realEstate == null ) {
            return null;
        }

        RealEstateDTO realEstateDTO = new RealEstateDTO();

        realEstateDTO.setId( realEstate.getId() );
        if ( realEstate.getCreationDate() != null ) {
            realEstateDTO.setCreationDate( ZonedDateTime.ofInstant( realEstate.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( realEstate.getModificationDate() != null ) {
            realEstateDTO.setModificationDate( ZonedDateTime.ofInstant( realEstate.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        realEstateDTO.setCurrency( realEstate.getCurrency() );
        realEstateDTO.setPrice( realEstate.getPrice() );
        realEstateDTO.setDescription( realEstate.getDescription() );
        realEstateDTO.setRoom( realEstate.getRoom() );
        realEstateDTO.setLivingRoom( realEstate.getLivingRoom() );
        realEstateDTO.setAge( realEstate.getAge() );
        realEstateDTO.setBathRoom( realEstate.getBathRoom() );
        realEstateDTO.setImageList( imageListToImageDTOList( realEstate.getImageList() ) );
        realEstateDTO.setFloor( realEstate.getFloor() );
        realEstateDTO.setNumberOfFloor( realEstate.getNumberOfFloor() );
        realEstateDTO.setNetSquareMeters( realEstate.getNetSquareMeters() );
        realEstateDTO.setSquareMeters( realEstate.getSquareMeters() );
        realEstateDTO.setPublicationType( realEstate.getPublicationType() );
        realEstateDTO.setBuildType( realEstate.getBuildType() );
        realEstateDTO.setBuildState( realEstate.getBuildState() );
        realEstateDTO.setAddress( addressToAddressDTO( realEstate.getAddress() ) );
        realEstateDTO.setMainCategory( categoryToCategoryDTO( realEstate.getMainCategory() ) );
        realEstateDTO.setSubCategory( categoryToCategoryDTO( realEstate.getSubCategory() ) );
        realEstateDTO.setRoomAndLivingRoom( realEstate.getRoomAndLivingRoom() );

        return realEstateDTO;
    }

    protected List<RealEstateDTO> realEstateListToRealEstateDTOList(List<RealEstate> list) {
        if ( list == null ) {
            return null;
        }

        List<RealEstateDTO> list1 = new ArrayList<RealEstateDTO>( list.size() );
        for ( RealEstate realEstate : list ) {
            list1.add( realEstateToRealEstateDTO( realEstate ) );
        }

        return list1;
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
        userDTO.setRealEstateList( realEstateListToRealEstateDTOList( user.getRealEstateList() ) );
        userDTO.setFavorite( realEstateSetToAdvertDTOSet( user.getFavorite() ) );
        userDTO.setMessageList( toDTOList( user.getMessageList() ) );

        return userDTO;
    }
}
