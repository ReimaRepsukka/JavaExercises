public class PlayerMain {
    public static void main(String[] args) {
        ToughPlayer tp = new ToughPlayer();
        SoftPlayer sp = new SoftPlayer();
        tp.name = "Tiina";
        tp.energy = 20;
        sp.name = "Lasse";
        sp.energy = 15;

        tp.takeHit();
        sp.takeHit();

        System.out.println(tp.energy);
        System.out.println(sp.energy);

        System.out.println(tp);
    }
}
