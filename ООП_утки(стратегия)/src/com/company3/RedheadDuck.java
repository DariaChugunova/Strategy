package com.company3;

public class RedheadDuck extends Duck implements Flyable,Quackable{
    @Override
    public void display() {
        System.out.println("RedheadDuck");
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
