package com.ecommerce.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.site.entity.Order;

@RepositoryRestResource(collectionResourceRel = "order", path="order")
public interface OrderRepo extends PagingAndSortingRepository<Order, Long>, CrudRepository<Order, Long>{

}
