package com.mikesheehy.jbrew_product.service;

import org.springframework.stereotype.Service;

import com.mikesheehy.jbrew_product.dto.ProductRequest;
import com.mikesheehy.jbrew_product.model.Product;
import com.mikesheehy.jbrew_product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest){
        Product product = Product.builder()
        .name(productRequest.name())
        .description(productRequest.description())
        .price(productRequest.price())
        .build();
    productRepository.save(product);
    log.info("Product {} is saved", product.getId());
    return product;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
