package com.ecommerce.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.site.entity.Image;

@RepositoryRestResource(collectionResourceRel = "image",path="image")
public interface ImageRepo extends PagingAndSortingRepository<Image, Long>,CrudRepository<Image, Long>{

}
