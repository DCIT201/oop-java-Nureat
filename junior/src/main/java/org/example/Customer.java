package org.example;

//to represent a customer who rents a vehicle

public class Customer {
    //name of customer
    private String name;

    // age of customer
    private int age;

    //initialising customer object using a constructor

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter method for customer name, age

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // to check eligibility of customer

    public boolean checkAgeEligibility() {
        return age >= 18;
    }
}