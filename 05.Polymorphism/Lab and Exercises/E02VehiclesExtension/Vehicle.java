package E02VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuel;
    private double fuelConsumption;
    private int capacity;
    private DecimalFormat formatter;

    protected Vehicle(double fuel, double fuelConsumption, int capacity){
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.capacity = capacity;
        this.formatter = new DecimalFormat("##.##");
    }
    public String drive(double distance){
        double fuelNeeded = distance * this.fuelConsumption;
        if (fuelNeeded > this.fuel){
            return " needs refueling";
        }
        this.fuel -= fuelNeeded;
        return  " travelled "  + formatter.format(distance) + " km";
    }

    protected void increaseConsumption(double additionalConsumption){
        this.fuelConsumption += additionalConsumption;
    }

    public  void refuel(double quantity){
        if (quantity <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.fuel + quantity > this.capacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuel += quantity;
    }

    @Override
    public String toString(){
        return String.format(": %.2f", this.fuel);
    }

}
