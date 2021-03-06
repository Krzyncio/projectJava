package creatures;

import java.io.File;

public class Animal {

    final static Double MIN_WEIGHT = 2.0;
    public String species;
    public Boolean isAlive = true;
    public String name;
    File pic;
    public Double weight;

    public void takeForWalk() {
        if (this.isAlive) {
            this.weight--;
            System.out.println("Thx for a walk, bro");
            if (this.weight < MIN_WEIGHT) {
                this.isAlive = false;
            }
        } else {
            System.out.println("Idziesz do więzienia");
            System.out.println("Miło");
        }
    }

    public void feed() {
        if (this.isAlive) {
            this.weight += 0.5;
            System.out.println("Dzięki za jedzonko");
            if (weight > 10.00) {
                while (weight < 5.00) {
                    this.takeForWalk();
                }
                System.out.println("Chodziłeś tyle razy na spacer, aż ważysz mniej niż 5 kilo");
            }
        }

    }
}
