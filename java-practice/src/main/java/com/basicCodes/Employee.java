package com.basicCodes;

public class Employee {

    private String id;
    private String name;
    private String role;
    private String dept;

    Employee() {
        this.id = "emp-def";
        this.name = "John Doe";
        this.role = "System Engineer";
        this.dept = "Computer Science";
    }

    Employee(String id, String name, String role, String dept) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.dept = dept;
    }

    Employee(Employee employee) {
        this(employee.id, employee.name, employee.role, employee.dept);
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void displayInfo() {
        System.out.println("\n-----Employee Information-----\n");

        System.out.println("Employee ID: " + this.id + ".");
        System.out.println("Employee Name: " + this.name + ".");
        System.out.println("Employee Role: " + this.role + ".");
        System.out.println("Employee Dept: " + this.dept + ".");
    }

    static void main() {
        Employee employee1 = new Employee();
        employee1.displayInfo();
        employee1.setId("emp-001");
        employee1.setName("Raushan Kumar");
        employee1.displayInfo();


        Employee employee2 = new Employee("emp-002", "Raj Ranjan", "SDE1", "Computer Science");
        employee2.displayInfo();
        employee2.setRole("SDE2");
        employee2.setDept("Artificial Intelligence");
        employee2.displayInfo();
    }
}