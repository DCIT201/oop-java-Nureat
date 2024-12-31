package org.example;

//Abstract class representing a vehicle
public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        isAvailable = true;
    }

    //Getter for vehicle
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    // Returns a string representation of the vehicle.
    @Override
    public String toString() {
        return "VehicleId: " + vehicleId + ", Model: " + model + ", BaseRentalRate: " + baseRentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();

    public abstract void rent(Customer customer, int days);

    public abstract void returnVehicle();

}

