public class King extends Character {
    public King(){
      weapon =  new AxeBehavior();//топор
    }

    @Override
    public void display() {
        System.out.println("I’m a King ");
    }
}
