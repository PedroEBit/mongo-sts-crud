package com.pedrobit.mongocrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pedrobit.mongocrud.domain.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>{
}
