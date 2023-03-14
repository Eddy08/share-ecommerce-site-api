package com.ecommerce.site.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PromoCode {
    private String code;
    private String discount;
    private LocalDate validFrom;
    private LocalDate validTill;
}
