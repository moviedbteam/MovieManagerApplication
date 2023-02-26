package com.bcefit.projet.exposition.watch.dto;

import com.bcefit.projet.domain.user.UserAccount;

public class WatchEpisodeDto {

    private Long idWatch;

    private UserAccount userAccount;

    private Long idEpisode;

    private Long idSeason;

    private Long IdTv;

    public WatchEpisodeDto() {
    }

    public WatchEpisodeDto(Long idWatch, UserAccount userAccount, Long idEpisode, Long idSeason, Long idTv) {
        this.idWatch = idWatch;
        this.userAccount = userAccount;
        this.idEpisode = idEpisode;
        this.idSeason = idSeason;
        IdTv = idTv;
    }

    public Long getIdWatch() {
        return idWatch;
    }

    public void setIdWatch(Long idWatch) {
        this.idWatch = idWatch;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
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
        return IdTv;
    }

    public void setIdTv(Long idTv) {
        IdTv = idTv;
    }
}
