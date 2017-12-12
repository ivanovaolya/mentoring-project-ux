package com.mentoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "registration";
    }
}
