package com.practice;

public class Employee {

    String id;
    String name;
    double basicSalary;
    double taxRate;
    double grossPay;
    double taxAmount;
    double finalAmount;

    public Employee(String id, String name, double taxRate) {
        this.id = id;
        this.name = name;
        this.taxRate = taxRate;
    }

    public Employee(String id, String name, double basicSalary, double taxRate) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.taxRate = taxRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxDeducted) {
        this.taxAmount = taxDeducted;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public void calculateGrossPay(double addetives) {
        this.grossPay = this.basicSalary + addetives;
//        this.setGrossPay(this.basicSalary + addetives);
    }

    public void calculateTaxAmount() {
        this.taxAmount = this.grossPay * this.taxRate;
    }

    public void calculateFinalPay() {
        this.finalAmount = this.grossPay - this.taxAmount;
    }

    public void calculatePay(double addetives) {
        this.calculateGrossPay(addetives);
        this.calculateTaxAmount();
        this.calculateFinalPay();
    }

    public void printEmpDetails() {

        System.out.println("-----Employee Details-----");
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Basic Pay: " + this.basicSalary);
        System.out.println("Employee Gross Pay: " + this.grossPay);
        System.out.println("Employee Tax Amount: " + this.taxAmount);
        System.out.println("Employee Final Pay: " + this.finalAmount);
    }
}