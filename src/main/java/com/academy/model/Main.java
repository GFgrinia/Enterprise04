package com.academy.model;

import com.academy.model.entity.Address;
import com.academy.model.entity.Login;
import com.academy.model.entity.User;
import com.academy.model.repository.AddressRepository;
import com.academy.model.repository.LoginRepository;
import com.academy.model.repository.UserRepository;
import com.academy.model.repository.impl.AddressRepositoryImpl;
import com.academy.model.repository.impl.LoginRepositoryImpl;
import com.academy.model.repository.impl.UserRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();

        User user = new User();
        Login login = new Login();

        login.setUsername("Yury111");
        login.setPassword("Password1");


        user.setLogin(login);
        user.setFirstName("Yury");
        user.setSecondName("Hrytsuk");
        userRepository.save(user);


    }
}
