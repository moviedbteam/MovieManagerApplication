package com.bcefit.projet.service.user;

import com.bcefit.projet.domain.user.UserIam;

public interface IUserIamService{

    UserIam findUserIamByLoggin(String loggin);

    UserIam createUserIam(UserIam userIam);

    UserIam updateUserIam(UserIam userIam);


}
