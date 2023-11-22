package org.example.abstractfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VictorianFurnitureFactoryTests {
    FurnitureFactory factory;

    @BeforeEach
    void init() {
        factory = new VictorianFurnitureFactory();
    }

    @Test
    void chair() {
        Chair chair = factory.createChair();
        assertTrue(chair.hasLegs());
        assertEquals(chair.sitOn(), "This is stiff!");
    }

    @Test
    void coffeeTable() {
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        assertTrue(coffeeTable.hasLegs());
        assertEquals(coffeeTable.placeItem("a coffee mug"), "You can't put a coffee mug here! It's vintage!");
    }

    @Test
    void sofa() {
        Sofa sofa = factory.createSofa();
        assertTrue(sofa.hasLegs());
        assertEquals(sofa.layOn(), "Not long enough!");
    }
}
