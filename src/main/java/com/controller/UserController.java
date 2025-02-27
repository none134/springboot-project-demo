package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id) {
        // 参数校验
        if (id == null || id <= 0){
            PrintStream err = System.err;
            err.println("参数不合法");
            return null;
        }
        else {
            return userService.getUserById(id);
        }
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }
}
