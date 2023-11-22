package org.example.builder;

public class HouseBuilder {
    private House house;

    public HouseBuilder() { this.house = new House(); }

    public HouseBuilder reset() { this.house = new House(); return this; }

    public HouseBuilder buildWalls(int walls) { house.setWalls(walls); return this; }
    public HouseBuilder buildDoors(int doors) { house.setDoors(doors); return this; }
    public HouseBuilder buildWindows(int windows) { house.setWindows(windows); return this; }
    public HouseBuilder buildTinRoof() { house.setRoof("tin"); return this; }
    public HouseBuilder buildShingleRoof() { house.setRoof("shingle"); return this; }
    public HouseBuilder buildSlateRoof() { house.setRoof("slate"); return this; }
    public HouseBuilder buildGarage() { house.setGarage(true); return this; }
    public HouseBuilder buildPool() { house.setPool(true); return this; }
    public House build() { return house; }
}
