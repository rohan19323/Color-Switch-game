import java.io.Serializable;

public class Ball extends Color_Change implements Serializable {
    private double x_position;
    private double y_position;
    private double speed;

    Ball(){
        speed=0;
        x_position=280;
        y_position=475;
    }

    public void setX_position(double x_position) {
        this.x_position = x_position;
    }

    public void setY_position(double y_position) {
        this.y_position = y_position;
    }

    public void setSpeed(double speed) {
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
