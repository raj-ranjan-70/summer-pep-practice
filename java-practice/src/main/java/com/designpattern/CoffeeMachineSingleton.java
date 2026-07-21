package com.designpattern;

public class CoffeeMachineSingleton {
    private double waterTemperature;
    private String machinePowerStatus;

    private static CoffeeMachineSingleton instance;

    private CoffeeMachineSingleton() {
        System.out.println("The Coffee Machine Singleton Instance is created");
    }

    public static CoffeeMachineSingleton getInstance() {
        if(instance == null) {
            instance = new CoffeeMachineSingleton();
        }

        return instance;
    }

    public double getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(double waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public String getMachinePowerStatus() {
        return machinePowerStatus;
    }

    public void setMachinePowerStatus(String machinePowerStatus) {
        this.machinePowerStatus = machinePowerStatus;
    }
}
