package com.example.pazaryerientegrasyon.service.impl;

import com.example.pazaryerientegrasyon.domain.model.loginapi.LoginRequest;
import com.example.pazaryerientegrasyon.domain.model.loginapi.LoginResponse;
import com.example.pazaryerientegrasyon.service.AuthService;

import java.util.ArrayList;
import java.util.List;

public class AuthServiceImpl implements AuthService {

    @Override
    public LoginResponse login(LoginRequest request) {
        LoginResponse response = new LoginResponse();
        if("admin".equals(request.getUsername()) && "1".equals(request.getPassword())){
            response.setResult(true);
            List<String> grants = new ArrayList<>();
            grants.add("ROLE_SHOW_MENU");
            grants.add("ROLE_SHOW_DETAILS");
            grants.add("ROLE_SHOW_ITEMS");
            grants.add("ROLE_ADD;_ITEMS");
            response.setGrants(grants);
        }
        return response;
    }
}
