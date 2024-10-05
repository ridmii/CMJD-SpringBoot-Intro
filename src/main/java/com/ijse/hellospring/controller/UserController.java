package com.ijse.hellospring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.hellospring.entity.User;
import com.ijse.hellospring.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
}
