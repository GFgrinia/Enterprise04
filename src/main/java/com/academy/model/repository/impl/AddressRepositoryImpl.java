package com.academy.model.repository.impl;

import com.academy.model.entity.Address;
import com.academy.model.repository.AddressRepository;

public class AddressRepositoryImpl extends DefaultRepositoryImpl<Address> implements AddressRepository {
    public AddressRepositoryImpl() {
        super(Address.class);
    }
}
