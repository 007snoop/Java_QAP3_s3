/**
 * Ellipse subclass of Shape
 */

public class Ellipse extends Shape {
    private final double a;
    private final double b;

    /**
     * Constructor for Ellipse.
     * @param axis1 major axis.
     * @param axis2 minor axis.
     */
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1,axis2);
        this.b = Math.max(axis1,axis2);
    }

    /**
     * overrides superclass method
     * @return pi * radius(squared)
     */
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    /**
     * overrides superclass method
     * @return P=π*2*(a+b)−2(a−b)2
     */
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * (a+b) - Math.pow((a-b) , 2) / 2;
    }
}
