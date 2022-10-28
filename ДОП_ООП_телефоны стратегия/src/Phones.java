public abstract class Phones {
    Callint call;
    Screenint screen;
    public Phones(){

    }
    public  abstract  void display();
    public void phone_ring(){
        call.call();
    }
    public void phone_screen(){
        screen.screen();
    }

    public void setScreen(Screenint scr){
        screen = scr;
    }
}
