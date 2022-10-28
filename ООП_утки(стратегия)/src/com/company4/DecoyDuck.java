package com.company4;
public class DecoyDuck extends  Duck{//Подсадная утка(деревянная)
    public DecoyDuck() {
        quackBehavior = new MuteQuack();//вызов performQuack выполняет объект Quack
        flyBehavior = new FlyNoWay();// FlyBehavior реализует тип  FlyWithWings
    }

    public void display() {
        System.out.println("I’m a Decoy Duck");
    }
}
