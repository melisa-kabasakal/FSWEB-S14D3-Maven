package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public void startEngine() {
        System.out.println("the car's engine is starting. " + getClass().getSimpleName());
    }

    public void accelerate() {
        System.out.println("the car is accelerating. " + getClass().getSimpleName());
    }

    public void brake() {
        System.out.println("the car is braking. " + getClass().getSimpleName());
    }



}
