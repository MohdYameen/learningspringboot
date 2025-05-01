package com.conceptandcoding.learningspringboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "nosqlconnect", value = "enabled", havingValue = "true", matchIfMissing = false)
public class NoSQLConnection {
    NoSQLConnection(){
        System.out.println("NoSQL Connnection Bean Initialized");
    }
}
