package com.ecommerce.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.site.entity.Cart;

@RepositoryRestResource(collectionResourceRel = "cart",path="cart")
public interface CartRepo extends PagingAndSortingRepository<Cart, Long>, CrudRepository<Cart, Long>{

}
