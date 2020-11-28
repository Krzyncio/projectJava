package devices;

public class Car {
    final public Integer yearOfProduction;
    final public String producer;
    final public String model;
    final public String color;
    Double value;

    public Car(Integer yearOfProduction, String producer, String model, String color, Double value) {
        this.yearOfProduction = yearOfProduction;
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.value = value;
    }


}
