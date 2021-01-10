import java.io.Serializable;

public class Obstacle3 extends Obstacle implements Serializable {
    private double bluerecthor_x;
    private double bluerecthor_y;

    private double redrecthor_x;
    private double redrecthor_y;

    private double pinkrecthor_x;
    private double pinkrecthor_y;

    private double greenrecthor_x;
    private double greenrecthor_y;

    public void setBluerecthor_x(double bluerecthor_x) {
        this.bluerecthor_x = bluerecthor_x;
    }

    public void setBluerecthor_y(double bluerecthor_y) {
        this.bluerecthor_y = bluerecthor_y;
    }

    public void setRedrecthor_x(double redrecthor_x) {
        this.redrecthor_x = redrecthor_x;
    }

    public void setRedrecthor_y(double redrecthor_y) {
        this.redrecthor_y = redrecthor_y;
    }

    public void setPinkrecthor_x(double pinkrecthor_x) {
        this.pinkrecthor_x = pinkrecthor_x;
    }

    public void setPinkrecthor_y(double pinkrecthor_y) {
        this.pinkrecthor_y = pinkrecthor_y;
    }

    public void setGreenrecthor_x(double greenrecthor_x) {
        this.greenrecthor_x = greenrecthor_x;
    }

    public void setGreenrecthor_y(double greenrecthor_y) {
        this.greenrecthor_y = greenrecthor_y;
    }

    public double getBluerecthor_x() {
        return bluerecthor_x;
    }

    public double getBluerecthor_y() {
        return bluerecthor_y;
    }

    public double getRedrecthor_x() {
        return redrecthor_x;
    }

    public double getRedrecthor_y() {
        return redrecthor_y;
    }

    public double getPinkrecthor_x() {
        return pinkrecthor_x;
    }

    public double getPinkrecthor_y() {
        return pinkrecthor_y;
    }

    public double getGreenrecthor_x() {
        return greenrecthor_x;
    }

    public double getGreenrecthor_y() {
        return greenrecthor_y;
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
