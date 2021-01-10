import java.io.Serializable;

public class Obstacle1 extends Obstacle implements Serializable {
    private double circle_black_x;
    private double circle_black_y;

    private double arc1_x;
    private double arc1_y;

    private double arc2_x;
    private double arc2_y;

    public void setCircle_black_x(double circle_black_x) {
        this.circle_black_x = circle_black_x;
    }

    public void setCircle_black_y(double circle_black_y) {
        this.circle_black_y = circle_black_y;
    }

    public void setArc1_x(double arc1_x) {
        this.arc1_x = arc1_x;
    }

    public void setArc1_y(double arc1_y) {
        this.arc1_y = arc1_y;
    }

    public void setArc2_x(double arc2_x) {
        this.arc2_x = arc2_x;
    }

    public void setArc2_y(double arc2_y) {
        this.arc2_y = arc2_y;
    }

    public void setArc3_x(double arc3_x) {
        this.arc3_x = arc3_x;
    }

    public void setArc3_y(double arc3_y) {
        this.arc3_y = arc3_y;
    }

    public void setArc4_x(double arc4_x) {
        this.arc4_x = arc4_x;
    }

    public void setArc4_y(double arc4_y) {
        this.arc4_y = arc4_y;
    }

    public double getCircle_black_x() {
        return circle_black_x;
    }

    public double getCircle_black_y() {
        return circle_black_y;
    }

    public double getArc1_x() {
        return arc1_x;
    }

    public double getArc1_y() {
        return arc1_y;
    }

    public double getArc2_x() {
        return arc2_x;
    }

    public double getArc2_y() {
        return arc2_y;
    }

    public double getArc3_x() {
        return arc3_x;
    }

    public double getArc3_y() {
        return arc3_y;
    }

    public double getArc4_x() {
        return arc4_x;
    }

    public double getArc4_y() {
        return arc4_y;
    }

    private double arc3_x;
    private double arc3_y;

    private double arc4_x;
    private double arc4_y;

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
