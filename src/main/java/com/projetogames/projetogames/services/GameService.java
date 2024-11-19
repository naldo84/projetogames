package com.projetogames.projetogames.services;

import com.projetogames.projetogames.dto.GameDTO;
import com.projetogames.projetogames.dto.GameMinDTO;
import com.projetogames.projetogames.entities.Game;
import com.projetogames.projetogames.projections.GameMinProjection;
import com.projetogames.projetogames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

/*    Uma boa prática é usar em tohdo o service o @Transactinal (Spring), pois garante que a operação
    do banco de dados aconteça obedecende o ACID.
    */


    @Transactional(readOnly = true) //garante no BD que a trasnação não fará operaçaõ de escrita (ficando mais rápido)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get(); //O findById retorna um optinal. Nesse caso é necessário incluir o .get.

        return new GameDTO(result); //transformando o objeto game em GAMEDTO (uso do construtor)
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        List<GameMinDTO> gameMinDto = result.stream().map(gameDto -> new GameMinDTO(gameDto)).toList();

        return gameMinDto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(gameMinProjection -> new GameMinDTO(gameMinProjection)).toList();

    }




}
