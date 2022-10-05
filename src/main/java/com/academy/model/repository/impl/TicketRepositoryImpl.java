package com.academy.model.repository.impl;

import com.academy.model.entity.Ticket;
import com.academy.model.repository.TicketRepository;

public class TicketRepositoryImpl extends DefaultRepositoryImpl<Ticket> implements TicketRepository {
    public TicketRepositoryImpl() {
        super(Ticket.class);
    }
}
