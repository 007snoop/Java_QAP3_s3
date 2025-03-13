public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5)
                ,new Ellipse(8, 9)
                ,new Triangle(3, 4, 5)
                ,new EquilateralTriangle(6)
        };


        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("=================");
        }
    }
}