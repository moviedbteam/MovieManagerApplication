package com.bcefit.projet.exposition.user.dto;

import java.util.Set;

public class UserAccountDto {

    private Long idUser;

    private String userName;

    private String email;

    private Integer birthYear;

    private boolean adultContent;

    private boolean enableAccount;


    Set<GenreMovieDto> genreMovieDtoSet;

    Set<GenreTvDto> genreTvDtoSet;

    public UserAccountDto() {
    }

    public UserAccountDto(Long idUser, String userName, String email, Integer birthYear, boolean adultContent, boolean enableAccount, Set<GenreMovieDto> genreMovieDtoSet, Set<GenreTvDto> genreTvDtoSet) {
        this.idUser = idUser;
        this.userName = userName;
        this.email = email;
        this.birthYear = birthYear;
        this.adultContent = adultContent;
        this.enableAccount = enableAccount;
        this.genreMovieDtoSet = genreMovieDtoSet;
        this.genreTvDtoSet = genreTvDtoSet;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isAdultContent() {
        return adultContent;
    }

    public void setAdultContent(boolean adultContent) {
        this.adultContent = adultContent;
    }

    public boolean isEnableAccount() {
        return enableAccount;
    }

    public void setEnableAccount(boolean enableAccount) {
        this.enableAccount = enableAccount;
    }

    public Set<GenreMovieDto> getGenreMovieDtoSet() {
        return genreMovieDtoSet;
    }

    public void setGenreMovieDtoSet(Set<GenreMovieDto> genreMovieDtoSet) {
        this.genreMovieDtoSet = genreMovieDtoSet;
    }

    public Set<GenreTvDto> getGenreTvDtoSet() {
        return genreTvDtoSet;
    }

    public void setGenreTvDtoSet(Set<GenreTvDto> genreTvDtoSet) {
        this.genreTvDtoSet = genreTvDtoSet;
    }

}
