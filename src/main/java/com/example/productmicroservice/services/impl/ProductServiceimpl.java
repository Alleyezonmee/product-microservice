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

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductDTO getProduct(String id) {
        System.out.println(id);
        //System.out.println(employeeRepository.findAll());
        Product product = productRepository.findOne(id);
        System.out.println(product);
        if(product==null) {
            System.out.println("DNE");
            return null;
        }
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product,productDTO);
        return productDTO;
    }

    @Override
    public void addProduct(ProductDTO productDTO) {
        Product product = new Product();
        BeanUtils.copyProperties(productDTO,product);
        productRepository.save(product);
    }

    @Override
    public ProductDTO deleteProduct(String productId) {
        Product product = new Product();
        product = productRepository.findOne(productId);
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product,productDTO);
        productRepository.delete(product);
        return productDTO;
    }

    @Override
    public List<Product> findProductByCategory(String category) {
        return productRepository.findByProductCategory(category);

    }

}
