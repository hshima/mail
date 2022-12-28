package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    Boolean sendMessageWithAttachment(String to, String subject, String msg, String path);
}
