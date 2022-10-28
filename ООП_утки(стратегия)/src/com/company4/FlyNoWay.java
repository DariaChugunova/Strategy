package com.company4;
public class FlyNoWay implements FlyBehavior {//утки, которые не летают
    public void fly() {
        System.out.println("I can’t fly");
    }
}