package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.function.Predicate;

@Service
public class ProductService {

    public ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("1", "android", "android mobile", 25000, "Mr. x"));
        products.add(new Product("2", "Iphone", "Iphone mobile", 75000, "Mr. y"));
        products.add(new Product("3", "cross", "cross mobile", 25000, "Mr. z"));
        return products;
    }

    public Product getProductById(String id) {

        Predicate<Product> byId = a -> a.getId().equals(id);
        return filterProducts(byId);
    }

    public Product filterProducts(Predicate<Product> strategy) {
        return getProducts().stream().filter(strategy).findFirst().orElse(null);
    }
}
