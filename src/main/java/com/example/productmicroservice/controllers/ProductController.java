package com.example.productmicroservice.controllers;

import com.example.productmicroservice.model.ProductDTO;
import com.example.productmicroservice.services.impl.ProductServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductServiceimpl productServiceimpl;


    @RequestMapping(name = "/product")
    ProductDTO getProduct(@RequestParam String productId) {
        return productServiceimpl.getProduct(productId);
    }


    @PostMapping(name = "/addProduct")
    void addProduct(@RequestBody ProductDTO productDTO) {
        productServiceimpl.addProduct(productDTO);
    }


    @DeleteMapping(name="/deleteProduct")
    ProductDTO deleteProduct(@RequestParam String productId) {
        return productServiceimpl.deleteProduct(productId);
    }

}
