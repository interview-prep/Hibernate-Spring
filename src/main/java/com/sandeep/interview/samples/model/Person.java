package com.sandeep.interview.samples.model;

import org.springframework.context.ApplicationContext;

/**
 * Created by SMALA on 7/31/2016.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private ApplicationContext context = null;
    private static int countParent = 0;

    public Person() {
        countParent++;
        System.out.println(this.getClass().getCanonicalName() +":" + countParent);
    }

    public Address getAddress() {
        return address;
    }

    private Address address;

    public static int getCountParent() {
        return countParent;
    }

    public static void setCountParent(int countParent) {
        Person.countParent = countParent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBeanName(String s) {
        System.out.println("bean name " + s);
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
