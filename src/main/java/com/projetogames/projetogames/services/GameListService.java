package com.projetogames.projetogames.services;

import com.projetogames.projetogames.dto.GameListDTO;
import com.projetogames.projetogames.entities.GameList;
import com.projetogames.projetogames.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();

        return result.stream().map(gameList -> new GameListDTO(gameList)).toList();

        //return result.stream().map(GameListDTO::new).toList();
    }
}
