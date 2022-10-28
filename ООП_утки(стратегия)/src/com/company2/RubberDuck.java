package com.company2;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
    public void Quack() {
        System.out.println("Писк");
    }

    @Override
    public void fly() {
        System.out.println("Не летает");
    }
}
