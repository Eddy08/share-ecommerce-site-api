package com.ecommerce.site.dto;

import com.ecommerce.site.constants.Size;
import com.ecommerce.site.constants.Category;
import com.ecommerce.site.constants.Colour;
import com.ecommerce.site.constants.Rating;

import lombok.Data;
import java.util.List;

@Data
public class ProductDTO {
    private String title;
    private double price;
    private Rating rating;
    private String description;
    private Category category;
    private List<ImageDTO> imageArray;
    private List<ReviewDTO> reviewArray;
    private Size size;
    private Colour colour;
    private List<String> tagArray;
    private String productId;
    private List<String> additionalInfoArray;

}
