package com.bcefit.projet.domain.user;

public class User {

    private UserAccount userAccount;

    private UserIam userIam;

    public User() {
    }

    public User(UserAccount userAccount, UserIam userIam) {
        this.userAccount = userAccount;
        this.userIam = userIam;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public UserIam getUserIam() {
        return userIam;
    }

    public void setUserIam(UserIam userIam) {
        this.userIam = userIam;
    }
}
