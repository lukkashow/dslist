package com.lukkashow.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lukkashow.dslist.entities.Game;



public interface GameRepository extends JpaRepository<Game, Long> {

}
