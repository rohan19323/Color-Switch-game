import javafx.scene.paint.Color;

public class Color_Change {
    public Color[] color;

    public Color AssignColor(){
        int color_number= (int) (Math.random() * 4);
        if (color_number==1){
            return color[0];
        }
        else if (color_number==2){
            return color[1];
        }
        if (color_number==3){
            return color[2];
        }
        return color[3];
    }

    Color_Change(){
        color=new Color[4];

        color[0]=Color.BLUE;
        color[1]=Color.YELLOW;
        color[2]=Color.PURPLE;
        color[3]=Color.PINK;
    }

}
