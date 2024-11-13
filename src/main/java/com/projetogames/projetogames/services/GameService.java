package com.projetogames.projetogames.services;

import com.projetogames.projetogames.dto.GameMinDTO;
import com.projetogames.projetogames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        List<GameMinDTO> gameMinDto = result.stream().map(gameDto -> new GameMinDTO(gameDto)).toList();
        return gameMinDto;
    }
}
