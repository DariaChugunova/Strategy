public class smartphone extends Phones {
    public  smartphone(){
        screen = new touch_screen();
        call = new phonering();
    }
    @Override
    public void display() {
        System.out.println("Смартфон");
    }
}
