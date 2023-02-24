package com.bcefit.projet.exposition.user.dto;

import java.util.Set;

public class UserAccountDto {

    private Long idUser;

    private String userName;

    private String email;

    private Integer birthYear;

    private boolean adultContent;

    private boolean enableAccount;


    Set<GenreMovieUserDto> genreMovieUserDtoSet;

    Set<GenreTvUserDto> genreTvUserDtoSet;

    public UserAccountDto() {
    }

    public UserAccountDto(Long idUser, String userName, String email, Integer birthYear, boolean adultContent, boolean enableAccount, Set<GenreMovieUserDto> genreMovieUserDtoSet, Set<GenreTvUserDto> genreTvUserDtoSet) {
        this.idUser = idUser;
        this.userName = userName;
        this.email = email;
        this.birthYear = birthYear;
        this.adultContent = adultContent;
        this.enableAccount = enableAccount;
        this.genreMovieUserDtoSet = genreMovieUserDtoSet;
        this.genreTvUserDtoSet = genreTvUserDtoSet;
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

    public Set<GenreMovieUserDto> getGenreMovieUserDtoSet() {
        return genreMovieUserDtoSet;
    }

    public void setGenreMovieUserDtoSet(Set<GenreMovieUserDto> genreMovieUserDtoSet) {
        this.genreMovieUserDtoSet = genreMovieUserDtoSet;
    }

    public Set<GenreTvUserDto> getGenreTvUserDtoSet() {
        return genreTvUserDtoSet;
    }

    public void setGenreTvUserDtoSet(Set<GenreTvUserDto> genreTvUserDtoSet) {
        this.genreTvUserDtoSet = genreTvUserDtoSet;
    }

    public void addGenreMovie(GenreMovieUserDto genreMovieUserDto){
        this.genreMovieUserDtoSet.add(genreMovieUserDto);
        genreMovieUserDto.getUserAccountsDto().add(this);
    }

    public void addGenreTv(GenreTvUserDto genreTvUserDto){
        this.genreTvUserDtoSet.add(genreTvUserDto);
        genreTvUserDto.getUserAccountsDto().add(this);
    }

    public void removeGenreMovie(Long id){
        GenreMovieUserDto genreMovieUserDto = this.genreMovieUserDtoSet.stream().filter(t-> t.getId() == id).findFirst().orElse(null);
        if (genreMovieUserDto != null){
            this.genreMovieUserDtoSet.remove(genreMovieUserDto);
            genreMovieUserDto.getUserAccountsDto().remove(this);
        }
    }

    public void removeGenreTv(Long id){
        GenreTvUserDto genreTvUserDto = this.genreTvUserDtoSet.stream().filter(t-> t.getId() == id).findFirst().orElse(null);
        if (genreTvUserDto != null){
            this.genreTvUserDtoSet.remove(genreTvUserDto);
            genreTvUserDto.getUserAccountsDto().remove(this);
        }
    }
}
