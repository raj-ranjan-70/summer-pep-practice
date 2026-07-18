package com.practice;

public class PartTimeEmployee extends Employee{


    double hourlyRate;
    int legalCap;

    public PartTimeEmployee(String id, String name, double taxRate, double hourlyRate,
                            int legalCap) {
        super(id, name, taxRate);
        this.hourlyRate = hourlyRate;
        this.legalCap = legalCap;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getLegalCap() {
        return legalCap;
    }

    public void setLegalCap(int legalCap) {
        this.legalCap = legalCap;
    }

    public void calculatePartTimePay(double hours) {
        if(hours > this.legalCap) {
            System.out.println("Error: The Legal hour cap rule has been breached...");
            return;
        }
        super.setBasicSalary(this.hourlyRate * hours);
        super.calculatePay(0);
    }

    public void printDetails() {
        super.printEmpDetails();
    }
}