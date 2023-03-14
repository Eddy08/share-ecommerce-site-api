package com.ecommerce.site.entity;

import com.ecommerce.site.constants.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import com.ecommerce.site.constants.Category;
import com.ecommerce.site.constants.Colour;
import com.ecommerce.site.constants.Rating;

import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "PRODUCT")
public class Product {
    private String title;
    private double price;
    private Rating rating;
    private String description;
    private Category category;
    private List<Image> imageArray;
    private List<Review> reviewArray;
    private Size size;
    private Colour colour;
    private List<String> tagArray;
    private String productId;
    private List<String> additionalInfoArray;

}
