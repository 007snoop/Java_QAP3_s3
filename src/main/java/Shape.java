/**
 * Shape super class
 */

abstract class Shape {
    protected String name;

    /**
     * Constructor for shape.
     * @param name The name of the shape.
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * method to get area.
     * @return the area.
     */
    public abstract double getArea();

    /**
     * method to get perimeter.
     * @return the perimeter.
     */
    public abstract double getPerimeter();

    /**
     * overrides java toString method.
     * @return Shape name, Area, and perimeter.
     */
    @Override
    public String toString() {
        return "Shape: " + name
                + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter();
    }
}