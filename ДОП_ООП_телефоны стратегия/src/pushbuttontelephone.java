public class pushbuttontelephone extends Phones{
    @Override
    public void display() {
        System.out.println("Кнопочный телефон");
    }
    public  pushbuttontelephone(){
        screen = new nottouchscreen();
        call = new phonering();
    }
}
