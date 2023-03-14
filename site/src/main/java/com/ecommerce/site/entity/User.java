package com.ecommerce.site.entity;

import lombok.Data;
import java.util.List;

@Data
public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private List<Order> orderArray;
}
