package com.ecommerce.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.site.entity.Review;

@RepositoryRestResource(collectionResourceRel = "review",path ="review")
public interface ReviewRepo extends PagingAndSortingRepository<Review, Long>, CrudRepository<Review, Long>{

}
