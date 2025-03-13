public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // use the scale interface here

    @Override
    public void scale(double scaleFactor) {
        this.radius *= scaleFactor;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}
