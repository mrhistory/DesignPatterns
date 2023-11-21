package org.example.factory;

public class Truck implements Transport {
    @Override
    public String deliver(String cargo) {
        return String.format("Delivered %s by Truck!", cargo);
    }
}
