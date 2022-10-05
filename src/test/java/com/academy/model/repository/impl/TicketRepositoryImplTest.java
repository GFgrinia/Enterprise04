package com.academy.model.repository.impl;


import com.academy.model.entity.*;
import com.academy.model.repository.TicketRepository;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketRepositoryImplTest {
    @Test
    void testSave() {
        TicketRepository ticketRepository = new TicketRepositoryImpl();

        Event event = new Event();
        User user = new User();
        Login login = new Login();
        Ticket ticket = new Ticket();

        Address address = Address.builder()
                .country("Russia")
                .city("Moscow")
                .street("Red")
                .building(18)
                .build();

        login.setUsername("James777");
        login.setPassword("Password7");

        user.setLogin(login);
        user.setFirstName("James");
        user.setSecondName("Bond");
        user.setBoardgames(new ArrayList<>());

        event.setAddress(address);
        event.setName("Spiel des Jahre");
        event.setTime(Timestamp.valueOf("2022-10-17 12:30:22"));

        ticket.setEvent(event);
        ticket.setUser(user);
        ticketRepository.save(ticket);

        List<Ticket> list = ticketRepository.findAll();
        Ticket lastTicket = list.get(list.size() - 1);

        assertEquals(ticket.toString(), lastTicket.toString());
    }

}
