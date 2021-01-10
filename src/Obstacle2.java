import java.io.Serializable;

public class Obstacle2 extends Obstacle implements Serializable {
    private double bluerect_x;
    private double bluerect_y;

    private double redrect_x;
    private double redrect_y;

    private double pinkrect_x;
    private double pinkrect_y;

    private double greenrect_x;
    private double greenrect_y;

    public void setBluerect_x(double bluerect_x) {
        this.bluerect_x = bluerect_x;
    }

    public void setBluerect_y(double bluerect_y) {
        this.bluerect_y = bluerect_y;
    }

    public void setRedrect_x(double redrect_x) {
        this.redrect_x = redrect_x;
    }

    public void setRedrect_y(double redrect_y) {
        this.redrect_y = redrect_y;
    }

    public void setPinkrect_x(double pinkrect_x) {
        this.pinkrect_x = pinkrect_x;
    }

    public void setPinkrect_y(double pinkrect_y) {
        this.pinkrect_y = pinkrect_y;
    }

    public void setGreenrect_x(double greenrect_x) {
        this.greenrect_x = greenrect_x;
    }

    public void setGreenrect_y(double greenrect_y) {
        this.greenrect_y = greenrect_y;
    }

    public double getBluerect_x() {
        return bluerect_x;
    }

    public double getBluerect_y() {
        return bluerect_y;
    }

    public double getRedrect_x() {
        return redrect_x;
    }

    public double getRedrect_y() {
        return redrect_y;
    }

    public double getPinkrect_x() {
        return pinkrect_x;
    }

    public double getPinkrect_y() {
        return pinkrect_y;
    }

    public double getGreenrect_x() {
        return greenrect_x;
    }

    public double getGreenrect_y() {
        return greenrect_y;
    }

    @Override
    public void move() {

    }

    @Override
    public void setObjectDimension() {

    }

    @Override
    public int noofsides() {
        return 0;
    }
}
