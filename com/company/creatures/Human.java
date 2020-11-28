package com.company.creatures;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Human extends Animal {
    public String firstName;
    public String secondName;
    public Double salary;
    public Animal animal;

    public Double getSalary() {
        Calendar cal = Calendar.getInstance();
        System.out.println("\n" + cal.getTime());
        //System.out.println(salary);
        return salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("Nie pracowałeś - nie zarobiłeś");
        } else {
            System.out.println("Pobieranie wynagrodzenia " + LocalDateTime.now());
            System.out.println("Dane o podwyżce zostały wysłane do księgowości");
            System.out.println("Aneks do odebrania u pani HAni");
            System.out.println("Info do ZUS i US zostało przekazane");
            this.salary = newSalary;
        }

    }


}



