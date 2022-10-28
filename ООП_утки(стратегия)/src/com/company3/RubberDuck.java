package com.company3;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }


    @Override
    public void quack() {
        System.out.println("Пищит");
    }

}
