package com.example.emlakburada.activeMq.service;

import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

@Service
@RequiredArgsConstructor
public class ActiveMqService {

    private final JmsTemplate jmsTemplate;

    private final Queue queue;

    public void sendMessage(String emailMessageDTO){
        jmsTemplate.convertAndSend(queue, emailMessageDTO);
    }
}
