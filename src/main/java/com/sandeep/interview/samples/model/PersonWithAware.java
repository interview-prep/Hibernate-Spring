package com.sandeep.interview.samples.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by SMALA on 7/31/2016.
 */
public class PersonWithAware implements ApplicationContextAware, BeanNameAware {
    private Long id;
    private String firstName;
    private String lastName;
    private ApplicationContext context = null;
    private static int countParent = 0;

    public PersonWithAware() {
        countParent++;
        System.out.println(countParent);
    }

    public Address getAddress() {
        return address;
    }

    private Address address;

    public static int getCountParent() {
        return countParent;
    }

    public static void setCountParent(int countParent) {
        PersonWithAware.countParent = countParent;
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

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void setBeanName(String s) {
        System.out.println("bean name " + s);
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
