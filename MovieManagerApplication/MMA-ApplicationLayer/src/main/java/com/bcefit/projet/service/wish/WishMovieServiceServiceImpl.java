package com.bcefit.projet.service.wish;


import com.bcefit.projet.domain.user.UserAccount;
import com.bcefit.projet.domain.wish.WishMovie;
import com.bcefit.projet.infrastructure.IWishMovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class WishMovieServiceServiceImpl implements IWishMovieService{

    Logger logger = LoggerFactory.getLogger(WishMovieServiceServiceImpl.class);

    @Autowired
    IWishMovieRepository repository;



    @Override
    public Iterable<WishMovie> findAllByUserAccountId(UserAccount userAccount) {
        Optional<List<WishMovie>> WishMovieList = repository.findWishMoviesByUserAccount(userAccount.getIdUser());
        logger.debug("service findbyId {}", userAccount.getIdUser());
        if (WishMovieList.isPresent()) {
            return WishMovieList.get();
        } else {
            logger.error("pas de wish movie avec l'id user {}", userAccount.getIdUser());
            throw new EntityNotFoundException("Pas de wish movie en base");
        }
    }

    @Override
    public WishMovie findById(Long id) {
        Optional<WishMovie> optionalWishMovie = repository.findById(id);
        logger.debug("service findbyId {}", id);
        if (optionalWishMovie.isPresent()) {
            return optionalWishMovie.get();
        } else {
            logger.error("pas de wish movie avec l'id  {}", id);
            throw new EntityNotFoundException("Le wish movie n'existe pas");
        }
    }

    @Override
    public WishMovie createWishMovie(WishMovie wishMovie) {
        return repository.save(wishMovie);
    }
}
