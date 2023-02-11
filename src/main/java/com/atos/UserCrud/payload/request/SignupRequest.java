package com.atos.UserCrud.payload.request;

import java.util.List;
import java.util.Set;

public class SignupRequest {
    private String username;
    private String password;
    private String email;
    private Set<String> role;

    public SignupRequest() {
    }

    public SignupRequest(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> roles) {
        this.role = roles;
    }
}
