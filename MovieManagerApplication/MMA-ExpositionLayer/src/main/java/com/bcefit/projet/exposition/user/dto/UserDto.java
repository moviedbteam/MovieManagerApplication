package com.bcefit.projet.exposition.user.dto;

public class UserDto {

    private UserIamDto userIamDto;

    private UserAccountDto userAccountDto;


    public UserDto() {
    }

    public UserDto(UserIamDto userIamDto, UserAccountDto userAccountDto) {
        this.userIamDto = userIamDto;
        this.userAccountDto = userAccountDto;
    }

    public UserIamDto getUserIamDto() {
        return userIamDto;
    }

    public void setUserIamDto(UserIamDto userIamDto) {
        this.userIamDto = userIamDto;
    }

    public UserAccountDto getUserAccountDto() {
        return userAccountDto;
    }

    public void setUserAccountDto(UserAccountDto userAccountDto) {
        this.userAccountDto = userAccountDto;
    }
}
