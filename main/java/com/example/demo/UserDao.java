package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserDao() {

    }

    public void createUser(String username, String password, String first_name, String last_name){
        String sql = "INSERT INTO `users` (`username`, `password`, `first_name`, `last_name`)" +
                "VALUES(?, ?, ?, ?)";
        int result = this.jdbcTemplate.update(sql, username, password, first_name, last_name);

        if(result > 0){
            System.out.println("A new row has been inserted.");
        }
    }
}
