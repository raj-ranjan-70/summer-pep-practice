package com.basicCodes;

public class Car {
    private int year;
    private String modelName;
    private String color;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Car(int year, String modelName, String color) {
        this.year = year;
        this.modelName = modelName;
        this.color = color;
    }

    void driving() {
        System.out.println("The Car with model name " + this.getModelName() + " is running");
    }

    void accelerate(int rate) {
        System.out.println("The car is accelerating at the rate of " + rate + " meter per second square");
    }

    void decelerate(int rate) {
        System.out.println("The car is deaccelerating at the rate of " + rate + " meter per second square");
    }

    void carDetails() {
        System.out.println("\n.....The Car Details.....\n");
        System.out.println("The car Model name is " + this.getModelName() + ".");
        System.out.println("The car Year is " + this.getYear() + ".");
        System.out.println("The car Color is " + this.getColor() + ".");
    }


    public static void main() {
        Car car1 = new Car(2004, "Maruti Alto", "Red");
        car1.driving();
        car1.accelerate(60);
        car1.decelerate(40);
        car1.carDetails();
    }
}
