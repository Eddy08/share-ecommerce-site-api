package com.ecommerce.site.dto;

import lombok.Data;

@Data
public class CheckoutDTO {
    private String name;
    private String email;
    private String phoneNumber;
    private String pincode;
    private String city;
}
