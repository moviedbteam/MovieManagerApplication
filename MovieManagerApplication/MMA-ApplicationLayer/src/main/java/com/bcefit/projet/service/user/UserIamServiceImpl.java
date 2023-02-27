package com.bcefit.projet.service.user;

import com.bcefit.projet.domain.user.UserIam;
import org.springframework.stereotype.Service;

@Service
public class UserIamServiceImpl implements IUserIamService{

    @Override
    public UserIam findUserIamByLoggin(String loggin) {
        return new UserIam("loginRenaud","myPassword");
    }

    @Override
    public UserIam createUserIam(UserIam userIam) {

        return userIam;
    }

    @Override
    public UserIam updateUserIam(UserIam userIam) {
        return userIam;
    }
}
