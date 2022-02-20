package com.example.emlakburada.mapper;

import com.example.emlakburada.dto.ImageDTO;
import com.example.emlakburada.model.Image;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-20T23:02:34+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class ImageMapperImpl implements ImageMapper {

    @Override
    public Image toEntity(ImageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Image image = new Image();

        image.setId( dto.getId() );
        if ( dto.getModificationDate() != null ) {
            image.setModificationDate( Date.from( dto.getModificationDate().toInstant() ) );
        }
        image.setPath( dto.getPath() );
        image.setSort( dto.getSort() );

        return image;
    }

    @Override
    public ImageDTO toDTO(Image entity) {
        if ( entity == null ) {
            return null;
        }

        ImageDTO imageDTO = new ImageDTO();

        imageDTO.setId( entity.getId() );
        if ( entity.getCreationDate() != null ) {
            imageDTO.setCreationDate( ZonedDateTime.ofInstant( entity.getCreationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        if ( entity.getModificationDate() != null ) {
            imageDTO.setModificationDate( ZonedDateTime.ofInstant( entity.getModificationDate().toInstant(), ZoneId.systemDefault() ) );
        }
        imageDTO.setPath( entity.getPath() );
        imageDTO.setSort( entity.getSort() );

        return imageDTO;
    }

    @Override
    public List<Image> toEntityList(List<ImageDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Image> list = new ArrayList<Image>( dtoList.size() );
        for ( ImageDTO imageDTO : dtoList ) {
            list.add( toEntity( imageDTO ) );
        }

        return list;
    }

    @Override
    public List<ImageDTO> toDTOList(List<Image> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ImageDTO> list = new ArrayList<ImageDTO>( entityList.size() );
        for ( Image image : entityList ) {
            list.add( toDTO( image ) );
        }

        return list;
    }
}
