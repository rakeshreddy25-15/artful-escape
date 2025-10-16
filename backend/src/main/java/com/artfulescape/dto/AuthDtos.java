package com.artfulescape.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AuthDtos {
    public static class RegisterRequest {
        @NotBlank
        public String name;
        @Email @NotBlank
        public String email;
        @NotBlank @Size(min = 8)
        public String password;
    }

    public static class LoginRequest {
        @Email @NotBlank
        public String email;
        @NotBlank
        public String password;
    }

    public static class AuthResponse {
        public String token;
        public String role;
        public String name;
        public String email;

        public AuthResponse(String token, String role, String name, String email) {
            this.token = token;
            this.role = role;
            this.name = name;
            this.email = email;
        }
    }
}
