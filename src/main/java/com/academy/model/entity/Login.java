package com.academy.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;
    @Column
    private String password;


}
