package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public void startEngine(){
        System.out.println(getClass().getSimpleName() + "the holden's engine is starting");

    }

    @Override
    public void accelerate(){
        System.out.println(getClass().getSimpleName()+"the holden is accelerating");

    }
    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + "the holden is braking");
    }
}


