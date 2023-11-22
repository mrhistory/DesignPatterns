package org.example.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShipFactoryTests {
    LogisticsFactory factory;

    @BeforeEach
    void init() {
        factory = new ShipFactory();
    }

    @Test
    void makeDelivery() {
        assertEquals(factory.makeDelivery("100 TVs"), "Delivered 100 TVs by Ship!");
    }
}
