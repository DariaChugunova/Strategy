package com.company4;
public class RubberDuck extends  Duck {//резиновые утки
    public RubberDuck() {
        quackBehavior = new Squeak();//вызов performQuack выполняет объект Quack
        flyBehavior = new FlyNoWay();// FlyBehavior реализует тип  FlyWithWings
    }

    public void display() {
        System.out.println("I’m a Rubber Duck");
    }
}
