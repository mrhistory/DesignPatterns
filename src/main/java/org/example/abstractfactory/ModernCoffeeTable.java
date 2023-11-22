package org.example.abstractfactory;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() { return false; }

    @Override
    public String placeItem(String item) { return String.format("You can put %s here. It's indestructible!", item); }
}
