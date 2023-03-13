package com.ecommerce.site.dto;

import java.util.List;

import lombok.Data;

@Data
public class ReviewDTO {
    private String heading;
    private List<String> commentArray;
    private List<ImageDTO> imageArray;
}
