public class Triangle extends Shape {
    protected double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");

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

    @Override
    public double getArea() {
        double side = getPerimeter() / 2;
        return Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
