package org.example;

// representing motocycle to be rented

public class Motocycle extends Vehicle implements Rentable {

    // cost of gloves
    private int glovesCost = 33;

    //constructor to initialise motocycle object

    public Motocycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    // getter for cost of gloves
    public int getHelmetCost() {
        return glovesCost;
    }

    //calculating the total rental cost for a given number of days
    @Override
    public double calculateRentalCost(int days) {
        return super.getBaseRentalRate() * days + glovesCost;
    }

    // to check the availability of a motocycle
    @Override
    public boolean isAvailableForRental() {
        return super.getIsAvailable();
    }

    //rent of motocycle to customers
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental() && customer.checkAgeEligibility()) {
            setIsAvailable(false);
            System.out.println(super.getVehicleId() + " rented to " + customer.getName());
        } else{
            System.out.println("Motocycle already rented or Invalid age");
        }
    }

    //returns motocycle making it available for rent again
    @Override
    public void returnVehicle() {
        setIsAvailable(true);
    }
}

