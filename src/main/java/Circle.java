public class Circle extends Shape{
    private double radius;

    public Circle() {
        this("Circle", 1.0f);
    }

    public Circle(double radius) {
        this("Circle", radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }

    public Circle(String name, double radius) {
        super(name);
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
