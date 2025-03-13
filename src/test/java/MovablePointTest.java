import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2.0f, 3.0f, 1.0f, 2.0f);
        System.out.println("Initial: " + point);
        // Set new speeds
        point.setSpeed(3.0f, 4.0f);
        System.out.println("Speed after setSpeed: " + Arrays.toString(point.getSpeed())); // Get and print new speed

        // Move the point
        point.move();
        System.out.println("After moving: " + point);
    }
}
