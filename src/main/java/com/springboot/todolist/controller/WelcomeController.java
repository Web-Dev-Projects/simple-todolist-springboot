package com.springboot.todolist.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping(value = "/")
    public String getWelcomePage(ModelMap modelMap){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        modelMap.put("username",username);
        return "welcome";
    }
    
}
