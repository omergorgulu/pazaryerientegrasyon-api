package com.example.pazaryerientegrasyon.service;

import com.example.pazaryerientegrasyon.domain.model.loginapi.LoginRequest;
import com.example.pazaryerientegrasyon.domain.model.loginapi.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest request);
}
