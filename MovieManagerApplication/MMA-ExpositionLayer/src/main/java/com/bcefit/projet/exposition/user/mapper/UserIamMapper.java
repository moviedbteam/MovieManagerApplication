package com.bcefit.projet.exposition.user.mapper;


import com.bcefit.projet.domain.user.UserIam;
import com.bcefit.projet.exposition.user.dto.UserIamDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserIamMapper {




    public UserIamDto convertEntityToDto(UserIam entity){
        UserIamDto dto = new UserIamDto();
        dto.setPassword(entity.getPassword());
        return dto;
    }

    public UserIam convertDtoToEntity(UserIamDto dto){
        UserIam entity = new UserIam();
        entity.setPassword(dto.getPassword());
        return entity;
    }
}
