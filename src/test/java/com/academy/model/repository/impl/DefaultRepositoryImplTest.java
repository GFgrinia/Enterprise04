package com.academy.model.repository.impl;

import com.academy.model.entity.Address;
import com.academy.model.repository.AddressRepository;
import com.academy.model.repository.DefaultRepository;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DefaultRepositoryImplTest {

    @Test
    void testConstructor() {
        DefaultRepository<Address> repository = new DefaultRepositoryImpl<>(Address.class);
        Class<Address> type = repository.getType();
        assertEquals(type,Address.class);
    }

    @Test
    void testSave() {
        DefaultRepository<Address> repository =  new DefaultRepositoryImpl<>(Address.class);
        Address address = Address.builder()
                .country("Belarus")
                .city("Brest")
                .street("South")
                .building(333)
                .build();
        repository.save(address);

        address = Address.builder()
                .country("USA")
                .city("New York")
                .street("5th Avenue")
                .building(15)
                .build();
        repository.save(address);

        address = Address.builder()
                .country("China")
                .city("Beijing")
                .street("street")
                .building(1208)
                .build();
        repository.save(address);

        List<Address> list = repository.findAll();
        Address lastAddress = list.get(list.size()-1);

        assertEquals(address, lastAddress);
    }


    @Test
    void testFindById() {
        DefaultRepository<Address> repository =  new DefaultRepositoryImpl<>(Address.class);

        List<Address> list = repository.findAll();
        Address address = list.get(0);
        Integer id = address.getId();

        Address findAddress =  repository.findById(id);
        assertEquals(address, findAddress);
    }


    @Test
    void deleteTest() {
        DefaultRepository<Address> repository =  new DefaultRepositoryImpl<>(Address.class);

        Address address = Address.builder()
                .country("Delete")
                .build();
        repository.save(address);

        List<Address> list = repository.findAll();
        Address lastAddress = list.get(list.size()-1);
        Integer id = lastAddress.getId();

        repository.delete(lastAddress);
        Address deletedAddress = repository.findById(id);

        assertNull(deletedAddress);
    }



    @Test
    void testFindAll() {
        DefaultRepository<Address> repository =  new DefaultRepositoryImpl<>(Address.class);

        int sizeBefore = repository.findAll().size();

        Address address = Address.builder()
                .country("Canada")
                .city("Toronto")
                .building(12)
                .build();
        repository.save(address);

        int sizeAfter = repository.findAll().size();

        assertTrue(sizeAfter > sizeBefore);

    }


}
