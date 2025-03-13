public abstract class Shape implements Scalable {
    // since shape is abstract it doesnt need to implement the scale method
    protected String name;
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

}
