package com.example.pazaryerientegrasyon.controller.v1;

import com.example.pazaryerientegrasyon.domain.model.loginapi.LoginRequest;
import com.example.pazaryerientegrasyon.domain.model.loginapi.LoginResponse;
import com.example.pazaryerientegrasyon.service.AuthService;
import com.example.pazaryerientegrasyon.service.impl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request){
        return authService.login(request);
    }
}
