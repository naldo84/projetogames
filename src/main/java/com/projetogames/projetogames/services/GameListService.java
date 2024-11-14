package com.projetogames.projetogames.services;

import com.projetogames.projetogames.dto.GameListDTO;
import com.projetogames.projetogames.entities.GameList;
import com.projetogames.projetogames.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();

        return result.stream().map(GameListDTO::new).toList();
    }
}
