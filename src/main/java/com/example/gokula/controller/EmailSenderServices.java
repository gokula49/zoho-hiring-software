package com.example.gokula.controller;

import com.example.gokula.config.EmailSenderService;
import com.example.gokula.payload.request.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EmailSenderServices {
    @Autowired
    EmailSenderService emailSenderService;
    @PostMapping("/email")
    public  String myEmail(@RequestBody EmailRequest emailRequest){
        emailSenderService.sendSimpleEmail(emailRequest.getTo(),emailRequest.getBody(),emailRequest.getSub());
        return "email send succesfully"+emailRequest.getTo();


    }

}
