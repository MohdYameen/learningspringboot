package com.conceptandcoding.learningspringboot.paymentDemo;

import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity paymentModel = executeQuery(request);
        return paymentModel;
    }

    public PaymentEntity executeQuery(PaymentRequest request){
        PaymentEntity payment = new PaymentEntity();

        payment.setId(request.getId());
        payment.setAmount(10000);
        payment.setCurrency("INR");
        return payment;
    }
}
