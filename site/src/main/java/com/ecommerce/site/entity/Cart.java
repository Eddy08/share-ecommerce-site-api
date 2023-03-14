package com.ecommerce.site.entity;

import java.util.List;

import com.ecommerce.site.constants.Category;
import com.ecommerce.site.constants.Colour;
import com.ecommerce.site.constants.Rating;
import com.ecommerce.site.constants.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private double price;
    @Enumerated(EnumType.STRING)

    private Rating rating;
    private String description;

    @Enumerated(EnumType.STRING)
    private Category catagory;

    @OneToMany
    private List<Image> imageArray;
    @OneToMany
    private List<Review> reviewArray;

    @Enumerated(EnumType.STRING)
    private Size size;

    @Enumerated(EnumType.STRING)
    private Colour colour;
    private List<String> tags;
    private String productId;
    private List<String> additionalInfoArray;

}
