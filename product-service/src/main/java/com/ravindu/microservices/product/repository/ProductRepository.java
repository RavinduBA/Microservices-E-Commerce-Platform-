package com.ravindu.microservices.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ravindu.microservices.product.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
