/**
 * Circle subclass for Ellipse
 */

public class Circle extends Ellipse {
    /**
     * sets name and passes radius twice for area
     * @param radius the full area.
     */
    public Circle(double radius) {
        super(radius, radius);
        this.name = "Circle";
    }
}
