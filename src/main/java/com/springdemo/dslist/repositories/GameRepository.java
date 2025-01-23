package com.springdemo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long > {

}
