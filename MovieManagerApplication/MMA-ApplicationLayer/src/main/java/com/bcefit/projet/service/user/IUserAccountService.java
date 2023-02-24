package com.bcefit.projet.service.user;

import com.bcefit.projet.domain.user.UserAccount;

import java.util.UUID;

public interface IUserAccountService {

    UserAccount findById(Long idUser);

    void createUserAccount(UserAccount userAccount);

    void deleteUserAccount(UserAccount userAccount);

    void updateUserAccount(UserAccount userAccount);

}
