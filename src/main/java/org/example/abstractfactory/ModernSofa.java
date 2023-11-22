package org.example.abstractfactory;

public class ModernSofa implements Sofa {
    @Override
    public boolean hasLegs() { return false; }

    @Override
    public String layOn() { return "Groovy!"; }
}
