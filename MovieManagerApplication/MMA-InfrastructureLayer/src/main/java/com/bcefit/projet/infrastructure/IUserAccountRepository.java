package com.bcefit.projet.infrastructure;

import com.bcefit.projet.domain.user.UserAccount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface IUserAccountRepository extends CrudRepository<UserAccount , Long> {

    List<UserAccount> findUserAccountsByGenreMovieSet(Long id);

    List<UserAccount> findUserAccountsByGenreTvSet(Long id);
}
