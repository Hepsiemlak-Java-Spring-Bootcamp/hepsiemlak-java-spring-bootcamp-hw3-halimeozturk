package com.example.emlakburadaemail.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ActiveMqListenerService {
    private final EmailService emailService;

    @JmsListener(destination = "emlakburada.queue")
    public void consume(String message) {
        emailService.sendMail(message);
        System.out.println("Received Message: " + message);
    }

}
