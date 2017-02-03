package com.sandeep.interview.samples.model;

import org.springframework.stereotype.Component;

/**
 * Created by SMALA on 7/31/2016.
 */
@Component
public class Address extends Person {
    private Long streetNumber;
    private String streetName;
    private String ZipCode;
    private static int countChild=0;

    public Address(){
        countChild++;
        System.out.println(this.getClass() +":" + countChild);
    }

    public static int getCountChild() {
        return countChild;
    }

    public static void setCountChild(int countChild) {
        Address.countChild = countChild;
    }

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
