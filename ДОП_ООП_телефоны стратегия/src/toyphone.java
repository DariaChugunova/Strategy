public class toyphone  extends Phones{

    @Override
    public void display() {
        System.out.println("Игрушечный телефон");
    }

    public  toyphone(){
        screen = new noscreen();
        call = new doesnotcall();
    }
}
