public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double countArea() {
        return Math.PI * this.radius * this.radius;
    }
    
}
