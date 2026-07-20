package com.designpattern;

public interface AIModels {
    void useModel();
}

class FastLightweightModel implements AIModels{

    @Override
    public void useModel() {
        System.out.println("\nFast and Lightweight Model is being used...");
        NotificationService.switchModel(new StatusBar(0.2));
    }
}

class BalencedGeneralModel implements AIModels {

    @Override
    public void useModel() {
        System.out.println("\nBalanced and General Model is being used...");
        NotificationService.switchModel(new StatusBar(0.4));
    }
}

class HeavyReasoningModel implements AIModels {

    @Override
    public void useModel() {
        System.out.println("\nHeavy and Reasoning Model is being used...");
        NotificationService.switchModel(new StatusBar(0.6));
    }
}

class ModelFactory {
    public static AIModels CreateModel(String type) {
        return switch (type) {
            case "fast" -> new FastLightweightModel();
            case "balanced" -> new BalencedGeneralModel();
            case "reasoning" -> new HeavyReasoningModel();
            default -> throw new IllegalArgumentException("Unknown Model Type...");
        };
    }
}
