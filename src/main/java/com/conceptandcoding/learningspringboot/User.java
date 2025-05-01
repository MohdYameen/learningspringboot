package com.conceptandcoding.learningspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {


    @Qualifier("online")
    @Autowired
    Order order;

    public User(){
        System.out.println("User Initialized");
    }
}
