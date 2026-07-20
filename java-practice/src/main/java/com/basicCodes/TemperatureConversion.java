package com.basicCodes;

import java.util.Scanner;

public class TemperatureConversion {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celcius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * (9.0 / 5)) + 32;
        System.out.println("The temperature in fahrenheit is " + fahrenheit + " °F");
    }
}
