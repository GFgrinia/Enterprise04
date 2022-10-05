package com.academy.model.repository.impl;

import com.academy.model.entity.Boardgame;
import com.academy.model.repository.BoardgameRepository;

public class BoardgameRepositoryImpl extends DefaultRepositoryImpl<Boardgame> implements BoardgameRepository {
    public BoardgameRepositoryImpl() {
        super(Boardgame.class);
    }
}
