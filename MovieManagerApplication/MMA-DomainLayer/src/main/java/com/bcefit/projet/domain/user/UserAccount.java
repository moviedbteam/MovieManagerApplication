package com.bcefit.projet.domain.user;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user", nullable = false)
    private Long idUser;

    private String userName;

    private String email;

    private Integer birthYear;

    private boolean adultContent;

    private boolean enableAccount;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "UserAccount_GenreMovie",
            joinColumns =  { @JoinColumn(name = "id_user") },
            inverseJoinColumns = { @JoinColumn(name = "id") })
    private Set<GenreMovie> genreMovieSet= new HashSet<>();


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "UserAccount_GenreTv",
            joinColumns =  { @JoinColumn(name = "id_user") },
            inverseJoinColumns = { @JoinColumn(name = "id") })
    private Set<GenreTv> genreTvSet= new HashSet<>();

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public UserAccount() {
    }

    public UserAccount(Long idUser, String userName, String email, Integer birthYear, boolean adultContent, boolean enableAccount) {
        this.idUser = idUser;
        this.userName = userName;
        this.email = email;
        this.birthYear = birthYear;
        this.adultContent = adultContent;
        this.enableAccount = enableAccount;
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


    public void addGenreMovie(GenreMovie genreMovie){
        this.genreMovieSet.add(genreMovie);
        genreMovie.getUserAccounts().add(this);
    }

    public void addGenreTv(GenreTv genreTv){
        this.genreTvSet.add(genreTv);
        genreTv.getUserAccounts().add(this);
    }

    public void removeGenreMovie(Long id){
        GenreMovie genreMovie = this.genreMovieSet.stream().filter(t-> t.getId() == id).findFirst().orElse(null);
        if (genreMovie != null){
            this.genreMovieSet.remove(genreMovie);
            genreMovie.getUserAccounts().remove(this);
        }
    }

    public void removeGenreTv(Long id){
        GenreTv genreTv = this.genreTvSet.stream().filter(t-> t.getId() == id).findFirst().orElse(null);
        if (genreTv != null){
            this.genreTvSet.remove(genreTv);
            genreTv.getUserAccounts().remove(this);
        }
    }

    public Set<GenreMovie> getGenreMovieSet() {
        return genreMovieSet;
    }

    public void setGenreMovieSet(Set<GenreMovie> genreMovieSet) {
        this.genreMovieSet = genreMovieSet;
    }

    public Set<GenreTv> getGenreTvSet() {
        return genreTvSet;
    }

    public void setGenreTvSet(Set<GenreTv> genreTvSet) {
        this.genreTvSet = genreTvSet;
    }
}

