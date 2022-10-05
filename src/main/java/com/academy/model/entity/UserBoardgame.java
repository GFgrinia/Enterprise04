package com.academy.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserBoardgame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "boardgame_id")
    private Boardgame boardgame;
}
