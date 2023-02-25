package com.bcefit.projet.domain.wish;

import com.bcefit.projet.domain.user.UserAccount;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wish_movie")
public class WishMovie extends WishContent{

    private Integer idMovie;

    private Integer idCollection;


    public WishMovie(Long idWish, UserAccount userAccount, Integer idMovie, Integer idCollection) {
        super(idWish, userAccount);
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }

    public WishMovie() {

    }

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public Integer getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(Integer idCollection) {
        this.idCollection = idCollection;
    }
}
