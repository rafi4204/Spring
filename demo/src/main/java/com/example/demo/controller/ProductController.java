package com.example.demo.controller;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public String getProduct(Model model) {

        model.addAttribute("products", productService.getProducts());

        return "product_all";
    }

    @GetMapping("/{productId}")
    public String getProductById(Model model, @PathVariable("productId") String id){
        model.addAttribute("product",productService.getProductById(id));
        return "product";
    }
}
