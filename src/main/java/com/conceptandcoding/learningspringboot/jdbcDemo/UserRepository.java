package com.conceptandcoding.learningspringboot.jdbcDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createTable(){
        jdbcTemplate.execute("CREATE TABLE USERTABLE(USER_ID INT AUTO_INCREMENT PRIMARY KEY, USER_NAME VARCHAR(255), USER_AGE INT);");
    }

    public void insertUser(String userName, int userAge){
        String sqlQuery = "INSERT INTO USERTABLE(USER_NAME,USER_AGE) VALUES(?,?);";
        jdbcTemplate.update(sqlQuery, userName, userAge);
    }

    public List<UserDB> getUsers(){

        String sqlQuery = "SELECT * FROM USERTABLE;";

        return jdbcTemplate.query(sqlQuery, (rs, rowNum) -> {
            UserDB user = new UserDB();
            user.setuId(rs.getInt("USER_ID"));
            user.setuName(rs.getString("USER_NAME"));
            user.setuAge(rs.getInt("USER_AGE"));
            return user;
        });

    }
}
