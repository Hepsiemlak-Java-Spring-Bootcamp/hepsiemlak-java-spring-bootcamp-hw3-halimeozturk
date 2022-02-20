package com.example.emlakburada.service;

import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.mapper.UserMapper;
import com.example.emlakburada.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public List<UserDTO> getAllList() {
        return userMapper.toDTOList(userRepository.getAllList());
    }

    public UserDTO create(UserDTO userDTO) {
        return userMapper.toDTO(userRepository.create(userMapper.toEntity(userDTO)));
    }

    public UserDTO getUserById(Long id){
        return userMapper.toDTO(userRepository.getUserById(id));
    }
}
