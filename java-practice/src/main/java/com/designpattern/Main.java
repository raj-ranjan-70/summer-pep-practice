package com.designpattern;

public class Main {
    static void main() {

        // Singleton Design Pattern
        LoggerSingleton obj1 = LoggerSingleton.getLoggerSingletonInstance();
        LoggerSingleton obj2 = LoggerSingleton.getLoggerSingletonInstance();

        System.out.println(obj1 == obj2);

        // Factory Design Pattern
        Shape obj3 = ShapeFactory.createShape("Circle");
        obj3.draw();

        Shape obj4 = ShapeFactory.createShape("Square");
        obj4.draw();

        // Observer Design Pattern
        Channel channel = new Channel();
        Subscriber raj = new Subscriber("Raj");
        Subscriber ankit = new Subscriber("Ankit");
        channel.subscribe(raj);
        channel.subscribe(ankit);
        channel.publish("Java Design Pattern");
        channel.unSubscribe(ankit);
        channel.publish("Java Spring Boot");
    }
}
