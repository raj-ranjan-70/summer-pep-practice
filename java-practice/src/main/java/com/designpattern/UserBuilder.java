package com.designpattern;

public class UserBuilder {
    private String name;
    private int age;
    private String email;

    private UserBuilder(Builder b) {
        this.name = b.name;
        this.age = b.age;
        this.email = b.email;
    }

    public void printDetails() {
        System.out.println("\n\n-----User Details-----");
        System.out.println("User Name: " + this.name);
        System.out.println("User Age: " + this.age);
        System.out.println("User Email: " + this.email);
    }

    static class Builder {
        private String name;
        private int age;
        private String email;

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        UserBuilder build() {
            return new UserBuilder(this);
        }
    }
}