package com.training.week3.oops;

public class EncapsulationExample {
    private Double accountBalance;

    public double getBalance() {
        //Validate User
        //Refresh Balance using database call if needed
        return accountBalance;
    }

    public void setBalance(double accountBalance) {
        //Validate User
        this.accountBalance = accountBalance;
        //Save to database if needed
    }
}
