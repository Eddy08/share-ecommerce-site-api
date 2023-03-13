package com.ecommerce.site.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PromoCodeDTO {
    private String code;
    private String discount;
    private LocalDate validFrom;
    private LocalDate validTill;
}
