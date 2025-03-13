public class Rectangle extends Shape{
    private double width;
    private double height;


    public Rectangle() {
       this("Rectangle", 1.0, 1.0);
    }

    public Rectangle(double w, double h) {
        this("Rectangle", w, h);
    }

    public Rectangle(String name, double w, double h) {
        super(name);
        this.width = w;
        this.height = h;
    }

    @Override
    public void scale(double scaleFactor) {
        this.width *= scaleFactor;
        this.height *= scaleFactor;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle with width: " + width
                + " And height: " + height;
    }
}
