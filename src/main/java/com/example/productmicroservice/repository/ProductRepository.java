package com.example.productmicroservice.repository;

import com.example.productmicroservice.entity.Product;
import com.example.productmicroservice.model.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByProductCategory(String category);

}
