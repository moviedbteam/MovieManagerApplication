package com.bcefit.projet.service.user;

import com.bcefit.projet.domain.user.UserAccount;

public interface IUserAccountService {

    UserAccount findById(Long idUser);

    UserAccount createUserAccount(UserAccount userAccount);

    void deleteUserAccount(UserAccount userAccount);

    void updateUserAccount(UserAccount userAccount);

    Iterable<UserAccount> findAll();
}
