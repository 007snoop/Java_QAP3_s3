/**
 * Triangle subclass of shape
 */

public class Triangle extends Shape {
    protected double side1, side2, side3;

    /**
     * triangle constructor with side validation.
     * @param side1 First side.
     * @param side2 Second side.
     * @param side3 Third side.
     */
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);

        if (side1 + side2 > side3
        && side2 + side3 > side1
        && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid triangle sides: " + side1 + "," + side2 + "," + side3);
        }
    }

    public Triangle(double side1, double side2, double side3) {
        this("Triangle", side1, side2, side3);
    }

    public Triangle() {
        this("Triangle", 0,0,0);
    }

    /**
     * overrides superclass method.
     * @return the area of triangle.
     */
    @Override
    public double getArea() {
        double side = getPerimeter() / 2;
        return Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
    }

    /**
     * overrides superclass method.
     * @return the perimeter of triangle.
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void scale(double scaleFactor) {
        this.side1 *= scaleFactor;
        this.side2 *= scaleFactor;
        this.side3 *= scaleFactor;
    }

    @Override
    public String toString() {
        return name
                + " with sides: "
                + side1
                + ", "
                + side2
                + ", "
                + side3;
    }
}
