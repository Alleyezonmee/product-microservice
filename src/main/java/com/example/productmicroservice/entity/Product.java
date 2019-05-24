package com.example.productmicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;

@Document(collection = Product.COLLECTION_NAME)
public class Product {
    public static final String COLLECTION_NAME = "product";
    @Id
    private String productId;
    private String productName;
    private String productCategory;
    private String[] imageURLs;
    private String productDesciption;
    private ArrayList<Variant> variants;
    private ArrayList<Review> reviews;

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public static String getCollectionName() {
        return COLLECTION_NAME;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String[] getImageURLs() {
        return imageURLs;
    }

    public void setImageURLs(String[] imageURLs) {
        this.imageURLs = imageURLs;
    }

    public String getProductDesciption() {
        return productDesciption;
    }

    public void setProductDesciption(String productDesciption) {
        this.productDesciption = productDesciption;
    }

    public ArrayList<Variant> getVariants() {
        return variants;
    }

    public void setVariants(ArrayList<Variant> variants) {
        this.variants = variants;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", imageURLs=" + Arrays.toString(imageURLs) +
                ", productDesciption='" + productDesciption + '\'' +
                ", variants=" + variants +
                '}';
    }
}
