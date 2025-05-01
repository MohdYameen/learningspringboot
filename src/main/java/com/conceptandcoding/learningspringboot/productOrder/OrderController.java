package com.conceptandcoding.learningspringboot.productOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

//ManyToMany working example with new table

@RestController
@RequestMapping("/order-api")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    ProductService productService;

    @GetMapping("/order/{id}")
    public OrderDetails fetchUser(@PathVariable Long id){
        return orderService.getById(id);
    }

    @PostMapping("/order")
    public OrderDetails insertOrder(@RequestBody OrderDetails orderDetails){

        List<ProductDetails> managedProducts = orderDetails.getProductDetails().stream()
                .map(product -> productService.getById(product.getProductId()))
                .collect(Collectors.toList());

        orderDetails.setProductDetails(managedProducts);
        return orderService.saveOrder(orderDetails);

    }


}
