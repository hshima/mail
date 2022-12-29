package com.example.demo.controller;

import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private EmailService emailService;

    @GetMapping
    public Boolean getEmailMessage(){
        try{
            emailService.sendMessageWithAttachment(
                    "shimada.henrique@gmail.com",
                    "teste de envio por aplicação",
                    "Sucesso!",
                    "private/20221018.pdf"
            );
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
