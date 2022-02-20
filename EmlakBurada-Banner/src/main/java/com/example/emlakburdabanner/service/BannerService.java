package com.example.emlakburdabanner.service;

import com.example.emlakburdabanner.dto.BannerDTO;
import com.example.emlakburdabanner.mapper.BannerMapper;
import com.example.emlakburdabanner.model.Banner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BannerService {
    private final BannerMapper bannerMapper;
    List<Banner> bannerList = new ArrayList<>();

    public List<BannerDTO> getAllList() {
        return bannerMapper.toDTOList(bannerList);
    }

    public BannerDTO create(BannerDTO bannerDTO) {
        Banner banner = bannerMapper.toEntity(bannerDTO);
        bannerList.add(banner);
        return bannerMapper.toDTO(banner);
    }

}
