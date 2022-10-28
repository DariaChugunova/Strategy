package com.company4;
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;//каждый объект содержит ссылку на реализацию интерфейса

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();//объект Duck делегирует поведение объекту, на который ссылается quackBehavior
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }//изменение поведения утки

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}