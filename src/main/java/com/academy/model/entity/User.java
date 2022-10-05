package com.academy.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "login_id")
    private Login login;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            // table in DB describes ManyToMany links
            name = "user_boardgame",
            // primary key for mapping
            joinColumns = {@JoinColumn(name = "user_id")},
            // add this to join
            inverseJoinColumns = {@JoinColumn(name = "boardgame_id")}
    )
    private List<Boardgame> boardgames;

}
