package com.academy.model.repository.impl;

import com.academy.model.entity.Login;
import com.academy.model.entity.User;
import com.academy.model.repository.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRepositoryImplTest {
    @Test
    void testConstructor() {
        UserRepository repository = new UserRepositoryImpl();
        Class<User> type = repository.getType();
        assertEquals(type,User.class);
    }


    @Test
    void testSave1() {
        UserRepository userRepository = new UserRepositoryImpl();

        User user = new User();
        Login login = new Login();

        login.setUsername("Yury111");
        login.setPassword("Password1");

        user.setLogin(login);
        user.setFirstName("Yury");
        user.setSecondName("Hrytsuk");
        userRepository.save(user);

        List<User> list = userRepository.findAll();
        User lastUser = list.get(list.size() - 1);

        assertEquals(user, lastUser);
    }

    @Test
    void testSave2() {
        UserRepository userRepository = new UserRepositoryImpl();

        User user = new User();
        Login login = new Login();

        login.setUsername("Dmitry222");
        login.setPassword("Password2");

        user.setLogin(login);
        user.setFirstName("Dmitry");
        user.setSecondName("Lje");
        userRepository.save(user);

        List<User> list = userRepository.findAll();
        User lastUser = list.get(list.size() - 1);

        assertEquals(user, lastUser);
    }

    @Test
    void testSave3() {
        UserRepository userRepository = new UserRepositoryImpl();

        User user = new User();
        Login login = new Login();

        login.setUsername("Ihar333");
        login.setPassword("Password3");

        user.setLogin(login);
        user.setFirstName("Ihar");
        user.setSecondName("Pumpkin");
        userRepository.save(user);

        List<User> list = userRepository.findAll();
        User lastUser = list.get(list.size() - 1);

        assertEquals(user, lastUser);
    }


}
