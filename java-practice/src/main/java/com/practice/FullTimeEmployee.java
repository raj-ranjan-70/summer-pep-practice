package com.practice;

public class FullTimeEmployee extends Employee{

    double bonusAmount;

    public FullTimeEmployee(String id, String name, double basicSalary, double taxRate) {
        super(id, name, basicSalary, taxRate);
        this.bonusAmount = 5000;
    }

    public FullTimeEmployee(String id, String name, double basicSalary, double taxRate, double bonusAmount) {
        super(id, name, basicSalary, taxRate);
        this.bonusAmount = bonusAmount;
    }

    public FullTimeEmployee(FullTimeEmployee employee) {
        super(employee.id, employee.name, employee.basicSalary, employee.taxRate);
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public void calculateFullTimePay() {
        super.calculatePay(this.bonusAmount);
    }

    public void printDetails() {
        super.printEmpDetails();
    }
}