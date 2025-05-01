package com.conceptandcoding.learningspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("offline")

@Lazy
public class OfflineOrder implements Order{
    public OfflineOrder(){
        System.out.println("Offline Order Initialized");
    }
}
