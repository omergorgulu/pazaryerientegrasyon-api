package com.example.pazaryerientegrasyon.controller.v1;

import com.example.pazaryerientegrasyon.domain.model.loginapi.LoginRequest;
import com.example.pazaryerientegrasyon.domain.model.loginapi.LoginResponse;
import com.example.pazaryerientegrasyon.service.impl.AuthServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request){
        AuthServiceImpl authService = new AuthServiceImpl();
        return authService.login(request);
    }
}
