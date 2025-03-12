/**
 * Point class for problem#2.
 */

public class Point {
    protected float x;
    protected float y;

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
        this(0.0f, 0.0f);
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


    /**
     * Sets both X and Y values of point.
     * @param x X value of point.
     * @param y Y value of point.
     */
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Float object array.
     * @return New Float object with parameters X, Y.
     */
    public float[] getXY() {
        return new float[]{x,y};
    }

    /**
     * Overrides the toString default method java implements.
     * @return "X: {X}"
     *         "Y: {Y}"
     */
    @Override
    public String toString() {
        return "\nX: " + getX()
                + "\nY: " + getY();
    }
}
