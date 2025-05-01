package com.conceptandcoding.learningspringboot;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

    @Autowired(required = false)
    MySQLConnection mysql;

    @Autowired(required = false)
    NoSQLConnection nosql;

    @PostConstruct
    public void init(){
        System.out.println("DB Connection Bean Initialized");
        System.out.println("MySQL Bean : "+ mysql);
        System.out.println("MySQL Bean : "+ nosql);
    }

//    DBConnection(){
//        System.out.println("DB Connnection Bean Initialized");
//        System.out.println("MySQL Bean : "+ mysql);
//        System.out.println("NoSQL Bean : "+ nosql);
//    }
}
