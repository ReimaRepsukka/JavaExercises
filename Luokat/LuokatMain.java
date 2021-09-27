

public class LuokatMain {
    public static void main(String[] args) {
        // Player p1 = new Player();
        // p1.name ="John";
        // p1.points = 100;

        // Player p2 = new Player();
        // p2.name = "Lisa";
        // p2.points = 120;


        // System.out.println("Player 1: " + p1.name + " " + p1.points);
        // System.out.println("Player 2: " + p2.name + " " + p2.points);

        // Player p3 = new Player();
        // p3.name = p2.name;
        // p3.points = p3.points;

        Player p = new Player();
        p.setName("Repe");

        p.addPoints(10);
        p.addPoints(5);
        p.addPoints(12);

        System.out.println( p.getInfo() );

        p.setName("Sam");

        System.out.println(p.getInfo());

        Player p2 = new Player("Tiina");
        p2.addPoints(-40);
        System.out.println(p2.getInfo());

    }
}
