package com.bcefit.projet.domain.user;

public class UserIam {


    private String loggin;
    private String password;

    public UserIam() {
    }

    public UserIam(String loggin, String password) {
        this.loggin = loggin;
        this.password = password;
    }

    public String getLoggin() {
        return loggin;
    }

    public void setLoggin(String loggin) {
        this.loggin = loggin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
