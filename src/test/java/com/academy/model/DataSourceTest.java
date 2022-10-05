package com.academy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class DataSourceTest {


    @Test
    void testConstructor() {
        assertNotNull(DataSource.getInstance());
    }

    @Test
    void testEntityManager() {
        assertNotNull(DataSource.getInstance().getEntityManager());
    }

    @Test
    void testSession() {
        assertNotNull(DataSource.getInstance().getSession());
    }
}
