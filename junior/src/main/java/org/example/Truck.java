package org.example;

// Represents a Truck in the rental system.
public class Truck extends Vehicle implements Rentable {
    private int capacity = 2000;

    //Constructor to initialize a Truck object with its specific attributes.

    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    public int getCapacity() {
        return capacity;
    }

    //calculating rental cost
    @Override
    public double calculateRentalCost(int days) {
        return super.getBaseRentalRate() * days + capacity;
    }

    //checking availability of truck
    @Override
    public boolean isAvailableForRental() {
        return super.getIsAvailable();
    }

    //renting status
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental() && customer.checkAgeEligibility()) {
            setIsAvailable(false);
            System.out.println(super.getVehicleId() + " rented to " + customer.getName());
        } else{
            System.out.println("Truck already rented or Invalid age");
        }
    }

    //Returns the truck, making it available for future rentals.
    @Override
    public void returnVehicle() {
        setIsAvailable(true);
    }
}


