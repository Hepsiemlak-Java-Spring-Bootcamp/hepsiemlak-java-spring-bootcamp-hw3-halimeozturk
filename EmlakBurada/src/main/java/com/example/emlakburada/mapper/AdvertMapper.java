package com.example.emlakburada.mapper;

import com.example.emlakburada.dto.AdvertDTO;
import com.example.emlakburada.model.Advert;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Set;

@Mapper(componentModel = "spring",uses = {UserMapper.class, RealEstateMapper.class})
public interface AdvertMapper extends BaseMapper<Advert, AdvertDTO>{

}
