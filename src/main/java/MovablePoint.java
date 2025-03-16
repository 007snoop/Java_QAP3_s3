/**
 * Movable point object class, extends point.
 */

public class MovablePoint extends Point{
    protected float xSpeed;
    protected float ySpeed;

    /**
     * Movable Point constructor.
     * @param xSpeed Speed X point is moving.
     * @param ySpeed Speed Y point is moving.
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * No argument constructor.
     */
    public MovablePoint() {
        super();
    }

    /**
     * Gets X speed.
     * @return Value of xSpeed.
     */
    public float getxSpeed() {
        return xSpeed;
    }

    /**
     * Gets Y speed.
     * @return Value of ySpeed.
     */
    public float getySpeed() {
        return ySpeed;
    }

    /**
     * Sets speed for value X.
     * @param xSpeed The speed value.
     */
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }


    /**
     * Sets speed for value Y.
     * @param ySpeed The speed value.
     */
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * Sets speed for both X and Y.
     * @param xSpeed The speed value.
     * @param ySpeed The speed value.
     */
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Sets array float.
     * @return X speed value and Y speed value.
     */
    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    /**
     * Overrides java toString Method.
     * @return Speed of Y, X and total.
     */
    public String toString() {
        return "\nX speed: " + getxSpeed()
                + "\nY speed: " + getySpeed();
    }

    /**
     * allows move() to be called.
     * @return the movement distance.
     */
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
