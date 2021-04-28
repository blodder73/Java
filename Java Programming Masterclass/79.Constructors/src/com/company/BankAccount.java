package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount() {
        this(11111, 2.50, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String name, String email, String phone){
        this(99999, 100.55, name, email, phone);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void depositFunds(double deposit) {
        System.out.println("Balance was " + this.balance);
        this.balance += deposit;
        System.out.println("Balance after deposit " + deposit + " = " + this.balance);
    }

    public void withdrawFunds(double withdraw) {
        if(this.balance - withdraw < 0) {
            System.out.println("Balance will be nagative");
        } else {
            System.out.println("Balance was " + this.balance);
            this.balance -= withdraw;
            System.out.println("Balance after withdraw " + withdraw + " = " + this.balance);
        }

    }
}
