package org.example.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class TruckFactoryTests {
    TruckFactory factory;

    @BeforeEach
    void init() {
        factory = new TruckFactory();
    }

    @Test
    void makeDelivery() {
        assertEquals(factory.makeDelivery("20 boxes of bananas"), "Delivered 20 boxes of bananas by Truck!");
    }
}
