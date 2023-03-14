package com.ecommerce.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.site.entity.Checkout;

@RepositoryRestResource(collectionResourceRel = "checkout",path="checkout")
public interface CheckoutRepo extends PagingAndSortingRepository<Checkout,Long>, CrudRepository<Checkout, Long>{

}
