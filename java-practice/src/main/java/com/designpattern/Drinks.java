package com.designpattern;

public interface Drinks {
    void chooseDrink();
}

class Espresso implements Drinks {

    @Override
    public void chooseDrink() {
        System.out.println("Espresso is selected");
    }
}

class Latte implements Drinks {

    @Override
    public void chooseDrink() {
        System.out.println("Latte is selected");
    }
}

class Cuppuccino implements Drinks {

    @Override
    public void chooseDrink() {
        System.out.println("Cuppoccino is selected");
    }
}

class DrinkFactory {
    Drinks drink;

    DrinkFactory(Drinks drink) {
        this.drink = drink;
    }

    public void selectDrink() {
        drink.chooseDrink();
    }
}