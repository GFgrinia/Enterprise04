package com.academy.model.repository.impl;

import com.academy.model.entity.Login;
import com.academy.model.repository.LoginRepository;

public class LoginRepositoryImpl extends DefaultRepositoryImpl<Login> implements LoginRepository {
    public LoginRepositoryImpl() {
        super(Login.class);
    }
}