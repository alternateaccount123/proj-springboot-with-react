package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReactAppController {

    @GetMapping("/")
    public String index(Model model) {
        return "mainpage";
    }
}

