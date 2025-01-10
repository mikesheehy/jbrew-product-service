package com.mikesheehy.jbrew_product.controller;

import org.springframework.web.bind.annotation.*;
import com.mikesheehy.jbrew_product.dto.ProductRequest;
import com.mikesheehy.jbrew_product.model.Product;
import com.mikesheehy.jbrew_product.service.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
