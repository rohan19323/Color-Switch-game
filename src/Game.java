import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class SavedGamed implements Serializable{
    private ArrayList<Data> savedgames=new ArrayList<>();

    public void setSavedgames(ArrayList<Data> savedgames) {
        savedgames = savedgames;
    }

    public ArrayList<Data> getSavedgames() {
        return savedgames;
    }
}

class Data implements Serializable{



    private int star;

    public void setStar(int star) {
        this.star = star;
    }

    public int getStar() {
        return star;
    }

    private String name_save;

    public void setName_save(String name_save) {
        this.name_save = name_save;
    }

    public String getName_save() {
        return name_save;
    }

    private int Ball_color;

    public void setBall_color(int ball_color) {
        Ball_color = ball_color;
    }

    public int getBall_color() {
        return Ball_color;
    }

    private int no_of_obstacles;
    private int o1;
    private int o2;
    private int o3;
    private int o4;

    public void setNo_of_obstacles(int no_of_obstacles) {
        this.no_of_obstacles = no_of_obstacles;
    }

    public void setO1(int o1) {
        this.o1 = o1;
    }

    public void setO2(int o2) {
        this.o2 = o2;
    }

    public void setO3(int o3) {
        this.o3 = o3;
    }

    public void setO4(int o4) {
        this.o4 = o4;
    }

    public int getNo_of_obstacles() {
        return no_of_obstacles;
    }

    public int getO1() {
        return o1;
    }

    public int getO2() {
        return o2;
    }

    public int getO3() {
        return o3;
    }

    public int getO4() {
        return o4;
    }

    //star
    private double circle_x1;
    private double circle_y1;
    private double circle_x2;
    private double circle_y2;
    private double circle_x3;
    private double circle_y3;
    private double circle_x4;
    private double circle_y4;

    private double arc1_x1;
    private double arc1_y1;

    private double arc2_x1;
    private double arc2_y1;

    private double arc3_x1;
    private double arc3_y1;

    private double arc4_x1;
    private double arc4_y1;


    private double arc1_x2;
    private double arc1_y2;

    private double arc2_x2;
    private double arc2_y2;

    private double arc3_x2;
    private double arc3_y2;

    private double arc4_x2;
    private double arc4_y2;

    private double arc1_x3;
    private double arc1_y3;

    private double arc2_x3;
    private double arc2_y3;

    private double arc3_x3;
    private double arc3_y3;

    private double arc4_x3;
    private double arc4_y3;

    private double arc1_x4;
    private double arc1_y4;

    private double arc2_x4;
    private double arc2_y4;

    private double arc3_x4;
    private double arc3_y4;

    private double arc4_x4;
    private double arc4_y4;

    public void setCircle_x1(double circle_x1) {
        this.circle_x1 = circle_x1;
    }

    public void setCircle_y1(double circle_y1) {
        this.circle_y1 = circle_y1;
    }

    public void setCircle_x2(double circle_x2) {
        this.circle_x2 = circle_x2;
    }

    public void setCircle_y2(double circle_y2) {
        this.circle_y2 = circle_y2;
    }

    public void setCircle_x3(double circle_x3) {
        this.circle_x3 = circle_x3;
    }

    public void setCircle_y3(double circle_y3) {
        this.circle_y3 = circle_y3;
    }

    public void setCircle_x4(double circle_x4) {
        this.circle_x4 = circle_x4;
    }

    public void setCircle_y4(double circle_y4) {
        this.circle_y4 = circle_y4;
    }

    public void setArc1_x1(double arc1_x1) {
        this.arc1_x1 = arc1_x1;
    }

    public void setArc1_y1(double arc1_y1) {
        this.arc1_y1 = arc1_y1;
    }

    public void setArc2_x1(double arc2_x1) {
        this.arc2_x1 = arc2_x1;
    }

    public void setArc2_y1(double arc2_y1) {
        this.arc2_y1 = arc2_y1;
    }

    public void setArc3_x1(double arc3_x1) {
        this.arc3_x1 = arc3_x1;
    }

    public void setArc3_y1(double arc3_y1) {
        this.arc3_y1 = arc3_y1;
    }

    public void setArc4_x1(double arc4_x1) {
        this.arc4_x1 = arc4_x1;
    }

    public void setArc4_y1(double arc4_y1) {
        this.arc4_y1 = arc4_y1;
    }

    public void setArc1_x2(double arc1_x2) {
        this.arc1_x2 = arc1_x2;
    }

    public void setArc1_y2(double arc1_y2) {
        this.arc1_y2 = arc1_y2;
    }

    public void setArc2_x2(double arc2_x2) {
        this.arc2_x2 = arc2_x2;
    }

    public void setArc2_y2(double arc2_y2) {
        this.arc2_y2 = arc2_y2;
    }

    public void setArc3_x2(double arc3_x2) {
        this.arc3_x2 = arc3_x2;
    }

    public void setArc3_y2(double arc3_y2) {
        this.arc3_y2 = arc3_y2;
    }

    public void setArc4_x2(double arc4_x2) {
        this.arc4_x2 = arc4_x2;
    }

    public void setArc4_y2(double arc4_y2) {
        this.arc4_y2 = arc4_y2;
    }

    public void setArc1_x3(double arc1_x3) {
        this.arc1_x3 = arc1_x3;
    }

    public void setArc1_y3(double arc1_y3) {
        this.arc1_y3 = arc1_y3;
    }

    public void setArc2_x3(double arc2_x3) {
        this.arc2_x3 = arc2_x3;
    }

    public void setArc2_y3(double arc2_y3) {
        this.arc2_y3 = arc2_y3;
    }

    public void setArc3_x3(double arc3_x3) {
        this.arc3_x3 = arc3_x3;
    }

    public void setArc3_y3(double arc3_y3) {
        this.arc3_y3 = arc3_y3;
    }

    public void setArc4_x3(double arc4_x3) {
        this.arc4_x3 = arc4_x3;
    }

    public void setArc4_y3(double arc4_y3) {
        this.arc4_y3 = arc4_y3;
    }

    public void setArc1_x4(double arc1_x4) {
        this.arc1_x4 = arc1_x4;
    }

    public void setArc1_y4(double arc1_y4) {
        this.arc1_y4 = arc1_y4;
    }

    public void setArc2_x4(double arc2_x4) {
        this.arc2_x4 = arc2_x4;
    }

    public void setArc2_y4(double arc2_y4) {
        this.arc2_y4 = arc2_y4;
    }

    public void setArc3_x4(double arc3_x4) {
        this.arc3_x4 = arc3_x4;
    }

    public void setArc3_y4(double arc3_y4) {
        this.arc3_y4 = arc3_y4;
    }

    public void setArc4_x4(double arc4_x4) {
        this.arc4_x4 = arc4_x4;
    }

    public void setArc4_y4(double arc4_y4) {
        this.arc4_y4 = arc4_y4;
    }

    public double getCircle_x1() {
        return circle_x1;
    }

    public double getCircle_y1() {
        return circle_y1;
    }

    public double getCircle_x2() {
        return circle_x2;
    }

    public double getCircle_y2() {
        return circle_y2;
    }

    public double getCircle_x3() {
        return circle_x3;
    }

    public double getCircle_y3() {
        return circle_y3;
    }

    public double getCircle_x4() {
        return circle_x4;
    }

    public double getCircle_y4() {
        return circle_y4;
    }

    public double getArc1_x1() {
        return arc1_x1;
    }

    public double getArc1_y1() {
        return arc1_y1;
    }

    public double getArc2_x1() {
        return arc2_x1;
    }

    public double getArc2_y1() {
        return arc2_y1;
    }

    public double getArc3_x1() {
        return arc3_x1;
    }

    public double getArc3_y1() {
        return arc3_y1;
    }

    public double getArc4_x1() {
        return arc4_x1;
    }

    public double getArc4_y1() {
        return arc4_y1;
    }

    public double getArc1_x2() {
        return arc1_x2;
    }

    public double getArc1_y2() {
        return arc1_y2;
    }

    public double getArc2_x2() {
        return arc2_x2;
    }

    public double getArc2_y2() {
        return arc2_y2;
    }

    public double getArc3_x2() {
        return arc3_x2;
    }

    public double getArc3_y2() {
        return arc3_y2;
    }

    public double getArc4_x2() {
        return arc4_x2;
    }

    public double getArc4_y2() {
        return arc4_y2;
    }

    public double getArc1_x3() {
        return arc1_x3;
    }

    public double getArc1_y3() {
        return arc1_y3;
    }

    public double getArc2_x3() {
        return arc2_x3;
    }

    public double getArc2_y3() {
        return arc2_y3;
    }

    public double getArc3_x3() {
        return arc3_x3;
    }

    public double getArc3_y3() {
        return arc3_y3;
    }

    public double getArc4_x3() {
        return arc4_x3;
    }

    public double getArc4_y3() {
        return arc4_y3;
    }

    public double getArc1_x4() {
        return arc1_x4;
    }

    public double getArc1_y4() {
        return arc1_y4;
    }

    public double getArc2_x4() {
        return arc2_x4;
    }

    public double getArc2_y4() {
        return arc2_y4;
    }

    public double getArc3_x4() {
        return arc3_x4;
    }

    public double getArc3_y4() {
        return arc3_y4;
    }

    public double getArc4_x4() {
        return arc4_x4;
    }

    public double getArc4_y4() {
        return arc4_y4;
    }
//color changer


    //ball

    private double x_position;
    private double y_position;
    private double speed=0;

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

    //circle
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

    //vertical

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

    //vertical
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

    //parallel

    private double left_bluerecthor_x;
    private double left_bluerecthor_y;

    private double left_redrecthor_x;
    private double left_redrecthor_y;

    private double left_pinkrecthor_x;
    private double left_pinkrecthor_y;

    private double left_greenrecthor_x;
    private double left_greenrecthor_y;

    private double right_bluerecthor_x;
    private double right_bluerecthor_y;

    private double right_redrecthor_x;
    private double right_redrecthor_y;

    private double right_pinkrecthor_x;
    private double right_pinkrecthor_y;

    private double right_greenrecthor_x;
    private double right_greenrecthor_y;

    public void setLeft_bluerecthor_x(double left_bluerecthor_x) {
        this.left_bluerecthor_x = left_bluerecthor_x;
    }

    public void setLeft_bluerecthor_y(double left_bluerecthor_y) {
        this.left_bluerecthor_y = left_bluerecthor_y;
    }

    public void setLeft_redrecthor_x(double left_redrecthor_x) {
        this.left_redrecthor_x = left_redrecthor_x;
    }

    public void setLeft_redrecthor_y(double left_redrecthor_y) {
        this.left_redrecthor_y = left_redrecthor_y;
    }

    public void setLeft_pinkrecthor_x(double left_pinkrecthor_x) {
        this.left_pinkrecthor_x = left_pinkrecthor_x;
    }

    public void setLeft_pinkrecthor_y(double left_pinkrecthor_y) {
        this.left_pinkrecthor_y = left_pinkrecthor_y;
    }

    public void setLeft_greenrecthor_x(double left_greenrecthor_x) {
        this.left_greenrecthor_x = left_greenrecthor_x;
    }

    public void setLeft_greenrecthor_y(double left_greenrecthor_y) {
        this.left_greenrecthor_y = left_greenrecthor_y;
    }

    public void setRight_bluerecthor_x(double right_bluerecthor_x) {
        this.right_bluerecthor_x = right_bluerecthor_x;
    }

    public void setRight_bluerecthor_y(double right_bluerecthor_y) {
        this.right_bluerecthor_y = right_bluerecthor_y;
    }

    public void setRight_redrecthor_x(double right_redrecthor_x) {
        this.right_redrecthor_x = right_redrecthor_x;
    }

    public void setRight_redrecthor_y(double right_redrecthor_y) {
        this.right_redrecthor_y = right_redrecthor_y;
    }

    public void setRight_pinkrecthor_x(double right_pinkrecthor_x) {
        this.right_pinkrecthor_x = right_pinkrecthor_x;
    }

    public void setRight_pinkrecthor_y(double right_pinkrecthor_y) {
        this.right_pinkrecthor_y = right_pinkrecthor_y;
    }

    public void setRight_greenrecthor_x(double right_greenrecthor_x) {
        this.right_greenrecthor_x = right_greenrecthor_x;
    }

    public void setRight_greenrecthor_y(double right_greenrecthor_y) {
        this.right_greenrecthor_y = right_greenrecthor_y;
    }

    public double getLeft_bluerecthor_x() {
        return left_bluerecthor_x;
    }

    public double getLeft_bluerecthor_y() {
        return left_bluerecthor_y;
    }

    public double getLeft_redrecthor_x() {
        return left_redrecthor_x;
    }

    public double getLeft_redrecthor_y() {
        return left_redrecthor_y;
    }

    public double getLeft_pinkrecthor_x() {
        return left_pinkrecthor_x;
    }

    public double getLeft_pinkrecthor_y() {
        return left_pinkrecthor_y;
    }

    public double getLeft_greenrecthor_x() {
        return left_greenrecthor_x;
    }

    public double getLeft_greenrecthor_y() {
        return left_greenrecthor_y;
    }

    public double getRight_bluerecthor_x() {
        return right_bluerecthor_x;
    }

    public double getRight_bluerecthor_y() {
        return right_bluerecthor_y;
    }

    public double getRight_redrecthor_x() {
        return right_redrecthor_x;
    }

    public double getRight_redrecthor_y() {
        return right_redrecthor_y;
    }

    public double getRight_pinkrecthor_x() {
        return right_pinkrecthor_x;
    }

    public double getRight_pinkrecthor_y() {
        return right_pinkrecthor_y;
    }

    public double getRight_greenrecthor_x() {
        return right_greenrecthor_x;
    }

    public double getRight_greenrecthor_y() {
        return right_greenrecthor_y;
    }
}



public class Game {
    public void setData_input(Data data_input) {
        Game.data_input = data_input;
    }

    public Data getData_input() {
        return data_input;
    }
    //    Game(){
//        ball=new Ball();
////        images=new Image[];
////        buttons=new Button[];
//        obstacle1=new Obstacle1();
//        obstacle2=new Obstacle2();
//        obstacle3=new Obstacle3();
//        obstacle4=new Obstacle4();
//
//    }

    private SavedGamed savedGamed;

    public SavedGamed getSavedGamed() {
        return savedGamed;
    }

    private static Data data_input;


    public void deseralize(String name){
        try
        {
            File file;
            FileInputStream fileOut = new FileInputStream(name);
            ObjectInputStream outStream = new ObjectInputStream(fileOut);
            Data saved = (Data) outStream.readObject();
            data_input=saved;
//            sout("pink de "+data_input);
            outStream.close();
            fileOut.close();



        }catch(IOException | ClassNotFoundException i)
        {
            i.printStackTrace();
        }
    }

    public void serialize(){

//        sout("Pink ser "+pinkhor_rect.getY());

        Data data=new Data();

        data.setStar(star_pont);

        data.setName_save(name);

        data.setBall_color(ball_color);

        int i=0;

        if (i<obstacles.size()){
            data.setO1(obstacles.get(obstacles.size()-1));
            i++;
        }
        if (i<obstacles.size()){
            data.setO1(obstacles.get(obstacles.size()-2));
            i++;
        }
        if (i<obstacles.size()){
            data.setO1(obstacles.get(obstacles.size()-3));
            i++;
        }
        if (i<obstacles.size()){
            data.setO1(obstacles.get(obstacles.size()-4));
            i++;
        }

        data.setNo_of_obstacles(i);
        //start

        //stars

        data.setCircle_x1(star1.getCircle_x());
        data.setCircle_y1(star1.getCircle_y());

        data.setCircle_x2(star2.getCircle_x());
        data.setCircle_y2(star2.getCircle_y());

        data.setCircle_x3(star3.getCircle_x());
        data.setCircle_y3(star3.getCircle_y());

        data.setCircle_x4(star4.getCircle_x());
        data.setCircle_y4(star4.getCircle_y());

        //color cahnger

        data.setArc1_x1(colorrandom1.getArc1_x());
        data.setArc1_y1(colorrandom1.getArc1_y());

        data.setArc2_x1(colorrandom1.getArc2_x());
        data.setArc2_y1(colorrandom1.getArc2_y());

        data.setArc3_x1(colorrandom1.getArc3_x());
        data.setArc3_y1(colorrandom1.getArc3_y());

        data.setArc4_x1(colorrandom1.getArc4_x());
        data.setArc4_y1(colorrandom1.getArc4_y());


        data.setArc1_x2(colorrandom2.getArc1_x());
        data.setArc1_y2(colorrandom2.getArc1_y());

        data.setArc2_x2(colorrandom2.getArc2_x());
        data.setArc2_y2(colorrandom2.getArc2_y());

        data.setArc3_x2(colorrandom2.getArc3_x());
        data.setArc3_y2(colorrandom2.getArc3_y());

        data.setArc4_x2(colorrandom2.getArc4_x());
        data.setArc4_y2(colorrandom2.getArc4_y());

        data.setArc1_x3(colorrandom3.getArc1_x());
        data.setArc1_y3(colorrandom3.getArc1_y());

        data.setArc2_x3(colorrandom3.getArc2_x());
        data.setArc2_y3(colorrandom3.getArc2_y());

        data.setArc3_x3(colorrandom3.getArc3_x());
        data.setArc3_y3(colorrandom3.getArc3_y());

        data.setArc4_x3(colorrandom3.getArc4_x());
        data.setArc4_y3(colorrandom3.getArc4_y());

        data.setArc1_x4(colorrandom4.getArc1_x());
        data.setArc1_y4(colorrandom4.getArc1_y());

        data.setArc2_x4(colorrandom4.getArc2_x());
        data.setArc2_y4(colorrandom4.getArc2_y());

        data.setArc3_x4(colorrandom4.getArc3_x());
        data.setArc3_y4(colorrandom4.getArc3_y());

        data.setArc4_x4(colorrandom4.getArc4_x());
        data.setArc4_y4(colorrandom4.getArc4_y());



        //ball

        data.setX_position(ball.getX_position());
        data.setY_position(ball.getY_position());


        //1->circle
        //2->vertical line
        //3->horizontal line
        //4->8 obstacle


        //circle
        data.setCircle_black_x(obstacle1.getCircle_black_x());
        data.setCircle_black_y(obstacle1.getCircle_black_y());

        data.setArc1_x(obstacle1.getArc1_x());
        data.setArc1_y(obstacle1.getArc1_y());

        data.setArc2_x(obstacle1.getArc2_x());
        data.setArc2_y(obstacle1.getArc2_y());

        data.setArc3_x(obstacle1.getArc3_x());
        data.setArc3_y(obstacle1.getArc3_y());

        data.setArc4_x(obstacle1.getArc4_x());
        data.setArc4_y(obstacle1.getArc4_y());

        //vertical

        data.setBluerect_x(obstacle2.getBluerect_x());
        data.setBluerect_y(obstacle2.getBluerect_y());

        data.setGreenrect_x(obstacle2.getGreenrect_x());
        data.setGreenrect_y(obstacle2.getGreenrect_y());

        data.setPinkrect_x(obstacle2.getPinkrect_x());
        data.setPinkrect_y(obstacle2.getPinkrect_y());

        data.setRedrect_x(obstacle2.getRedrect_x());
        data.setRedrect_y(obstacle2.getRedrect_y());

        //horizontal


        data.setBluerecthor_x(obstacle3.getBluerecthor_x());
        data.setBluerecthor_y(obstacle3.getBluerecthor_y());

        data.setGreenrecthor_x(obstacle3.getGreenrecthor_x());
        data.setGreenrecthor_y(obstacle3.getGreenrecthor_y());

        data.setPinkrecthor_x(obstacle3.getPinkrecthor_x());
        data.setPinkrecthor_y(obstacle3.getPinkrecthor_y());

        data.setRedrecthor_x(obstacle3.getRedrecthor_x());
        data.setRedrecthor_y(obstacle3.getRedrecthor_y());

        //parallel

        data.setLeft_bluerecthor_x(obstacle4.getLeft_bluerecthor_x());
        data.setLeft_bluerecthor_y(obstacle4.getLeft_bluerecthor_y());

        data.setLeft_greenrecthor_x(obstacle4.getLeft_greenrecthor_x());
        data.setLeft_greenrecthor_y(obstacle4.getLeft_greenrecthor_y());

        data.setLeft_pinkrecthor_x(obstacle4.getLeft_pinkrecthor_x());
        data.setLeft_pinkrecthor_y(obstacle4.getLeft_pinkrecthor_y());

        data.setLeft_redrecthor_x(obstacle4.getLeft_redrecthor_x());
        data.setLeft_redrecthor_y(obstacle4.getLeft_redrecthor_y());

        data.setRight_bluerecthor_x(obstacle4.getRight_bluerecthor_x());
        data.setRight_bluerecthor_y(obstacle4.getRight_bluerecthor_y());

        data.setRight_greenrecthor_x(obstacle4.getRight_greenrecthor_x());
        data.setRight_greenrecthor_y(obstacle4.getRight_greenrecthor_y());

        data.setRight_pinkrecthor_x(obstacle4.getRight_pinkrecthor_x());
        data.setRight_pinkrecthor_y(obstacle4.getRight_pinkrecthor_y());

        data.setRight_redrecthor_x(obstacle4.getRight_redrecthor_x());
        data.setRight_redrecthor_y(obstacle4.getRight_redrecthor_y());


        //end

        SavedGamed savedGamed=new SavedGamed();
        try
        {
            FileOutputStream fileOut1 = new FileOutputStream(name);
            ObjectOutputStream outStream1 = new ObjectOutputStream(fileOut1);
//            sout(saved.count);
            outStream1.writeObject(data);
            outStream1.close();
            fileOut1.close();


//            FileOutputStream fileOut2 = new FileOutputStream("load");
//            ObjectOutputStream outStream2 = new ObjectOutputStream(fileOut2);
////            sout(saved.count);
//            outStream2.writeObject(savedGamed);
//            outStream2.close();
//            fileOut2.close();
        }catch(IOException ii)
        {
            ii.printStackTrace();
        }
    }

    private static int star_pont;
    private static Ball ball=new Ball();

    private Image[] images;
    private Button[] buttons;
    private int difficulty;
    private double ball_speed;
    private double obstacle_speed;
    private Obstacle current_obstacle;


    private static ArrayList<Integer> obstacles=new ArrayList<>();

    private static Star star1=new Star();
    private static Star star2=new Star();
    private static Star star3=new Star();
    private static Star star4=new Star();

    private static int ball_color;

    private static Colorrandom colorrandom1=new Colorrandom();
    private static Colorrandom colorrandom2=new Colorrandom();
    private static Colorrandom colorrandom3=new Colorrandom();
    private static Colorrandom colorrandom4=new Colorrandom();


    private static Obstacle1 obstacle1=new Obstacle1();
    private static Obstacle2 obstacle2=new Obstacle2();
    private static Obstacle3 obstacle3=new Obstacle3();
    private static Obstacle4 obstacle4=new Obstacle4();


    private static String name;

    private Media background_music;
    private Player player;

    @FXML
    private Label score_text;

    @FXML
    private Circle star_circle;

    @FXML
    private Circle star_circle2;

    @FXML
    private Circle star_circle3;

