package com.conceptandcoding.learningspringboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "mysqlconnect", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MySQLConnection {
    MySQLConnection(){
        System.out.println("MySQL Connnection Bean Initialized");
    }
}
