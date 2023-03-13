package com.ecommerce.site.dto;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

@JsonSerialize
@Data
public class ImageDTO {
    private String name;
    private String size;
    private MultipartFile image;
}
