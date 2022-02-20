package com.example.emlakburada.activeMq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    // Kuyruga yazilan mesaj consumer sayesinde okunup islenir
//    @JmsListener(destination = "emlakburada.queue")
//    public void consume(String message) {
//        System.out.println("Received Message: " + message);
//    }
}
