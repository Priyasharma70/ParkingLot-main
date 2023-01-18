package com.demo.parking.model.entity;

import com.demo.parking.web.rest.vm.DetailsofDirector;
import com.demo.parking.web.rest.vm.Star;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@Entity
@ToString

public class VendorRegistration {
    @Id
    @GeneratedValue
    private int vendorId;

    private String name;
    private String address;
    private String factoryAddress;
    private Long IECNumber;
    private Long registrationNo;
    private Star star;
    private  String detailsOfDirector;
    private List<String> vendorsRegistrationList;
    private String vendorNonFarmerSector;



}
