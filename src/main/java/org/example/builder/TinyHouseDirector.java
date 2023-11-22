package org.example.builder;

public class TinyHouseDirector implements HouseDirector {
    protected HouseBuilder builder;

    public TinyHouseDirector(HouseBuilder builder) { this.builder = builder; }

    public TinyHouseDirector changeBuilder(HouseBuilder builder) { this.builder = builder; return this; }

    public TinyHouseDirector make() { builder.buildWalls(4).buildDoors(1).buildWindows(1).buildTinRoof(); return this; }
}
