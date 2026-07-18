package com.practice;

public class EmployeeService {
    static void main() {
        FullTimeEmployee emp1 = new FullTimeEmployee("emp-001", "Raj Ranjan", 45000, 0.28);
        FullTimeEmployee emp2 = new FullTimeEmployee("emp-002", "Kumar Mayank", 45000, 0.28, 12000);

        PartTimeEmployee emp3 = new PartTimeEmployee("emp-003", "Raushan Kumar", 0.24, 3500, 14 );

        Contractor emp4 = new Contractor("emp-004", "Ankit Kumar", 0.2, 12000);

        emp1.calculateFullTimePay();
        emp2.calculateFullTimePay();

        emp3.calculatePartTimePay(10);

        emp4.calculateContractorPay(20);

        emp1.printDetails();
        emp2.printDetails();
        emp3.printDetails();
        emp4.printDetails();

        FullTimeEmployee emp5 = new FullTimeEmployee(emp1);
        emp5.setBasicSalary(55000.0);
        emp5.calculateFullTimePay();

        emp5.printDetails();
    }
}