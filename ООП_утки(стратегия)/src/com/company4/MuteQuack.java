package com.company4;
public class MuteQuack implements QuackBehavior {//утки не крякают
    public void quack() {
        System.out.println("<< Silence >>");
    }
}