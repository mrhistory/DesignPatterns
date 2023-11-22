package org.example.builder;

public class House {
    protected int walls = 4;
    protected int doors = 1;
    protected int windows = 4;
    protected String roof = "shingles";
    protected boolean garage = false;
    protected boolean pool = false;

    public House() {}

    public void setWalls(int walls) { this.walls = walls; }
    public void setDoors(int doors) { this.doors = doors; }
    public void setWindows(int windows) { this.windows = windows; }
    public void setRoof(String roofMaterial) { this.roof = roofMaterial; }
    public void setGarage(boolean garage) { this.garage = garage; }
    public void setPool(boolean pool) { this.pool = pool; }

    public String describe() {
        String garageText = garage ? "a" : "no";
        String poolText = pool ? "a" : "no";
        return String.format(
                "This house has %d walls, %d doors, %d windows, a roof made of %s, %s garage, and %s pool.",
                walls,
                doors,
                windows,
                roof,
                garageText,
                poolText
        );
    }
}
