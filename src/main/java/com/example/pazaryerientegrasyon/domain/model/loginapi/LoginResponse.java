package com.example.pazaryerientegrasyon.domain.model.loginapi;

import lombok.Data;

import java.util.List;

@Data
public class LoginResponse {
    private boolean result;
    private List<String> grants;
}
