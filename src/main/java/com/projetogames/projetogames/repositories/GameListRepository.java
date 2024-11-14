package com.projetogames.projetogames.repositories;

import com.projetogames.projetogames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
