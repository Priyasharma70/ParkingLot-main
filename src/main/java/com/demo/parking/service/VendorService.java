package com.demo.parking.service;

import com.demo.parking.model.entity.*;
import com.demo.parking.repository.VendorDirectorRepository;
import com.demo.parking.repository.VendorInfoRepository;
import com.demo.parking.web.rest.vm.RegistrationRequestVM;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;
@Service

public class VendorService {
    private final VendorInfoRepository vendorInfoRepository;
    private final VendorDirectorRepository vendorDirectorRepository;


    public VendorService(VendorInfoRepository vendorInfoRepository, VendorDirectorRepository vendorDirectorRepository) {
        this.vendorInfoRepository = vendorInfoRepository;

        this.vendorDirectorRepository = vendorDirectorRepository;
    }




    public void vendorDetails(RegistrationRequestVM registrationRequestVM) throws AccountNotFoundException {

        VendorRegistration vendorRegistration = new VendorRegistration();
        VendorDirector vendorDirector = new VendorDirector();
        vendorDirector.setAddress(registrationRequestVM.getDetailsofDirector().getAddress());
        vendorDirector.setName(registrationRequestVM.getDetailsofDirector().getName());
        vendorDirector.setMobNo(registrationRequestVM.getDetailsofDirector().getMobno());
        vendorDirector.setTelephoneNo(registrationRequestVM.getDetailsofDirector().getTelephoneno());

        vendorRegistration.setName(registrationRequestVM.getName());
        vendorRegistration.setAddress(registrationRequestVM.getAddress());
        vendorRegistration.setRegistrationNo(registrationRequestVM.getRegistrationNo());
        vendorRegistration.setStar(registrationRequestVM.getStar());
        vendorInfoRepository.save(vendorRegistration);
        vendorDirectorRepository.save(vendorDirector);
    }}




