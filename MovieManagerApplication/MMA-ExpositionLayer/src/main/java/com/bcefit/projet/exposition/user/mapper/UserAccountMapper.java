package com.bcefit.projet.exposition.user.mapper;

import com.bcefit.projet.domain.user.UserAccount;

import com.bcefit.projet.exposition.user.dto.UserAccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserAccountMapper {

    @Autowired
    GenreMovieMapper movieMapper;
    @Autowired
    GenreTvMapper tvMapper;



    public UserAccountDto convertEntityToDto(UserAccount entity){
        UserAccountDto dto = new UserAccountDto();
        dto.setIdUser(entity.getIdUser());
        dto.setUserName(entity.getUserName());
        dto.setAdultContent(entity.isAdultContent());
        dto.setEmail(entity.getEmail());
        dto.setEnableAccount(entity.isEnableAccount());
        dto.setBirthYear(entity.getBirthYear());
        return dto;
    }

    public UserAccount convertDtoToEntity(UserAccountDto dto){
        UserAccount entity = new UserAccount();
        entity.setIdUser(dto.getIdUser());
        entity.setUserName(dto.getUserName());
        entity.setAdultContent(dto.isAdultContent());
        entity.setEmail(dto.getEmail());
        entity.setEnableAccount(dto.isEnableAccount());
        entity.setBirthYear(dto.getBirthYear());
        return entity;
    }




}
