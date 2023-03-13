package com.ecommerce.site.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ImageDTO {
    private String name;
    private String size;
    private MultipartFile image;
}
