package com.example.myFirstProject.controller;

import com.example.myFirstProject.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/roza")
    public User getUser()
    {
        return new User("Roza", 1l);
    }
}
