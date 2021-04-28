package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Buddy Lodder", 3000.50, "buddy@gmail.com");
    }

    public VipCustomer(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = 2500.0;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
