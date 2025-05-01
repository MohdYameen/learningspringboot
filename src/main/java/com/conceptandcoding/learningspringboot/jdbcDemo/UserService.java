package com.conceptandcoding.learningspringboot.jdbcDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createTable(){
        userRepository.createTable();
        System.out.println("Created Table Successfully. ");
    }

    public void insertUser(String name, int age){
        userRepository.insertUser(name, age);
        System.out.println("Inserted into Table Successfully. ");
    }

    public List<UserDB> getAllUsers(){
        List<UserDB> usersList =  userRepository.getUsers();
        for(UserDB user : usersList){
            System.out.println("Username : "+user.getuName() +", Age : "+user.getuAge()+". ");
        }

        return usersList;
    }
}
