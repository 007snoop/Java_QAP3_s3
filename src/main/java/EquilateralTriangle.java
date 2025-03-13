/**
 * subclass of triangle
 */

public class EquilateralTriangle extends Triangle {
    private double side;
    /**
     * All sides equal in this triangle.
     * @param side the same size side.
     */
    public EquilateralTriangle(double side) {
        super("Equilateral Triangle", side, side, side);

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
                + " with side: "
                + side1;
    }
}
