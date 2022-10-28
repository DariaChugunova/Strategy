package com.company4;
public class RedheadDuck extends  Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();//вызов performQuack выполняет объект Quack
        flyBehavior = new FlyWithWings();// FlyBehavior реализует тип  FlyWithWings
    }

    public void display() {
        System.out.println("I’m a Redhead Duck");
    }
}
