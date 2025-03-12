public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(3.5f, 7.2f);
        float[] coordinates = p.getXY();
        System.out.println("X: " + coordinates[0] + ", Y: " + coordinates[1]);
    }
}
