package org.example.abstractfactory;

public class ModernChair implements Chair {
    @Override
    public boolean hasLegs() { return false; }

    @Override
    public String sitOn() { return "How do you sit on this?"; }
}
