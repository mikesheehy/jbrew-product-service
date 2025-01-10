package com.mikesheehy.jbrew_product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mikesheehy.jbrew_product.model.Product;

public interface ProductRepository extends MongoRepository<Product,String>{

}
