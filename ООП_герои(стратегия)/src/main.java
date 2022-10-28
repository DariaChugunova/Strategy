public class main {
    public static void main(String[] args) {
        Character king = new King();
        king.display();
        king.fight();
        System.out.println();

        Character queen = new Queen();
        queen.display();
        queen.fight();
        System.out.println();

        Character troll = new Troll();
        troll.display();
        troll.fight();
        System.out.println();

        Character knight=new Knight();
        knight.display();
        knight.fight();
        System.out.println();

        king.display();
        king.fight();
        king.setWeapon(new BowAndArrowBehavior());
        king.fight();
    }
}
