package com.bcefit.projet.exposition.user.mapper;


import com.bcefit.projet.domain.user.User;
import com.bcefit.projet.exposition.user.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    UserAccountMapper userAccountMapper;


    @Autowired
    UserIamMapper userIamMapper;


    public UserDto convertEntityToDto(User entity){
        UserDto dto = new UserDto();
        dto.setUserIamDto(userIamMapper.convertEntityToDto(entity.getUserIam()));
        dto.setUserAccountDto(userAccountMapper.convertEntityToDto(entity.getUserAccount()));
        return dto;
    }

    public User convertDtoToEntity(UserDto dto){
        User entity = new User();
        entity.setUserIam(userIamMapper.convertDtoToEntity(dto.getUserIamDto()));
        entity.setUserAccount(userAccountMapper.convertDtoToEntity(dto.getUserAccountDto()));
        return entity;
    }

}
