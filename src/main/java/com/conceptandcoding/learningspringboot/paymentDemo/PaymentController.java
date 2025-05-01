package com.conceptandcoding.learningspringboot.paymentDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-api")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{paymentId}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long paymentId){

        PaymentRequest internalReqObj = new PaymentRequest();
        internalReqObj.setId(paymentId);

        PaymentResponse paymentResponse = paymentService.getPaymentById(internalReqObj);

        return ResponseEntity.ok(paymentResponse);
    }
}
