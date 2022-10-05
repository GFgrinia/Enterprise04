package com.academy.model.repository.impl;

import com.academy.model.entity.Event;
import com.academy.model.repository.EventRepository;

public class EventRepositoryImpl extends DefaultRepositoryImpl<Event> implements EventRepository {
    public EventRepositoryImpl() {
        super(Event.class);
    }
}
