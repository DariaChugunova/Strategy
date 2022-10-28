public class Queen extends  Character {//королева
    public  Queen(){
        weapon = new KnifeBehavior();
    }//нож
    @Override
    public void display() {
        System.out.println("I’m a Queen ");
    }
}
