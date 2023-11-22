package org.example.abstractfactory;

public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() { return true; }

    @Override
    public String sitOn() { return "This is stiff!"; }
}
