package com.example.hospitalplus.controller;

import com.example.hospitalplus.entity.User;
import com.example.hospitalplus.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    @Autowired
    private MyUserDetailsService userDetailsService;

    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userDetailsService.saveUser(user);
        return ResponseEntity.ok("User registration successful");
    }
}
