public class Knight extends Character {//рыцарь
    public  Knight(){
        weapon = new SwordBehavior();//меч
    }
    @Override
    public void display() {
        System.out.println("I’m a Knight ");
    }
}
