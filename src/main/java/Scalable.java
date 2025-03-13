// step 1; define scalable interface

public interface Scalable {
    void scale(double scaleFactor);

    public static void scaleShapes(Scalable[] scalableArray, double scaleFactor) {
        for (Scalable scalable : scalableArray) {
            scalable.scale(scaleFactor);
        }
    }
}
