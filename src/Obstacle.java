public abstract class Obstacle extends Color_Change{
    protected double x_position;
    protected double y_position;
    protected double speed;
    public abstract void move();

    public static void Serialize(){

    }
    public static void Deserialize(){

    }

    public abstract void setObjectDimension();

    public abstract int noofsides();

    public void setX_position(double x_position) {
        this.x_position = x_position;
    }

    public void setY_position(double y_position) {
        this.y_position = y_position;
    }

    public void increase_Speed(double speed) {
        this.speed = speed;
    }

    public double getX_position() {
        return x_position;
    }

    public double getY_position() {
        return y_position;
    }

    public double getSpeed() {
        return speed;
    }
}
