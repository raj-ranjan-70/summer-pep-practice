package com.designpattern;

public class APIKeyConfigSingleton {
    private String API_KEY;
    private double defaultTemperature;
    private String currentlyActiveModel;

    static APIKeyConfigSingleton instance;

    private APIKeyConfigSingleton() {
        System.out.println("APIKeiConfigSingleton's object is created");
    }

    public static APIKeyConfigSingleton getAPIKeyConfigSingletonObject() {
        if(instance == null) instance = new APIKeyConfigSingleton();
        return instance;
    }

    public double getDefaultTemperature() {
        return defaultTemperature;
    }

    public void setDefaultTemperature(double defaultTemperature) {
        this.defaultTemperature = defaultTemperature;
    }

    public String getAPI_KEY() {
        return API_KEY;
    }

    public void setAPI_KEY(String API_KEY) {
        this.API_KEY = API_KEY;
    }

    public String getCurrentlyActiveModel() {
        return currentlyActiveModel;
    }

    public void setCurrentlyActiveModel(String currentlyActiveModel) {
        this.currentlyActiveModel = currentlyActiveModel;
    }
}

