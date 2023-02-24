package com.bcefit.projet.exposition.user.dto;

import java.util.Set;

public class GenreTvUserDto {
    private Long id;
    private String name;

    private Set<UserAccountDto> userAccountDtoSet;

    public GenreTvUserDto() {
    }

    public GenreTvUserDto(Long id, String name) {
        this.id = id;
        this.name = name;
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
