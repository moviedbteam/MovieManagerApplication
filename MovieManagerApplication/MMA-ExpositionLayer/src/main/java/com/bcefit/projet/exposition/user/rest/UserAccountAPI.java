package com.bcefit.projet.exposition.user.rest;

import com.bcefit.projet.domain.user.UserAccount;
import com.bcefit.projet.exposition.user.dto.UserAccountDto;
import com.bcefit.projet.exposition.user.mapper.UserAccountMapper;
import com.bcefit.projet.service.user.IUserAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/user")
public class UserAccountAPI {

    @Autowired
    IUserAccountService service;

    @Autowired
    UserAccountMapper mapper;

    Logger logger = LoggerFactory.getLogger(UserAccountAPI.class);

    @GetMapping("/{idUser}")
    public UserAccountDto getUserAccountById(@PathVariable("idUser") Long idUser){
        logger.info("Nouvelle demande pour le UserAccount {}", idUser);
        UserAccount userAccount = service.findById(idUser);
        logger.debug("DEBUG---ID UserAccount = {}", userAccount.getIdUser());
        return mapper.convertEntityToDto(userAccount);
    }
}
