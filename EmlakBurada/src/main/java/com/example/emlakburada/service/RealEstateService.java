package com.example.emlakburada.service;

import com.example.emlakburada.dto.RealEstateDTO;
import com.example.emlakburada.mapper.RealEstateMapper;
import com.example.emlakburada.repository.RealEstateRepository;
import com.example.emlakburada.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class RealEstateService {
    private final RealEstateMapper realEstateMapper;
    private final RealEstateRepository realEstateRepository;
    private final UserRepository userRepository;

    public List<RealEstateDTO> getAllList() {
        return realEstateMapper.toDTOList(realEstateRepository.getAllList());
    }

    public RealEstateDTO create(RealEstateDTO realEstateDTO) {
        return realEstateMapper.toDTO(realEstateRepository.create(realEstateMapper.toEntity(realEstateDTO)));
    }

    public RealEstateDTO getRealEstateById(Long id){
        return realEstateMapper.toDTO(realEstateRepository.getRealEstateById(id));
    }

    public Set<RealEstateDTO> getRealEstateListWithUserId(long userId){
        return realEstateMapper.toAdvertDTOList(new HashSet<>(userRepository.getUserById(userId).getFavorite()));
    }
}
