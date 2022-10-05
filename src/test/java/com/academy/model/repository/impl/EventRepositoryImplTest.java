package com.academy.model.repository.impl;

import com.academy.model.entity.Address;
import com.academy.model.entity.Event;
import com.academy.model.repository.EventRepository;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventRepositoryImplTest {
    @Test
    void testSave1() {
        EventRepository eventRepository = new EventRepositoryImpl();

        Address address = Address.builder()
                .country("USA")
                .city("New York")
                .street("5th Avenue")
                .building(15)
                .build();

        Event event = new Event();

        event.setAddress(address);
        event.setName("AlcoholParty");
        event.setTime(Timestamp.valueOf("2022-11-25 10:30:22"));
        eventRepository.save(event);

        List<Event> list = eventRepository.findAll();
        Event lastEvent = list.get(list.size() - 1);

        assertEquals(event, lastEvent);
    }


    @Test
    void testSave2() {
        EventRepository eventRepository = new EventRepositoryImpl();

        Address address = Address.builder()
                .country("China")
                .city("Beijing")
                .street("street")
                .building(1208)
                .build();

        Event event = new Event();

        event.setAddress(address);
        event.setName("Olympic Games");
        event.setTime(Timestamp.valueOf("2008-07-07 10:30:22"));
        eventRepository.save(event);

        List<Event> list = eventRepository.findAll();
        Event lastEvent = list.get(list.size() - 1);

        assertEquals(event, lastEvent);
    }
}
