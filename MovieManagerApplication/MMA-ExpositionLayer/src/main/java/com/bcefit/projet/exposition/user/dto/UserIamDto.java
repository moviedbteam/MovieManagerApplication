package com.bcefit.projet.exposition.user.dto;

public class UserIamDto {


    private String password;

    public UserIamDto() {
    }

    public UserIamDto(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
