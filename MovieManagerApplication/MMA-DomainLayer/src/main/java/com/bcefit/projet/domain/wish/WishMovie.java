package com.bcefit.projet.domain.wish;

import com.bcefit.projet.domain.user.UserAccount;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wish_movie")
public class WishMovie extends WishContent{

    private Long idMovie;

    private Long idCollection;


    public WishMovie(Long idWish, UserAccount userAccount, Long idMovie, Long idCollection) {
        super(idWish, userAccount);
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }

    public WishMovie() {

    }

    public Long getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Long idMovie) {
        this.idMovie = idMovie;
    }

    public Long getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(Long idCollection) {
        this.idCollection = idCollection;
    }
}
