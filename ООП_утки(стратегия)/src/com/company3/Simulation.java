package com.company3;

public class Simulation {
    public static void main(String[] args) {
        MallardDuck malard = new MallardDuck();
        malard.display();
        malard.swim();
        malard.fly();
        System.out.println();

        RubberDuck rubber = new RubberDuck();
        rubber.display();
        rubber.quack();

    }
}
