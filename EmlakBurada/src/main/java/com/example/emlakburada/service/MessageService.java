package com.example.emlakburada.service;


import com.example.emlakburada.dto.MessageDTO;
import com.example.emlakburada.mapper.MessageMapper;
import com.example.emlakburada.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageMapper messageMapper;
    private final MessageRepository messageRepository;

    public List<MessageDTO> getAllList() {
        return messageMapper.toDTOList(messageRepository.getAllList());
    }

    public MessageDTO create(MessageDTO messageDTO) {
        return messageMapper.toDTO(messageRepository.create(messageMapper.toEntity(messageDTO)));
    }

    public MessageDTO getMessageById(Long id){
        return messageMapper.toDTO(messageRepository.getMessageById(id));
    }

}
