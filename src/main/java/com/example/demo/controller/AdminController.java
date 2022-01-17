package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public String adminList(Model model) {
        model.addAttribute("allUsers", userService.allUsers());
        return "admin";
    }
    @GetMapping("/user")
    public String userList(Model model) {
        model.addAttribute("allUsers", userService.allUsers());
        return "user";
    }
}
