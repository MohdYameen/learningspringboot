package com.conceptandcoding.learningspringboot.productOrder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-api")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product")
    public ProductDetails insertUsers(@RequestBody ProductDetails productDetails){
        return productService.saveUser(productDetails);
    }

}
