package com.demo.parking.controller;

import com.demo.parking.model.entity.VehicleType;
import com.demo.parking.service.BuisnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.security.auth.login.AccountNotFoundException;

@RestController
public class AppController {
    private final BuisnessService buisnessService;






    public AppController(BuisnessService buisnessService) {
        this.buisnessService = buisnessService;

    }
    @GetMapping("/send-email")
    public void getSlotAvailability() throws AccountNotFoundException, MessagingException {
         buisnessService.sendEmail();
    }




    }
