package com.ecommerce.site.dto;

import lombok.Data;
import java.util.List;

@Data
public class UserDTO {
    private String name;
    private String email;
    private String phoneNumber;
    private List<OrderDTO> orderArray;
}
