package com.springboot.todolist.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
    public LoginService() {
        super();
    }

    public boolean login(String username,String password) {
        return username.equals("shehab") && password.equals("shehab");
    }
    
}
