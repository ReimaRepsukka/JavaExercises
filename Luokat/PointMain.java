public class PointMain {
    public static void main(String[] args) {
        Point p = new Point(10, 10);
        p.set(50, 60);
        p.move(0, 100);

        System.out.println(p.info());

        p.move(-150, 0);

        System.out.println(p.info());
    }
}
