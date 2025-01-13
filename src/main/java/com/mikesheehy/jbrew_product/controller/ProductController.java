package com.mikesheehy.jbrew_product.controller;

import org.springframework.web.bind.annotation.*;
import com.mikesheehy.jbrew_product.dto.ProductRequest;
import com.mikesheehy.jbrew_product.dto.ProductResponse;
import com.mikesheehy.jbrew_product.service.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
