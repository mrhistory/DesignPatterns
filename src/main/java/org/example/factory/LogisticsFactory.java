package org.example.factory;

public abstract class LogisticsFactory {

    public String makeDelivery(String cargo) {
        Transport transport = createTransport();
        return transport.deliver(cargo);
    }
    public abstract Transport createTransport();
}
