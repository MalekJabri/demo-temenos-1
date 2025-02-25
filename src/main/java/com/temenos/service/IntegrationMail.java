package com.temenos.service;

import com.temenos.model.Customer;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IntegrationMail {

    public void sendNotifcationtest(Customer customer){
        System.out.println(customer.toString());
    }
    
}
