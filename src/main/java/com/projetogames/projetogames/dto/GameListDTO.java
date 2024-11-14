package com.projetogames.projetogames.dto;

import com.projetogames.projetogames.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){}

    public GameListDTO(GameList entity) {  //poderia usar o benUtils - Como não foi usado, não é necessário usar os sets
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

}
