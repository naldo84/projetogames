package com.projetogames.projetogames.controllers;

import com.projetogames.projetogames.dto.GameListDTO;
import com.projetogames.projetogames.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
}


/*
* @RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping (value = "/{id}") //Essa anotação indica que o valor do {id} na URL será mapeado para o parâmetro id do métodoh
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }
* */
