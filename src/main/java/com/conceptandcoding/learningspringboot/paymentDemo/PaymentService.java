package com.conceptandcoding.learningspringboot.paymentDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public PaymentResponse getPaymentById(PaymentRequest internalReqObj){
        PaymentEntity paymentModel = paymentRepository.getPaymentById(internalReqObj);


        PaymentResponse paymentResponse = mapModelToDTO(paymentModel);
        return paymentResponse;
    }

    public PaymentResponse mapModelToDTO(PaymentEntity paymentEntity){
        PaymentResponse response = new PaymentResponse();

        response.setId(paymentEntity.getId());
        response.setAmount(paymentEntity.getAmount());
        response.setCurrency(paymentEntity.getCurrency());

        return response;
    }
}
