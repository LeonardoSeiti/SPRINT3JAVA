package com.emi.sprint1java.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthApiController {
    
    @Autowired
    private AuthService authService;

    @PostMapping("/api/login")
    public Token login(@RequestBody Credentials credentials){
        return authService.login(credentials);
    }


    @GetMapping("/api/logout")
    public String logout(){
        return "Logout";
    }
}