    @FXML
    private Circle star_circle4;

    @FXML
    private Button button2;

    @FXML
    private Rectangle left_pinksquare;

    @FXML
    private Rectangle right_pinksquare;

    @FXML
    private Rectangle left_bluesquare;

    @FXML
    private Rectangle right_bluesquare;

    @FXML
    private Rectangle left_redsquare;

    @FXML
    private Rectangle right_redsquare;

    @FXML
    private Rectangle left_greensquare;

    @FXML
    private Rectangle right_greensquare;

    @FXML
    private Arc pink_switch;

    @FXML
    private Arc red_switch;

    @FXML
    private Arc blue_switch;

    @FXML
    private Arc green_switch;


    @FXML
    private Arc pink_switch2;

    @FXML
    private Arc red_switch2;

    @FXML
    private Arc blue_switch2;

    @FXML
    private Arc green_switch2;

    @FXML
    private Arc pink_switch3;

    @FXML
    private Arc red_switch3;

    @FXML
    private Arc blue_switch3;

    @FXML
    private Arc green_switch3;

    @FXML
    private Arc pink_switch4;

    @FXML
    private Arc red_switch4;

    @FXML
    private Arc blue_switch4;

    @FXML
    private Arc green_switch4;

    @FXML
    private Rectangle greenhor_rect;

    @FXML
    private Rectangle redhor_rect;

    @FXML
    private Rectangle bluehor_rect;

    @FXML
    private Rectangle pinkhor_rect;

    @FXML
    private Rectangle blue_rect;


    @FXML
    private Rectangle pink_rect;

    @FXML
    private Rectangle red_rect;

    @FXML
    private Rectangle green_rect;

    @FXML
    private Line red_line;

    @FXML
    private Line pink_line;

    @FXML
    private Line blue_line;

    @FXML
    private Line green_line;

    @FXML
    private Pane background;

    @FXML
    private Button buttonnew;

    @FXML
    private Circle ball_circle;

    @FXML
    private Circle circle_black;

    @FXML
    private Arc arc1;

    @FXML
    private Arc arc2;

    @FXML
    private Arc arc3;

    @FXML
    private Arc arc4;

    @FXML
    private void initialize() {
        buttonnew.setText("Play Game");


        try {

            score_text.setText(String.valueOf(data_input.getStar()));

            int size = data_input.getNo_of_obstacles();

            if (size > 0) {
                obstacles.add(data_input.getO1());
                size--;
            }
            if (size > 0) {
                obstacles.add(data_input.getO2());
                size--;
            }
            if (size > 0) {
                obstacles.add(data_input.getO3());
                size--;
            }
            if (size > 0) {
                obstacles.add(data_input.getO4());
                size--;
            }


//            while (obstacles.get(obstacles.size()-1)==0){
//                obstacles.remove(obstacles.size()-1);
//            }
            obstacles.remove(obstacles.size()-1);

//            sout("last obstacle"+obstacles.get(obstacles.size()-1));
//            sout("From deserialize Current obstacles ");
//            for (int i = 0; i < obstacles.size(); i++) {
//                System.out.print(obstacles.get(i) + " ");
//            }
//            sout();


            ball_circle.setCenterY(data_input.getY_position());

//            sout("Restarted");

            //color change position

            blue_switch.setCenterY(data_input.getArc1_y1());
            red_switch.setCenterY(data_input.getArc2_y1());
            pink_switch.setCenterY(data_input.getArc3_y1());
            green_switch.setCenterY(data_input.getArc4_y1());


            blue_switch2.setCenterY(data_input.getArc1_y2());
            red_switch2.setCenterY(data_input.getArc2_y2());
            pink_switch2.setCenterY(data_input.getArc3_y2());
            green_switch2.setCenterY(data_input.getArc4_y2());

            blue_switch3.setCenterY(data_input.getArc1_y3());
            red_switch3.setCenterY(data_input.getArc2_y3());
            pink_switch3.setCenterY(data_input.getArc3_y3());
            green_switch3.setCenterY(data_input.getArc4_y3());

            blue_switch4.setCenterY(data_input.getArc1_y4());
            red_switch4.setCenterY(data_input.getArc2_y4());
            pink_switch4.setCenterY(data_input.getArc3_y4());
            green_switch4.setCenterY(data_input.getArc4_y4());

            //end

            Image image = new Image("https://vignette.wikia.nocookie.net/colorswitch/images/1/11/Regular_Star.png/revision/latest/top-crop/width/220/height/220?cb=20161030060935", false);

            star_circle.setFill(new ImagePattern(image));
            star_circle2.setFill(new ImagePattern(image));
            star_circle3.setFill(new ImagePattern(image));
            star_circle4.setFill(new ImagePattern(image));

            star_circle.setCenterY(data_input.getCircle_y1());
            star_circle2.setCenterY(data_input.getCircle_y2());
            star_circle3.setCenterY(data_input.getCircle_y3());
            star_circle4.setCenterY(data_input.getCircle_y4());


            //circle
            circle_black.setCenterY(data_input.getCircle_black_y());
            arc1.setCenterY(data_input.getArc1_y());
            arc2.setCenterY(data_input.getArc2_y());
            arc3.setCenterY(data_input.getArc3_y());
            arc4.setCenterY(data_input.getArc4_y());

            //vertical
            blue_rect.setY(data_input.getBluerect_y());
            red_rect.setY(data_input.getRedrect_y());
            green_rect.setY(data_input.getGreenrect_y());
            pink_rect.setY(data_input.getPinkrect_y());

            //vertical
            bluehor_rect.setY(data_input.getBluerecthor_y());
            redhor_rect.setY(data_input.getRedrecthor_y());
            greenhor_rect.setY(data_input.getGreenrecthor_y());
            pinkhor_rect.setY(data_input.getPinkrecthor_y());

            //parallel
            left_bluesquare.setY(data_input.getLeft_bluerecthor_y());
            left_greensquare.setY(data_input.getLeft_greenrecthor_y());
            left_pinksquare.setY(data_input.getLeft_pinkrecthor_y());
            left_redsquare.setY(data_input.getLeft_redrecthor_y());

            right_bluesquare.setY(data_input.getRight_bluerecthor_y());
            right_greensquare.setY(data_input.getRight_greenrecthor_y());
            right_pinksquare.setY(data_input.getRight_pinkrecthor_y());
            right_redsquare.setY(data_input.getRight_redrecthor_y());

            circle_black.setFill(Paint.valueOf("Black"));


            //color for ball
            int rand_color = data_input.getBall_color();
            if (rand_color == 1) {
                ball_circle.setFill(Paint.valueOf("#ff1f23"));
            }
            if (rand_color == 2) {
                ball_circle.setFill(Paint.valueOf("#ff1fd3"));
            }
            if (rand_color == 3) {
                ball_circle.setFill(Paint.valueOf("#d9ff5c"));
            }
            if (rand_color == 4) {
                ball_circle.setFill(Paint.valueOf("DODGERBLUE"));
            }


            //1 -> Circle
            //2 -> vertical line
            //3 -> square


            // 8obstacle start


            Timeline timeline9 = new Timeline();
            timeline9.setCycleCount(Timeline.INDEFINITE);
            timeline9.setAutoReverse(true);
            KeyValue kv9 = new KeyValue(left_bluesquare.xProperty(), -300);

            KeyFrame kf9 = new KeyFrame(Duration.millis(2000), kv9);
            timeline9.getKeyFrames().add(kf9);
            timeline9.play();

            Timeline timeline10 = new Timeline();
            timeline10.setCycleCount(Timeline.INDEFINITE);
            timeline10.setAutoReverse(true);
            KeyValue kv10 = new KeyValue(right_bluesquare.xProperty(), 300);

            KeyFrame kf10 = new KeyFrame(Duration.millis(2000), kv10);
            timeline10.getKeyFrames().add(kf10);
            timeline10.play();

            Timeline timelineg = new Timeline();
            timelineg.setCycleCount(Timeline.INDEFINITE);
            timelineg.setAutoReverse(true);
            KeyValue kv11 = new KeyValue(left_greensquare.xProperty(), 222);

            KeyFrame kf11 = new KeyFrame(Duration.millis(2000), kv11);
            timelineg.getKeyFrames().add(kf11);
            timelineg.play();

            Timeline timelineg2 = new Timeline();
            timelineg2.setCycleCount(Timeline.INDEFINITE);
            timelineg2.setAutoReverse(true);
            KeyValue kv12 = new KeyValue(right_greensquare.xProperty(), -222);

            KeyFrame kf12 = new KeyFrame(Duration.millis(2000), kv12);
            timelineg2.getKeyFrames().add(kf12);
            timelineg2.play();

            Timeline timelinep = new Timeline();
            timelinep.setCycleCount(Timeline.INDEFINITE);
            timelinep.setAutoReverse(true);
            KeyValue kv13 = new KeyValue(left_pinksquare.xProperty(), 222);

            KeyFrame kf13 = new KeyFrame(Duration.millis(2000), kv13);
            timelinep.getKeyFrames().add(kf13);
            timelinep.play();

            Timeline timelinep2 = new Timeline();
            timelinep2.setCycleCount(Timeline.INDEFINITE);
            timelinep2.setAutoReverse(true);
            KeyValue kv14 = new KeyValue(right_pinksquare.xProperty(), -222);

            KeyFrame kf14 = new KeyFrame(Duration.millis(2000), kv14);
            timelinep2.getKeyFrames().add(kf14);
            timelinep2.play();

            Timeline timeliner = new Timeline();
            timeliner.setCycleCount(Timeline.INDEFINITE);
            timeliner.setAutoReverse(true);
            KeyValue kv15 = new KeyValue(left_redsquare.xProperty(), -300);

            KeyFrame kf15 = new KeyFrame(Duration.millis(2000), kv15);
            timeliner.getKeyFrames().add(kf15);
            timeliner.play();

            Timeline timeliner2 = new Timeline();
            timeliner2.setCycleCount(Timeline.INDEFINITE);
            timeliner2.setAutoReverse(true);
            KeyValue kv16 = new KeyValue(right_redsquare.xProperty(), 300);

            KeyFrame kf16 = new KeyFrame(Duration.millis(2000), kv16);
            timeliner2.getKeyFrames().add(kf16);
            timeliner2.play();


            //end


            //horizontal line

            Timeline timeline91 = new Timeline();
            timeline91.setCycleCount(Timeline.INDEFINITE);
            timeline91.setAutoReverse(true);
            KeyValue kv41 = new KeyValue(redhor_rect.xProperty(), -600);
            KeyFrame kf41 = new KeyFrame(Duration.millis(1000), kv41);
            timeline91.getKeyFrames().add(kf41);
            timeline91.play();


            Timeline timeline101 = new Timeline();
            timeline101.setCycleCount(Timeline.INDEFINITE);
            timeline101.setAutoReverse(true);
            KeyValue kv51 = new KeyValue(bluehor_rect.xProperty(), 500);

            KeyFrame kf51 = new KeyFrame(Duration.millis(1000), kv51);
            timeline101.getKeyFrames().add(kf51);
            timeline101.play();


            Timeline timeline111 = new Timeline();
            timeline111.setCycleCount(Timeline.INDEFINITE);
            timeline111.setAutoReverse(true);
            KeyValue kv61 = new KeyValue(greenhor_rect.xProperty(), 500);

            KeyFrame kf61 = new KeyFrame(Duration.millis(1000), kv61);
            timeline111.getKeyFrames().add(kf61);
            timeline111.play();


            Timeline timeline121 = new Timeline();
            timeline121.setCycleCount(Timeline.INDEFINITE);
            timeline121.setAutoReverse(true);
            KeyValue kv71 = new KeyValue(pinkhor_rect.xProperty(), -600);

            KeyFrame kf71 = new KeyFrame(Duration.millis(1000), kv71);

            timeline121.getKeyFrames().add(kf71);
            timeline121.play();


            //end


            //line plus

            Rotate rotation11 = new Rotate();
            rotation11.pivotXProperty().bind(pink_line.startXProperty());
            rotation11.pivotYProperty().bind(pink_line.startYProperty());

            pink_line.getTransforms().add(rotation11);
            Timeline timeline11 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(rotation11.angleProperty(), 0)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(rotation11.angleProperty(), 360)));
            timeline11.setCycleCount(Timeline.INDEFINITE);
            timeline11.play();


            Rotate rotation21 = new Rotate();
            rotation21.pivotXProperty().bind(red_line.endXProperty());
            rotation21.pivotYProperty().bind(red_line.endYProperty());

            red_line.getTransforms().add(rotation21);
            Timeline timeline21 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(rotation21.angleProperty(), 0)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(rotation21.angleProperty(), 360)));
            timeline21.setCycleCount(Timeline.INDEFINITE);
            timeline21.play();


            Rotate rotation31 = new Rotate();
            rotation31.pivotXProperty().bind(blue_line.startXProperty());
            rotation31.pivotYProperty().bind(blue_line.endYProperty());

            blue_line.getTransforms().add(rotation31);
            Timeline timeline31 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(rotation31.angleProperty(), 0)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(rotation31.angleProperty(), 360)));
            timeline31.setCycleCount(Timeline.INDEFINITE);
            timeline31.play();

            Rotate rotation41 = new Rotate();
            rotation41.pivotXProperty().bind(green_line.startXProperty());
            rotation41.pivotYProperty().bind(green_line.startYProperty());

            green_line.getTransforms().add(rotation41);
            Timeline timeline41 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(rotation41.angleProperty(), 0)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(rotation41.angleProperty(), 360)));
            timeline41.setCycleCount(Timeline.INDEFINITE);
            timeline41.play();


            //end

            //start

            Timeline timeline5 = new Timeline();
            timeline5.setCycleCount(Timeline.INDEFINITE);
            timeline5.setAutoReverse(true);
            KeyValue kv = new KeyValue(blue_rect.xProperty(), 400);

            KeyFrame kf = new KeyFrame(Duration.millis(2000), kv);
            timeline5.getKeyFrames().add(kf);
            timeline5.play();

            Timeline timeline6 = new Timeline();
            timeline6.setCycleCount(Timeline.INDEFINITE);
            timeline6.setAutoReverse(true);
            KeyValue kv1 = new KeyValue(red_rect.xProperty(), 400);

            KeyFrame kf1 = new KeyFrame(Duration.millis(2000), kv1);
            timeline6.getKeyFrames().add(kf1);
            timeline6.play();

            Timeline timeline7 = new Timeline();
            timeline7.setCycleCount(Timeline.INDEFINITE);
            timeline7.setAutoReverse(true);
            KeyValue kv2 = new KeyValue(green_rect.xProperty(), 400);

            KeyFrame kf2 = new KeyFrame(Duration.millis(2000), kv2);
            timeline7.getKeyFrames().add(kf2);
            timeline7.play();

            Timeline timeline8 = new Timeline();
            timeline8.setCycleCount(Timeline.INDEFINITE);
            timeline8.setAutoReverse(true);
            KeyValue kv3 = new KeyValue(pink_rect.xProperty(), 400);

            KeyFrame kf3 = new KeyFrame(Duration.millis(2000), kv3);
            timeline8.getKeyFrames().add(kf3);
            timeline8.play();


            //end


            Rotate rotation1 = new Rotate();
            rotation1.pivotXProperty().bind(pink_line.startXProperty());
            rotation1.pivotYProperty().bind(pink_line.startYProperty());

            pink_line.getTransforms().add(rotation1);
            Timeline timeline1 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(rotation1.angleProperty(), 0)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(rotation1.angleProperty(), 360)));
            timeline1.setCycleCount(Timeline.INDEFINITE);
            timeline1.play();

            Rotate rotation2 = new Rotate();
            rotation2.pivotXProperty().bind(red_line.endXProperty());
            rotation2.pivotYProperty().bind(red_line.endYProperty());

            red_line.getTransforms().add(rotation2);
            Timeline timeline2 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(rotation2.angleProperty(), 0)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(rotation2.angleProperty(), 360)));
            timeline2.setCycleCount(Timeline.INDEFINITE);
            timeline2.play();

            Rotate rotation3 = new Rotate();
            rotation3.pivotXProperty().bind(blue_line.startXProperty());
            rotation3.pivotYProperty().bind(blue_line.endYProperty());

            blue_line.getTransforms().add(rotation3);
            Timeline timeline3 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(rotation3.angleProperty(), 0)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(rotation3.angleProperty(), 360)));
            timeline3.setCycleCount(Timeline.INDEFINITE);
            timeline3.play();

            Rotate rotation4 = new Rotate();
            rotation4.pivotXProperty().bind(green_line.startXProperty());
            rotation4.pivotYProperty().bind(green_line.startYProperty());

            green_line.getTransforms().add(rotation4);
            Timeline timeline4 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(rotation4.angleProperty(), 0)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(rotation4.angleProperty(), 360)));
            timeline4.setCycleCount(Timeline.INDEFINITE);
            timeline4.play();


//        ball_circle.addEventHandler( KeyEvent.KEY_PRESSED,keyListener);


            Timeline animation = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc1.startAngleProperty(), arc1.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(arc1.startAngleProperty(), arc1.getStartAngle() - 360, Interpolator.LINEAR))
            );
            Timeline animation2 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc2.startAngleProperty(), arc2.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(arc2.startAngleProperty(), arc2.getStartAngle() - 360, Interpolator.LINEAR))
            );
            Timeline animation3 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc3.startAngleProperty(), arc3.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(arc3.startAngleProperty(), arc3.getStartAngle() - 360, Interpolator.LINEAR))
            );
            Timeline animation4 = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(arc4.startAngleProperty(), arc4.getStartAngle(), Interpolator.LINEAR)),
                    new KeyFrame(Duration.seconds(4), new KeyValue(arc4.startAngleProperty(), arc4.getStartAngle() - 360, Interpolator.LINEAR))
            );

            animation.setCycleCount(Animation.INDEFINITE);
            animation.play();
            animation2.setCycleCount(Animation.INDEFINITE);
            animation2.play();
            animation3.setCycleCount(Animation.INDEFINITE);
            animation3.play();
            animation4.setCycleCount(Animation.INDEFINITE);
            animation4.play();

            double bluehor_rect_initial = bluehor_rect.getY();
            double pinkhor_rect_initial = pinkhor_rect.getY();
            double greenhor_rect_initial = greenhor_rect.getY();
            double redhor_rect_initial = redhor_rect.getY();

            double blue_rect_initial = blue_rect.getY();
            double pink_rect_initial = pink_rect.getY();
            double red_rect_initial = red_rect.getY();
            double green_rect_initial = green_rect.getY();


