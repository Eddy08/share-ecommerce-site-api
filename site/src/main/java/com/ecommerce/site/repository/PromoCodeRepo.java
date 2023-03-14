package com.ecommerce.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.site.entity.PromoCode;

@RepositoryRestResource(collectionResourceRel = "promocode",path="promocode")
public interface PromoCodeRepo extends PagingAndSortingRepository<PromoCode, Long>, CrudRepository<PromoCode, Long>{

}
