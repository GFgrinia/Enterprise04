package com.academy.model.repository.impl;

import com.academy.model.entity.Login;
import com.academy.model.entity.User;
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
        UserRepository userRepository = new UserRepositoryImpl();
        Login login1 = new Login();
        Login login2 = new Login();
        Login login3 = new Login();

        login1.setUsername("Yury111");
        login1.setPassword("Password1");
        repository.save(login1);

        login2.setUsername("Ihar222");
        login2.setPassword("Password2");
        repository.save(login2);

        login3.setUsername("Dmitry333");
        login3.setPassword("Password3");
        repository.save(login3);

        List<Login> list = repository.findAll();
        Login lastLogin = list.get(list.size() - 1);


        assertEquals(login3, lastLogin);
    }

}
