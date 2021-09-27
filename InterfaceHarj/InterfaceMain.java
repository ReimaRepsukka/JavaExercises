import java.util.ArrayList;
import java.util.List;

public class InterfaceMain {
    public static void main(String[] args) {
        List<Shape> muodot = new ArrayList<>();

        muodot.add(new Circle(5.6));
        muodot.add(new Rectangle(3, 2.2));
        muodot.add(new Quadrat(4.4));

        for (Shape shape : muodot) {
            System.out.println(shape.countArea());
        }
    }   
}
