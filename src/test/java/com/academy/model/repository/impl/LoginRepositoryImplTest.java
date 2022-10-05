package com.academy.model.repository.impl;

import com.academy.model.entity.Login;
import com.academy.model.repository.LoginRepository;
import com.academy.model.repository.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LoginRepositoryImplTest {

    @Test
    void testConstructor() {
        LoginRepository repository = new LoginRepositoryImpl();
        Class<Login> type = repository.getType();
        assertEquals(type, Login.class);
    }


    @Test
    void testSave1() {
        LoginRepository repository = new LoginRepositoryImpl();
        Login login = new Login();

        login.setUsername("UserNameXXX");
        login.setPassword("PasswordXXX");
        repository.save(login);

        List<Login> list = repository.findAll();
        Login lastLogin = list.get(list.size() - 1);


        assertEquals(login, lastLogin);
    }

}
