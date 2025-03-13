public class Test {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2),
                new Rectangle(3, 4)
        };

        System.out.println("Before Scaling: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        Scalable.scaleShapes(shapes, 2);

        System.out.println("After scaling: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

