package org.example.factory;

public class Ship implements Transport {
    @Override
    public String deliver(String cargo) {
        return String.format("Delivered %s by Ship!", cargo);
    }
}
