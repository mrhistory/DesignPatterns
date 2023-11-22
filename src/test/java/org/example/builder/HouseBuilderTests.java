package org.example.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HouseBuilderTests {
    HouseBuilder builder;

    @BeforeEach
    void init() {
        builder = new HouseBuilder();
    }

    @Test
    void defaultHouse() {
        House house = builder.build();
        assertEquals(
                house.describe(),
                "This house has 4 walls, 1 doors, 4 windows, a roof made of shingles, no garage, and no pool."
        );
    }

    @Test
    void tinyHouse() {
        HouseDirector director = new TinyHouseDirector(builder);
        director.make();
        House house = builder.build();
        assertEquals(
                house.describe(),
                "This house has 4 walls, 1 doors, 1 windows, a roof made of tin, no garage, and no pool."
        );
    }

    @Test
    void mansion() {
        HouseDirector director = new MansionHouseDirector(builder);
        director.make();
        House house = builder.build();
        assertEquals(
                house.describe(),
                "This house has 8 walls, 6 doors, 24 windows, a roof made of slate, a garage, and a pool."
        );
    }

    @Test
    void tinyHouseWithPool() {
        HouseDirector director = new TinyHouseDirector(builder);
        director.make();
        builder.buildPool();
        House house = builder.build();
        assertEquals(
                house.describe(),
                "This house has 4 walls, 1 doors, 1 windows, a roof made of tin, no garage, and a pool."
        );
    }
}
