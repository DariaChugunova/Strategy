package com.company4;
public class MallardDuck extends Duck {//кряква
    public MallardDuck() {
        quackBehavior = new Quack();//вызов performQuack выполняет объект Quack
        flyBehavior = new FlyWithWings();// FlyBehavior реализует тип  FlyWithWings
    }

    public void display() {
        System.out.println("I’m a Mallard duck");
    }
}