package com.company;

import creatures.Animal;
import creatures.Human;
import devices.Car;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.species = "Maltańczyk";
        dog.name = "Bella";
        dog.weight = 11.0;
        System.out.println(dog.species);
        dog.takeForWalk();
        dog.feed();
        for (int i = 1; i < 10; i++) {
            dog.feed();
            for (int j = 1; j < 3; j++) {
                dog.takeForWalk();
            }
            System.out.println(dog.weight);
        }
        System.out.println("Pies waży teraz - " + dog.weight + " Co robimy dalej?");

//        Human me = new Human();
//        me.firstName = "Krzysztof";
//        me.secondName = "Smoliński";
//        me.setSalary(10000.0);
//        System.out.println(me.getSalary());
//
//        Car opel = new Car(1999,"opel", "astra", "silver", 1000.0);
//        System.out.println(opel.color);
//        System.out.println(opel.yearOfProduction);
    }
}
