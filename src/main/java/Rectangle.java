public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public void scale(double scaleFactor) {
        this.width *= scaleFactor;
        this.height *= scaleFactor;
    }

    @Override
    public String toString() {
        return "Rectangle with width: " + width
                + " And height: " + height;
    }
}
