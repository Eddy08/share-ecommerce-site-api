package com.ecommerce.site.entity;

import java.util.List;

import lombok.Data;

@Data
public class Review {
    private String heading;
    private List<String> commentArray;
    private List<Image> imageArray;
}
