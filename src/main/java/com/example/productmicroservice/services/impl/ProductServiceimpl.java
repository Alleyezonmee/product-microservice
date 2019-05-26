package com.example.productmicroservice.services.impl;

import com.example.productmicroservice.entity.Product;
import com.example.productmicroservice.model.ProductDTO;
import com.example.productmicroservice.repository.ProductRepository;
import com.example.productmicroservice.services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceimpl implements ProductService {


    // variable for fetching the product repository.

    @Autowired
    private ProductRepository productRepository;


    // method for getting a product.

    @Override
    public ProductDTO getProduct(String productId) {
        System.out.println(productId);
        Product product = productRepository.findOne(productId);
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product,productDTO);
        return productDTO;
    }


    // method for adding a product to the database.

    @Override
    public void addProduct(ProductDTO productDTO) {
        Product product = new Product();
        BeanUtils.copyProperties(productDTO,product);
        productRepository.save(product);
    }


    // method for deleting a product.

    @Override
    public ProductDTO deleteProduct(String productId) {
        Product product = new Product();
        product = productRepository.findOne(productId);
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product,productDTO);
        productRepository.delete(product);
        return productDTO;
    }


    // method for getting all the products falling a particular category.

    @Override
    public List<Product> findProductByCategory(String category) {
        return productRepository.findByProductCategory(category);

    }
}
