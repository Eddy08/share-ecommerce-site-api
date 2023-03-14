package com.ecommerce.site.dto;

import java.util.List;

import com.ecommerce.site.constants.Category;
import com.ecommerce.site.constants.Colour;
import com.ecommerce.site.constants.Rating;
import com.ecommerce.site.constants.Size;

import lombok.Data;

@Data
public class OrderDTO {

    private String title;
    private double price;
    private Rating rating;
    private String description;
    private Category catagory;
    private List<ImageDTO> imageArray;
    private List<ReviewDTO> reviewArray;
    private Size size;
    private Colour colour;
    private List<String> tagArray;
    private String productId;
    private List<String> additionalInfoArray;

}
