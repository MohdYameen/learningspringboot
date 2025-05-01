package com.conceptandcoding.learningspringboot.productOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {

    @Autowired
    OrderRepository orderRepository;
    public OrderDetails saveOrder(OrderDetails orderDetails) {
        return orderRepository.save(orderDetails);
    }

    public OrderDetails getById(Long primaryKey) {
        return orderRepository.findById(primaryKey).get();
    }
    public List<OrderDetails> findAll() {
        return orderRepository.findAll();
    }
}
