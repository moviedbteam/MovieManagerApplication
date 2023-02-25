package com.bcefit.projet.exposition.wish.dto;

import com.bcefit.projet.domain.user.UserAccount;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class WishMovieDto {

    private Long idWish;

    private UserAccount userAccount;

    private Integer idMovie;

    private Integer idCollection;

    public WishMovieDto() {
    }

    public WishMovieDto(Long idWish, UserAccount userAccount, Integer idMovie, Integer idCollection) {
        this.idWish = idWish;
        this.userAccount = userAccount;
        this.idMovie = idMovie;
        this.idCollection = idCollection;
    }

    public Long getIdWish() {
        return idWish;
    }

    public void setIdWish(Long idWish) {
        this.idWish = idWish;
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

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
