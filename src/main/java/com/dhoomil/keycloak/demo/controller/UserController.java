package com.dhoomil.keycloak.demo.controller;

import com.dhoomil.keycloak.demo.model.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @GetMapping("/admin/greet")
    public Message sayHelloToAdmin() {
        return new Message("Hello, Admin");
    }

    @GetMapping("/user/greet")
    public Message sayHelloToUser() {
        return new Message("Hello, User");
    }
}
