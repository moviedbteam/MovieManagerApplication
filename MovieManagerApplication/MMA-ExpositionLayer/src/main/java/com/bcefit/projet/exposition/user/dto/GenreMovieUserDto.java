package com.bcefit.projet.exposition.user.dto;


import com.bcefit.projet.domain.user.UserAccount;

import java.util.Set;

public class GenreMovieUserDto {

    private Long id;
    private String name;

    private Set<UserAccountDto> userAccountDtoSet;
    public GenreMovieUserDto() {
    }

    public GenreMovieUserDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public GenreMovieUserDto(Long id, String name, Set<UserAccountDto> userAccountDtoSet) {
        this.id = id;
        this.name = name;
        this.userAccountDtoSet = userAccountDtoSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserAccountDto> getUserAccountsDto() {
        return userAccountDtoSet;
    }

    public void setUserAccountsDto(Set<UserAccountDto> userAccountDtoSet) {
        this.userAccountDtoSet = userAccountDtoSet;
    }
}
