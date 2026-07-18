/*
*   Payroll System — Problem Situation

    * A company employs three kinds of workers: full-time staff who earn a fixed monthly salary plus a bonus, part-time workers who are paid by the hour, and contractors who are paid a daily rate. Every employee, regardless of type, has an ID and a name, and every employee's pay is taxed at the same company-wide rate before they receive it. The company also enforces a legal cap on how many hours a part-time worker may log in a week.

    * At the end of each pay cycle, the HR system holds a single list containing all employees mixed together. The system must go through that list and, for each person, work out their pay and print a payslip. Every payslip must look identical in structure no matter the employee type — showing the ID, name, gross pay, tax deducted, and final take-home amount — so that the layout is defined once and cannot be altered by any individual employee type.


    * The company frequently gives raises by taking an existing employee's record, making an independent duplicate of it, and adjusting the duplicate's pay — the original record must stay untouched. When creating a full-time employee, HR sometimes knows the bonus amount and sometimes doesn't, so the system must allow creating one either with a stated bonus or without one.

    * Finally, the design must be future-proof: next quarter the company plans to add a new category of worker (interns), and adding them should not force any changes to the code that already handles the existing employee types.
*/

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