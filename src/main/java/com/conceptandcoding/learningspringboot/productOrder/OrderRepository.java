package com.conceptandcoding.learningspringboot.productOrder;

import com.conceptandcoding.learningspringboot.jpaDemo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Long> {

}