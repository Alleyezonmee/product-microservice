package com.example.productmicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;

@Document(collection = Product.COLLECTION_NAME)
public class Product {
    public static final String COLLECTION_NAME = "product"; // name of collection.

    @Id
    private String productId; // unique id.

    private String productName; // name of the product.

    private String productCategory; // category in which product falls.
                                    // Should be given as "Phones" or "Laptops" or "Tvs".

    private String[] imageURLs; // array of image urls for the product.

    private String productDescription; // brief description of product.

    private ArrayList<Variant> variants; // a list containing all the detail about the specification a product.

    private ArrayList<Review> reviews; //  a list containing reviews of the product.


    // getters and setters.

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

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
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
                ", productDescription='" + productDescription + '\'' +
                ", variants=" + variants +
                '}';
    }
}
