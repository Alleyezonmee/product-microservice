package com.example.productmicroservice.services;


import com.example.productmicroservice.model.ProductDTO;

public interface ProductService {

    ProductDTO getProduct(String productId);

    void addProduct(ProductDTO productDTO);

    ProductDTO deleteProduct(String productId);

}
