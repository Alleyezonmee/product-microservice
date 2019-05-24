package com.example.productmicroservice.services;


import com.example.productmicroservice.entity.Product;
import com.example.productmicroservice.model.ProductDTO;

import java.util.List;

public interface ProductService {

    ProductDTO getProduct(String productId);

    void addProduct(ProductDTO productDTO);

    ProductDTO deleteProduct(String productId);

    List<Product> findProductByCategory(String category);

}
