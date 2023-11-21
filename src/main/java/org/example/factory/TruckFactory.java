package org.example.factory;

public class TruckFactory extends LogisticsFactory {
    @Override
    public Truck createTransport() {
        return new Truck();
    }
}
