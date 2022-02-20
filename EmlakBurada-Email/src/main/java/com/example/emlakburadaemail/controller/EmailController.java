package com.example.emlakburadaemail.controller;

import com.example.emlakburadaemail.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {
    private final EmailService emailService;

    @GetMapping("/{email}")
    public String sendEmail(@PathVariable String email) {
        emailService.sendMail(email);
        return "Email sent successfully";
    }
}
