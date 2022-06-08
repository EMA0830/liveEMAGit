package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;

@RestController
@RequestMapping("/rest")
public class ProductController {
//    @GetMapping("/product")
//    public Product product() {
//        return new Product("P01", "Power of Now");
//    }
    @GetMapping("/products")
    public List getProducts() {
    	List productList = new ArrayList<Product>();
        productList.add(new Product("P01", "Power of Now"));
        productList.add(new Product("P02", "Start With Why"));
        productList.add(new Product("P03", "Can't Hurt Me"));
        return productList;
    }
}

