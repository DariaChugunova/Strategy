package com.company2;

public class DecoyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("DecoyDuck");
    }
    public void Quack() {
        System.out.println("Не крякает");
    }

    @Override
    public void fly() {
        System.out.println("Не летает");
    }
}
