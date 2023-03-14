package com.ecommerce.site.entity;

import lombok.Data;

@Data
public class Checkout {
    private String name;
    private String email;
    private String phoneNumber;
    private String pincode;
    private String city;
}
