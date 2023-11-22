package org.example.abstractfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModernFurnitureFactoryTests {
    FurnitureFactory factory;

    @BeforeEach
    void init() {
        factory = new ModernFurnitureFactory();
    }

    @Test
    void chair() {
        Chair chair = factory.createChair();
        assertFalse(chair.hasLegs());
        assertEquals(chair.sitOn(), "How do you sit on this?");
    }

    @Test
    void coffeeTable() {
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        assertFalse(coffeeTable.hasLegs());
        assertEquals(coffeeTable.placeItem("a coffee mug"), "You can put a coffee mug here. It's indestructible!");
    }

    @Test
    void sofa() {
        Sofa sofa = factory.createSofa();
        assertFalse(sofa.hasLegs());
        assertEquals(sofa.layOn(), "Groovy!");
    }

}
