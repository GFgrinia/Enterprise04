package com.academy.model.repository.impl;


import com.academy.model.entity.Boardgame;
import com.academy.model.repository.BoardgameRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BoardgameRepositoryImplTest {

    @Test
    void testConstructor() {
        BoardgameRepository repository = new BoardgameRepositoryImpl();
        Class<Boardgame> type = repository.getType();
        assertEquals(type,Boardgame.class);
    }


    @Test
    void testSave() {
        BoardgameRepository repository = new BoardgameRepositoryImpl();

        Boardgame boardgame = Boardgame.builder().name("Ticket to Ride").release_year(2004).build();
        repository.save(boardgame);

        boardgame = Boardgame.builder().name("Dice Throne").release_year(2018).build();
        repository.save(boardgame);

        boardgame = Boardgame.builder().name("Dune: Imperium").release_year(2020).build();
        repository.save(boardgame);

        boardgame = Boardgame.builder().name("Nemesis").release_year(2018).build();
        repository.save(boardgame);

        boardgame = Boardgame.builder().name("Terraformming Mars").release_year(2020).build();
        repository.save(boardgame);



        List<Boardgame> list = repository.findAll();
        Boardgame lastBoardgame = list.get(list.size()-1);

        assertEquals(boardgame, lastBoardgame);
    }

}
