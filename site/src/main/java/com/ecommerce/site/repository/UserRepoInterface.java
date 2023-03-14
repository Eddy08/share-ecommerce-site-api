package com.ecommerce.site.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerce.site.entity.User;

@RepositoryRestResource(collectionResourceRel = "user",path = "user")
public interface UserRepoInterface extends PagingAndSortingRepository<User, Long>,CrudRepository<User, Long>{

}
