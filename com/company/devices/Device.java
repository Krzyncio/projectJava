package com.company.devices;

public class Device {
    public Integer yearOfProduction;
    public String producer;
    public String model;

    @Override
    public String toString() {
        return "Device{" +
                "yearOfProduction=" + yearOfProduction +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
