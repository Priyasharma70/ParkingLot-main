package com.demo.parking.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class VendorDirector {
    @Id
    @GeneratedValue
    private int directorId;

        private String name;
        private String fatherName;
        private String address;
        private long telephoneNo;
        private Long mobNo;

    }
