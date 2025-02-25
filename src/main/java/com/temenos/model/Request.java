package com.temenos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Request {

    private String title;
    private String description;
    private float amount;

    
}
