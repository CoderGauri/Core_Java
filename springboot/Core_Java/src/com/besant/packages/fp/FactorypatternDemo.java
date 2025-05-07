package com.besant.packages.fp;

public class FactorypatternDemo {
    public static void main(String[] args) {
        Logistics logistics;
        // Using road logistics
        logistics = new RoadLogistics();
        logistics.planDelivery();
        // Using sea logistics
        logistics = new SeaLogistics();
        logistics.planDelivery();
    }
}
interface Transport {
    void deliver();
}
class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}
class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}
abstract class Logistics {
    // Factory Method
    public abstract Transport createTransport();
    public void planDelivery() {
        // Use factory method instead of direct instantiation
        Transport transport = createTransport();
        transport.deliver();
    }
}
class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}