//        ArrayList<Integer> obstacles=new ArrayList<>();


            AnimationTimer timer = new AnimationTimer() {
                Star istar1 = star1;
                Star istar2 = star2;
                Star istar3 = star3;
                Star istar4 = star4;

                Colorrandom icolorrandom1 = colorrandom1;
                Colorrandom icolorrandom2 = colorrandom2;
                Colorrandom icolorrandom3 = colorrandom3;
                Colorrandom icolorrandom4 = colorrandom4;


                Ball iball = ball;

                Obstacle1 iobstacle1 = obstacle1;
                Obstacle2 iobstacle2 = obstacle2;
                Obstacle3 iobstacle3 = obstacle3;
                Obstacle4 iobstacle4 = obstacle4;

                boolean color_change_icon_set = false;
                boolean star_icon_set = false;

                boolean color_change_else = false;
                boolean star_else = false;

                boolean added_new = false;

                boolean collide_star1 = false;
                boolean collide_star2 = false;
                boolean collide_star3 = false;
                boolean collide_star4 = false;


                boolean circle_check = false;
                boolean vertical_check = false;
                boolean horizontal_check = false;
                boolean parallel_obstacle_check = false;

                boolean first_obstacle = true;
                int no_vertical = 2;

                private boolean is_break=false;


                @Override
                public void handle(long now) {


                    if (ispaused){
                        is_break=ispaused;
                    }


//                    if (ball_circle.getCenterY()>100 && !is_break){
//                        exit();
//                        is_break=true;
//                    }

                    //1->circle
                    //2->vertical line
                    //3->horizontal line
                    //4->8 obstacle


                    //collision start

                    Color c = (Color) ball_circle.getFill();
                    Color blue_color = Color.valueOf("0x1e90ffff");
                    Color red_color = Color.valueOf("#ff1f23");
                    Color pink_color = Color.valueOf("#ff1fd1");
                    Color green_color = Color.valueOf("#d9ff5c");

                    //blue color ball
                    if (c.equals(blue_color)) {

                        //for circle

                        Shape intersect1 = Shape.intersect(ball_circle, arc1);
                        Shape intersect11 = Shape.intersect(ball_circle, circle_black);
                        if (intersect1.getBoundsInLocal().getWidth() != -1 && intersect11.getBoundsInLocal().getWidth() == -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect2 = Shape.intersect(ball_circle, arc2);
                        Shape intersect21 = Shape.intersect(ball_circle, circle_black);
                        if (intersect2.getBoundsInLocal().getWidth() != -1 && intersect21.getBoundsInLocal().getWidth() == -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect3 = Shape.intersect(ball_circle, arc3);
                        Shape intersect31 = Shape.intersect(ball_circle, circle_black);
                        if (intersect3.getBoundsInLocal().getWidth() != -1 && intersect31.getBoundsInLocal().getWidth() == -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        //for vertical line

                        Shape intersect4 = Shape.intersect(ball_circle, pink_rect);
                        if (intersect4.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect5 = Shape.intersect(ball_circle, red_rect);
                        if (intersect5.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect6 = Shape.intersect(ball_circle, green_rect );
                        if (intersect6.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }


                        //horizontal line

                        Shape intersect7 = Shape.intersect(ball_circle, redhor_rect);
                        if (intersect7.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect8 = Shape.intersect(ball_circle, pinkhor_rect);
                        if (intersect8.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect9 = Shape.intersect(ball_circle, greenhor_rect);
                        if (intersect9.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect10 = Shape.intersect(ball_circle, left_greensquare);
                        if (intersect10.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect111 = Shape.intersect(ball_circle, left_pinksquare);
                        if (intersect111.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect121 = Shape.intersect(ball_circle, left_redsquare);
                        if (intersect121.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect131 = Shape.intersect(ball_circle, right_greensquare );
                        if (intersect131.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                        }

                        Shape intersect141 = Shape.intersect(ball_circle, right_pinksquare );
                        if (intersect141.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect151 = Shape.intersect(ball_circle, right_redsquare);
                        if (intersect151.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        //collison with color change


                        Shape intersecti1 = Shape.intersect(ball_circle, red_switch);
                        Shape intersecti2 = Shape.intersect(ball_circle, blue_switch);
                        Shape intersecti3 = Shape.intersect(ball_circle, green_switch);
                        Shape intersecti4 = Shape.intersect(ball_circle, red_switch);

                        if (intersecti1.getBoundsInLocal().getWidth() != -1 || intersecti2.getBoundsInLocal().getWidth() != -1
                                || intersecti3.getBoundsInLocal().getWidth() != -1 || intersecti4.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(green_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch.setCenterY(-1000);
                            red_switch.setCenterY(-1000);
                            green_switch.setCenterY(-1000);
                            pink_switch.setCenterY(-1000);

                        }

                        Shape intersecti11 = Shape.intersect(ball_circle, red_switch2);
                        Shape intersecti21 = Shape.intersect(ball_circle, blue_switch2);
                        Shape intersecti31 = Shape.intersect(ball_circle, green_switch2);
                        Shape intersecti41 = Shape.intersect(ball_circle, red_switch2);

                        if (intersecti11.getBoundsInLocal().getWidth() != -1 || intersecti21.getBoundsInLocal().getWidth() != -1
                                || intersecti31.getBoundsInLocal().getWidth() != -1 || intersecti41.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(green_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch2.setCenterY(-1000);
                            red_switch2.setCenterY(-1000);
                            green_switch2.setCenterY(-1000);
                            pink_switch2.setCenterY(-1000);

                        }

                        Shape intersecti121 = Shape.intersect(ball_circle, red_switch3);
                        Shape intersecti221 = Shape.intersect(ball_circle, blue_switch3);
                        Shape intersecti321 = Shape.intersect(ball_circle, green_switch3);
                        Shape intersecti421 = Shape.intersect(ball_circle, red_switch3);

                        if (intersecti121.getBoundsInLocal().getWidth() != -1 || intersecti221.getBoundsInLocal().getWidth() != -1
                                || intersecti321.getBoundsInLocal().getWidth() != -1 || intersecti421.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(green_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch3.setCenterY(-1000);
                            red_switch3.setCenterY(-1000);
                            green_switch3.setCenterY(-1000);
                            pink_switch3.setCenterY(-1000);

                        }

                        Shape intersecti12 = Shape.intersect(ball_circle, red_switch4);
                        Shape intersecti22 = Shape.intersect(ball_circle, blue_switch4);
                        Shape intersecti32 = Shape.intersect(ball_circle, green_switch4);
                        Shape intersecti42 = Shape.intersect(ball_circle, red_switch4);

                        if (intersecti12.getBoundsInLocal().getWidth() != -1 || intersecti22.getBoundsInLocal().getWidth() != -1
                                || intersecti32.getBoundsInLocal().getWidth() != -1 || intersecti42.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = rand.nextInt();
                            if (number == 0) {
                                ball_circle.setFill(green_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch4.setCenterY(-1000);
                            red_switch4.setCenterY(-1000);
                            green_switch4.setCenterY(-1000);
                            pink_switch4.setCenterY(-1000);

                        }


                        //collison end


                        //collision with star

                        Shape intersecti13 = Shape.intersect(ball_circle, star_circle);

                        if (intersecti13.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star1) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star1 = true;
                            }

                            star_circle.setCenterY(-10000);
                        }

                        Shape intersecti131 = Shape.intersect(ball_circle, star_circle2);

                        if (intersecti131.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star2) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star2 = true;
                            }

                            star_circle2.setCenterY(-10000);
                        }

                        Shape intersecti132 = Shape.intersect(ball_circle, star_circle3);

                        if (intersecti132.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star3) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star3 = true;
                            }

                            star_circle3.setCenterY(-10000);
                        }

                        Shape intersecti134 = Shape.intersect(ball_circle, star_circle4);

                        if (intersecti134.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star4) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star4 = true;
                            }

                            star_circle4.setCenterY(-10000);
                        }

                        //end

                    }

                    //red color ball

                    if (c.equals(red_color)) {

//                    //for circle

                        Shape intersect1 = Shape.intersect(ball_circle, arc2);
                        Shape intersect11 = Shape.intersect(ball_circle, circle_black);
                        if (intersect1.getBoundsInLocal().getWidth() != -1 && intersect11.getBoundsInLocal().getWidth() == -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect2 = Shape.intersect(ball_circle, arc3);
                        Shape intersect21 = Shape.intersect(ball_circle, circle_black);
                        if (intersect2.getBoundsInLocal().getWidth() != -1 && intersect21.getBoundsInLocal().getWidth() == -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect3 = Shape.intersect(ball_circle, arc4);
                        Shape intersect31 = Shape.intersect(ball_circle, circle_black);
                        if (intersect3.getBoundsInLocal().getWidth() != -1 && intersect31.getBoundsInLocal().getWidth() == -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        //for vertical line

                        Shape intersect4 = Shape.intersect(ball_circle, pink_rect);
                        if (intersect4.getBoundsInLocal().getWidth() != -1 && !is_break && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect5 = Shape.intersect(ball_circle, blue_rect);
                        if (intersect5.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect6 = Shape.intersect(ball_circle, green_rect);
                        if (intersect6.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }


                        //horizontal line

                        Shape intersect7 = Shape.intersect(ball_circle, bluehor_rect);
                        if (intersect7.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect8 = Shape.intersect(ball_circle, pinkhor_rect);
                        if (intersect8.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect9 = Shape.intersect(ball_circle, greenhor_rect);
                        if (intersect9.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }


                        Shape intersect10 = Shape.intersect(ball_circle, left_greensquare);
                        if (intersect10.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect111 = Shape.intersect(ball_circle, left_pinksquare);
                        if (intersect111.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect121 = Shape.intersect(ball_circle, left_bluesquare );
                        if (intersect121.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect131 = Shape.intersect(ball_circle, right_greensquare);
                        if (intersect131.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect141 = Shape.intersect(ball_circle, right_pinksquare);
                        if (intersect141.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect151 = Shape.intersect(ball_circle, right_bluesquare);
                        if (intersect151.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        //collison with color change


                        Shape intersecti1 = Shape.intersect(ball_circle, red_switch);
                        Shape intersecti2 = Shape.intersect(ball_circle, blue_switch);
                        Shape intersecti3 = Shape.intersect(ball_circle, green_switch);
                        Shape intersecti4 = Shape.intersect(ball_circle, red_switch);

                        if (intersecti1.getBoundsInLocal().getWidth() != -1 || intersecti2.getBoundsInLocal().getWidth() != -1
                                || intersecti3.getBoundsInLocal().getWidth() != -1 || intersecti4.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(green_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch.setCenterY(-1000);
                            red_switch.setCenterY(-1000);
                            green_switch.setCenterY(-1000);
                            pink_switch.setCenterY(-1000);
                        }

                        Shape intersecti11 = Shape.intersect(ball_circle, red_switch2);
                        Shape intersecti21 = Shape.intersect(ball_circle, blue_switch2);
                        Shape intersecti31 = Shape.intersect(ball_circle, green_switch2);
                        Shape intersecti41 = Shape.intersect(ball_circle, red_switch2);

                        if (intersecti11.getBoundsInLocal().getWidth() != -1 || intersecti21.getBoundsInLocal().getWidth() != -1
                                || intersecti31.getBoundsInLocal().getWidth() != -1 || intersecti41.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(green_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch2.setCenterY(-1000);
                            red_switch2.setCenterY(-1000);
                            green_switch2.setCenterY(-1000);
                            pink_switch2.setCenterY(-1000);

                        }

                        Shape intersecti112 = Shape.intersect(ball_circle, red_switch3);
                        Shape intersecti212 = Shape.intersect(ball_circle, blue_switch3);
                        Shape intersecti312 = Shape.intersect(ball_circle, green_switch3);
                        Shape intersecti412 = Shape.intersect(ball_circle, red_switch3);

                        if (intersecti112.getBoundsInLocal().getWidth() != -1 || intersecti212.getBoundsInLocal().getWidth() != -1
                                || intersecti312.getBoundsInLocal().getWidth() != -1 || intersecti412.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(green_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch3.setCenterY(-1000);
                            red_switch3.setCenterY(-1000);
                            green_switch3.setCenterY(-1000);
                            pink_switch3.setCenterY(-1000);

                        }

                        Shape intersecti12 = Shape.intersect(ball_circle, red_switch4);
                        Shape intersecti22 = Shape.intersect(ball_circle, blue_switch4);
                        Shape intersecti32 = Shape.intersect(ball_circle, green_switch4);
                        Shape intersecti42 = Shape.intersect(ball_circle, red_switch4);

                        if (intersecti12.getBoundsInLocal().getWidth() != -1 || intersecti22.getBoundsInLocal().getWidth() != -1
                                || intersecti32.getBoundsInLocal().getWidth() != -1 || intersecti42.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(green_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch4.setCenterY(-1000);
                            red_switch4.setCenterY(-1000);
                            green_switch4.setCenterY(-1000);
                            pink_switch4.setCenterY(-1000);

                        }

                        //collison end


                        //collision with star

                        Shape intersecti13 = Shape.intersect(ball_circle, star_circle);

                        if (intersecti13.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star1) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star1 = true;
                            }

                            star_circle.setCenterY(-10000);
                        }

                        Shape intersecti131 = Shape.intersect(ball_circle, star_circle2);

                        if (intersecti131.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star2) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star2 = true;
                            }

                            star_circle2.setCenterY(-10000);
                        }

                        Shape intersecti132 = Shape.intersect(ball_circle, star_circle3);

                        if (intersecti132.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star3) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star3 = true;
                            }

                            star_circle3.setCenterY(-10000);
                        }

                        Shape intersecti134 = Shape.intersect(ball_circle, star_circle4);

                        if (intersecti134.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star4) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star4 = true;
                            }

                            star_circle4.setCenterY(-10000);
                        }
                        //end

                    }


                    //Pink color ball

                    if (c.equals(pink_color)) {
//                    //for circle

                        Shape intersect1 = Shape.intersect(ball_circle, arc1);
                        Shape intersect11 = Shape.intersect(ball_circle, circle_black);
                        if (intersect1.getBoundsInLocal().getWidth() != -1 && intersect11.getBoundsInLocal().getWidth() == -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect2 = Shape.intersect(ball_circle, arc3);
                        Shape intersect21 = Shape.intersect(ball_circle, circle_black);
                        if (intersect2.getBoundsInLocal().getWidth() != -1 && intersect21.getBoundsInLocal().getWidth() == -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect3 = Shape.intersect(ball_circle, arc4);
                        Shape intersect31 = Shape.intersect(ball_circle, circle_black);
                        if (intersect3.getBoundsInLocal().getWidth() != -1 && intersect31.getBoundsInLocal().getWidth() == -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        //for vertical line

                        Shape intersect4 = Shape.intersect(ball_circle, blue_rect);
                        if (intersect4.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect5 = Shape.intersect(ball_circle, red_rect);
                        if (intersect5.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect6 = Shape.intersect(ball_circle, green_rect);
                        if (intersect6.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }


                        //horizontal line

                        Shape intersect7 = Shape.intersect(ball_circle, redhor_rect);
                        if (intersect7.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect8 = Shape.intersect(ball_circle, bluehor_rect);
                        if (intersect8.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect9 = Shape.intersect(ball_circle, greenhor_rect);
                        if (intersect9.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }


                        Shape intersect10 = Shape.intersect(ball_circle, left_greensquare);
                        if (intersect10.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect111 = Shape.intersect(ball_circle, left_bluesquare);
                        if (intersect111.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect121 = Shape.intersect(ball_circle, left_redsquare );
                        if (intersect121.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect131 = Shape.intersect(ball_circle, right_greensquare );
                        if (intersect131.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect141 = Shape.intersect(ball_circle, right_bluesquare);
                        if (intersect111.getBoundsInLocal().getWidth() != -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect151 = Shape.intersect(ball_circle, right_redsquare );
                        if (intersect121.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        //collison with color change


                        Shape intersecti1 = Shape.intersect(ball_circle, red_switch);
                        Shape intersecti2 = Shape.intersect(ball_circle, blue_switch);
                        Shape intersecti3 = Shape.intersect(ball_circle, green_switch);
                        Shape intersecti4 = Shape.intersect(ball_circle, red_switch);

                        if (intersecti1.getBoundsInLocal().getWidth() != -1 || intersecti2.getBoundsInLocal().getWidth() != -1
                                || intersecti3.getBoundsInLocal().getWidth() != -1 || intersecti4.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(green_color);

                            blue_switch.setCenterY(-1000);
                            red_switch.setCenterY(-1000);
                            green_switch.setCenterY(-1000);
                            pink_switch.setCenterY(-1000);
                        }

                        Shape intersecti11 = Shape.intersect(ball_circle, red_switch2);
                        Shape intersecti21 = Shape.intersect(ball_circle, blue_switch2);
                        Shape intersecti31 = Shape.intersect(ball_circle, green_switch2);
                        Shape intersecti41 = Shape.intersect(ball_circle, red_switch2);

                        if (intersecti11.getBoundsInLocal().getWidth() != -1 || intersecti21.getBoundsInLocal().getWidth() != -1
                                || intersecti31.getBoundsInLocal().getWidth() != -1 || intersecti41.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(green_color);

                            blue_switch2.setCenterY(-1000);
                            red_switch2.setCenterY(-1000);
                            green_switch2.setCenterY(-1000);
                            pink_switch2.setCenterY(-1000);

                        }

                        Shape intersecti112 = Shape.intersect(ball_circle, red_switch3);
                        Shape intersecti212 = Shape.intersect(ball_circle, blue_switch3);
                        Shape intersecti312 = Shape.intersect(ball_circle, green_switch3);
                        Shape intersecti412 = Shape.intersect(ball_circle, red_switch3);

                        if (intersecti112.getBoundsInLocal().getWidth() != -1 || intersecti212.getBoundsInLocal().getWidth() != -1
                                || intersecti312.getBoundsInLocal().getWidth() != -1 || intersecti412.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(green_color);

                            blue_switch3.setCenterY(-1000);
                            red_switch3.setCenterY(-1000);
                            green_switch3.setCenterY(-1000);
                            pink_switch3.setCenterY(-1000);

                        }

                        Shape intersecti12 = Shape.intersect(ball_circle, red_switch4);
                        Shape intersecti22 = Shape.intersect(ball_circle, blue_switch4);
                        Shape intersecti32 = Shape.intersect(ball_circle, green_switch4);
                        Shape intersecti42 = Shape.intersect(ball_circle, red_switch4);

                        if (intersecti12.getBoundsInLocal().getWidth() != -1 || intersecti22.getBoundsInLocal().getWidth() != -1
                                || intersecti32.getBoundsInLocal().getWidth() != -1 || intersecti42.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch4.setCenterY(-1000);
                            red_switch4.setCenterY(-1000);
                            green_switch4.setCenterY(-1000);
                            pink_switch4.setCenterY(-1000);

                        }

                        //collison end


                        //collision with star

                        Shape intersecti13 = Shape.intersect(ball_circle, star_circle);

                        if (intersecti13.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star1) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star1 = true;
                            }

                            star_circle.setCenterY(-10000);
                        }

                        Shape intersecti131 = Shape.intersect(ball_circle, star_circle2);

                        if (intersecti131.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star2) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star2 = true;
                            }

                            star_circle2.setCenterY(-10000);
                        }

                        Shape intersecti132 = Shape.intersect(ball_circle, star_circle3);

                        if (intersecti132.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star3) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star3 = true;
                            }

                            star_circle3.setCenterY(-10000);
                        }

                        Shape intersecti134 = Shape.intersect(ball_circle, star_circle4);

                        if (intersecti134.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star4) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star4 = true;
                            }

                            star_circle4.setCenterY(-10000);
                        }

                        //end

                    }

                    //Green color ball

                    if (c.equals(green_color)) {
//                    sout(1);

//                    //for circle
                        Shape intersect1 = Shape.intersect(ball_circle, arc1);
                        Shape intersect11 = Shape.intersect(ball_circle, circle_black);
                        if (intersect1.getBoundsInLocal().getWidth() != -1 && intersect11.getBoundsInLocal().getWidth() == -1 && !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect2 = Shape.intersect(ball_circle, arc2);
                        Shape intersect21 = Shape.intersect(ball_circle, circle_black);
                        if (intersect2.getBoundsInLocal().getWidth() != -1 && intersect21.getBoundsInLocal().getWidth() == -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect3 = Shape.intersect(ball_circle, arc4);
                        Shape intersect31 = Shape.intersect(ball_circle, circle_black);
                        if (intersect3.getBoundsInLocal().getWidth() != -1 && intersect31.getBoundsInLocal().getWidth() == -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        //for vertical line

                        Shape intersect4 = Shape.intersect(ball_circle, blue_rect);
                        if (intersect4.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect5 = Shape.intersect(ball_circle, red_rect);
                        if (intersect5.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect6 = Shape.intersect(ball_circle, blue_rect);
                        if (intersect6.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }


                        //horizontal line

                        Shape intersect7 = Shape.intersect(ball_circle, redhor_rect);
                        if (intersect7.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect8 = Shape.intersect(ball_circle, bluehor_rect);
                        if (intersect8.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect9 = Shape.intersect(ball_circle, bluehor_rect);
                        if (intersect9.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect10 = Shape.intersect(ball_circle, left_bluesquare);
                        if (intersect10.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect111 = Shape.intersect(ball_circle, left_pinksquare);
                        if (intersect111.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect121 = Shape.intersect(ball_circle, left_redsquare);
                        if (intersect121.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect131 = Shape.intersect(ball_circle, right_bluesquare);
                        if (intersect131.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect141 = Shape.intersect(ball_circle, right_pinksquare);
                        if (intersect111.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }

                        Shape intersect151 = Shape.intersect(ball_circle, right_redsquare);
                        if (intersect121.getBoundsInLocal().getWidth() != -1&& !is_break) {
                            exit();
                            is_break=true;
                        }


                        //collison with color change


                        Shape intersecti1 = Shape.intersect(ball_circle, red_switch);
                        Shape intersecti2 = Shape.intersect(ball_circle, blue_switch);
                        Shape intersecti3 = Shape.intersect(ball_circle, green_switch);
                        Shape intersecti4 = Shape.intersect(ball_circle, red_switch);

                        if (intersecti1.getBoundsInLocal().getWidth() != -1 || intersecti2.getBoundsInLocal().getWidth() != -1
                                || intersecti3.getBoundsInLocal().getWidth() != -1 || intersecti4.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch.setCenterY(-1000);
                            red_switch.setCenterY(-1000);
                            green_switch.setCenterY(-1000);
                            pink_switch.setCenterY(-1000);

                        }

                        Shape intersecti11 = Shape.intersect(ball_circle, red_switch2);
                        Shape intersecti21 = Shape.intersect(ball_circle, blue_switch2);
                        Shape intersecti31 = Shape.intersect(ball_circle, green_switch2);
                        Shape intersecti41 = Shape.intersect(ball_circle, red_switch2);

                        if (intersecti11.getBoundsInLocal().getWidth() != -1 || intersecti21.getBoundsInLocal().getWidth() != -1
                                || intersecti31.getBoundsInLocal().getWidth() != -1 || intersecti41.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch2.setCenterY(-1000);
                            red_switch2.setCenterY(-1000);
                            green_switch2.setCenterY(-1000);
                            pink_switch2.setCenterY(-1000);

                        }

                        Shape intersecti112 = Shape.intersect(ball_circle, red_switch3);
                        Shape intersecti212 = Shape.intersect(ball_circle, blue_switch3);
                        Shape intersecti312 = Shape.intersect(ball_circle, green_switch3);
                        Shape intersecti412 = Shape.intersect(ball_circle, red_switch3);

                        if (intersecti112.getBoundsInLocal().getWidth() != -1 || intersecti212.getBoundsInLocal().getWidth() != -1
                                || intersecti312.getBoundsInLocal().getWidth() != -1 || intersecti412.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);

                            blue_switch3.setCenterY(-1000);
                            red_switch3.setCenterY(-1000);
                            green_switch3.setCenterY(-1000);
                            pink_switch3.setCenterY(-1000);

                        }

                        Shape intersecti12 = Shape.intersect(ball_circle, red_switch4);
                        Shape intersecti22 = Shape.intersect(ball_circle, blue_switch4);
                        Shape intersecti32 = Shape.intersect(ball_circle, green_switch4);
                        Shape intersecti42 = Shape.intersect(ball_circle, red_switch4);

                        if (intersecti12.getBoundsInLocal().getWidth() != -1 || intersecti22.getBoundsInLocal().getWidth() != -1
                                || intersecti32.getBoundsInLocal().getWidth() != -1 || intersecti42.getBoundsInLocal().getWidth() != -1) {

                            Random rand = new Random();
                            int number = (int) (Math.random() * 3);
                            if (number == 0) {
                                ball_circle.setFill(blue_color);
                            } else if (number == 1) {
                                ball_circle.setFill(red_color);
                            } else if (number == 2)
                                ball_circle.setFill(pink_color);


                            blue_switch4.setCenterY(-1000);
                            red_switch4.setCenterY(-1000);
                            green_switch4.setCenterY(-1000);
                            pink_switch4.setCenterY(-1000);

                        }

                        //collison end

                        //collision with star

                        Shape intersecti13 = Shape.intersect(ball_circle, star_circle);

                        if (intersecti13.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star1) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star1 = true;
                            }

                            star_circle.setCenterY(-10000);
                        }

                        Shape intersecti131 = Shape.intersect(ball_circle, star_circle2);

                        if (intersecti131.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star2) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star2 = true;
                            }

                            star_circle2.setCenterY(-10000);
                        }

                        Shape intersecti132 = Shape.intersect(ball_circle, star_circle3);

                        if (intersecti132.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star3) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star3 = true;
                            }

                            star_circle3.setCenterY(-10000);
                        }

                        Shape intersecti134 = Shape.intersect(ball_circle, star_circle4);

                        if (intersecti134.getBoundsInLocal().getWidth() != -1) {
                            if (!collide_star4) {
                                int score = Integer.parseInt(score_text.getText());
                                score++;
                                score_text.setText(String.valueOf(score));
                                collide_star4 = true;
                            }

                            star_circle4.setCenterY(-10000);
                        }

                        //end

                    }

                    //end




                    //collision end

                    if (obstacles.get(obstacles.size() - 1) == 1) {
                        if (!circle_check && circle_black.getCenterY() > 150) {
                            int rand_obstacle = (int) ((Math.random() * 4) + 1);


                            if (obstacles.size() == 1) {

                                while (rand_obstacle == obstacles.get(obstacles.size() - 1)) {
                                    rand_obstacle = (int) ((Math.random() * 4) + 1);
                                }
                            } else {
//                            sout("Vertical Previous Obstacle "+obstacles.get(obstacles.size() - 2) +"   "+ obstacles.get(obstacles.size() - 1));
                                while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == obstacles.get(obstacles.size() - 2)) {
                                    rand_obstacle = (int) ((Math.random() * 4) + 1);
                                }
                            }

                            if (rand_obstacle == 1) {

                                if (obstacles.size() == 2) {
                                    int prev_obstacle = obstacles.get(1);

                                    if (prev_obstacle == 2) {
                                        rand_obstacle = 3;
                                    }
                                    if (prev_obstacle == 3) {
                                        rand_obstacle = 4;
                                    }
                                    if (prev_obstacle == 4) {
                                        rand_obstacle = 2;
                                    }
                                } else {
                                    int prev_obstacle = obstacles.get(obstacles.size() - 2);

                                    if (prev_obstacle == 2) {
                                        rand_obstacle = 3;
                                    }
                                    if (prev_obstacle == 3) {
                                        rand_obstacle = 4;
                                    }
                                    if (prev_obstacle == 4) {
                                        rand_obstacle = 2;
                                    }
                                }


                            }
//                            sout("Current obstacles ");
                            for (int i = 0; i < obstacles.size(); i++) {
                                System.out.print(obstacles.get(i) + " ");
                            }
//                            sout();

//                            sout("Circle " + rand_obstacle);


                            if (rand_obstacle == 1) {


                                star_circle.setCenterY(-1000);

                                blue_switch.setCenterY(-100);
                                red_switch.setCenterY(-100);
                                pink_switch.setCenterY(-100);
                                green_switch.setCenterY(-100);

                                circle_black.setCenterY(-350);
                                arc1.setCenterY(-350);
                                arc2.setCenterY(-350);
                                arc3.setCenterY(-350);
                                arc4.setCenterY(-350);


                                bluehor_rect.setY(400);
                                pinkhor_rect.setY(-560);
                                greenhor_rect.setY(400);
                                redhor_rect.setY(-560);
                                collide_star3 = false;
//                                sout("here me 1");
//                                sout("horizontal  " + blue_rect.getY());
                                obstacles.add(2);
                            }
                            if (rand_obstacle == 2) {
                                collide_star2 = false;
                                obstacles.add(rand_obstacle);
                                star_circle2.setCenterY(-1000);
                                blue_switch2.setCenterY(-100);
                                red_switch2.setCenterY(-100);
                                pink_switch2.setCenterY(-100);
                                green_switch2.setCenterY(-100);


                                blue_rect.setY(-170);
                                pink_rect.setY(-170);
                                green_rect.setY(-170);
                                red_rect.setY(-170);

                            }
                            if (rand_obstacle == 3) {
                                collide_star3 = false;
                                obstacles.add(rand_obstacle);

//                            bluehor_rect.setY(0);
//                            pinkhor_rect.setY(-160);
//                            greenhor_rect.setY(0);
//                            redhor_rect.setY(-160);
                                bluehor_rect.setY(400);
                                pinkhor_rect.setY(-560);
                                greenhor_rect.setY(400);
                                redhor_rect.setY(-560);
                            }
                            if (rand_obstacle == 4) {
                                collide_star4 = false;
                                obstacles.add(rand_obstacle);

                                star_circle4.setCenterY(-1000);

                                blue_switch4.setCenterY(-100);
                                red_switch4.setCenterY(-100);
                                pink_switch4.setCenterY(-100);
                                green_switch4.setCenterY(-100);


                                left_bluesquare.setY(-574.0);
                                left_redsquare.setY(-278.0);
                                left_greensquare.setY(-426.0);
                                left_pinksquare.setY(-130.0);

                                right_pinksquare.setY(-130.0);
                                right_redsquare.setY(-278.0);
                                right_greensquare.setY(-426.0);
                                right_bluesquare.setY(-574.0);
                            }

                            circle_check = true;
                            horizontal_check = false;
                            vertical_check = false;
                            parallel_obstacle_check = false;
                        }
                    }
                    if (obstacles.get(obstacles.size() - 1) == 2) {

//                    sout("fdwuygifgeiga");
                        if (!vertical_check && blue_rect.getY() > 950) {
                            int rand_obstacle = (int) ((Math.random() * 4) + 1);
//                        sout("Horizontal Previous Obstacle "+obstacles.get(obstacles.size() - 2) +"   "+ obstacles.get(obstacles.size() - 1));
                            if (obstacles.size() == 1) {
                                while (rand_obstacle == obstacles.get(obstacles.size() - 1)) {
                                    rand_obstacle = (int) ((Math.random() * 4) + 1);
                                }
                            } else {
                                while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == obstacles.get(obstacles.size() - 2)) {
                                    rand_obstacle = (int) ((Math.random() * 4) + 1);
                                }
                            }


                            if (rand_obstacle == 2) {
                                if (obstacles.size() == 2) {
                                    int prev_obstacle = obstacles.get(1);

                                    if (prev_obstacle == 1) {
                                        rand_obstacle = 3;
                                    }
                                    if (prev_obstacle == 3) {
                                        rand_obstacle = 4;
                                    }
                                    if (prev_obstacle == 4) {
                                        rand_obstacle = 1;
                                    }
                                } else {
                                    int prev_obstacle = obstacles.get(obstacles.size() - 2);

                                    if (prev_obstacle == 3) {
                                        rand_obstacle = 4;
                                    }
                                    if (prev_obstacle == 4) {
                                        rand_obstacle = 3;
                                    }
                                    if (prev_obstacle == 1) {
                                        rand_obstacle = 3;
                                    }
                                }
                            }


//                            sout("Current obstacles ");
                            for (int i = 0; i < obstacles.size(); i++) {
                                System.out.print(obstacles.get(i) + " ");
                            }
//                            sout();

//                            sout("vertical " + rand_obstacle);


                            if (rand_obstacle == 1) {
                                collide_star1 = false;
                                obstacles.add(rand_obstacle);

                                star_circle.setCenterY(-1000);

                                blue_switch.setCenterY(-100);
                                red_switch.setCenterY(-100);
                                pink_switch.setCenterY(-100);
                                green_switch.setCenterY(-100);

                                circle_black.setCenterY(-350);
                                arc1.setCenterY(-350);
                                arc2.setCenterY(-350);
                                arc3.setCenterY(-350);
                                arc4.setCenterY(-350);

                            }
                            if (rand_obstacle == 2) {

                                star_circle2.setCenterY(-1000);

                                blue_switch2.setCenterY(-100);
                                red_switch2.setCenterY(-100);
                                pink_switch2.setCenterY(-100);
                                green_switch2.setCenterY(-100);

                                blue_rect.setY(-170);
                                pink_rect.setY(-170);
                                green_rect.setY(-170);
                                red_rect.setY(-170);

                                collide_star3 = false;

                                bluehor_rect.setY(400);
                                pinkhor_rect.setY(-560);
                                greenhor_rect.setY(400);
                                redhor_rect.setY(-560);
//                                sout("here me 2");
//                                sout("horizontal  " + bluehor_rect.getY());

                                obstacles.add(3);
                            }
                            if (rand_obstacle == 3) {
                                collide_star3 = false;


//                            bluehor_rect.setY(0);
//                            pinkhor_rect.setY(-160);
//                            greenhor_rect.setY(0);
//                            redhor_rect.setY(-160);
                                bluehor_rect.setY(400);
                                pinkhor_rect.setY(-560);
                                greenhor_rect.setY(400);
                                redhor_rect.setY(-560);
                                obstacles.add(rand_obstacle);
                            }
                            if (rand_obstacle == 4) {
                                collide_star4 = false;

                                star_circle4.setCenterY(-1000);

                                blue_switch4.setCenterY(-100);
                                red_switch4.setCenterY(-100);
                                pink_switch4.setCenterY(-100);
                                green_switch4.setCenterY(-100);


                                left_bluesquare.setY(-574.0);
                                left_redsquare.setY(-278.0);
                                left_greensquare.setY(-426.0);
                                left_pinksquare.setY(-130.0);

                                right_pinksquare.setY(-130.0);
                                right_redsquare.setY(-278.0);
                                right_greensquare.setY(-426.0);
                                right_bluesquare.setY(-574.0);
                                obstacles.add(rand_obstacle);
                            }

                            circle_check = false;
                            horizontal_check = false;
                            vertical_check = true;
                            parallel_obstacle_check = false;

                        }
                    }

                    if (obstacles.get(obstacles.size() - 1) == 3) {

                        if (!horizontal_check && bluehor_rect.getY() > 300) {

                            int rand_obstacle = (int) ((Math.random() * 4) + 1);

//                        sout("Horizontal Previous Obstacle "+obstacles.get(obstacles.size() - 2) +"   "+ obstacles.get(obstacles.size() - 1));
                            if (obstacles.size() == 1) {
                                while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == 1) {
                                    rand_obstacle = (int) ((Math.random() * 4) + 1);
                                }
                            } else {
                                while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == obstacles.get(obstacles.size() - 2) && rand_obstacle == 1) {
                                    rand_obstacle = (int) ((Math.random() * 4) + 1);
                                }
                            }

                            if (rand_obstacle == 3) {
                                if (obstacles.size() == 2) {
                                    int prev_obstacle = obstacles.get(1);

                                    if (prev_obstacle == 2) {
                                        rand_obstacle = 4;
                                    }
                                    if (prev_obstacle == 4) {
                                        rand_obstacle = 4;
                                    }
                                    if (prev_obstacle == 1) {
                                        rand_obstacle = 2;
                                    }
                                } else {
                                    int prev_obstacle = obstacles.get(obstacles.size() - 2);

                                    if (prev_obstacle == 2) {
                                        rand_obstacle = 4;
                                    }
                                    if (prev_obstacle == 4) {
                                        rand_obstacle = 4;
                                    }
                                    if (prev_obstacle == 1) {
                                        rand_obstacle = 2;
                                    }
                                }
                            }

//                            sout("Current obstacles ");
                            for (int i = 0; i < obstacles.size(); i++) {
                                System.out.print(obstacles.get(i) + " ");
                            }
//                            sout();

//                            sout("horizontal " + rand_obstacle);


                            if (rand_obstacle == 1) {
                                collide_star1 = false;
                                obstacles.add(rand_obstacle);

                                star_circle.setCenterY(-1000);

                                blue_switch.setCenterY(-100);
                                red_switch.setCenterY(-100);
                                pink_switch.setCenterY(-100);
                                green_switch.setCenterY(-100);

                                circle_black.setCenterY(-350);
                                arc1.setCenterY(-350);
                                arc2.setCenterY(-350);
                                arc3.setCenterY(-350);
                                arc4.setCenterY(-350);

                            }
                            if (rand_obstacle == 2) {
                                collide_star2 = false;
                                obstacles.add(rand_obstacle);
                                star_circle2.setCenterY(-1000);

                                blue_switch2.setCenterY(-100);
                                red_switch2.setCenterY(-100);
                                pink_switch2.setCenterY(-100);
                                green_switch2.setCenterY(-100);

                                blue_rect.setY(-170);
                                pink_rect.setY(-170);
                                green_rect.setY(-170);
                                red_rect.setY(-170);
                            }
                            if (rand_obstacle == 3) {
                                collide_star1 = false;

                                circle_black.setCenterY(-350);
                                arc1.setCenterY(-350);
                                arc2.setCenterY(-350);
                                arc3.setCenterY(-350);
                                arc4.setCenterY(-350);

                                obstacles.add(1);

//                                sout("here me 3");
//                                sout("Circle  " + circle_black.getCenterY());

//                            bluehor_rect.setY(0);
//                            pinkhor_rect.setY(-160);
//                            greenhor_rect.setY(0);
//                            redhor_rect.setY(-160);
                                bluehor_rect.setY(400);
                                pinkhor_rect.setY(-560);
                                greenhor_rect.setY(400);
                                redhor_rect.setY(-560);
                            }
                            if (rand_obstacle == 4) {
                                collide_star4 = false;
                                obstacles.add(rand_obstacle);

                                star_circle4.setCenterY(-1000);

                                blue_switch4.setCenterY(-100);
                                red_switch4.setCenterY(-100);
                                pink_switch4.setCenterY(-100);
                                green_switch4.setCenterY(-100);


                                left_bluesquare.setY(-574.0);
                                left_redsquare.setY(-278.0);
                                left_greensquare.setY(-426.0);
                                left_pinksquare.setY(-130.0);

                                right_pinksquare.setY(-130.0);
                                right_redsquare.setY(-278.0);
                                right_greensquare.setY(-426.0);
                                right_bluesquare.setY(-574.0);
                            }


                            circle_check = false;
                            horizontal_check = true;
                            vertical_check = false;
                            parallel_obstacle_check = false;
                        }
                    }


                    if (obstacles.get(obstacles.size() - 1) == 4) {

                        if (!parallel_obstacle_check && left_bluesquare.getY() > 670) {

                            int rand_obstacle = (int) ((Math.random() * 4) + 1);

//                        sout("Parallel Previous Obstacle "+obstacles.get(obstacles.size() - 2) +"   "+ obstacles.get(obstacles.size() - 1));
                            if (obstacles.size() == 1) {
                                while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == 1) {
                                    rand_obstacle = (int) ((Math.random() * 4) + 1);
                                }
                            } else {
                                while (rand_obstacle == 1 && rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == obstacles.get(obstacles.size() - 2)) {
                                    rand_obstacle = (int) ((Math.random() * 4) + 1);
                                }
                            }

                            if (rand_obstacle == 4) {
                                if (obstacles.size() == 2) {
                                    int prev_obstacle = obstacles.get(1);

                                    if (prev_obstacle == 1) {
                                        rand_obstacle = 2;
                                    }
                                    if (prev_obstacle == 2) {
                                        rand_obstacle = 3;
                                    }
                                    if (prev_obstacle == 3) {
                                        rand_obstacle = 3;
                                    }
                                } else {
                                    int prev_obstacle = obstacles.get(obstacles.size() - 2);

                                    if (prev_obstacle == 1) {
                                        rand_obstacle = 2;
                                    }
                                    if (prev_obstacle == 2) {
                                        rand_obstacle = 3;
                                    }
                                    if (prev_obstacle == 3) {
                                        rand_obstacle = 3;
                                    }
                                }
                            }

//                            sout("Current obstacles ");
                            for (int i = 0; i < obstacles.size(); i++) {
                                System.out.print(obstacles.get(i) + " ");
                            }
//                            sout();

//                            sout("parallel " + rand_obstacle);


                            if (rand_obstacle == 1) {
                                collide_star1 = false;
                                obstacles.add(rand_obstacle);

                                star_circle.setCenterY(-1000);

                                blue_switch.setCenterY(-100);
                                red_switch.setCenterY(-100);
                                pink_switch.setCenterY(-100);
                                green_switch.setCenterY(-100);

                                circle_black.setCenterY(-350);
                                arc1.setCenterY(-350);
                                arc2.setCenterY(-350);
                                arc3.setCenterY(-350);
                                arc4.setCenterY(-350);

                            }
                            if (rand_obstacle == 2) {
                                collide_star2 = false;
                                obstacles.add(rand_obstacle);

                                star_circle2.setCenterY(-1000);

                                blue_switch2.setCenterY(-100);
                                red_switch2.setCenterY(-100);
                                pink_switch2.setCenterY(-100);
                                green_switch2.setCenterY(-100);

                                blue_rect.setY(-170);
                                pink_rect.setY(-170);
                                green_rect.setY(-170);
                                red_rect.setY(-170);
                            }
                            if (rand_obstacle == 3) {
                                collide_star3 = false;


                                obstacles.add(rand_obstacle);

//                            bluehor_rect.setY(0);
//                            pinkhor_rect.setY(-160);
//                            greenhor_rect.setY(0);
//                            redhor_rect.setY(-160z);
                                bluehor_rect.setY(400);
                                pinkhor_rect.setY(-560);
                                greenhor_rect.setY(400);
                                redhor_rect.setY(-560);
                            }
                            if (rand_obstacle == 4) {
                                collide_star3 = false;

//                                sout("here me 4");
                                bluehor_rect.setY(400);
                                pinkhor_rect.setY(-560);
                                greenhor_rect.setY(400);
                                redhor_rect.setY(-560);

                                obstacles.add(3);

//                                sout("here me 4");
//                                sout("horizontal  " + bluehor_rect.getY());


                                star_circle4.setCenterY(-1000);

                                blue_switch4.setCenterY(-100);
                                red_switch4.setCenterY(-100);
                                pink_switch4.setCenterY(-100);
                                green_switch4.setCenterY(-100);


                                left_bluesquare.setY(-574.0);
                                left_redsquare.setY(-278.0);
                                left_greensquare.setY(-426.0);
                                left_pinksquare.setY(-130.0);

                                right_pinksquare.setY(-130.0);
                                right_redsquare.setY(-278.0);
                                right_greensquare.setY(-426.0);
                                right_bluesquare.setY(-574.0);
                            }

                            circle_check = false;
                            horizontal_check = false;
                            vertical_check = false;
                            parallel_obstacle_check = true;
                        }
                    }

                    AtomicInteger atomicInteger = new AtomicInteger(1);

                    buttonnew.setOnKeyPressed(e -> {

                        Timeline animation5 = null;
                        Timeline animation6 = null;
                        Timeline animation7 = null;
                        Timeline animation8 = null;
                        Timeline animation9 = null;
                        Timeline animation10 = null;
                        Timeline animationi7 = null;
                        Timeline animationi8 = null;
                        Timeline animationi9 = null;
                        Timeline animationi10 = null;

                        switch (e.getCode()) {
                            case UP:
                                atomicInteger.set(2);
                                animation5 = new Timeline(
                                        new KeyFrame(Duration.ZERO, new KeyValue(ball_circle.centerYProperty(), ball_circle.getCenterY(), Interpolator.LINEAR)),
                                        new KeyFrame(Duration.seconds(150), new KeyValue(ball_circle.centerYProperty(), ball_circle.getCenterY() - 500000, Interpolator.LINEAR))
                                );
                                animation5.setCycleCount(1);
                                animation5.play();

                                for (int i = 0; i < obstacles.size(); i++) {
                                    int obstacle_number = obstacles.get(i);

                                    if (obstacle_number == 1) {
                                        Timeline animation_star = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(star_circle.centerYProperty(), star_circle.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(star_circle.centerYProperty(), star_circle.getCenterY() + 100, Interpolator.LINEAR))
                                        );
                                        animation_star.setCycleCount(1);
                                        animation_star.play();

                                        animationi7 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(blue_switch.centerYProperty(), blue_switch.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(blue_switch.centerYProperty(), blue_switch.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animationi8 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(red_switch.centerYProperty(), red_switch.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(red_switch.centerYProperty(), red_switch.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animationi9 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(green_switch.centerYProperty(), green_switch.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(green_switch.centerYProperty(), green_switch.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animationi10 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(pink_switch.centerYProperty(), pink_switch.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(pink_switch.centerYProperty(), pink_switch.getCenterY() + 100, Interpolator.LINEAR))
                                        );
                                        animationi7.setCycleCount(1);
                                        animationi7.play();
                                        animationi8.setCycleCount(1);
                                        animationi8.play();
                                        animationi9.setCycleCount(1);
                                        animationi9.play();
                                        animationi10.setCycleCount(1);
                                        animationi10.play();

                                        animation6 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(circle_black.centerYProperty(), circle_black.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(circle_black.centerYProperty(), circle_black.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation7 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(arc1.centerYProperty(), arc1.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(arc1.centerYProperty(), arc1.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation8 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(arc2.centerYProperty(), arc2.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(arc2.centerYProperty(), arc2.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation9 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(arc3.centerYProperty(), arc3.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(arc3.centerYProperty(), arc3.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation10 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(arc4.centerYProperty(), arc4.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(arc4.centerYProperty(), arc4.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation6.setCycleCount(1);
                                        animation6.play();
                                        animation7.setCycleCount(1);
                                        animation7.play();
                                        animation8.setCycleCount(1);
                                        animation8.play();
                                        animation9.setCycleCount(1);
                                        animation9.play();
                                        animation10.setCycleCount(1);
                                        animation10.play();


                                    }
                                    if (obstacle_number == 2) {
                                        Timeline animation_star = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(star_circle2.centerYProperty(), star_circle2.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(star_circle2.centerYProperty(), star_circle2.getCenterY() + 100, Interpolator.LINEAR))
                                        );
                                        animation_star.setCycleCount(1);
                                        animation_star.play();

                                        animation7 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(blue_switch2.centerYProperty(), blue_switch2.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(blue_switch2.centerYProperty(), blue_switch2.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation8 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(red_switch2.centerYProperty(), red_switch2.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(red_switch2.centerYProperty(), red_switch2.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation9 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(green_switch2.centerYProperty(), green_switch2.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(green_switch2.centerYProperty(), green_switch2.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation10 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(pink_switch2.centerYProperty(), pink_switch2.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(pink_switch2.centerYProperty(), pink_switch2.getCenterY() + 100, Interpolator.LINEAR))
                                        );
                                        animation7.setCycleCount(1);
                                        animation7.play();
                                        animation8.setCycleCount(1);
                                        animation8.play();
                                        animation9.setCycleCount(1);
                                        animation9.play();
                                        animation10.setCycleCount(1);
                                        animation10.play();

                                        Timeline animation11 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(pink_rect.yProperty(), pink_rect.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(2), new KeyValue(pink_rect.yProperty(), pink_rect.getY() + 200, Interpolator.LINEAR))
                                        );

                                        animation11.setCycleCount(Timeline.INDEFINITE);
                                        animation11.play();

                                        Timeline animation12 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(green_rect.yProperty(), green_rect.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(2), new KeyValue(green_rect.yProperty(), green_rect.getY() + 200, Interpolator.LINEAR))
                                        );

                                        animation12.setCycleCount(Timeline.INDEFINITE);
                                        animation12.play();

                                        Timeline animation13 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(red_rect.yProperty(), red_rect.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(2), new KeyValue(red_rect.yProperty(), red_rect.getY() + 200, Interpolator.LINEAR))
                                        );

                                        animation13.setCycleCount(Timeline.INDEFINITE);
                                        animation13.play();

                                        Timeline animation14 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(blue_rect.yProperty(), blue_rect.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(2), new KeyValue(blue_rect.yProperty(), blue_rect.getY() + 200, Interpolator.LINEAR))
                                        );

                                        animation14.setCycleCount(Timeline.INDEFINITE);
                                        animation14.play();

                                    }
                                    if (obstacle_number == 3) {

                                        Timeline animation121 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(redhor_rect.yProperty(), redhor_rect.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(redhor_rect.yProperty(), redhor_rect.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation121.play();
                                        Timeline animation131 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(bluehor_rect.yProperty(), bluehor_rect.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(bluehor_rect.yProperty(), bluehor_rect.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation131.play();
                                        Timeline animation141 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(greenhor_rect.yProperty(), greenhor_rect.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(greenhor_rect.yProperty(), greenhor_rect.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation141.play();
                                        Timeline animation151 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(pinkhor_rect.yProperty(), pinkhor_rect.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(pinkhor_rect.yProperty(), pinkhor_rect.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation151.play();

                                    }
                                    if (obstacle_number == 4) {
                                        Timeline animation_star = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(star_circle4.centerYProperty(), star_circle4.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(star_circle4.centerYProperty(), star_circle4.getCenterY() + 100, Interpolator.LINEAR))
                                        );
                                        animation_star.setCycleCount(1);
                                        animation_star.play();

                                        animation7 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(blue_switch4.centerYProperty(), blue_switch4.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(blue_switch4.centerYProperty(), blue_switch4.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation8 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(red_switch4.centerYProperty(), red_switch4.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(red_switch4.centerYProperty(), red_switch4.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation9 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(green_switch4.centerYProperty(), green_switch4.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(green_switch4.centerYProperty(), green_switch4.getCenterY() + 100, Interpolator.LINEAR))
                                        );

                                        animation10 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(pink_switch4.centerYProperty(), pink_switch4.getCenterY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(pink_switch4.centerYProperty(), pink_switch4.getCenterY() + 100, Interpolator.LINEAR))
                                        );
                                        animation7.setCycleCount(1);
                                        animation7.play();
                                        animation8.setCycleCount(1);
                                        animation8.play();
                                        animation9.setCycleCount(1);
                                        animation9.play();
                                        animation10.setCycleCount(1);
                                        animation10.play();


                                        Timeline animation121 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(left_redsquare.yProperty(), left_redsquare.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(left_redsquare.yProperty(), left_redsquare.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation121.play();
                                        Timeline animation131 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(left_bluesquare.yProperty(), left_bluesquare.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(left_bluesquare.yProperty(), left_bluesquare.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation131.play();
                                        Timeline animation141 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(left_greensquare.yProperty(), left_greensquare.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(left_greensquare.yProperty(), left_greensquare.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation141.play();
                                        Timeline animation151 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(left_pinksquare.yProperty(), left_pinksquare.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(left_pinksquare.yProperty(), left_pinksquare.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation151.play();


                                        Timeline animation1211 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(right_redsquare.yProperty(), right_redsquare.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(right_redsquare.yProperty(), right_redsquare.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation1211.play();
                                        Timeline animation1311 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(right_bluesquare.yProperty(), right_bluesquare.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(right_bluesquare.yProperty(), right_bluesquare.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation1311.play();
                                        Timeline animation1411 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(right_greensquare.yProperty(), right_greensquare.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(right_greensquare.yProperty(), right_greensquare.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation1411.play();
                                        Timeline animation1511 = new Timeline(
                                                new KeyFrame(Duration.ZERO, new KeyValue(right_pinksquare.yProperty(), right_pinksquare.getY(), Interpolator.LINEAR)),
                                                new KeyFrame(Duration.seconds(1), new KeyValue(right_pinksquare.yProperty(), right_pinksquare.getY() + 100, Interpolator.LINEAR))
                                        );

                                        animation1511.play();
                                    }
                                }

//                            sout("Current obstacles ");
//                            for (int i = 0; i < obstacles.size(); i++) {
//                                System.out.print(obstacles.get(i)+" ");
//                            }
//
//                            sout();
//                            ArrayList<Integer> tobe_removed=new ArrayList<>();
//
//                            for (int i = 0; i < obstacles.size(); i++) {
//                                int obstacle_number=obstacles.get(i);
//
//                                if (obstacle_number==1){
//                                    if (circle_black.getCenterY()>480){
//                                        tobe_removed.add(i);
//                                    }
//                                }
//                                if (obstacle_number==2){
//                                    if (blue_rect.getY()>795){
//                                        tobe_removed.add(i);
//                                    }
//                                }
//                                if (obstacle_number==3){
//                                    if (bluehor_rect.getY()>805){
//                                        tobe_removed.add(i);
//                                    }
//                                }
//
//                                if (obstacle_number==4){
//                                    if (left_bluesquare.getY()>1200){
//                                        tobe_removed.add(i);
//                                    }
//                                }
//                            }
//
////                            for (int i = 0; i < tobe_removed.size()-1; i++) {
////                                if (obstacles.get(tobe_removed.get(i))!=obstacles.get(obstacles.size()-1)) {
////                                    obstacles.remove(tobe_removed.get(i));
////                                }
////                            }


                        }


                    });


                    if (atomicInteger.get() == 1) {
                        //sout("down");
                        Timeline animation5 = animation5 = new Timeline(
                                new KeyFrame(Duration.ZERO, new KeyValue(ball_circle.centerYProperty(), ball_circle.getCenterY(), Interpolator.LINEAR)),
                                new KeyFrame(Duration.seconds(1), new KeyValue(ball_circle.centerYProperty(), ball_circle.getCenterY() + 100, Interpolator.LINEAR))
                        );
                        animation5.play();

                        animation5.setCycleCount(1);

                    }


                    //ball colors

                    //1->red
                    //2->pinl
                    //3->green
                    //4->blue

                    if (ball_circle.getFill().equals(red_color)) {
                        ball_color = 1;
                    }
                    if (ball_circle.getFill().equals(pink_color)) {
                        ball_color = 2;
                    }
                    if (ball_circle.getFill().equals(green_color)) {
                        ball_color = 3;
                    }
                    if (ball_circle.getFill().equals(blue_color)) {
                        ball_color = 4;
                    }


                    //stars

                    istar1.setCircle_x(star_circle.getCenterX());
                    istar1.setCircle_y(star_circle.getCenterY());

                    istar2.setCircle_x(star_circle2.getCenterX());
                    istar2.setCircle_y(star_circle2.getCenterY());

                    istar3.setCircle_x(star_circle3.getCenterX());
                    istar3.setCircle_y(star_circle3.getCenterY());

                    istar4.setCircle_x(star_circle4.getCenterX());
                    istar4.setCircle_y(star_circle4.getCenterY());

                    //color cahnger

                    icolorrandom1.setArc1_x(red_switch.getCenterX());
                    icolorrandom1.setArc1_y(red_switch.getCenterY());

                    icolorrandom1.setArc2_x(pink_switch.getCenterX());
                    icolorrandom1.setArc2_y(pink_switch.getCenterY());

                    icolorrandom1.setArc3_x(green_switch.getCenterX());
                    icolorrandom1.setArc3_y(green_switch.getCenterY());

                    icolorrandom1.setArc4_x(blue_switch.getCenterX());
                    icolorrandom1.setArc4_y(blue_switch.getCenterY());


                    icolorrandom2.setArc1_x(red_switch2.getCenterX());
                    icolorrandom2.setArc1_y(red_switch2.getCenterY());

                    icolorrandom2.setArc2_x(pink_switch2.getCenterX());
                    icolorrandom2.setArc2_y(pink_switch2.getCenterY());

                    icolorrandom2.setArc3_x(green_switch2.getCenterX());
                    icolorrandom2.setArc3_y(green_switch2.getCenterY());

                    icolorrandom2.setArc4_x(blue_switch2.getCenterX());
                    icolorrandom2.setArc4_y(blue_switch2.getCenterY());


                    icolorrandom3.setArc1_x(red_switch3.getCenterX());
                    icolorrandom3.setArc1_y(red_switch3.getCenterY());

                    icolorrandom3.setArc2_x(pink_switch3.getCenterX());
                    icolorrandom3.setArc2_y(pink_switch3.getCenterY());

                    icolorrandom3.setArc3_x(green_switch3.getCenterX());
                    icolorrandom3.setArc3_y(green_switch3.getCenterY());

                    icolorrandom3.setArc4_x(blue_switch3.getCenterX());
                    icolorrandom3.setArc4_y(blue_switch3.getCenterY());

                    icolorrandom4.setArc1_x(red_switch4.getCenterX());
                    icolorrandom4.setArc1_y(red_switch4.getCenterY());

                    icolorrandom4.setArc2_x(pink_switch4.getCenterX());
                    icolorrandom4.setArc2_y(pink_switch4.getCenterY());

                    icolorrandom4.setArc3_x(green_switch4.getCenterX());
                    icolorrandom4.setArc3_y(green_switch4.getCenterY());

                    icolorrandom4.setArc4_x(blue_switch4.getCenterX());
                    icolorrandom4.setArc4_y(blue_switch4.getCenterY());


//                ball
                    iball.setX_position(ball_circle.getCenterX());
                    iball.setY_position(ball_circle.getCenterY());

                    //1->circle
                    //2->vertical line
                    //3->horizontal line
                    //4->8 obstacle


                    //circle
                    iobstacle1.setCircle_black_x(circle_black.getCenterX());
                    iobstacle1.setCircle_black_y(circle_black.getCenterY());

                    iobstacle1.setArc1_x(arc1.getCenterX());
                    iobstacle1.setArc1_y(arc1.getCenterY());

                    iobstacle1.setArc2_x(arc2.getCenterX());
                    iobstacle1.setArc2_y(arc2.getCenterY());

                    iobstacle1.setArc3_x(arc3.getCenterX());
                    iobstacle1.setArc3_y(arc3.getCenterY());

                    iobstacle1.setArc4_x(arc4.getCenterX());
                    iobstacle1.setArc4_y(arc4.getCenterY());

                    //vertical

                    iobstacle2.setBluerect_x(blue_rect.getX());
                    iobstacle2.setBluerect_y(blue_rect.getY());

                    iobstacle2.setGreenrect_x(green_rect.getX());
                    iobstacle2.setGreenrect_y(green_rect.getY());

                    iobstacle2.setPinkrect_x(pink_rect.getX());
                    iobstacle2.setPinkrect_y(pink_rect.getY());

                    iobstacle2.setRedrect_x(red_rect.getX());
                    iobstacle2.setRedrect_y(red_rect.getY());

                    //horizontal


                    iobstacle3.setBluerecthor_x(bluehor_rect.getX());
                    iobstacle3.setBluerecthor_y(bluehor_rect.getY());

                    iobstacle3.setGreenrecthor_x(greenhor_rect.getX());
                    iobstacle3.setGreenrecthor_y(greenhor_rect.getY());

                    iobstacle3.setPinkrecthor_x(pinkhor_rect.getX());
                    iobstacle3.setPinkrecthor_y(pinkhor_rect.getY());

                    iobstacle3.setRedrecthor_x(redhor_rect.getX());
                    iobstacle3.setRedrecthor_y(redhor_rect.getY());

                    //parallel

                    iobstacle4.setLeft_bluerecthor_x(left_bluesquare.getX());
                    iobstacle4.setLeft_bluerecthor_y(left_bluesquare.getY());

                    iobstacle4.setLeft_greenrecthor_x(left_greensquare.getX());
                    iobstacle4.setLeft_greenrecthor_y(left_greensquare.getY());

                    iobstacle4.setLeft_pinkrecthor_x(left_pinksquare.getX());
                    iobstacle4.setLeft_pinkrecthor_y(left_pinksquare.getY());

                    iobstacle4.setLeft_redrecthor_x(left_redsquare.getX());
                    iobstacle4.setLeft_redrecthor_y(left_redsquare.getY());

                    iobstacle4.setRight_bluerecthor_x(right_bluesquare.getX());
                    iobstacle4.setRight_bluerecthor_y(right_bluesquare.getY());

                    iobstacle4.setRight_greenrecthor_x(right_greensquare.getX());
                    iobstacle4.setRight_greenrecthor_y(right_greensquare.getY());

                    iobstacle4.setRight_pinkrecthor_x(right_pinksquare.getX());
                    iobstacle4.setRight_pinkrecthor_y(right_pinksquare.getY());

                    iobstacle4.setRight_redrecthor_x(right_redsquare.getX());
                    iobstacle4.setRight_redrecthor_y(right_redsquare.getY());
//
//
//
//                sout("check obstacle class "+obstacle1.getCircle_black_y());
                }


            };
            timer.start();


        }
        catch (Exception e) {


            //color change position

            blue_switch.setCenterY(40);
            red_switch.setCenterY(40);
            pink_switch.setCenterY(40);
            green_switch.setCenterY(40);


            blue_switch2.setCenterY(-100);
            red_switch2.setCenterY(-100);
            pink_switch2.setCenterY(-100);
            green_switch2.setCenterY(-100);

            blue_switch3.setCenterY(-100);
            red_switch3.setCenterY(-100);
            pink_switch3.setCenterY(-100);
            green_switch3.setCenterY(-100);

            blue_switch4.setCenterY(-100);
            red_switch4.setCenterY(-100);
            pink_switch4.setCenterY(-100);
            green_switch4.setCenterY(-100);


            //end


            Image image = new Image("https://vignette.wikia.nocookie.net/colorswitch/images/1/11/Regular_Star.png/revision/latest/top-crop/width/220/height/220?cb=20161030060935", false);

            star_circle.setFill(new ImagePattern(image));
            star_circle2.setFill(new ImagePattern(image));
            star_circle3.setFill(new ImagePattern(image));
            star_circle4.setFill(new ImagePattern(image));

            star_circle2.setCenterY(-1000);
            star_circle3.setCenterY(-1000);
            star_circle4.setCenterY(-1000);


            circle_black.setFill(Paint.valueOf("Black"));


            //color for ball
            int rand_color = (int) (Math.random() * 4) + 1;
            if (rand_color == 1) {
                ball_circle.setFill(Paint.valueOf("#ff1f23"));
            }
            if (rand_color == 2) {
                ball_circle.setFill(Paint.valueOf("#ff1fd1"));
            }
            if (rand_color == 3) {
                ball_circle.setFill(Paint.valueOf("#d9ff5c"));
            }
            if (rand_color == 4) {
                ball_circle.setFill(Paint.valueOf("DODGERBLUE"));
            }

            obstacles.add(1);

            {


                //1 -> Circle
                //2 -> vertical line
                //3 -> square


                // 8obstacle start


                Timeline timeline9 = new Timeline();
                timeline9.setCycleCount(Timeline.INDEFINITE);
                timeline9.setAutoReverse(true);
                KeyValue kv9 = new KeyValue(left_bluesquare.xProperty(), -300);

                KeyFrame kf9 = new KeyFrame(Duration.millis(2000), kv9);
                timeline9.getKeyFrames().add(kf9);
                timeline9.play();

                Timeline timeline10 = new Timeline();
                timeline10.setCycleCount(Timeline.INDEFINITE);
                timeline10.setAutoReverse(true);
                KeyValue kv10 = new KeyValue(right_bluesquare.xProperty(), 300);

                KeyFrame kf10 = new KeyFrame(Duration.millis(2000), kv10);
                timeline10.getKeyFrames().add(kf10);
                timeline10.play();

                Timeline timelineg = new Timeline();
                timelineg.setCycleCount(Timeline.INDEFINITE);
                timelineg.setAutoReverse(true);
                KeyValue kv11 = new KeyValue(left_greensquare.xProperty(), 222);

                KeyFrame kf11 = new KeyFrame(Duration.millis(2000), kv11);
                timelineg.getKeyFrames().add(kf11);
                timelineg.play();

                Timeline timelineg2 = new Timeline();
                timelineg2.setCycleCount(Timeline.INDEFINITE);
                timelineg2.setAutoReverse(true);
                KeyValue kv12 = new KeyValue(right_greensquare.xProperty(), -222);

                KeyFrame kf12 = new KeyFrame(Duration.millis(2000), kv12);
                timelineg2.getKeyFrames().add(kf12);
                timelineg2.play();

                Timeline timelinep = new Timeline();
                timelinep.setCycleCount(Timeline.INDEFINITE);
                timelinep.setAutoReverse(true);
                KeyValue kv13 = new KeyValue(left_pinksquare.xProperty(), 222);

                KeyFrame kf13 = new KeyFrame(Duration.millis(2000), kv13);
                timelinep.getKeyFrames().add(kf13);
                timelinep.play();

                Timeline timelinep2 = new Timeline();
                timelinep2.setCycleCount(Timeline.INDEFINITE);
                timelinep2.setAutoReverse(true);
                KeyValue kv14 = new KeyValue(right_pinksquare.xProperty(), -222);

                KeyFrame kf14 = new KeyFrame(Duration.millis(2000), kv14);
                timelinep2.getKeyFrames().add(kf14);
                timelinep2.play();

                Timeline timeliner = new Timeline();
                timeliner.setCycleCount(Timeline.INDEFINITE);
                timeliner.setAutoReverse(true);
                KeyValue kv15 = new KeyValue(left_redsquare.xProperty(), -300);

                KeyFrame kf15 = new KeyFrame(Duration.millis(2000), kv15);
                timeliner.getKeyFrames().add(kf15);
                timeliner.play();

                Timeline timeliner2 = new Timeline();
                timeliner2.setCycleCount(Timeline.INDEFINITE);
                timeliner2.setAutoReverse(true);
                KeyValue kv16 = new KeyValue(right_redsquare.xProperty(), 300);

                KeyFrame kf16 = new KeyFrame(Duration.millis(2000), kv16);
                timeliner2.getKeyFrames().add(kf16);
                timeliner2.play();


                //end


                //horizontal line

                Timeline timeline91 = new Timeline();
                timeline91.setCycleCount(Timeline.INDEFINITE);
                timeline91.setAutoReverse(true);
                KeyValue kv41 = new KeyValue(redhor_rect.xProperty(), -600);
                KeyFrame kf41 = new KeyFrame(Duration.millis(1000), kv41);
                timeline91.getKeyFrames().add(kf41);
                timeline91.play();


                Timeline timeline101 = new Timeline();
                timeline101.setCycleCount(Timeline.INDEFINITE);
                timeline101.setAutoReverse(true);
                KeyValue kv51 = new KeyValue(bluehor_rect.xProperty(), 500);

                KeyFrame kf51 = new KeyFrame(Duration.millis(1000), kv51);
                timeline101.getKeyFrames().add(kf51);
                timeline101.play();


                Timeline timeline111 = new Timeline();
                timeline111.setCycleCount(Timeline.INDEFINITE);
                timeline111.setAutoReverse(true);
                KeyValue kv61 = new KeyValue(greenhor_rect.xProperty(), 500);

                KeyFrame kf61 = new KeyFrame(Duration.millis(1000), kv61);
                timeline111.getKeyFrames().add(kf61);
                timeline111.play();


                Timeline timeline121 = new Timeline();
                timeline121.setCycleCount(Timeline.INDEFINITE);
                timeline121.setAutoReverse(true);
                KeyValue kv71 = new KeyValue(pinkhor_rect.xProperty(), -600);

                KeyFrame kf71 = new KeyFrame(Duration.millis(1000), kv71);

                timeline121.getKeyFrames().add(kf71);
                timeline121.play();


                //end


                //line plus

                Rotate rotation11 = new Rotate();
                rotation11.pivotXProperty().bind(pink_line.startXProperty());
                rotation11.pivotYProperty().bind(pink_line.startYProperty());

                pink_line.getTransforms().add(rotation11);
                Timeline timeline11 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotation11.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(rotation11.angleProperty(), 360)));
                timeline11.setCycleCount(Timeline.INDEFINITE);
                timeline11.play();


                Rotate rotation21 = new Rotate();
                rotation21.pivotXProperty().bind(red_line.endXProperty());
                rotation21.pivotYProperty().bind(red_line.endYProperty());

                red_line.getTransforms().add(rotation21);
                Timeline timeline21 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotation21.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(rotation21.angleProperty(), 360)));
                timeline21.setCycleCount(Timeline.INDEFINITE);
                timeline21.play();


                Rotate rotation31 = new Rotate();
                rotation31.pivotXProperty().bind(blue_line.startXProperty());
                rotation31.pivotYProperty().bind(blue_line.endYProperty());

                blue_line.getTransforms().add(rotation31);
                Timeline timeline31 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotation31.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(rotation31.angleProperty(), 360)));
                timeline31.setCycleCount(Timeline.INDEFINITE);
                timeline31.play();

                Rotate rotation41 = new Rotate();
                rotation41.pivotXProperty().bind(green_line.startXProperty());
                rotation41.pivotYProperty().bind(green_line.startYProperty());

                green_line.getTransforms().add(rotation41);
                Timeline timeline41 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotation41.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(rotation41.angleProperty(), 360)));
                timeline41.setCycleCount(Timeline.INDEFINITE);
                timeline41.play();


                //end

                //start

                Timeline timeline5 = new Timeline();
                timeline5.setCycleCount(Timeline.INDEFINITE);
                timeline5.setAutoReverse(true);
                KeyValue kv = new KeyValue(blue_rect.xProperty(), 400);

                KeyFrame kf = new KeyFrame(Duration.millis(2000), kv);
                timeline5.getKeyFrames().add(kf);
                timeline5.play();

                Timeline timeline6 = new Timeline();
                timeline6.setCycleCount(Timeline.INDEFINITE);
                timeline6.setAutoReverse(true);
                KeyValue kv1 = new KeyValue(red_rect.xProperty(), 400);

                KeyFrame kf1 = new KeyFrame(Duration.millis(2000), kv1);
                timeline6.getKeyFrames().add(kf1);
                timeline6.play();

                Timeline timeline7 = new Timeline();
                timeline7.setCycleCount(Timeline.INDEFINITE);
                timeline7.setAutoReverse(true);
                KeyValue kv2 = new KeyValue(green_rect.xProperty(), 400);

                KeyFrame kf2 = new KeyFrame(Duration.millis(2000), kv2);
                timeline7.getKeyFrames().add(kf2);
                timeline7.play();

                Timeline timeline8 = new Timeline();
                timeline8.setCycleCount(Timeline.INDEFINITE);
                timeline8.setAutoReverse(true);
                KeyValue kv3 = new KeyValue(pink_rect.xProperty(), 400);

                KeyFrame kf3 = new KeyFrame(Duration.millis(2000), kv3);
                timeline8.getKeyFrames().add(kf3);
                timeline8.play();


                //end


                Rotate rotation1 = new Rotate();
                rotation1.pivotXProperty().bind(pink_line.startXProperty());
                rotation1.pivotYProperty().bind(pink_line.startYProperty());

                pink_line.getTransforms().add(rotation1);
                Timeline timeline1 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotation1.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(rotation1.angleProperty(), 360)));
                timeline1.setCycleCount(Timeline.INDEFINITE);
                timeline1.play();

                Rotate rotation2 = new Rotate();
                rotation2.pivotXProperty().bind(red_line.endXProperty());
                rotation2.pivotYProperty().bind(red_line.endYProperty());

                red_line.getTransforms().add(rotation2);
                Timeline timeline2 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotation2.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(rotation2.angleProperty(), 360)));
                timeline2.setCycleCount(Timeline.INDEFINITE);
                timeline2.play();

                Rotate rotation3 = new Rotate();
                rotation3.pivotXProperty().bind(blue_line.startXProperty());
                rotation3.pivotYProperty().bind(blue_line.endYProperty());

                blue_line.getTransforms().add(rotation3);
                Timeline timeline3 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotation3.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(rotation3.angleProperty(), 360)));
                timeline3.setCycleCount(Timeline.INDEFINITE);
                timeline3.play();

                Rotate rotation4 = new Rotate();
                rotation4.pivotXProperty().bind(green_line.startXProperty());
                rotation4.pivotYProperty().bind(green_line.startYProperty());

                green_line.getTransforms().add(rotation4);
                Timeline timeline4 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotation4.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(rotation4.angleProperty(), 360)));
                timeline4.setCycleCount(Timeline.INDEFINITE);
                timeline4.play();


//        ball_circle.addEventHandler( KeyEvent.KEY_PRESSED,keyListener);


                Timeline animation = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(arc1.startAngleProperty(), arc1.getStartAngle(), Interpolator.LINEAR)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(arc1.startAngleProperty(), arc1.getStartAngle() - 360, Interpolator.LINEAR))
                );
                Timeline animation2 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(arc2.startAngleProperty(), arc2.getStartAngle(), Interpolator.LINEAR)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(arc2.startAngleProperty(), arc2.getStartAngle() - 360, Interpolator.LINEAR))
                );
                Timeline animation3 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(arc3.startAngleProperty(), arc3.getStartAngle(), Interpolator.LINEAR)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(arc3.startAngleProperty(), arc3.getStartAngle() - 360, Interpolator.LINEAR))
                );
                Timeline animation4 = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(arc4.startAngleProperty(), arc4.getStartAngle(), Interpolator.LINEAR)),
                        new KeyFrame(Duration.seconds(4), new KeyValue(arc4.startAngleProperty(), arc4.getStartAngle() - 360, Interpolator.LINEAR))
                );

                animation.setCycleCount(Animation.INDEFINITE);
                animation.play();
                animation2.setCycleCount(Animation.INDEFINITE);
                animation2.play();
                animation3.setCycleCount(Animation.INDEFINITE);
                animation3.play();
                animation4.setCycleCount(Animation.INDEFINITE);
                animation4.play();

                double bluehor_rect_initial = bluehor_rect.getY();
                double pinkhor_rect_initial = pinkhor_rect.getY();
                double greenhor_rect_initial = greenhor_rect.getY();
                double redhor_rect_initial = redhor_rect.getY();

                double blue_rect_initial = blue_rect.getY();
                double pink_rect_initial = pink_rect.getY();
                double red_rect_initial = red_rect.getY();
                double green_rect_initial = green_rect.getY();


//        ArrayList<Integer> obstacles=new ArrayList<>();


                AnimationTimer timer = new AnimationTimer() {
                    Star istar1 = star1;
                    Star istar2 = star2;
                    Star istar3 = star3;
                    Star istar4 = star4;

                    Colorrandom icolorrandom1 = colorrandom1;
                    Colorrandom icolorrandom2 = colorrandom2;
                    Colorrandom icolorrandom3 = colorrandom3;
                    Colorrandom icolorrandom4 = colorrandom4;


                    Ball iball = ball;

                    Obstacle1 iobstacle1 = obstacle1;
                    Obstacle2 iobstacle2 = obstacle2;
                    Obstacle3 iobstacle3 = obstacle3;
                    Obstacle4 iobstacle4 = obstacle4;

                    boolean color_change_icon_set = false;
                    boolean star_icon_set = false;

                    boolean color_change_else = false;
                    boolean star_else = false;

                    boolean added_new = false;

                    boolean collide_star1 = false;
                    boolean collide_star2 = false;
                    boolean collide_star3 = false;
                    boolean collide_star4 = false;


                    boolean circle_check = false;
                    boolean vertical_check = false;
                    boolean horizontal_check = false;
                    boolean parallel_obstacle_check = false;
                    boolean is_break=false;

                    boolean first_obstacle = true;
                    int no_vertical = 2;


                    @Override
                    public void handle(long now) {




                        if (ispaused){
                            is_break=ispaused;
                        }


//                        if (ball_circle.getCenterY()>100 && !is_break){
//                            exit();
//                            is_break=true;
//                        }

                        //1->circle
                        //2->vertical line
                        //3->horizontal line
                        //4->8 obstacle


                        //collision start

                        Color c = (Color) ball_circle.getFill();
                        Color blue_color = Color.valueOf("0x1e90ffff");
                        Color red_color = Color.valueOf("#ff1f23");
                        Color pink_color = Color.valueOf("#ff1fd1");
                        Color green_color = Color.valueOf("#d9ff5c");

                        //blue color ball
                        if (c.equals(blue_color)) {

                            //for circle

                            Shape intersect1 = Shape.intersect(ball_circle, arc1);
                            Shape intersect11 = Shape.intersect(ball_circle, circle_black);
                            if (intersect1.getBoundsInLocal().getWidth() != -1 && intersect11.getBoundsInLocal().getWidth() == -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect2 = Shape.intersect(ball_circle, arc2);
                            Shape intersect21 = Shape.intersect(ball_circle, circle_black);
                            if (intersect2.getBoundsInLocal().getWidth() != -1 && intersect21.getBoundsInLocal().getWidth() == -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect3 = Shape.intersect(ball_circle, arc3);
                            Shape intersect31 = Shape.intersect(ball_circle, circle_black);
                            if (intersect3.getBoundsInLocal().getWidth() != -1 && intersect31.getBoundsInLocal().getWidth() == -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            //for vertical line

                            Shape intersect4 = Shape.intersect(ball_circle, pink_rect);
                            if (intersect4.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect5 = Shape.intersect(ball_circle, red_rect);
                            if (intersect5.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect6 = Shape.intersect(ball_circle, green_rect );
                            if (intersect6.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }


                            //horizontal line

                            Shape intersect7 = Shape.intersect(ball_circle, redhor_rect);
                            if (intersect7.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect8 = Shape.intersect(ball_circle, pinkhor_rect);
                            if (intersect8.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect9 = Shape.intersect(ball_circle, greenhor_rect);
                            if (intersect9.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect10 = Shape.intersect(ball_circle, left_greensquare);
                            if (intersect10.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect111 = Shape.intersect(ball_circle, left_pinksquare);
                            if (intersect111.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect121 = Shape.intersect(ball_circle, left_redsquare);
                            if (intersect121.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect131 = Shape.intersect(ball_circle, right_greensquare );
                            if (intersect131.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                            }

                            Shape intersect141 = Shape.intersect(ball_circle, right_pinksquare );
                            if (intersect141.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect151 = Shape.intersect(ball_circle, right_redsquare);
                            if (intersect151.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            //collison with color change


                            Shape intersecti1 = Shape.intersect(ball_circle, red_switch);
                            Shape intersecti2 = Shape.intersect(ball_circle, blue_switch);
                            Shape intersecti3 = Shape.intersect(ball_circle, green_switch);
                            Shape intersecti4 = Shape.intersect(ball_circle, red_switch);

                            if (intersecti1.getBoundsInLocal().getWidth() != -1 || intersecti2.getBoundsInLocal().getWidth() != -1
                                    || intersecti3.getBoundsInLocal().getWidth() != -1 || intersecti4.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(green_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch.setCenterY(-1000);
                                red_switch.setCenterY(-1000);
                                green_switch.setCenterY(-1000);
                                pink_switch.setCenterY(-1000);

                            }

                            Shape intersecti11 = Shape.intersect(ball_circle, red_switch2);
                            Shape intersecti21 = Shape.intersect(ball_circle, blue_switch2);
                            Shape intersecti31 = Shape.intersect(ball_circle, green_switch2);
                            Shape intersecti41 = Shape.intersect(ball_circle, red_switch2);

                            if (intersecti11.getBoundsInLocal().getWidth() != -1 || intersecti21.getBoundsInLocal().getWidth() != -1
                                    || intersecti31.getBoundsInLocal().getWidth() != -1 || intersecti41.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(green_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch2.setCenterY(-1000);
                                red_switch2.setCenterY(-1000);
                                green_switch2.setCenterY(-1000);
                                pink_switch2.setCenterY(-1000);

                            }

                            Shape intersecti121 = Shape.intersect(ball_circle, red_switch3);
                            Shape intersecti221 = Shape.intersect(ball_circle, blue_switch3);
                            Shape intersecti321 = Shape.intersect(ball_circle, green_switch3);
                            Shape intersecti421 = Shape.intersect(ball_circle, red_switch3);

                            if (intersecti121.getBoundsInLocal().getWidth() != -1 || intersecti221.getBoundsInLocal().getWidth() != -1
                                    || intersecti321.getBoundsInLocal().getWidth() != -1 || intersecti421.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(green_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch3.setCenterY(-1000);
                                red_switch3.setCenterY(-1000);
                                green_switch3.setCenterY(-1000);
                                pink_switch3.setCenterY(-1000);

                            }

                            Shape intersecti12 = Shape.intersect(ball_circle, red_switch4);
                            Shape intersecti22 = Shape.intersect(ball_circle, blue_switch4);
                            Shape intersecti32 = Shape.intersect(ball_circle, green_switch4);
                            Shape intersecti42 = Shape.intersect(ball_circle, red_switch4);

                            if (intersecti12.getBoundsInLocal().getWidth() != -1 || intersecti22.getBoundsInLocal().getWidth() != -1
                                    || intersecti32.getBoundsInLocal().getWidth() != -1 || intersecti42.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = rand.nextInt();
                                if (number == 0) {
                                    ball_circle.setFill(green_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch4.setCenterY(-1000);
                                red_switch4.setCenterY(-1000);
                                green_switch4.setCenterY(-1000);
                                pink_switch4.setCenterY(-1000);

                            }


                            //collison end


                            //collision with star

                            Shape intersecti13 = Shape.intersect(ball_circle, star_circle);

                            if (intersecti13.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star1) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star1 = true;
                                }

                                star_circle.setCenterY(-10000);
                            }

                            Shape intersecti131 = Shape.intersect(ball_circle, star_circle2);

                            if (intersecti131.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star2) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star2 = true;
                                }

                                star_circle2.setCenterY(-10000);
                            }

                            Shape intersecti132 = Shape.intersect(ball_circle, star_circle3);

                            if (intersecti132.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star3) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star3 = true;
                                }

                                star_circle3.setCenterY(-10000);
                            }

                            Shape intersecti134 = Shape.intersect(ball_circle, star_circle4);

                            if (intersecti134.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star4) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star4 = true;
                                }

                                star_circle4.setCenterY(-10000);
                            }

                            //end

                        }

                        //red color ball

                        if (c.equals(red_color)) {

//                    //for circle

                            Shape intersect1 = Shape.intersect(ball_circle, arc2);
                            Shape intersect11 = Shape.intersect(ball_circle, circle_black);
                            if (intersect1.getBoundsInLocal().getWidth() != -1 && intersect11.getBoundsInLocal().getWidth() == -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect2 = Shape.intersect(ball_circle, arc3);
                            Shape intersect21 = Shape.intersect(ball_circle, circle_black);
                            if (intersect2.getBoundsInLocal().getWidth() != -1 && intersect21.getBoundsInLocal().getWidth() == -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect3 = Shape.intersect(ball_circle, arc4);
                            Shape intersect31 = Shape.intersect(ball_circle, circle_black);
                            if (intersect3.getBoundsInLocal().getWidth() != -1 && intersect31.getBoundsInLocal().getWidth() == -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            //for vertical line

                            Shape intersect4 = Shape.intersect(ball_circle, pink_rect);
                            if (intersect4.getBoundsInLocal().getWidth() != -1 && !is_break && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect5 = Shape.intersect(ball_circle, blue_rect);
                            if (intersect5.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect6 = Shape.intersect(ball_circle, green_rect);
                            if (intersect6.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }


                            //horizontal line

                            Shape intersect7 = Shape.intersect(ball_circle, bluehor_rect);
                            if (intersect7.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect8 = Shape.intersect(ball_circle, pinkhor_rect);
                            if (intersect8.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect9 = Shape.intersect(ball_circle, greenhor_rect);
                            if (intersect9.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }


                            Shape intersect10 = Shape.intersect(ball_circle, left_greensquare);
                            if (intersect10.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect111 = Shape.intersect(ball_circle, left_pinksquare);
                            if (intersect111.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect121 = Shape.intersect(ball_circle, left_bluesquare );
                            if (intersect121.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect131 = Shape.intersect(ball_circle, right_greensquare);
                            if (intersect131.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect141 = Shape.intersect(ball_circle, right_pinksquare);
                            if (intersect141.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect151 = Shape.intersect(ball_circle, right_bluesquare);
                            if (intersect151.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            //collison with color change


                            Shape intersecti1 = Shape.intersect(ball_circle, red_switch);
                            Shape intersecti2 = Shape.intersect(ball_circle, blue_switch);
                            Shape intersecti3 = Shape.intersect(ball_circle, green_switch);
                            Shape intersecti4 = Shape.intersect(ball_circle, red_switch);

                            if (intersecti1.getBoundsInLocal().getWidth() != -1 || intersecti2.getBoundsInLocal().getWidth() != -1
                                    || intersecti3.getBoundsInLocal().getWidth() != -1 || intersecti4.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(green_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch.setCenterY(-1000);
                                red_switch.setCenterY(-1000);
                                green_switch.setCenterY(-1000);
                                pink_switch.setCenterY(-1000);
                            }

                            Shape intersecti11 = Shape.intersect(ball_circle, red_switch2);
                            Shape intersecti21 = Shape.intersect(ball_circle, blue_switch2);
                            Shape intersecti31 = Shape.intersect(ball_circle, green_switch2);
                            Shape intersecti41 = Shape.intersect(ball_circle, red_switch2);

                            if (intersecti11.getBoundsInLocal().getWidth() != -1 || intersecti21.getBoundsInLocal().getWidth() != -1
                                    || intersecti31.getBoundsInLocal().getWidth() != -1 || intersecti41.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(green_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch2.setCenterY(-1000);
                                red_switch2.setCenterY(-1000);
                                green_switch2.setCenterY(-1000);
                                pink_switch2.setCenterY(-1000);

                            }

                            Shape intersecti112 = Shape.intersect(ball_circle, red_switch3);
                            Shape intersecti212 = Shape.intersect(ball_circle, blue_switch3);
                            Shape intersecti312 = Shape.intersect(ball_circle, green_switch3);
                            Shape intersecti412 = Shape.intersect(ball_circle, red_switch3);

                            if (intersecti112.getBoundsInLocal().getWidth() != -1 || intersecti212.getBoundsInLocal().getWidth() != -1
                                    || intersecti312.getBoundsInLocal().getWidth() != -1 || intersecti412.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(green_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch3.setCenterY(-1000);
                                red_switch3.setCenterY(-1000);
                                green_switch3.setCenterY(-1000);
                                pink_switch3.setCenterY(-1000);

                            }

                            Shape intersecti12 = Shape.intersect(ball_circle, red_switch4);
                            Shape intersecti22 = Shape.intersect(ball_circle, blue_switch4);
                            Shape intersecti32 = Shape.intersect(ball_circle, green_switch4);
                            Shape intersecti42 = Shape.intersect(ball_circle, red_switch4);

                            if (intersecti12.getBoundsInLocal().getWidth() != -1 || intersecti22.getBoundsInLocal().getWidth() != -1
                                    || intersecti32.getBoundsInLocal().getWidth() != -1 || intersecti42.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(green_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch4.setCenterY(-1000);
                                red_switch4.setCenterY(-1000);
                                green_switch4.setCenterY(-1000);
                                pink_switch4.setCenterY(-1000);

                            }

                            //collison end


                            //collision with star

                            Shape intersecti13 = Shape.intersect(ball_circle, star_circle);

                            if (intersecti13.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star1) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star1 = true;
                                }

                                star_circle.setCenterY(-10000);
                            }

                            Shape intersecti131 = Shape.intersect(ball_circle, star_circle2);

                            if (intersecti131.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star2) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star2 = true;
                                }

                                star_circle2.setCenterY(-10000);
                            }

                            Shape intersecti132 = Shape.intersect(ball_circle, star_circle3);

                            if (intersecti132.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star3) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star3 = true;
                                }

                                star_circle3.setCenterY(-10000);
                            }

                            Shape intersecti134 = Shape.intersect(ball_circle, star_circle4);

                            if (intersecti134.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star4) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star4 = true;
                                }

                                star_circle4.setCenterY(-10000);
                            }
                            //end

                        }


                        //Pink color ball

                        if (c.equals(pink_color)) {
//                    //for circle

                            Shape intersect1 = Shape.intersect(ball_circle, arc1);
                            Shape intersect11 = Shape.intersect(ball_circle, circle_black);
                            if (intersect1.getBoundsInLocal().getWidth() != -1 && intersect11.getBoundsInLocal().getWidth() == -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect2 = Shape.intersect(ball_circle, arc3);
                            Shape intersect21 = Shape.intersect(ball_circle, circle_black);
                            if (intersect2.getBoundsInLocal().getWidth() != -1 && intersect21.getBoundsInLocal().getWidth() == -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect3 = Shape.intersect(ball_circle, arc4);
                            Shape intersect31 = Shape.intersect(ball_circle, circle_black);
                            if (intersect3.getBoundsInLocal().getWidth() != -1 && intersect31.getBoundsInLocal().getWidth() == -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            //for vertical line

                            Shape intersect4 = Shape.intersect(ball_circle, blue_rect);
                            if (intersect4.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect5 = Shape.intersect(ball_circle, red_rect);
                            if (intersect5.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect6 = Shape.intersect(ball_circle, green_rect);
                            if (intersect6.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }


                            //horizontal line

                            Shape intersect7 = Shape.intersect(ball_circle, redhor_rect);
                            if (intersect7.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect8 = Shape.intersect(ball_circle, bluehor_rect);
                            if (intersect8.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect9 = Shape.intersect(ball_circle, greenhor_rect);
                            if (intersect9.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }


                            Shape intersect10 = Shape.intersect(ball_circle, left_greensquare);
                            if (intersect10.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect111 = Shape.intersect(ball_circle, left_bluesquare);
                            if (intersect111.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect121 = Shape.intersect(ball_circle, left_redsquare );
                            if (intersect121.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect131 = Shape.intersect(ball_circle, right_greensquare );
                            if (intersect131.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect141 = Shape.intersect(ball_circle, right_bluesquare);
                            if (intersect111.getBoundsInLocal().getWidth() != -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect151 = Shape.intersect(ball_circle, right_redsquare );
                            if (intersect121.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            //collison with color change


                            Shape intersecti1 = Shape.intersect(ball_circle, red_switch);
                            Shape intersecti2 = Shape.intersect(ball_circle, blue_switch);
                            Shape intersecti3 = Shape.intersect(ball_circle, green_switch);
                            Shape intersecti4 = Shape.intersect(ball_circle, red_switch);

                            if (intersecti1.getBoundsInLocal().getWidth() != -1 || intersecti2.getBoundsInLocal().getWidth() != -1
                                    || intersecti3.getBoundsInLocal().getWidth() != -1 || intersecti4.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(green_color);

                                blue_switch.setCenterY(-1000);
                                red_switch.setCenterY(-1000);
                                green_switch.setCenterY(-1000);
                                pink_switch.setCenterY(-1000);
                            }

                            Shape intersecti11 = Shape.intersect(ball_circle, red_switch2);
                            Shape intersecti21 = Shape.intersect(ball_circle, blue_switch2);
                            Shape intersecti31 = Shape.intersect(ball_circle, green_switch2);
                            Shape intersecti41 = Shape.intersect(ball_circle, red_switch2);

                            if (intersecti11.getBoundsInLocal().getWidth() != -1 || intersecti21.getBoundsInLocal().getWidth() != -1
                                    || intersecti31.getBoundsInLocal().getWidth() != -1 || intersecti41.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(green_color);

                                blue_switch2.setCenterY(-1000);
                                red_switch2.setCenterY(-1000);
                                green_switch2.setCenterY(-1000);
                                pink_switch2.setCenterY(-1000);

                            }

                            Shape intersecti112 = Shape.intersect(ball_circle, red_switch3);
                            Shape intersecti212 = Shape.intersect(ball_circle, blue_switch3);
                            Shape intersecti312 = Shape.intersect(ball_circle, green_switch3);
                            Shape intersecti412 = Shape.intersect(ball_circle, red_switch3);

                            if (intersecti112.getBoundsInLocal().getWidth() != -1 || intersecti212.getBoundsInLocal().getWidth() != -1
                                    || intersecti312.getBoundsInLocal().getWidth() != -1 || intersecti412.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(green_color);

                                blue_switch3.setCenterY(-1000);
                                red_switch3.setCenterY(-1000);
                                green_switch3.setCenterY(-1000);
                                pink_switch3.setCenterY(-1000);

                            }

                            Shape intersecti12 = Shape.intersect(ball_circle, red_switch4);
                            Shape intersecti22 = Shape.intersect(ball_circle, blue_switch4);
                            Shape intersecti32 = Shape.intersect(ball_circle, green_switch4);
                            Shape intersecti42 = Shape.intersect(ball_circle, red_switch4);

                            if (intersecti12.getBoundsInLocal().getWidth() != -1 || intersecti22.getBoundsInLocal().getWidth() != -1
                                    || intersecti32.getBoundsInLocal().getWidth() != -1 || intersecti42.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch4.setCenterY(-1000);
                                red_switch4.setCenterY(-1000);
                                green_switch4.setCenterY(-1000);
                                pink_switch4.setCenterY(-1000);

                            }

                            //collison end


                            //collision with star

                            Shape intersecti13 = Shape.intersect(ball_circle, star_circle);

                            if (intersecti13.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star1) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star1 = true;
                                }

                                star_circle.setCenterY(-10000);
                            }

                            Shape intersecti131 = Shape.intersect(ball_circle, star_circle2);

                            if (intersecti131.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star2) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star2 = true;
                                }

                                star_circle2.setCenterY(-10000);
                            }

                            Shape intersecti132 = Shape.intersect(ball_circle, star_circle3);

                            if (intersecti132.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star3) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star3 = true;
                                }

                                star_circle3.setCenterY(-10000);
                            }

                            Shape intersecti134 = Shape.intersect(ball_circle, star_circle4);

                            if (intersecti134.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star4) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star4 = true;
                                }

                                star_circle4.setCenterY(-10000);
                            }

                            //end

                        }

                        //Green color ball

                        if (c.equals(green_color)) {
//                    sout(1);

//                    //for circle
                            Shape intersect1 = Shape.intersect(ball_circle, arc1);
                            Shape intersect11 = Shape.intersect(ball_circle, circle_black);
                            if (intersect1.getBoundsInLocal().getWidth() != -1 && intersect11.getBoundsInLocal().getWidth() == -1 && !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect2 = Shape.intersect(ball_circle, arc2);
                            Shape intersect21 = Shape.intersect(ball_circle, circle_black);
                            if (intersect2.getBoundsInLocal().getWidth() != -1 && intersect21.getBoundsInLocal().getWidth() == -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect3 = Shape.intersect(ball_circle, arc4);
                            Shape intersect31 = Shape.intersect(ball_circle, circle_black);
                            if (intersect3.getBoundsInLocal().getWidth() != -1 && intersect31.getBoundsInLocal().getWidth() == -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            //for vertical line

                            Shape intersect4 = Shape.intersect(ball_circle, blue_rect);
                            if (intersect4.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect5 = Shape.intersect(ball_circle, red_rect);
                            if (intersect5.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect6 = Shape.intersect(ball_circle, blue_rect);
                            if (intersect6.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }


                            //horizontal line

                            Shape intersect7 = Shape.intersect(ball_circle, redhor_rect);
                            if (intersect7.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect8 = Shape.intersect(ball_circle, bluehor_rect);
                            if (intersect8.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect9 = Shape.intersect(ball_circle, bluehor_rect);
                            if (intersect9.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect10 = Shape.intersect(ball_circle, left_bluesquare);
                            if (intersect10.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect111 = Shape.intersect(ball_circle, left_pinksquare);
                            if (intersect111.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect121 = Shape.intersect(ball_circle, left_redsquare);
                            if (intersect121.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect131 = Shape.intersect(ball_circle, right_bluesquare);
                            if (intersect131.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect141 = Shape.intersect(ball_circle, right_pinksquare);
                            if (intersect111.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }

                            Shape intersect151 = Shape.intersect(ball_circle, right_redsquare);
                            if (intersect121.getBoundsInLocal().getWidth() != -1&& !is_break) {
                                exit();
                                is_break=true;
                            }


                            //collison with color change


                            Shape intersecti1 = Shape.intersect(ball_circle, red_switch);
                            Shape intersecti2 = Shape.intersect(ball_circle, blue_switch);
                            Shape intersecti3 = Shape.intersect(ball_circle, green_switch);
                            Shape intersecti4 = Shape.intersect(ball_circle, red_switch);

                            if (intersecti1.getBoundsInLocal().getWidth() != -1 || intersecti2.getBoundsInLocal().getWidth() != -1
                                    || intersecti3.getBoundsInLocal().getWidth() != -1 || intersecti4.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch.setCenterY(-1000);
                                red_switch.setCenterY(-1000);
                                green_switch.setCenterY(-1000);
                                pink_switch.setCenterY(-1000);

                            }

                            Shape intersecti11 = Shape.intersect(ball_circle, red_switch2);
                            Shape intersecti21 = Shape.intersect(ball_circle, blue_switch2);
                            Shape intersecti31 = Shape.intersect(ball_circle, green_switch2);
                            Shape intersecti41 = Shape.intersect(ball_circle, red_switch2);

                            if (intersecti11.getBoundsInLocal().getWidth() != -1 || intersecti21.getBoundsInLocal().getWidth() != -1
                                    || intersecti31.getBoundsInLocal().getWidth() != -1 || intersecti41.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch2.setCenterY(-1000);
                                red_switch2.setCenterY(-1000);
                                green_switch2.setCenterY(-1000);
                                pink_switch2.setCenterY(-1000);

                            }

                            Shape intersecti112 = Shape.intersect(ball_circle, red_switch3);
                            Shape intersecti212 = Shape.intersect(ball_circle, blue_switch3);
                            Shape intersecti312 = Shape.intersect(ball_circle, green_switch3);
                            Shape intersecti412 = Shape.intersect(ball_circle, red_switch3);

                            if (intersecti112.getBoundsInLocal().getWidth() != -1 || intersecti212.getBoundsInLocal().getWidth() != -1
                                    || intersecti312.getBoundsInLocal().getWidth() != -1 || intersecti412.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);

                                blue_switch3.setCenterY(-1000);
                                red_switch3.setCenterY(-1000);
                                green_switch3.setCenterY(-1000);
                                pink_switch3.setCenterY(-1000);

                            }

                            Shape intersecti12 = Shape.intersect(ball_circle, red_switch4);
                            Shape intersecti22 = Shape.intersect(ball_circle, blue_switch4);
                            Shape intersecti32 = Shape.intersect(ball_circle, green_switch4);
                            Shape intersecti42 = Shape.intersect(ball_circle, red_switch4);

                            if (intersecti12.getBoundsInLocal().getWidth() != -1 || intersecti22.getBoundsInLocal().getWidth() != -1
                                    || intersecti32.getBoundsInLocal().getWidth() != -1 || intersecti42.getBoundsInLocal().getWidth() != -1) {

                                Random rand = new Random();
                                int number = (int) (Math.random() * 3);
                                if (number == 0) {
                                    ball_circle.setFill(blue_color);
                                } else if (number == 1) {
                                    ball_circle.setFill(red_color);
                                } else if (number == 2)
                                    ball_circle.setFill(pink_color);


                                blue_switch4.setCenterY(-1000);
                                red_switch4.setCenterY(-1000);
                                green_switch4.setCenterY(-1000);
                                pink_switch4.setCenterY(-1000);

                            }

                            //collison end

                            //collision with star

                            Shape intersecti13 = Shape.intersect(ball_circle, star_circle);

                            if (intersecti13.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star1) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star1 = true;
                                }

                                star_circle.setCenterY(-10000);
                            }

                            Shape intersecti131 = Shape.intersect(ball_circle, star_circle2);

                            if (intersecti131.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star2) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star2 = true;
                                }

                                star_circle2.setCenterY(-10000);
                            }

                            Shape intersecti132 = Shape.intersect(ball_circle, star_circle3);

                            if (intersecti132.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star3) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star3 = true;
                                }

                                star_circle3.setCenterY(-10000);
                            }

                            Shape intersecti134 = Shape.intersect(ball_circle, star_circle4);

                            if (intersecti134.getBoundsInLocal().getWidth() != -1) {
                                if (!collide_star4) {
                                    int score = Integer.parseInt(score_text.getText());
                                    score++;
                                    score_text.setText(String.valueOf(score));
                                    collide_star4 = true;
                                }

                                star_circle4.setCenterY(-10000);
                            }

                            //end

                        }

                        //end


                        //collision end

                        if (obstacles.get(obstacles.size() - 1) == 1) {
                            if (!circle_check && circle_black.getCenterY() > 150) {
                                int rand_obstacle = (int) ((Math.random() * 4) + 1);


                                if (obstacles.size() == 1) {

                                    while (rand_obstacle == obstacles.get(obstacles.size() - 1)) {
                                        rand_obstacle = (int) ((Math.random() * 4) + 1);
                                    }
                                } else {
//                            sout("Vertical Previous Obstacle "+obstacles.get(obstacles.size() - 2) +"   "+ obstacles.get(obstacles.size() - 1));
                                    while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == obstacles.get(obstacles.size() - 2)) {
                                        rand_obstacle = (int) ((Math.random() * 4) + 1);
                                    }
                                }

                                if (rand_obstacle == 1) {

                                    if (obstacles.size() == 2) {
                                        int prev_obstacle = obstacles.get(1);

                                        if (prev_obstacle == 2) {
                                            rand_obstacle = 3;
                                        }
                                        if (prev_obstacle == 3) {
                                            rand_obstacle = 4;
                                        }
                                        if (prev_obstacle == 4) {
                                            rand_obstacle = 2;
                                        }
                                    } else {
                                        int prev_obstacle = obstacles.get(obstacles.size() - 2);

                                        if (prev_obstacle == 2) {
                                            rand_obstacle = 3;
                                        }
                                        if (prev_obstacle == 3) {
                                            rand_obstacle = 4;
                                        }
                                        if (prev_obstacle == 4) {
                                            rand_obstacle = 2;
                                        }
                                    }


                                }
//                                sout("Current obstacles ");
                                for (int i = 0; i < obstacles.size(); i++) {
                                    System.out.print(obstacles.get(i) + " ");
                                }
//                                sout();

//                                sout("Circle " + rand_obstacle);


                                if (rand_obstacle == 1) {


                                    star_circle.setCenterY(-1000);

                                    blue_switch.setCenterY(-100);
                                    red_switch.setCenterY(-100);
                                    pink_switch.setCenterY(-100);
                                    green_switch.setCenterY(-100);

                                    circle_black.setCenterY(-350);
                                    arc1.setCenterY(-350);
                                    arc2.setCenterY(-350);
                                    arc3.setCenterY(-350);
                                    arc4.setCenterY(-350);


                                    bluehor_rect.setY(400);
                                    pinkhor_rect.setY(-560);
                                    greenhor_rect.setY(400);
                                    redhor_rect.setY(-560);
                                    collide_star3 = false;
//                                    sout("here me 1");
//                                    sout("horizontal  " + blue_rect.getY());
                                    obstacles.add(2);
                                }
                                if (rand_obstacle == 2) {
                                    collide_star2 = false;
                                    obstacles.add(rand_obstacle);
                                    star_circle2.setCenterY(-1000);
                                    blue_switch2.setCenterY(-100);
                                    red_switch2.setCenterY(-100);
                                    pink_switch2.setCenterY(-100);
                                    green_switch2.setCenterY(-100);


                                    blue_rect.setY(-170);
                                    pink_rect.setY(-170);
                                    green_rect.setY(-170);
                                    red_rect.setY(-170);

                                }
                                if (rand_obstacle == 3) {
                                    collide_star3 = false;
                                    obstacles.add(rand_obstacle);

//                            bluehor_rect.setY(0);
//                            pinkhor_rect.setY(-160);
//                            greenhor_rect.setY(0);
//                            redhor_rect.setY(-160);
                                    bluehor_rect.setY(400);
                                    pinkhor_rect.setY(-560);
                                    greenhor_rect.setY(400);
                                    redhor_rect.setY(-560);
                                }
                                if (rand_obstacle == 4) {
                                    collide_star4 = false;
                                    obstacles.add(rand_obstacle);

                                    star_circle4.setCenterY(-1000);

                                    blue_switch4.setCenterY(-100);
                                    red_switch4.setCenterY(-100);
                                    pink_switch4.setCenterY(-100);
                                    green_switch4.setCenterY(-100);


                                    left_bluesquare.setY(-574.0);
                                    left_redsquare.setY(-278.0);
                                    left_greensquare.setY(-426.0);
                                    left_pinksquare.setY(-130.0);

                                    right_pinksquare.setY(-130.0);
                                    right_redsquare.setY(-278.0);
                                    right_greensquare.setY(-426.0);
                                    right_bluesquare.setY(-574.0);
                                }

                                circle_check = true;
                                horizontal_check = false;
                                vertical_check = false;
                                parallel_obstacle_check = false;
                            }
                        }
                        if (obstacles.get(obstacles.size() - 1) == 2) {

//                    sout("fdwuygifgeiga");
                            if (!vertical_check && blue_rect.getY() > 950) {
                                int rand_obstacle = (int) ((Math.random() * 4) + 1);
//                        sout("Horizontal Previous Obstacle "+obstacles.get(obstacles.size() - 2) +"   "+ obstacles.get(obstacles.size() - 1));
                                if (obstacles.size() == 1) {
                                    while (rand_obstacle == obstacles.get(obstacles.size() - 1)) {
                                        rand_obstacle = (int) ((Math.random() * 4) + 1);
                                    }
                                } else {
                                    while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == obstacles.get(obstacles.size() - 2)) {
                                        rand_obstacle = (int) ((Math.random() * 4) + 1);
                                    }
                                }


                                if (rand_obstacle == 2) {
                                    if (obstacles.size() == 2) {
                                        int prev_obstacle = obstacles.get(1);

                                        if (prev_obstacle == 1) {
                                            rand_obstacle = 3;
                                        }
                                        if (prev_obstacle == 3) {
                                            rand_obstacle = 4;
                                        }
                                        if (prev_obstacle == 4) {
                                            rand_obstacle = 1;
                                        }
                                    } else {
                                        int prev_obstacle = obstacles.get(obstacles.size() - 2);

                                        if (prev_obstacle == 3) {
                                            rand_obstacle = 4;
                                        }
                                        if (prev_obstacle == 4) {
                                            rand_obstacle = 3;
                                        }
                                        if (prev_obstacle == 1) {
                                            rand_obstacle = 3;
                                        }
                                    }
                                }


//                                sout("Current obstacles ");
                                for (int i = 0; i < obstacles.size(); i++) {
                                    System.out.print(obstacles.get(i) + " ");
                                }
//                                sout();

//                                sout("vertical " + rand_obstacle);


                                if (rand_obstacle == 1) {
                                    collide_star1 = false;
                                    obstacles.add(rand_obstacle);

                                    star_circle.setCenterY(-1000);

                                    blue_switch.setCenterY(-100);
                                    red_switch.setCenterY(-100);
                                    pink_switch.setCenterY(-100);
                                    green_switch.setCenterY(-100);

                                    circle_black.setCenterY(-350);
                                    arc1.setCenterY(-350);
                                    arc2.setCenterY(-350);
                                    arc3.setCenterY(-350);
                                    arc4.setCenterY(-350);

                                }
                                if (rand_obstacle == 2) {

                                    star_circle2.setCenterY(-1000);

                                    blue_switch2.setCenterY(-100);
                                    red_switch2.setCenterY(-100);
                                    pink_switch2.setCenterY(-100);
                                    green_switch2.setCenterY(-100);

                                    blue_rect.setY(-170);
                                    pink_rect.setY(-170);
                                    green_rect.setY(-170);
                                    red_rect.setY(-170);

                                    collide_star3 = false;

                                    bluehor_rect.setY(400);
                                    pinkhor_rect.setY(-560);
                                    greenhor_rect.setY(400);
                                    redhor_rect.setY(-560);
//                                    sout("here me 2");
//                                    sout("horizontal  " + bluehor_rect.getY());

                                    obstacles.add(3);
                                }
                                if (rand_obstacle == 3) {
                                    collide_star3 = false;


//                            bluehor_rect.setY(0);
//                            pinkhor_rect.setY(-160);
//                            greenhor_rect.setY(0);
//                            redhor_rect.setY(-160);
                                    bluehor_rect.setY(400);
                                    pinkhor_rect.setY(-560);
                                    greenhor_rect.setY(400);
                                    redhor_rect.setY(-560);
                                    obstacles.add(rand_obstacle);
                                }
                                if (rand_obstacle == 4) {
                                    collide_star4 = false;

                                    star_circle4.setCenterY(-1000);

                                    blue_switch4.setCenterY(-100);
                                    red_switch4.setCenterY(-100);
                                    pink_switch4.setCenterY(-100);
                                    green_switch4.setCenterY(-100);


                                    left_bluesquare.setY(-574.0);
                                    left_redsquare.setY(-278.0);
                                    left_greensquare.setY(-426.0);
                                    left_pinksquare.setY(-130.0);

                                    right_pinksquare.setY(-130.0);
                                    right_redsquare.setY(-278.0);
                                    right_greensquare.setY(-426.0);
                                    right_bluesquare.setY(-574.0);
                                    obstacles.add(rand_obstacle);
                                }

                                circle_check = false;
                                horizontal_check = false;
                                vertical_check = true;
                                parallel_obstacle_check = false;

                            }
                        }

                        if (obstacles.get(obstacles.size() - 1) == 3) {

                            if (!horizontal_check && bluehor_rect.getY() > 300) {

                                int rand_obstacle = (int) ((Math.random() * 4) + 1);

//                        sout("Horizontal Previous Obstacle "+obstacles.get(obstacles.size() - 2) +"   "+ obstacles.get(obstacles.size() - 1));
                                if (obstacles.size() == 1) {
                                    while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == 1) {
                                        rand_obstacle = (int) ((Math.random() * 4) + 1);
                                    }
                                } else {
                                    while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == obstacles.get(obstacles.size() - 2) && rand_obstacle == 1) {
                                        rand_obstacle = (int) ((Math.random() * 4) + 1);
                                    }
                                }

                                if (rand_obstacle == 3) {
                                    if (obstacles.size() == 2) {
                                        int prev_obstacle = obstacles.get(1);

                                        if (prev_obstacle == 2) {
                                            rand_obstacle = 4;
                                        }
                                        if (prev_obstacle == 4) {
                                            rand_obstacle = 4;
                                        }
                                        if (prev_obstacle == 1) {
                                            rand_obstacle = 2;
                                        }
                                    } else {
                                        int prev_obstacle = obstacles.get(obstacles.size() - 2);

                                        if (prev_obstacle == 2) {
                                            rand_obstacle = 4;
                                        }
                                        if (prev_obstacle == 4) {
                                            rand_obstacle = 4;
                                        }
                                        if (prev_obstacle == 1) {
                                            rand_obstacle = 2;
                                        }
                                    }
                                }

//                                sout("Current obstacles ");
                                for (int i = 0; i < obstacles.size(); i++) {
                                    System.out.print(obstacles.get(i) + " ");
                                }
//                                sout();

//                                sout("horizontal " + rand_obstacle);


                                if (rand_obstacle == 1) {
                                    collide_star1 = false;
                                    obstacles.add(rand_obstacle);

                                    star_circle.setCenterY(-1000);

                                    blue_switch.setCenterY(-100);
                                    red_switch.setCenterY(-100);
                                    pink_switch.setCenterY(-100);
                                    green_switch.setCenterY(-100);

                                    circle_black.setCenterY(-350);
                                    arc1.setCenterY(-350);
                                    arc2.setCenterY(-350);
                                    arc3.setCenterY(-350);
                                    arc4.setCenterY(-350);

                                }
                                if (rand_obstacle == 2) {
                                    collide_star2 = false;
                                    obstacles.add(rand_obstacle);
                                    star_circle2.setCenterY(-1000);

                                    blue_switch2.setCenterY(-100);
                                    red_switch2.setCenterY(-100);
                                    pink_switch2.setCenterY(-100);
                                    green_switch2.setCenterY(-100);

                                    blue_rect.setY(-170);
                                    pink_rect.setY(-170);
                                    green_rect.setY(-170);
                                    red_rect.setY(-170);
                                }
                                if (rand_obstacle == 3) {
                                    collide_star1 = false;

                                    circle_black.setCenterY(-350);
                                    arc1.setCenterY(-350);
                                    arc2.setCenterY(-350);
                                    arc3.setCenterY(-350);
                                    arc4.setCenterY(-350);

                                    obstacles.add(1);

//                                    sout("here me 3");
//                                    sout("Circle  " + circle_black.getCenterY());

//                            bluehor_rect.setY(0);
//                            pinkhor_rect.setY(-160);
//                            greenhor_rect.setY(0);
//                            redhor_rect.setY(-160);
                                    bluehor_rect.setY(400);
                                    pinkhor_rect.setY(-560);
                                    greenhor_rect.setY(400);
                                    redhor_rect.setY(-560);
                                }
                                if (rand_obstacle == 4) {
                                    collide_star4 = false;
                                    obstacles.add(rand_obstacle);

                                    star_circle4.setCenterY(-1000);

                                    blue_switch4.setCenterY(-100);
                                    red_switch4.setCenterY(-100);
                                    pink_switch4.setCenterY(-100);
                                    green_switch4.setCenterY(-100);


                                    left_bluesquare.setY(-574.0);
                                    left_redsquare.setY(-278.0);
                                    left_greensquare.setY(-426.0);
                                    left_pinksquare.setY(-130.0);

                                    right_pinksquare.setY(-130.0);
                                    right_redsquare.setY(-278.0);
                                    right_greensquare.setY(-426.0);
                                    right_bluesquare.setY(-574.0);
                                }


                                circle_check = false;
                                horizontal_check = true;
                                vertical_check = false;
                                parallel_obstacle_check = false;
                            }
                        }


                        if (obstacles.get(obstacles.size() - 1) == 4) {

                            if (!parallel_obstacle_check && left_bluesquare.getY() > 670) {

                                int rand_obstacle = (int) ((Math.random() * 4) + 1);

//                        sout("Parallel Previous Obstacle "+obstacles.get(obstacles.size() - 2) +"   "+ obstacles.get(obstacles.size() - 1));
                                if (obstacles.size() == 1) {
                                    while (rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == 1) {
                                        rand_obstacle = (int) ((Math.random() * 4) + 1);
                                    }
                                } else {
                                    while (rand_obstacle == 1 && rand_obstacle == obstacles.get(obstacles.size() - 1) && rand_obstacle == obstacles.get(obstacles.size() - 2)) {
                                        rand_obstacle = (int) ((Math.random() * 4) + 1);
                                    }
                                }

                                if (rand_obstacle == 4) {
                                    if (obstacles.size() == 2) {
                                        int prev_obstacle = obstacles.get(1);

                                        if (prev_obstacle == 1) {
                                            rand_obstacle = 2;
                                        }
                                        if (prev_obstacle == 2) {
                                            rand_obstacle = 3;
                                        }
                                        if (prev_obstacle == 3) {
                                            rand_obstacle = 3;
                                        }
                                    } else {
                                        int prev_obstacle = obstacles.get(obstacles.size() - 2);

                                        if (prev_obstacle == 1) {
                                            rand_obstacle = 2;
                                        }
                                        if (prev_obstacle == 2) {
                                            rand_obstacle = 3;
                                        }
                                        if (prev_obstacle == 3) {
                                            rand_obstacle = 3;
                                        }
                                    }
                                }

//                                sout("Current obstacles ");
                                for (int i = 0; i < obstacles.size(); i++) {
                                    System.out.print(obstacles.get(i) + " ");
                                }
//                                sout();

//                                sout("parallel " + rand_obstacle);


                                if (rand_obstacle == 1) {
                                    collide_star1 = false;
                                    obstacles.add(rand_obstacle);

                                    star_circle.setCenterY(-1000);

                                    blue_switch.setCenterY(-100);
                                    red_switch.setCenterY(-100);
                                    pink_switch.setCenterY(-100);
                                    green_switch.setCenterY(-100);

                                    circle_black.setCenterY(-350);
                                    arc1.setCenterY(-350);
                                    arc2.setCenterY(-350);
                                    arc3.setCenterY(-350);
                                    arc4.setCenterY(-350);

                                }
                                if (rand_obstacle == 2) {
                                    collide_star2 = false;
                                    obstacles.add(rand_obstacle);

                                    star_circle2.setCenterY(-1000);

                                    blue_switch2.setCenterY(-100);
                                    red_switch2.setCenterY(-100);
                                    pink_switch2.setCenterY(-100);
                                    green_switch2.setCenterY(-100);

                                    blue_rect.setY(-170);
                                    pink_rect.setY(-170);
                                    green_rect.setY(-170);
                                    red_rect.setY(-170);
                                }
                                if (rand_obstacle == 3) {
                                    collide_star3 = false;


                                    obstacles.add(rand_obstacle);

//                            bluehor_rect.setY(0);
//                            pinkhor_rect.setY(-160);
//                            greenhor_rect.setY(0);
//                            redhor_rect.setY(-160z);
                                    bluehor_rect.setY(400);
                                    pinkhor_rect.setY(-560);
                                    greenhor_rect.setY(400);
                                    redhor_rect.setY(-560);
                                }
                                if (rand_obstacle == 4) {
                                    collide_star3 = false;

//                                    sout("here me 4");
                                    bluehor_rect.setY(400);
                                    pinkhor_rect.setY(-560);
                                    greenhor_rect.setY(400);
                                    redhor_rect.setY(-560);

                                    obstacles.add(3);

//                                    sout("here me 4");
//                                    sout("horizontal  " + bluehor_rect.getY());


                                    star_circle4.setCenterY(-1000);

                                    blue_switch4.setCenterY(-100);
                                    red_switch4.setCenterY(-100);
                                    pink_switch4.setCenterY(-100);
                                    green_switch4.setCenterY(-100);


                                    left_bluesquare.setY(-574.0);
                                    left_redsquare.setY(-278.0);
                                    left_greensquare.setY(-426.0);
                                    left_pinksquare.setY(-130.0);

                                    right_pinksquare.setY(-130.0);
                                    right_redsquare.setY(-278.0);
                                    right_greensquare.setY(-426.0);
                                    right_bluesquare.setY(-574.0);
                                }

                                circle_check = false;
                                horizontal_check = false;
                                vertical_check = false;
                                parallel_obstacle_check = true;
                            }
                        }

                        AtomicInteger atomicInteger = new AtomicInteger(1);

                        buttonnew.setOnKeyPressed(e -> {

                            Timeline animation5 = null;
                            Timeline animation6 = null;
                            Timeline animation7 = null;
                            Timeline animation8 = null;
                            Timeline animation9 = null;
                            Timeline animation10 = null;
                            Timeline animationi7 = null;
                            Timeline animationi8 = null;
                            Timeline animationi9 = null;
                            Timeline animationi10 = null;

                            switch (e.getCode()) {
                                case UP:
                                    atomicInteger.set(2);
                                    animation5 = new Timeline(
                                            new KeyFrame(Duration.ZERO, new KeyValue(ball_circle.centerYProperty(), ball_circle.getCenterY(), Interpolator.LINEAR)),
                                            new KeyFrame(Duration.seconds(150), new KeyValue(ball_circle.centerYProperty(), ball_circle.getCenterY() - 500000, Interpolator.LINEAR))
                                    );
                                    animation5.setCycleCount(1);
                                    animation5.play();

                                    for (int i = 0; i < obstacles.size(); i++) {
                                        int obstacle_number = obstacles.get(i);

                                        if (obstacle_number == 1) {
                                            Timeline animation_star = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(star_circle.centerYProperty(), star_circle.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(star_circle.centerYProperty(), star_circle.getCenterY() + 100, Interpolator.LINEAR))
                                            );
                                            animation_star.setCycleCount(1);
                                            animation_star.play();

                                            animationi7 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(blue_switch.centerYProperty(), blue_switch.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(blue_switch.centerYProperty(), blue_switch.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animationi8 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(red_switch.centerYProperty(), red_switch.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(red_switch.centerYProperty(), red_switch.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animationi9 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(green_switch.centerYProperty(), green_switch.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(green_switch.centerYProperty(), green_switch.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animationi10 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(pink_switch.centerYProperty(), pink_switch.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(pink_switch.centerYProperty(), pink_switch.getCenterY() + 100, Interpolator.LINEAR))
                                            );
                                            animationi7.setCycleCount(1);
                                            animationi7.play();
                                            animationi8.setCycleCount(1);
                                            animationi8.play();
                                            animationi9.setCycleCount(1);
                                            animationi9.play();
                                            animationi10.setCycleCount(1);
                                            animationi10.play();

                                            animation6 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(circle_black.centerYProperty(), circle_black.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(circle_black.centerYProperty(), circle_black.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation7 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(arc1.centerYProperty(), arc1.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(arc1.centerYProperty(), arc1.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation8 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(arc2.centerYProperty(), arc2.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(arc2.centerYProperty(), arc2.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation9 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(arc3.centerYProperty(), arc3.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(arc3.centerYProperty(), arc3.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation10 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(arc4.centerYProperty(), arc4.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(arc4.centerYProperty(), arc4.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation6.setCycleCount(1);
                                            animation6.play();
                                            animation7.setCycleCount(1);
                                            animation7.play();
                                            animation8.setCycleCount(1);
                                            animation8.play();
                                            animation9.setCycleCount(1);
                                            animation9.play();
                                            animation10.setCycleCount(1);
                                            animation10.play();


                                        }
                                        if (obstacle_number == 2) {
                                            Timeline animation_star = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(star_circle2.centerYProperty(), star_circle2.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(star_circle2.centerYProperty(), star_circle2.getCenterY() + 100, Interpolator.LINEAR))
                                            );
                                            animation_star.setCycleCount(1);
                                            animation_star.play();

                                            animation7 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(blue_switch2.centerYProperty(), blue_switch2.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(blue_switch2.centerYProperty(), blue_switch2.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation8 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(red_switch2.centerYProperty(), red_switch2.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(red_switch2.centerYProperty(), red_switch2.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation9 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(green_switch2.centerYProperty(), green_switch2.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(green_switch2.centerYProperty(), green_switch2.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation10 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(pink_switch2.centerYProperty(), pink_switch2.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(pink_switch2.centerYProperty(), pink_switch2.getCenterY() + 100, Interpolator.LINEAR))
                                            );
                                            animation7.setCycleCount(1);
                                            animation7.play();
                                            animation8.setCycleCount(1);
                                            animation8.play();
                                            animation9.setCycleCount(1);
                                            animation9.play();
                                            animation10.setCycleCount(1);
                                            animation10.play();

                                            Timeline animation11 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(pink_rect.yProperty(), pink_rect.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(2), new KeyValue(pink_rect.yProperty(), pink_rect.getY() + 200, Interpolator.LINEAR))
                                            );

                                            animation11.setCycleCount(Timeline.INDEFINITE);
                                            animation11.play();

                                            Timeline animation12 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(green_rect.yProperty(), green_rect.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(2), new KeyValue(green_rect.yProperty(), green_rect.getY() + 200, Interpolator.LINEAR))
                                            );

                                            animation12.setCycleCount(Timeline.INDEFINITE);
                                            animation12.play();

                                            Timeline animation13 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(red_rect.yProperty(), red_rect.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(2), new KeyValue(red_rect.yProperty(), red_rect.getY() + 200, Interpolator.LINEAR))
                                            );

                                            animation13.setCycleCount(Timeline.INDEFINITE);
                                            animation13.play();

                                            Timeline animation14 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(blue_rect.yProperty(), blue_rect.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(2), new KeyValue(blue_rect.yProperty(), blue_rect.getY() + 200, Interpolator.LINEAR))
                                            );

                                            animation14.setCycleCount(Timeline.INDEFINITE);
                                            animation14.play();

                                        }
                                        if (obstacle_number == 3) {

                                            Timeline animation121 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(redhor_rect.yProperty(), redhor_rect.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(redhor_rect.yProperty(), redhor_rect.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation121.play();
                                            Timeline animation131 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(bluehor_rect.yProperty(), bluehor_rect.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(bluehor_rect.yProperty(), bluehor_rect.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation131.play();
                                            Timeline animation141 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(greenhor_rect.yProperty(), greenhor_rect.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(greenhor_rect.yProperty(), greenhor_rect.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation141.play();
                                            Timeline animation151 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(pinkhor_rect.yProperty(), pinkhor_rect.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(pinkhor_rect.yProperty(), pinkhor_rect.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation151.play();

                                        }
                                        if (obstacle_number == 4) {
                                            Timeline animation_star = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(star_circle4.centerYProperty(), star_circle4.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(star_circle4.centerYProperty(), star_circle4.getCenterY() + 100, Interpolator.LINEAR))
                                            );
                                            animation_star.setCycleCount(1);
                                            animation_star.play();

                                            animation7 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(blue_switch4.centerYProperty(), blue_switch4.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(blue_switch4.centerYProperty(), blue_switch4.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation8 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(red_switch4.centerYProperty(), red_switch4.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(red_switch4.centerYProperty(), red_switch4.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation9 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(green_switch4.centerYProperty(), green_switch4.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(green_switch4.centerYProperty(), green_switch4.getCenterY() + 100, Interpolator.LINEAR))
                                            );

                                            animation10 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(pink_switch4.centerYProperty(), pink_switch4.getCenterY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(pink_switch4.centerYProperty(), pink_switch4.getCenterY() + 100, Interpolator.LINEAR))
                                            );
                                            animation7.setCycleCount(1);
                                            animation7.play();
                                            animation8.setCycleCount(1);
                                            animation8.play();
                                            animation9.setCycleCount(1);
                                            animation9.play();
                                            animation10.setCycleCount(1);
                                            animation10.play();


                                            Timeline animation121 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(left_redsquare.yProperty(), left_redsquare.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(left_redsquare.yProperty(), left_redsquare.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation121.play();
                                            Timeline animation131 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(left_bluesquare.yProperty(), left_bluesquare.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(left_bluesquare.yProperty(), left_bluesquare.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation131.play();
                                            Timeline animation141 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(left_greensquare.yProperty(), left_greensquare.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(left_greensquare.yProperty(), left_greensquare.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation141.play();
                                            Timeline animation151 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(left_pinksquare.yProperty(), left_pinksquare.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(left_pinksquare.yProperty(), left_pinksquare.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation151.play();


                                            Timeline animation1211 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(right_redsquare.yProperty(), right_redsquare.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(right_redsquare.yProperty(), right_redsquare.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation1211.play();
                                            Timeline animation1311 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(right_bluesquare.yProperty(), right_bluesquare.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(right_bluesquare.yProperty(), right_bluesquare.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation1311.play();
                                            Timeline animation1411 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(right_greensquare.yProperty(), right_greensquare.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(right_greensquare.yProperty(), right_greensquare.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation1411.play();
                                            Timeline animation1511 = new Timeline(
                                                    new KeyFrame(Duration.ZERO, new KeyValue(right_pinksquare.yProperty(), right_pinksquare.getY(), Interpolator.LINEAR)),
                                                    new KeyFrame(Duration.seconds(1), new KeyValue(right_pinksquare.yProperty(), right_pinksquare.getY() + 100, Interpolator.LINEAR))
                                            );

                                            animation1511.play();
                                        }
                                    }

//                            sout("Current obstacles ");
//                            for (int i = 0; i < obstacles.size(); i++) {
//                                System.out.print(obstacles.get(i)+" ");
//                            }
//
//                            sout();
//                            ArrayList<Integer> tobe_removed=new ArrayList<>();
//
//                            for (int i = 0; i < obstacles.size(); i++) {
//                                int obstacle_number=obstacles.get(i);
//
//                                if (obstacle_number==1){
//                                    if (circle_black.getCenterY()>480){
//                                        tobe_removed.add(i);
//                                    }
//                                }
//                                if (obstacle_number==2){
//                                    if (blue_rect.getY()>795){
//                                        tobe_removed.add(i);
//                                    }
//                                }
//                                if (obstacle_number==3){
//                                    if (bluehor_rect.getY()>805){
//                                        tobe_removed.add(i);
//                                    }
//                                }
//
//                                if (obstacle_number==4){
//                                    if (left_bluesquare.getY()>1200){
//                                        tobe_removed.add(i);
//                                    }
//                                }
//                            }
//
////                            for (int i = 0; i < tobe_removed.size()-1; i++) {
////                                if (obstacles.get(tobe_removed.get(i))!=obstacles.get(obstacles.size()-1)) {
////                                    obstacles.remove(tobe_removed.get(i));
////                                }
////                            }


                            }


                        });


                        if (atomicInteger.get() == 1) {
                            //sout("down");
                            Timeline animation5 = animation5 = new Timeline(
                                    new KeyFrame(Duration.ZERO, new KeyValue(ball_circle.centerYProperty(), ball_circle.getCenterY(), Interpolator.LINEAR)),
                                    new KeyFrame(Duration.seconds(1), new KeyValue(ball_circle.centerYProperty(), ball_circle.getCenterY() + 100, Interpolator.LINEAR))
                            );
                            animation5.play();

                            animation5.setCycleCount(1);

                        }


                        //ball colors

                        //1->red
                        //2->pinl
                        //3->green
                        //4->blue

                        if (ball_circle.getFill().equals(red_color)) {
                            ball_color = 1;
                        }
                        if (ball_circle.getFill().equals(pink_color)) {
                            ball_color = 2;
                        }
                        if (ball_circle.getFill().equals(green_color)) {
                            ball_color = 3;
                        }
                        if (ball_circle.getFill().equals(blue_color)) {
                            ball_color = 4;
                        }


                        //stars

                        istar1.setCircle_x(star_circle.getCenterX());
                        istar1.setCircle_y(star_circle.getCenterY());

                        istar2.setCircle_x(star_circle2.getCenterX());
                        istar2.setCircle_y(star_circle2.getCenterY());

                        istar3.setCircle_x(star_circle3.getCenterX());
                        istar3.setCircle_y(star_circle3.getCenterY());

                        istar4.setCircle_x(star_circle4.getCenterX());
                        istar4.setCircle_y(star_circle4.getCenterY());

                        //color cahnger

                        icolorrandom1.setArc1_x(red_switch.getCenterX());
                        icolorrandom1.setArc1_y(red_switch.getCenterY());

                        icolorrandom1.setArc2_x(pink_switch.getCenterX());
                        icolorrandom1.setArc2_y(pink_switch.getCenterY());

                        icolorrandom1.setArc3_x(green_switch.getCenterX());
                        icolorrandom1.setArc3_y(green_switch.getCenterY());

                        icolorrandom1.setArc4_x(blue_switch.getCenterX());
                        icolorrandom1.setArc4_y(blue_switch.getCenterY());


                        icolorrandom2.setArc1_x(red_switch2.getCenterX());
                        icolorrandom2.setArc1_y(red_switch2.getCenterY());

                        icolorrandom2.setArc2_x(pink_switch2.getCenterX());
                        icolorrandom2.setArc2_y(pink_switch2.getCenterY());

                        icolorrandom2.setArc3_x(green_switch2.getCenterX());
                        icolorrandom2.setArc3_y(green_switch2.getCenterY());

                        icolorrandom2.setArc4_x(blue_switch2.getCenterX());
                        icolorrandom2.setArc4_y(blue_switch2.getCenterY());


                        icolorrandom3.setArc1_x(red_switch3.getCenterX());
                        icolorrandom3.setArc1_y(red_switch3.getCenterY());

                        icolorrandom3.setArc2_x(pink_switch3.getCenterX());
                        icolorrandom3.setArc2_y(pink_switch3.getCenterY());

                        icolorrandom3.setArc3_x(green_switch3.getCenterX());
                        icolorrandom3.setArc3_y(green_switch3.getCenterY());

                        icolorrandom3.setArc4_x(blue_switch3.getCenterX());
                        icolorrandom3.setArc4_y(blue_switch3.getCenterY());

                        icolorrandom4.setArc1_x(red_switch4.getCenterX());
                        icolorrandom4.setArc1_y(red_switch4.getCenterY());

                        icolorrandom4.setArc2_x(pink_switch4.getCenterX());
                        icolorrandom4.setArc2_y(pink_switch4.getCenterY());

                        icolorrandom4.setArc3_x(green_switch4.getCenterX());
                        icolorrandom4.setArc3_y(green_switch4.getCenterY());

                        icolorrandom4.setArc4_x(blue_switch4.getCenterX());
                        icolorrandom4.setArc4_y(blue_switch4.getCenterY());


//                ball
                        iball.setX_position(ball_circle.getCenterX());
                        iball.setY_position(ball_circle.getCenterY());

                        //1->circle
                        //2->vertical line
                        //3->horizontal line
                        //4->8 obstacle


                        //circle
                        iobstacle1.setCircle_black_x(circle_black.getCenterX());
                        iobstacle1.setCircle_black_y(circle_black.getCenterY());

                        iobstacle1.setArc1_x(arc1.getCenterX());
                        iobstacle1.setArc1_y(arc1.getCenterY());

                        iobstacle1.setArc2_x(arc2.getCenterX());
                        iobstacle1.setArc2_y(arc2.getCenterY());

                        iobstacle1.setArc3_x(arc3.getCenterX());
                        iobstacle1.setArc3_y(arc3.getCenterY());

                        iobstacle1.setArc4_x(arc4.getCenterX());
                        iobstacle1.setArc4_y(arc4.getCenterY());

                        //vertical

                        iobstacle2.setBluerect_x(blue_rect.getX());
                        iobstacle2.setBluerect_y(blue_rect.getY());

                        iobstacle2.setGreenrect_x(green_rect.getX());
                        iobstacle2.setGreenrect_y(green_rect.getY());

                        iobstacle2.setPinkrect_x(pink_rect.getX());
                        iobstacle2.setPinkrect_y(pink_rect.getY());

                        iobstacle2.setRedrect_x(red_rect.getX());
                        iobstacle2.setRedrect_y(red_rect.getY());

                        //horizontal


                        iobstacle3.setBluerecthor_x(bluehor_rect.getX());
                        iobstacle3.setBluerecthor_y(bluehor_rect.getY());

                        iobstacle3.setGreenrecthor_x(greenhor_rect.getX());
                        iobstacle3.setGreenrecthor_y(greenhor_rect.getY());

                        iobstacle3.setPinkrecthor_x(pinkhor_rect.getX());
                        iobstacle3.setPinkrecthor_y(pinkhor_rect.getY());

                        iobstacle3.setRedrecthor_x(redhor_rect.getX());
                        iobstacle3.setRedrecthor_y(redhor_rect.getY());

                        //parallel

                        iobstacle4.setLeft_bluerecthor_x(left_bluesquare.getX());
                        iobstacle4.setLeft_bluerecthor_y(left_bluesquare.getY());

                        iobstacle4.setLeft_greenrecthor_x(left_greensquare.getX());
                        iobstacle4.setLeft_greenrecthor_y(left_greensquare.getY());

                        iobstacle4.setLeft_pinkrecthor_x(left_pinksquare.getX());
                        iobstacle4.setLeft_pinkrecthor_y(left_pinksquare.getY());

                        iobstacle4.setLeft_redrecthor_x(left_redsquare.getX());
                        iobstacle4.setLeft_redrecthor_y(left_redsquare.getY());

                        iobstacle4.setRight_bluerecthor_x(right_bluesquare.getX());
                        iobstacle4.setRight_bluerecthor_y(right_bluesquare.getY());

                        iobstacle4.setRight_greenrecthor_x(right_greensquare.getX());
                        iobstacle4.setRight_greenrecthor_y(right_greensquare.getY());

                        iobstacle4.setRight_pinkrecthor_x(right_pinksquare.getX());
                        iobstacle4.setRight_pinkrecthor_y(right_pinksquare.getY());

                        iobstacle4.setRight_redrecthor_x(right_redsquare.getX());
                        iobstacle4.setRight_redrecthor_y(right_redsquare.getY());
                        star_pont=Integer.parseInt(score_text.getText());


//
//
//
//                sout("check obstacle class "+obstacle1.getCircle_black_y());
                    }



                };
                timer.start();


            }


        }
        buttonnew.isFocused();


    }


//    public void exit() {
//        Platform.exit();
//    }





    private static Stage primaryStage=new Stage();


    public void playgame(String name) throws IOException {
        this.name=name;
//        sout("Name "+name);
//        primaryStage=new Stage();
        Button button =new Button();
        Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        button.setLayoutY(200);
        button.setLayoutX(20);
//        button.setText("Button");



        Image imag = new Image("pause.png");


        BackgroundImage bImag = new BackgroundImage(imag, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(button.getWidth(), button.getHeight(), true, true, true, false));

        Background backGroun = new Background(bImag);
        button.setBackground(backGroun);
        button.setPrefSize(120,120);


        button.setOnAction(e->{



            Pause_display(primaryStage);
        });


        root.getChildren().addAll(button);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();


    }




    public void exit() {


//        sout("exit "+name);
        primaryStage.close();


//        sout("In Exit");

        Stage stage=new Stage();
        stage.setWidth(600);
        stage.setHeight(600);
        Image game_over=new Image("gameover.png");
        ImageView view7=new ImageView(game_over);
        view7.setX(150);

        view7.setY(50);
        view7.setFitHeight(50);
        view7.setFitWidth(300);
        Button button5=new Button("Revive using Stars");
        button5.setLayoutX(150);
        button5.setLayoutY(300);
        button5.setStyle("-fx-background-color: #696969;-fx-background-radius: 15px ");
        button5.setTextFill(Color.WHITE);
        Font font1=Font.font("Bree Regular", FontWeight.BOLD, FontPosture.REGULAR,26);
        button5.setFont(font1);

        button5.setOnAction(e->{

            if (star_pont>=5) {
                star_pont=star_pont-5;
                serialize();
            }else {
                serialize();
            }
            if (star_pont>=5) {
                deseralize(name);
//                sout(data_input.getCircle_black_y());
                stage.close();
                try {
                    playgame(name);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }else {
                button5.setText("Can't Revive Please Press Exit");
            }


        });


        Button button6=new Button("Play Again");
        button6.setLayoutX(200);
        button6.setLayoutY(400);
        button6.setStyle("-fx-background-color: #696969;-fx-background-radius: 15px ");
        button6.setTextFill(Color.WHITE);
        button6.setFont(font1);

        button6.setOnAction(e->{

            try {
                File f= new File(name);
                f.delete();
            }finally {
                stage.close();

//                sout(obstacle1.getArc1_x());

                try {
                    Game game=new Game();
                    game.playgame(name);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }


        });



        Button button7=new Button("Exit");
        button7.setLayoutX(240);
        button7.setLayoutY(500);
        button7.setStyle("-fx-background-color: #696969;-fx-background-radius: 15px ");
        button7.setTextFill(Color.WHITE);
        button7.setFont(font1);
        button7.setOnAction(e->{
            stage.close();
            try {
                new App().start(new Stage());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Image pause_image=new Image("bg.png");
        ImageView pause_bg_view=new ImageView(pause_image);
        pause_bg_view.setFitWidth(400);
        pause_bg_view.setFitHeight(150);
        pause_bg_view.setY(130);
        pause_bg_view.setX(100);
        Group group=new Group();
        group.getChildren().addAll(button5,button6,button7,view7,pause_bg_view);
        Scene scene=new Scene(group,600,600,Color.BLACK);
        stage.setScene(scene);

        stage.show();
    }




    private static boolean ispaused=false;

    public void Pause_display(Stage stage1){

        ispaused=true;
        serialize();

//        sout("From check obstacle class "+obstacle1.getCircle_black_y());


        //return -1 if save and exit
        //return 0 if restart
        //return 1id resume

        Image game_pause=new Image("GAMEP.png");
        ImageView view7=new ImageView(game_pause);
        view7.setX(150);

        Stage stage=new Stage();
        view7.setY(50);
        view7.setFitHeight(50);
        view7.setFitWidth(300);
        Button button5=new Button("Resume Game");
        button5.setLayoutX(200);
        button5.setLayoutY(300);
        button5.setStyle("-fx-background-color: #696969;-fx-background-radius: 15px ");
        button5.setTextFill(Color.WHITE);
        Font font1=Font.font("Bree Regular",FontWeight.BOLD, FontPosture.REGULAR,26);
        button5.setFont(font1);
        button5.setOnAction(e->{
            deseralize(name);
//            sout(data_input.getCircle_black_y());
            stage.close();
            stage1.close();
            try {
                playgame(name);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        Button button6=new Button("Restart Game");
        button6.setLayoutX(200);
        button6.setLayoutY(400);
        button6.setStyle("-fx-background-color: #696969;-fx-background-radius: 15px ");
        button6.setTextFill(Color.WHITE);
        button6.setFont(font1);

        button6.setOnAction(e->{


            try {
                File f= new File(name);
                f.delete();
            }finally {
                stage1.close();
                stage.close();

//                sout(obstacle1.getArc1_x());

                try {

                    playgame(name);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }


        });

        Button button7=new Button("Save and exit");
        button7.setLayoutX(200);
        button7.setLayoutY(500);
        button7.setStyle("-fx-background-color: #696969;-fx-background-radius: 15px ");
        button7.setTextFill(Color.WHITE);
        button7.setFont(font1);
        Image pause_image=new Image("bg.PNG");
        ImageView pause_bg_view=new ImageView(pause_image);
        pause_bg_view.setFitWidth(400);
        pause_bg_view.setFitHeight(150);
        pause_bg_view.setY(130);
        pause_bg_view.setX(100);

        button7.setOnAction(e->{
            deseralize(name);
            stage.close();

            stage1.close();


            SavedGamed savedGamed=new SavedGamed();
            savedGamed.getSavedgames().add(data_input);

            try {
                stage1.close();
                new App().start(new Stage());
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        Button button_back=new Button();

        Image image_setting_back_icon = new Image("back.png", button_back.getWidth(), button_back.getHeight(), false, true, true);
        BackgroundImage bImage22 = new BackgroundImage(image_setting_back_icon, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(button_back.getWidth(), button_back.getHeight(), true, true, true, false));

        Background backGround_setting_back_background = new Background(bImage22);
        button_back.setBackground(backGround_setting_back_background);
        button_back.setLayoutX(20);
        button_back.setLayoutY(20);
        button_back.setPrefSize(60,60);
        button_back.setOnAction(e1->{
            stage.close();
        });

        Group root4=new Group();

        root4.getChildren().addAll(button5,button6,button7,view7,pause_bg_view,button_back);

        Scene scene4=new Scene(root4,600,600,Color.BLACK);
        stage.setScene(scene4);
        stage.show();

    }
}

