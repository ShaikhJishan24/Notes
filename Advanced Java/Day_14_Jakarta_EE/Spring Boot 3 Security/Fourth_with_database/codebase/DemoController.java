package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/public")
    public String publicPage() {
        return "This is a public page!";
    }

    @GetMapping("/secure")
    public String securePage() {
        return "You are authenticated!";
    }
}

