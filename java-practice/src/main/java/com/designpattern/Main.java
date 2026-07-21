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

        // Practice Mix of Singleton, Factory, Observer Design Pattern

        APIKeyConfigSingleton apiKeyConfigSingleton = APIKeyConfigSingleton.getAPIKeyConfigSingletonObject();
        apiKeyConfigSingleton.setAPI_KEY("qwerty-uiop-asdf-ghjk");
        apiKeyConfigSingleton.setCurrentlyActiveModel("fast");
        apiKeyConfigSingleton.setDefaultTemperature(0.9);

        AIModels fastLightweight = ModelFactory.CreateModel("fast");
        fastLightweight.useModel();

        AIModels generalBalalced = ModelFactory.CreateModel("balanced");
        generalBalalced.useModel();

        AIModels heavyReasoning = ModelFactory.CreateModel("reasoning");
        heavyReasoning.useModel();

        //Builder Design Pattern
        UserBuilder userBuilder = new UserBuilder.Builder()
                .setName("Raj")
                .setAge(22)
                .setEmail("rajranjan707077@gmail.com")
                .build();

        userBuilder.printDetails();

        // Singleton, Builder, Factory pattern Practice
        CoffeeMachineSingleton coffeeMachineSingleton = CoffeeMachineSingleton.getInstance();
        coffeeMachineSingleton.setMachinePowerStatus("ON");
        coffeeMachineSingleton.setWaterTemperature(95.8);

        DrinkFactory drinkFactory = new DrinkFactory(new Espresso());
        drinkFactory.selectDrink();

        CoffeeOrderBuilder coffeeOrderBuilder = new CoffeeOrderBuilder.CoffeeBuilder()
                .setSize("Grande")
                .setSugerAmount("2 Suger Cubes")
                .setMilk("YES")
                .setExtraShot("2 Extra Shot")
                .buildOrder();

        coffeeOrderBuilder.printOrderDetails();

    }
}
