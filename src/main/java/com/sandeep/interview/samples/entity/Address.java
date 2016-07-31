package com.sandeep.interview.samples.entity;

/**
 * Created by SMALA on 7/31/2016.
 */
public class Address extends Person {
    private Long streetNumber;
    private String streetName;
    private String ZipCode;

    public Long getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Long streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }
}
