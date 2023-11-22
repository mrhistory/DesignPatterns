package org.example.builder;

public class MansionHouseDirector implements HouseDirector {
    protected HouseBuilder builder;

    public MansionHouseDirector(HouseBuilder builder) { this.builder = builder; }

    public MansionHouseDirector changeBuilder(HouseBuilder builder) { this.builder = builder; return this; }

    public MansionHouseDirector make() {
        builder.buildWalls(8).buildDoors(6).buildWindows(24).buildSlateRoof().buildGarage().buildPool();
        return this;
    }
}
