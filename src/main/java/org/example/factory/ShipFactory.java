package org.example.factory;

public class ShipFactory extends LogisticsFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
