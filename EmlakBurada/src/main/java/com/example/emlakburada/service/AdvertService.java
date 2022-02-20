package com.example.emlakburada.service;



import com.example.emlakburada.activeMq.service.ActiveMqService;
import com.example.emlakburada.client.BannerClient;
import com.example.emlakburada.client.dto.BannerDTO;
import com.example.emlakburada.dto.AdvertDTO;
import com.example.emlakburada.mapper.AdvertMapper;
import com.example.emlakburada.mapper.BannerMapper;
import com.example.emlakburada.model.Advert;
import com.example.emlakburada.repository.AdvertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class AdvertService {
    private final AdvertMapper advertMapper;
    private final BannerClient bannerClient;
    private final BannerMapper bannerMapper;
    private final ActiveMqService activeMqService;
    private final AdvertRepository advertRepository;

    public List<AdvertDTO> getAllList() {
        return advertMapper.toDTOList(advertRepository.getAllList());
    }

    public AdvertDTO create(AdvertDTO advertDTO) {
        Advert advert = advertRepository.create(advertMapper.toEntity(advertDTO));
        BannerDTO bannerDTO = bannerMapper.toDTO(advert);
        bannerDTO.setTotal(1);
        bannerDTO.setPhone("05555555555");
        bannerClient.saveOrUpdate(bannerDTO);
        activeMqService.sendMessage("ozturkk.halimee@gmail.com");
        return advertMapper.toDTO(advert);
    }

    public AdvertDTO getAdvertByAdvertNo(Integer advertNo){
        return advertMapper.toDTO(advertRepository.getAdvertByAdvertNo(advertNo));
    }

}
