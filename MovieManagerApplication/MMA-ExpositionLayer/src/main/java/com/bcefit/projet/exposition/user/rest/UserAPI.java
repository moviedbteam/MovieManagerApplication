package com.bcefit.projet.exposition.user.rest;

import com.bcefit.projet.domain.user.User;
import com.bcefit.projet.exposition.user.dto.UserAccountDto;
import com.bcefit.projet.exposition.user.dto.UserDto;
import com.bcefit.projet.exposition.user.dto.UserIamDto;
import com.bcefit.projet.exposition.user.mapper.UserAccountMapper;
import com.bcefit.projet.exposition.user.mapper.UserIamMapper;
import com.bcefit.projet.service.user.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserAPI {



    @Autowired
    IUserService service;

    @Autowired
    UserAccountMapper userAccountMapper;
    @Autowired
    UserIamMapper   userIamMapper;

    Logger logger = LoggerFactory.getLogger(UserAPI.class);

    @GetMapping("/detail")
    public UserDto getUserDetails(){
        logger.info("Nouvelle demande du détail User ");

        // code à modifier quand récupération de l'id depuis le jeton
        Long userId = 1234L;
        User userDetail = service.findUserById(userId);
        UserAccountDto userAccountDto = userAccountMapper.convertEntityToDto(userDetail.getUserAccount());
        UserIamDto userIamDto = userIamMapper.convertEntityToDto(userDetail.getUserIam());

        logger.debug("DEBUG---ID User = {} {}", userAccountDto.getIdUser(),userAccountDto.getEmail());

        return new UserDto(userIamDto,userAccountDto);
    }

    @PostMapping("/update")
    public ResponseEntity<UserDto> update(@RequestBody UserDto userDto){

        logger.info("modification du User {}",userDto.getUserAccountDto().getEmail());

        User user = service.updateUser(new User(userAccountMapper.convertDtoToEntity(userDto.getUserAccountDto()),userIamMapper.convertDtoToEntity(userDto.getUserIamDto())));

        UserDto userDtoResult = new UserDto(userIamMapper.convertEntityToDto(user.getUserIam()),(userAccountMapper.convertEntityToDto(user.getUserAccount())));

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userDtoResult);
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> create(@RequestBody UserDto userDto){

        logger.info("création du User {}",userDto.getUserAccountDto().getEmail());

        User user = service.createUser(new User(userAccountMapper.convertDtoToEntity(userDto.getUserAccountDto()),userIamMapper.convertDtoToEntity(userDto.getUserIamDto())));

        UserDto userDtoResult = new UserDto(userIamMapper.convertEntityToDto(user.getUserIam()),(userAccountMapper.convertEntityToDto(user.getUserAccount())));

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userDtoResult);
    }
}
