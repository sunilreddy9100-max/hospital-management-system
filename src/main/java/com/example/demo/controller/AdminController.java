package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping("/login")
    public String login(@RequestBody Admin admin) {

        Admin validAdmin =
                service.login(admin.getUsername(), admin.getPassword());

        if(validAdmin != null) {

            return "Login Success";

        } else {

            return "Invalid Username or Password";

        }

    }

}