package com.conceptandcoding.learningspringboot.jdbcDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jdbc-api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get-user-using-jdbc")
    public List<UserDB> getUser(){
        userService.createTable();

        userService.insertUser("Yameen", 25);
        userService.insertUser("Sahil", 25);

        return userService.getAllUsers();
    }
}
