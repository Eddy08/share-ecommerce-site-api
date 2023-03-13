package com.ecommerce.site.dto;

import java.util.List;

import com.ecommerce.site.constants.Category;
import com.ecommerce.site.constants.Size;
import com.ecommerce.site.constants.Colour;
import com.ecommerce.site.constants.Rating;

import lombok.Data;

@Data
public class CartDTO {
    private String title;
    private double price;
    private Rating rating;
    private String description;
    private Category catagory;
    private List<ImageDTO> imageArray;
    private List<ReviewDTO> reviewArray;
    private Size size;
    private Colour colour;
    private List<String> tags;
    private String productId;
    private List<String> additionalInfoArray;

}
