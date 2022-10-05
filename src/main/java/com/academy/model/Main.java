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

import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        Timestamp timestamp = Timestamp.valueOf("2022-11-25 10:30:22");
        Timestamp timestamp2 = Timestamp.valueOf("2022-11-22 10:30:22");

        System.out.println(timestamp.after(timestamp2));


    }
}
