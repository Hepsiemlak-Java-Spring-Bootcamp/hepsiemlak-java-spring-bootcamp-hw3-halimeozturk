package com.example.emlakburada.mapper;

import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.model.Message;
import com.example.emlakburada.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {RealEstateMapper.class, MessageMapper.class})
public interface UserMapper extends BaseMapper<User, UserDTO>{
}
