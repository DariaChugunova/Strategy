public class Troll extends Character  {
    public  Troll(){
        weapon = new BowAndArrowBehavior();//лук
    }


    @Override
    public void display() {
        System.out.println("I’m a Troll ");
    }
}
