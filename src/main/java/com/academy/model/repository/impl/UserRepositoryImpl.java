package com.academy.model.repository.impl;

import com.academy.model.entity.User;
import com.academy.model.repository.UserRepository;

public class UserRepositoryImpl extends DefaultRepositoryImpl<User> implements UserRepository {
    public UserRepositoryImpl() {
        super(User.class);
    }
}