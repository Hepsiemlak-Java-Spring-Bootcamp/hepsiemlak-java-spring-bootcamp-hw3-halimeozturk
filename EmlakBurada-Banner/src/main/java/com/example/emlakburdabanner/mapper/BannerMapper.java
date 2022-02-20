package com.example.emlakburdabanner.mapper;

import com.example.emlakburdabanner.dto.BannerDTO;
import com.example.emlakburdabanner.model.Banner;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BannerMapper extends BaseMapper<Banner, BannerDTO>{
}
