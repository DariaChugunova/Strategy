package com.company4;
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();//утка изначально не умеет летать
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I’m a model duck");
    }
}