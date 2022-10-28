package com.company4;
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performFly();
        redhead.performQuack();
        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        System.out.println();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();//изначально не летает
        model.setFlyBehavior(new FlyRocketPowered());//утра вдруг взлетает
        model.performFly(); //динамическое переключение полета утки
    }
}