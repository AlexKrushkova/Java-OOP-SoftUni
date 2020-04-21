package E01Vehicles;

public class Car extends Vehicle {
    private static final double AIR_CONDITIONER_CONSUMPTION = 0.9;

    public Car(double fuel, double fuelConsumption) {
        super(fuel, fuelConsumption + AIR_CONDITIONER_CONSUMPTION);
    }

    @Override
    public String drive(double distance) {
        return "Car" + super.drive(distance);
    }

    @Override
    public String toString(){
        return "Car" + super.toString();
    }

}
