public class landlinephone  extends Phones{
    @Override
    public void display() {
        System.out.println("Проводной телефон");
    }
    public landlinephone(){
        screen = new noscreen();
        call = new phonering();
    }
}
