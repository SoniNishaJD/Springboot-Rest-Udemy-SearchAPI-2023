package com.nishasoni.springboot.service;

import com.nishasoni.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
