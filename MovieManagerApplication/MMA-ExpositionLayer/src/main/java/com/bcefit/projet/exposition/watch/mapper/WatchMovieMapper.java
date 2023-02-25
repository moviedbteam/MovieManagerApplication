package com.bcefit.projet.exposition.watch.mapper;

import com.bcefit.projet.domain.watch.WatchMovie;
import com.bcefit.projet.exposition.watch.dto.WatchMovieDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WatchMovieMapper {

    public WatchMovieDto convertEntityToDto(WatchMovie entity){
        return new WatchMovieDto(entity.getIdWatch(),
                                entity.getUserAccount(),
                                entity.getViewingPlace(),
                                entity.getViewingMood(),
                                entity.getViewingRate(),
                                entity.getIdMovie(),
                                entity.getIdCollection());
    }

    public WatchMovie convertDtoToEntity(WatchMovieDto dto){
        WatchMovie entity = new WatchMovie();
        entity.setIdWatch(dto.getIdWatch());
        entity.setUserAccount(dto.getUserAccount());
        entity.setIdMovie(dto.getIdMovie());
        entity.setIdCollection(dto.getIdCollection());
        entity.setViewingMood(dto.getViewingMood());
        entity.setViewingRate(dto.getViewingRate());
        entity.setViewingPlace(dto.getViewingPlace());
        return entity;
    }

    public List<WatchMovie> convertListDtoToEntity(List<WatchMovieDto> dtoList){
        List<WatchMovie> entityList = new ArrayList<>();
        for(WatchMovieDto dto : dtoList){
            entityList.add(convertDtoToEntity(dto));
        }
        return entityList;
    }

    public List<WatchMovieDto> convertListEntityToDto(List<WatchMovie> entityList){
        List<WatchMovieDto> dtoList = new ArrayList<>();
        for(WatchMovie entity : entityList){
            dtoList.add(convertEntityToDto(entity));
        }
        return dtoList;
    }
}
