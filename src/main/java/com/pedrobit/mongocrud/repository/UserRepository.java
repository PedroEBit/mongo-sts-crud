package com.pedrobit.mongocrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pedrobit.mongocrud.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
