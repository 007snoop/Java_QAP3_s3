/**
 * Point class for problem#2.
 */

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    /**
     * Point constructor using 2 floats.
     * @param x X value of Point.
     * @param y Y value of Point.
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * No argument constructor.
     */
    public Point() {
        float x;
        float y;
    }


    /**
     * gets the X value of Point.
     * @return X value of Point.
     */
    public float getX() {
        return x;
    }


    /**
     * gets the Y value of Point.
     * @return Y value of Point.
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the point value of X.
     * @param x The x value of point.
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Sets the point value of Y
     * @param y The Y value of point.
     */
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "\nX: " + getX()
                + "\nY: " + getY();
    }
}
