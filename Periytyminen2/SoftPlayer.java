public class SoftPlayer extends Playerx{

    @Override
    public void takeHit() {
        super.takeHit();
        super.takeHit();
        System.out.println("I'm such a soft player!");
    }
}
