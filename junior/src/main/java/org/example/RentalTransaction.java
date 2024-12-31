package org.example;

// A rental transaction includes the customer, vehicle, and status of the transaction.
public class RentalTransaction {
    private String transactionId;
    private Customer customer;
    private Vehicle vehicle;
    boolean isCompleted;

    //Constructor to initialize a rental transaction
    public RentalTransaction(String transactionId, Customer customer, Vehicle vehicle) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.isCompleted = false;
    }

    //Getter for the transactions
    public String getTransactionId() {
        return transactionId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setIsCompleted () {
        isCompleted = true;
        vehicle.returnVehicle();
    }

    //Returns detailed transaction information
    @Override
    public String toString() {
        return "TransactionId: " + transactionId + '\n' + "Customer: " + customer.getName() + '\n' + "Vehicle: " + vehicle.getModel()
                + '\n' + "Status: " + (isCompleted ? "Vehicle returned" : "Vehicle not returned");
    }
}

