package com.bcefit.projet.service.user;


import com.bcefit.projet.domain.user.User;
import com.bcefit.projet.domain.user.UserAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    IUserAccountService iUserAccountService;

    @Autowired
    IUserIamService iUserIamService;

    Logger logger = LoggerFactory.getLogger(IUserService.class);

    @Override
    public User createUser(User user) {

        return new User(iUserAccountService.createUserAccount(user.getUserAccount()),iUserIamService.createUserIam(user.getUserIam()));

    }

    @Override
    public User updateUser(User user) {

        return new User(iUserAccountService.updateUserAccount(user.getUserAccount()),iUserIamService.updateUserIam(user.getUserIam()));

    }

    @Override
    public User findUserById(Long idUser) {

        UserAccount userAccount = iUserAccountService.findById(idUser);

        return new User((iUserAccountService.findById(idUser)),iUserIamService.findUserIamByLoggin(userAccount.getEmail()));

    }

}
