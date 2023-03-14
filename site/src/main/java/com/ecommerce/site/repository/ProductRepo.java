package com.ecommerce.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.site.entity.Product;

@RepositoryRestResource(collectionResourceRel = "product",path="product")
public interface ProductRepo extends PagingAndSortingRepository<Product, Long>, CrudRepository<Product, Long>{

}
