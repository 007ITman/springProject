package com.example.demo.dto;


import java.io.Serializable;

public class LoginDto implements Serializable {

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    private String loginName;

    private String loginPassword;


}
