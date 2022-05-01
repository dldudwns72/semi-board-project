package com.project.board.controller;

import com.project.board.entity.User;
import com.project.board.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "/register")
    void createUser(@RequestBody User user){
        userRepository.save(user);
    }

}
