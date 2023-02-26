package com.bcefit.projet.domain.wish;

import com.bcefit.projet.domain.user.UserAccount;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wish_episode")
public class WishEpisode extends WishContent{

    private Long idEpisode;

    private Long idSeason;

    private Long idTv;


    public WishEpisode(Long idWish, UserAccount userAccount, Long idEpisode, Long idSeason, Long idTv) {
        super(idWish, userAccount);
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
    }

    public WishEpisode(Long idEpisode, Long idSeason, Long idTv) {
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        this.idTv = idTv;
    }

    public WishEpisode() {

    }

    public Long getIdEpisode() {
        return idEpisode;
    }

    public void setIdEpisode(Long idEpisode) {
        this.idEpisode = idEpisode;
    }

    public Long getIdSeason() {
        return idSeason;
    }

    public void setIdSeason(Long idSeason) {
        this.idSeason = idSeason;
    }

    public Long getIdTv() {
        return idTv;
    }

    public void setIdTv(Long idTv) {
        this.idTv = idTv;
    }
}
