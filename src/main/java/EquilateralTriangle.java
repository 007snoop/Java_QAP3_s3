/**
 * subclass of triangle
 */

public class EquilateralTriangle extends Triangle {

    /**
     * All sides equal in this triangle.
     * @param side the same size side.
     */
    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "Equilateral Triangle";
    }
}
