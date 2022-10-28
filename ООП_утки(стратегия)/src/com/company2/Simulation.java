package com.company2;

public class Simulation {
    public static void main(String[] args) {
        Duck malar = new MallardDuck();
        malar.display();
        malar.swim();
        malar.fly();
        malar.Quack();
        System.out.println();

        Duck readhead = new RedheadDuck();
        readhead.display();
        readhead.swim();
        readhead.fly();
        readhead.Quack();
    }
}
