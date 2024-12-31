package org.example;

// representing car in the rental system
public class Car extends Vehicle implements Rentable {

   //whether car has a cupholder or not
    private boolean hasCupHolder;

    //constructor for initialising car object
    public Car(String vehicleId, String model, double baseRentalRate, boolean hasCupHolder) {
        super(vehicleId, model, baseRentalRate);
        this.hasCupHolder = hasCupHolder;
    }

    public boolean isHasCupHolder() {
        return hasCupHolder;
    }

    //calculating rental cost
    @Override
    public double calculateRentalCost(int days) {
        return super.getBaseRentalRate() * days + (hasCupHolder ? 100 : 0);
    }

    //checking availability of car
    @Override
    public boolean isAvailableForRental() {
        return super.getIsAvailable();
    }

    //Rents the car to a customer for a specified number of days.
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental() && customer.checkAgeEligibility()) {
            setIsAvailable(false);
            System.out.println(super.getVehicleId() + " rented to " + customer.getName());
        } else{
            System.out.println("Car already rented or Invalid age");
        }
    }

    //Returns the car
    @Override
    public void returnVehicle() {
        setIsAvailable(true);
    }
}

