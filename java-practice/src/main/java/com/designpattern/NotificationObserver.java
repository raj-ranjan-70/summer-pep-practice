package com.designpattern;

public interface NotificationObserver {
    void notifySwitch();
}

class StatusBar implements NotificationObserver {
    private String modelName;
    private double costPerToken;

    StatusBar(double costPerToken) {
        APIKeyConfigSingleton apiKeyConfigSingleton = APIKeyConfigSingleton.getAPIKeyConfigSingletonObject();
        this.modelName = apiKeyConfigSingleton.getCurrentlyActiveModel();
        this.costPerToken = costPerToken;
    }
    @Override
    public void notifySwitch() {
        System.out.println("-----The Status Bar-----");
        System.out.println("Logging the Model Switch");
        System.out.println("Model Name: " + this.modelName);
        System.out.println("Cost Per Token: " + costPerToken);
    }
}

class NotificationService {
    public static void switchModel(StatusBar statusBar) {
        statusBar.notifySwitch();
    }
}


