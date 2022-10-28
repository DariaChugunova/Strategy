package com.company3;

public class MallardDuck extends Duck implements Flyable,Quackable{
    @Override
    public void display() {
        System.out.println("MallardDuck");
    }

    @Override
    public void fly() {
        System.out.println("Летает");
    }

    @Override
    public void quack() {
        System.out.println("Крякает");
    }
}
