package com.bcefit.projet.exposition.user.dto;

import java.util.HashSet;
import java.util.Set;

public class GenreTvDto {
    private Long id;
    private String name;

    public GenreTvDto() {
    }

    public GenreTvDto(Long id, String name) {
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

}
