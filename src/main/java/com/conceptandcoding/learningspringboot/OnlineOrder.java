package com.conceptandcoding.learningspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Qualifier("online")
public class OnlineOrder implements Order{
    public OnlineOrder(){
        System.out.println("Online Order Initialized");
    }
}
