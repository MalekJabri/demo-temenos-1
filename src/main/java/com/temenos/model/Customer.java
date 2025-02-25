package com.temenos.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Customer {

    private String name;
    private String lastName;
    private String customerID;
    private String phone;
    private String email;
    private Pack pack;

}
   
