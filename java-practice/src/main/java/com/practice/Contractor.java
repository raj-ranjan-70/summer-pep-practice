package com.practice;

public class Contractor extends Employee{


    double dailyRate;

    Contractor(String id, String name, double taxRate, double dailyRate) {
        super(id, name, taxRate);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void calculateContractorPay(int days) {
        super.setBasicSalary(this.dailyRate * (double)days);
        super.calculatePay(0);
    }

    public void printDetails() {
        super.printEmpDetails();
    }
}