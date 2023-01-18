package com.demo.parking.controller;

import com.demo.parking.model.entity.VehicleVM;
import com.demo.parking.model.entity.VendorRegistration;
import com.demo.parking.service.VendorService;
import com.demo.parking.web.rest.vm.RegistrationRequestVM;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.AccountNotFoundException;

@RestController
public class VendorController {
    private final VendorService vendorService;


    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @PostMapping("/Vendor-Details")
    public void vendorDetails(@RequestBody RegistrationRequestVM registrationRequestVM) throws AccountNotFoundException {
        vendorService.vendorDetails(registrationRequestVM);
    }


    }

