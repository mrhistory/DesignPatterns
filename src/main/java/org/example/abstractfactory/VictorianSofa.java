package org.example.abstractfactory;

public class VictorianSofa implements Sofa {
    @Override
    public boolean hasLegs() { return true; }

    @Override
    public String layOn() { return "Not long enough!"; }
}
