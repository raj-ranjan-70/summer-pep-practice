package com.designpattern;

public class LoggerSingleton {
    private static LoggerSingleton instance;
    private LoggerSingleton() {
        System.out.println("LoggerSingleton Instance Created...");
    }

    public static LoggerSingleton getLoggerSingletonInstance() {
        if(instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void log(String data) {
        System.out.println("Log: Info: " + data);
    }
}
