package com.nttdata.productmicroservice.repository;

import com.nttdata.productmicroservice.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
