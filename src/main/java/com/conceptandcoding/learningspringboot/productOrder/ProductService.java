package com.conceptandcoding.learningspringboot.productOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public ProductDetails saveUser(ProductDetails productDetails) {
        return productRepository.save(productDetails);
    }

    public ProductDetails getById(Long primaryKey) {
        return productRepository.findById(primaryKey).get();
    }
    public List<ProductDetails> findAll() {
        return productRepository.findAll();
    }

}
