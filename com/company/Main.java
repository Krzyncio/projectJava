package com.company;

import creatures.Human;
import devices.Car;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Krzysztof";
        me.secondName = "Smoliński";
        me.setSalary(10000.0);
        System.out.println(me.getSalary());

        Car opel = new Car(1999,"opel", "astra", "silver", 1000.0);
        System.out.println(opel.color);
    }
}
