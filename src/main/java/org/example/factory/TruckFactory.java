package org.example.factory;

public class TruckFactory extends LogisticsFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
