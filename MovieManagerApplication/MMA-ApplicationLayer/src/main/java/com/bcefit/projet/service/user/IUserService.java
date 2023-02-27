package com.bcefit.projet.service.user;

import com.bcefit.projet.domain.user.User;
import org.hibernate.sql.Update;

public interface IUserService {

    User createUser(User user);

    User updateUser(User user);

    User findUserById(Long idUser);

}
