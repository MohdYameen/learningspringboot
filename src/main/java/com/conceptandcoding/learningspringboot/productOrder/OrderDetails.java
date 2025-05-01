package com.conceptandcoding.learningspringboot.productOrder;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "order_details")
@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<ProductDetails> productDetails = new ArrayList<>();


    public Long getOrderNo() {
        return orderNo;
    }

    public List<ProductDetails> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<ProductDetails> productDetails) {
        this.productDetails = productDetails;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

}
