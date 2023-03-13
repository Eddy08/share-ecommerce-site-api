package com.ecommerce.site.dto;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

@JsonSerialize
@Data
public class ReviewDTO {
    private String heading;
    private List<String> commentArray;
    private List<ImageDTO> imageArray;
}
