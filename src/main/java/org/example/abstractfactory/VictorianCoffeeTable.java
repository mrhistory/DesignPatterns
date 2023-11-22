package org.example.abstractfactory;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() { return true; }

    @Override
    public String placeItem(String item) { return String.format("You can't put %s here! It's vintage!", item); }
}
