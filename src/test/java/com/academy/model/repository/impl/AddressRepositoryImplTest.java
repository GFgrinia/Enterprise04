package com.academy.model.repository.impl;

import com.academy.model.entity.Address;
import com.academy.model.repository.AddressRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class AddressRepositoryImplTest {

    @Test
    void testConstructor() {
        AddressRepositoryImpl repository = new AddressRepositoryImpl();
        Class<Address> type = repository.getType();
        assertEquals(type,Address.class);
    }



}
