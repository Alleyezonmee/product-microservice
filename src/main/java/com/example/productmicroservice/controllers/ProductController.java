package com.example.productmicroservice.controllers;

import com.example.productmicroservice.entity.Product;
import com.example.productmicroservice.model.ProductDTO;
import com.example.productmicroservice.services.impl.ProductServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    // variable for fetching product service.

    @Autowired
    private ProductServiceimpl productServiceimpl;


    // method for fetching details of a product
    // based on it's unique "productId".

    @RequestMapping(method = RequestMethod.GET, value = "/product")
    ProductDTO getProduct(@RequestParam String productId) {
        return productServiceimpl.getProduct(productId);
    }


    // method for add a new product in database
    // requires full details of the product in
    // ProductDTO format

    @PostMapping(name = "/addProduct")
    void addProduct(@RequestBody ProductDTO productDTO) {
        productServiceimpl.addProduct(productDTO);
    }


    // method for deleting a product from database
    // based on it's unique "productId".

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteProduct")
    ProductDTO deleteProduct(@RequestParam String productId) {
        return productServiceimpl.deleteProduct(productId);
    }


    // method for fetching all the products
    // lying a particular category.

    @RequestMapping(method = RequestMethod.GET, value = "/category")
    List<Product> getByCategory(@RequestParam String category) {return productServiceimpl.findProductByCategory(category);}


    //method for fetching the products on the front page.

    @RequestMapping(method = RequestMethod.GET, value = "/landing")
    List<Product> landingPage() {
        List<Product> phone = productServiceimpl.findProductByCategory("Phones");
        List<Product> laptop = productServiceimpl.findProductByCategory("Laptop");
        //List<Product> tv = productServiceimpl.findProductByCategory("Tv");
        ArrayList<Product> trendingProducts = new ArrayList<>();
        trendingProducts.add(phone.get(0));
        trendingProducts.add(phone.get(1));
        trendingProducts.add(phone.get(2));
        trendingProducts.add(phone.get(3));
        trendingProducts.add(laptop.get(0));
        trendingProducts.add(laptop.get(1));
        trendingProducts.add(laptop.get(2));
        trendingProducts.add(laptop.get(3));
        /*trendingProducts.add(tv.get(0));
        trendingProducts.add(tv.get(1));
        trendingProducts.add(tv.get(2));
        trendingProducts.add(tv.get(3));*/
        return trendingProducts;
    }
}

