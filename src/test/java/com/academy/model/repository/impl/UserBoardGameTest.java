package com.academy.model.repository.impl;


import com.academy.model.entity.Boardgame;
import com.academy.model.entity.User;
import com.academy.model.repository.BoardgameRepository;
import com.academy.model.repository.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class UserBoardGameTest {
    @Test
    void getListById() {
        UserRepository userRepository = new UserRepositoryImpl();
        User user = userRepository.findById(2);
        List<Boardgame> actual = user.getBoardgames();

        BoardgameRepository boardgameRepository = new BoardgameRepositoryImpl();
        List<Boardgame> expected = new ArrayList<>();
        expected.add(boardgameRepository.findById(3));

        assertEquals(actual.toString(), expected.toString());
    }
}
