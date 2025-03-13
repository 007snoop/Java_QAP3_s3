public class Ellipse extends Shape {
    private final double a;
    private final double b;

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1,axis2);
        this.b = Math.max(axis1,axis2);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * (a+b) - Math.pow((a-b) , 2) / 2;
    }
}
