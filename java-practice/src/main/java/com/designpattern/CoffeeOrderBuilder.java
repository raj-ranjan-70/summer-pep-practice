package com.designpattern;

public class CoffeeOrderBuilder {
    private String size;
    private String sugerAmount;
    private String milk;
    private String extraShot;

    CoffeeOrderBuilder(CoffeeBuilder cB) {
        this.size = cB.size;
        this.sugerAmount = cB.sugerAmount;
        this.milk = cB.milk;
        this.extraShot = cB.extraShot;
    }

    public void printOrderDetails() {
        System.out.println("\n-----Order Details-----\n");
        System.out.println("Coffee Cup Size: " + this.size);
        System.out.println("Suger Amount: " + this.sugerAmount);
        System.out.println("Milk: " + this.milk);
        System.out.println("Extra Shot: " + this.extraShot);
    }

    static class CoffeeBuilder {
        private String size;
        private String sugerAmount;
        private String milk;
        private String extraShot;

        CoffeeBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        CoffeeBuilder setSugerAmount(String sugerAmount) {
            this.sugerAmount = sugerAmount;
            return this;
        }

        CoffeeBuilder setMilk(String milk) {
            this.milk = milk;
            return this;
        }

        CoffeeBuilder setExtraShot(String extraShot) {
            this.extraShot = extraShot;
            return this;
        }

        CoffeeOrderBuilder buildOrder() {
            return new CoffeeOrderBuilder(this);
        }
    }
}
