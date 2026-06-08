package com.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class simpleContro {

    @GetMapping("/home")
    @PreAuthorize("hasAuthority('ROLE_USER')")  // Role-based access
    public String homepage() {
        return "home";  // returns home.html view
    }

    @GetMapping("/about")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String aboutpage() {
        return "about";  // returns about.html view
    }
}
