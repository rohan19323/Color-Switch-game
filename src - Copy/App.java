import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class App extends Application {
//    public void serialize(){
//        SavedGamed savedGamed=new SavedGamed();
//
//    }
    public void display(){
        Stage stage=new Stage();
        stage.setWidth(600);
        stage.setHeight(600);

        TextFlow textFlow=new TextFlow();
        Text text=new Text(50,50,"New Game");
        text.setFill(Color.WHITE);
        Font font = Font.font("Open Sans", FontPosture.ITALIC,20);
        //text.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        text.setFont(font);
        textFlow.getChildren().add(text);
        BackgroundFill backgroundFill=new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        Image image = new Image("circle2.png");
        ImageView imageView = new ImageView(image);

        //Setting the position of the image
        imageView.setX(100);
        imageView.setY(25);

        //setting the fit height and width of the image view
        imageView.setFitHeight(400);
        imageView.setFitWidth(400);

        RotateTransition rotateTransition1=new RotateTransition(Duration.seconds(200),imageView);
        rotateTransition1.setFromAngle(0);
        rotateTransition1.setToAngle(40000);
        //rotateTransition1.setCycleCount(100000000);
        rotateTransition1.setAutoReverse(false);

        rotateTransition1.play();


        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);

        //Creating a Group object
        Group root = new Group(imageView);
        //BackgroundImage myBI= new BackgroundImage(new Image("C:\\Users\\dell\\Downloads\\unnamed.png",32,32,false,true),
        //BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
        //BackgroundSize.DEFAULT);
        Button button1=new Button("New Game");



        button1.setLayoutX(220);
        button1.setLayoutY(230);
        //button1.setMaxWidth(100);
        //button1.setMinHeight(50);
        //button1.setWrapText(true);
        button1.setStyle("-fx-background-color: #696969; -fx-background-radius: 15px;-fx-font-size:28; -fx-text-fill: #ffffff");
//        button1.setStyle("-fx-font-size:20");
//        button1.setMaxWidth(1000);
//        button1.setMaxHeight(2000);


        button1.setOnAction(e ->{
            stage.close();

                Game game=new Game();
            try {
                game.playgame(name);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        });


        Button button2=new Button("Load Game");
        //Hyperlink button = new Hyperlink("Masti button");
        //button.setOnAction(e -> sout("Hyperlink clicked"));
        button2.setLayoutX(220);
        button2.setLayoutY(320);
        button2.setStyle("-fx-background-color: #696969; -fx-background-radius: 15px;-fx-font-size:28; -fx-text-fill: #ffffff");
        Button button3=new Button("Exit Game");
        button3.setLayoutX(223);
        button3.setLayoutY(408);
        button3.setStyle("-fx-background-color: #696969; -fx-background-radius: 15px;-fx-font-size:28; -fx-text-fill: #ffffff");
        button3.setOnAction(e->{
            stage.close();
            exitgame();
        });
        button2.setOnAction(e->{
            stage.close();
            try {
                loadgame();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        button1.setOnAction(e ->{
            try {
                stage.close();
                newgame();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
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
            try {
                start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


        root.getChildren().addAll(button1,button2,button3,button_back);

        //Creating a scene object
        Scene scene1 = new Scene(root, 600, 600,Color.BLACK);

        //Setting title to the Stage
        stage.setTitle("Color Switch");


        //Adding scene to the stage
        stage.setScene(scene1);
        stage.show();
    }
    private static String name;
    public void newgame() throws FileNotFoundException {
        Stage stage=new Stage();
        Image newgame=new Image("ng.png");
        ImageView new_gameview=new ImageView(newgame);
        new_gameview.setFitHeight(50);
        new_gameview.setFitWidth(300);
        new_gameview.setTranslateX(140);
        new_gameview.setTranslateY(25);
        Image new_image=new Image("bg.PNG");
        ImageView new_bg_view=new ImageView(new_image);
        new_bg_view.setFitWidth(400);
        new_bg_view.setFitHeight(150);
        new_bg_view.setY(130);
        new_bg_view.setX(100);
//        TextField textField=new TextField("Enter player name");
        javafx.scene.control.TextField textField=new TextField("Enter player name");
        textField.setLayoutX(150);
        textField.setLayoutY(350);
        textField.setFont(new Font("Open Sans",24));
        Button button4=new Button("Start");

        //button4.setOnAction(actionEvent -> stage.setScene(scene3));

        button4.setLayoutX(250);
        button4.setLayoutY(450);
        button4.setStyle("-fx-font-size:20");
        button4.setStyle("-fx-background-color: #696969;-fx-background-radius: 15px ");
        button4.setTextFill(Color.WHITE);
        Font font2= Font.font("Bree Regular", FontWeight.BOLD, FontPosture.REGULAR,26);
        button4.setFont(font2);


        if (textField.toString().length()!=0){
            button4.setOnAction(e ->{

                String getname=textField.getText();


                name=getname;


                stage.close();

                Game game=new Game();
                try {
                    game.playgame(getname);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
        }

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
            display();
        });


        Group root2 = new Group();
        root2.getChildren().addAll(new_gameview,new_bg_view, (Node) textField,button4,button_back);
        Scene scene2= new Scene(root2,600,600,Color.BLACK);
        stage.setScene(scene2);
        stage.show();
    }
    public void loadgame() throws IOException {

        Stage stage=new Stage();
        stage.setTitle("Color Switch");
        stage.setWidth(600);
        stage.setHeight(600);
        Pane root=new Pane();




        ImageView imageView=new ImageView("0.jpg");
        imageView.setFitHeight(600);
        imageView.setFitWidth(600);

        Label label3=new Label("LOAD GAME ");
        label3.setLayoutX(145);
        label3.setLayoutY(10);
        label3.setFont(new Font("Open Sans",58));
        label3.setStyle("-fx-text-fill: white;");

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
            display();
        });



        root.getChildren().addAll(imageView,label3,button_back);















        //remember to change path as submission name



        File directoryPath = new File("/Users/aakashyadav/Downloads/2019222_2019323_Deadline3");

        ArrayList<String> file_name=new ArrayList<>();
        //List of all files and directories
        String contents[] = directoryPath.list();
//        sout("List of files and directories in the specified directory:");
        for(int i=0; i<contents.length; i++) {

//            sout(contents[i]);
            if (!contents[i].equals("Color-Switch.iml")){
                if (!contents[i].equals("README.md")){
                    if (!contents[i].equals("Color_switch.iml")){
                        if (!contents[i].equals(".gitattributes")){
                            if (!contents[i].equals(".git")){
                                if (!contents[i].equals(".idea")){
                                    if (!contents[i].equals("src")) {

                                        if (!contents[i].equals("out")) {
                                            if (!contents[i].equals("2019222_2019323_Ap_Presentation.pdf"))
                                                file_name.add(contents[i]);
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

        ArrayList<Button> buttons=new ArrayList<>();

        int x=250;
        int y=100;


        for (int i = 0; i < file_name.size(); i++) {
            buttons.add(new Button());
//            sout(file_name.get(i));
            if(!file_name.get(i).equals(".DS_Store")) {

                Button button = buttons.get(i);
                button.setText(file_name.get(i));
                button.setLayoutX(x);
                button.setLayoutY(y);
                button.setPrefSize(100,50);

                y += 60;

                button.setOnAction(e -> {
                    Game game = new Game();
                    game.deseralize(button.getText());
                    try {
                        game.playgame(button.getText());
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }


                });
                root.getChildren().add(button);


            }

        }


        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void exitgame(){
        Stage stage=new Stage();
        stage.setTitle("Color Switch");
        stage.setWidth(600);
        stage.setHeight(600);
        Pane root=new Pane();

        ImageView imageView=new ImageView("exitgame.jpg");
        imageView.setFitHeight(600);
        imageView.setFitWidth(600);

//        Label label3=new Label("Are You sure ?");
//        label3.setLayoutX(140);
//        label3.setLayoutY(140);
//        label3.setFont(new Font("Open Sans",58));
//        label3.setStyle("-fx-text-fill: white;");

        ImageView imageView1=new ImageView("areyousure.png");
        imageView1.setLayoutY(160);

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
            display();
        });

        Button button1=new Button("YES");
        button1.setLayoutX(245);
        button1.setLayoutY(250);
        button1.setStyle("-fx-background-color: #696969; -fx-background-radius: 15px;-fx-font-size:28; -fx-text-fill: #ffffff");

        //button1.setWrapText(true);
        //button1.setStyle("-fx-background-color: #008B8B");
        //button1.setStyle("-fx-font-size:20");

        button1.setOnAction(e->{
            exit();
        });

        Button button2=new Button("NO");
        button2.setLayoutX(247);
        button2.setLayoutY(350);
        button2.setStyle("-fx-background-color: #696969; -fx-background-radius: 15px;-fx-font-size:28; -fx-text-fill: #ffffff");

        //button2.setWrapText(true);
        //button2.setStyle("-fx-background-color: #008B8B");
        //button2.setStyle("-fx-font-size:40");
        button2.setOnAction(e->{
            stage.close();
            display();
        });

        ImageView imageView2=new ImageView("bg.png");
        imageView2.setFitWidth(480);
        imageView2.setFitHeight(140);
        imageView2.setLayoutX(60);

        root.getChildren().addAll(imageView,imageView1,button_back,button1,button2,imageView2);



        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private static void exit() {
        Platform.exit();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Color Switch");
        stage.setWidth(600);
        stage.setHeight(600);
        Pane root=new Pane();

        BackgroundFill background_fill = new BackgroundFill(Color.web("#0f0909"),
                CornerRadii.EMPTY, Insets.EMPTY);




        ImageView imageView=new ImageView("setting.png");
        imageView.setFitHeight(30);
        imageView.setFitWidth(30);
        Button button=new Button();

        Image image2 = new Image("setting_final.png", button.getWidth(), button.getHeight(), false, true, true);
        BackgroundImage bImage2 = new BackgroundImage(image2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(button.getWidth(), button.getHeight(), true, true, true, false));

        Background backGround2 = new Background(bImage2);
        button.setBackground(backGround2);
        button.setLayoutX(20);
        button.setLayoutY(20);
        button.setPrefSize(60,60);
        //rotate
        button.setOnAction(e ->{
            Stage stage_setting=new Stage();
            stage_setting.setWidth(600);
            stage_setting.setHeight(600);
            Pane root_setting=new Pane();


            ImageView imageView_setting_back=new ImageView("back.png");
            imageView_setting_back.setFitHeight(30);
            imageView_setting_back.setFitWidth(30);
            Button button_setting_back=new Button();

            Image image_setting_back_icon = new Image("back.png", button_setting_back.getWidth(), button_setting_back.getHeight(), false, true, true);
            BackgroundImage bImage22 = new BackgroundImage(image_setting_back_icon, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(button_setting_back.getWidth(), button_setting_back.getHeight(), true, true, true, false));

            Background backGround_setting_back_background = new Background(bImage22);
            button_setting_back.setBackground(backGround_setting_back_background);
            button_setting_back.setLayoutX(20);
            button_setting_back.setLayoutY(20);
            button_setting_back.setPrefSize(60,60);
            button_setting_back.setOnAction(e1->{
                stage_setting.close();
            });

            ImageView imageView1=new ImageView("setting_2.gif");



            Label label3=new Label("SETTINGS");
            label3.setLayoutX(155);
            label3.setLayoutY(10);
            label3.setFont(new Font("Open Sans",70));
            label3.setStyle("-fx-text-fill: white;");




            root_setting.getChildren().addAll(imageView1,label3,button_setting_back);
            Background background_setting=new Background(background_fill);
            root_setting.setBackground(background_setting);

            Scene scene2=new Scene(root_setting);
            stage_setting.setScene(scene2);


            stage_setting.show();




        });

        Label label=new Label("C");
        label.setFont(new Font("Arial",70));

        label.setTextFill(Color.web("#faf8f7"));
        label.setLayoutX(155);
        label.setLayoutY(30);


        ImageView imageView1=new ImageView("circle.png");
        imageView1.setFitWidth(70);
        imageView1.setFitHeight(70);
        imageView1.setLayoutX(205);
        imageView1.setLayoutY(35);

        Label label2=new Label("L");
        label2.setFont(new Font("Arial",70));

        label2.setTextFill(Color.web("#faf8f7"));
        label2.setLayoutX(280);
        label2.setLayoutY(30);

        ImageView imageView2=new ImageView("circle.png");
        imageView2.setFitWidth(70);
        imageView2.setFitHeight(70);
        imageView2.setLayoutX(315);
        imageView2.setLayoutY(35);

        Label label3=new Label("R");
        label3.setFont(new Font("Arial",70));

        label3.setTextFill(Color.web("#faf8f7"));
        label3.setLayoutX(380);
        label3.setLayoutY(30);

        Label label4=new Label("SWITCH");
        label4.setFont(new Font("Arial",77));

        label4.setTextFill(Color.web("#faf8f7"));
        label4.setLayoutX(146);
        label4.setLayoutY(100);


        ImageView imageView3=new ImageView("play.png");
        imageView3.setFitWidth(150);
        imageView3.setFitHeight(150);
//        Button button1=new Button();
//        button1.setShape(new Circle(1.5));
//        button1.setGraphic(imageView3);
//        button1.setPrefSize(90,90);
//        button1.setLayoutX(200);
//        button1.setLayoutY(280);

        Button btnTest=new Button();
//        btnTest.setMinSize(146, 100);
//        btnTest.setMaxSize(146, 100);
        btnTest.setPrefSize(140,140);

        Image image = new Image("play.png", btnTest.getWidth(), btnTest.getHeight(), false, true, true);
        BackgroundImage bImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(btnTest.getWidth(), btnTest.getHeight(), true, true, true, false));

        Background backGround = new Background(bImage);
        btnTest.setBackground(backGround);
        btnTest.setLayoutX(212);
        btnTest.setLayoutY(290);

        //button1.setBackground(background_fill);

        ImageView imageView4=new ImageView("circle.png");
        imageView4.setFitWidth(185);
        imageView4.setFitHeight(190);
        imageView4.setLayoutX(190);
        imageView4.setLayoutY(266);

        ImageView imageView5=new ImageView("circle.png");
        imageView5.setFitWidth(245);
        imageView5.setFitHeight(245);
        imageView5.setLayoutX(160);
        imageView5.setLayoutY(240);

        ImageView imageView6=new ImageView("circle.png");
        imageView6.setFitWidth(325);
        imageView6.setFitHeight(320);
        imageView6.setLayoutX(122);
        imageView6.setLayoutY(203);


        ImageView imageView7=new ImageView("setting.png");
        imageView7.setFitHeight(30);
        imageView7.setFitWidth(30);
        Button button3=new Button();

        Image image4 = new Image("ques.png", button3.getWidth(), button3.getHeight(), false, true, true);
        BackgroundImage bImage4 = new BackgroundImage(image4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(button3.getWidth(), button3.getHeight(), true, true, true, false));



        Background backGround3 = new Background(bImage4);
        button3.setBackground(backGround3);
        button3.setLayoutX(520);
        button3.setLayoutY(500);
        button3.setPrefSize(66,66);


        button3.setOnAction(e ->{

            Stage stage_help=new Stage();
            stage_help.setWidth(600);
            stage_help.setHeight(600);
            Pane root_setting=new Pane();


            ImageView imageView_help_back=new ImageView("back.png");
            imageView_help_back.setFitHeight(30);
            imageView_help_back.setFitWidth(30);
            Button button_help_back=new Button();

            Image image_help_back_icon = new Image("back.png", button_help_back.getWidth(), button_help_back.getHeight(), false, true, true);
            BackgroundImage bImage22 = new BackgroundImage(image_help_back_icon, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(button_help_back.getWidth(), button_help_back.getHeight(), true, true, true, false));

            Background backGround_help_back_background = new Background(bImage22);
            button_help_back.setBackground(backGround_help_back_background);
            button_help_back.setLayoutX(20);
            button_help_back.setLayoutY(20);
            button_help_back.setPrefSize(60,60);
            button_help_back.setOnAction(e1->{
                stage_help.close();
            });

            FadeTransition textTransition = new FadeTransition(Duration.seconds(1.5), button_help_back);
            textTransition.setAutoReverse(true);
            textTransition.setFromValue(0);
            textTransition.setToValue(1);
            textTransition.setCycleCount(Transition.INDEFINITE);
            textTransition.play();

            

            ImageView imageView8=new ImageView("help.png");
            imageView8.setFitWidth(600);
            imageView8.setFitHeight(600);
            root_setting.getChildren().addAll(imageView8,button_help_back);
//            Background background_setting=new Background(background_fill);
//            root_setting.setBackground(background_setting);


            Scene scene2=new Scene(root_setting);
            //scene2.getStylesheets().add(getClass().getResource("help.css").toString());
            stage_help.setScene(scene2);


            stage_help.show();




        });



        RotateTransition rotateTransition=new RotateTransition(Duration.seconds(200),imageView2);
        rotateTransition.setFromAngle(0);
        rotateTransition.setToAngle(40000);
        //rotateTransition.setCycleCount(2);
        rotateTransition.setAutoReverse(false);


        rotateTransition.play();

//        Timeline animation = new Timeline(
//                new KeyFrame(Duration.ZERO, new KeyValue(imageView2.getOnRotationStarted(), imageView2.getStartAngle(), Interpolator.LINEAR)),
//                new KeyFrame(Duration.seconds(2), new KeyValue(arc.startAngleProperty(), arc.getStartAngle() - 360, Interpolator.LINEAR))
//        );
//        animation.setCycleCount(Animation.INDEFINITE);
//        animation.play();





        RotateTransition rotateTransition1=new RotateTransition(Duration.seconds(200),imageView1);
        rotateTransition1.setFromAngle(0);
        rotateTransition1.setToAngle(40000);
        //rotateTransition1.setCycleCount(100000000);
        rotateTransition1.setAutoReverse(false);

        rotateTransition1.play();

        RotateTransition rotateTransition2=new RotateTransition(Duration.seconds(200),imageView4);
        rotateTransition2.setFromAngle(40000);
        rotateTransition2.setToAngle(0);
        //rotateTransition2.setCycleCount(100000000);
        rotateTransition2.setAutoReverse(false);

        rotateTransition2.play();



        RotateTransition rotateTransition3=new RotateTransition(Duration.seconds(200),imageView5);
        rotateTransition3.setFromAngle(0);
        rotateTransition3.setToAngle(40000);
        //rotateTransition3.setCycleCount(100000000);
        rotateTransition3.setAutoReverse(false);

        rotateTransition3.play();

        RotateTransition rotateTransition4=new RotateTransition(Duration.seconds(200),imageView6);
        rotateTransition4.setFromAngle(20000);
        rotateTransition4.setToAngle(60000);
        //rotateTransition4.setCycleCount(100000000);
        rotateTransition4.setAutoReverse(false);

        rotateTransition4.play();

        RotateTransition rotateTransition5=new RotateTransition(Duration.seconds(200),button);
        rotateTransition5.setFromAngle(36000);
        rotateTransition5.setToAngle(0);
        //rotateTransition2.setCycleCount(100000000);
        rotateTransition5.setAutoReverse(false);

        rotateTransition5.play();

        RotateTransition rotateTransition6=new RotateTransition(Duration.seconds(200),button3);
        rotateTransition6.setFromAngle(36000);
        rotateTransition6.setToAngle(0);
        //rotateTransition2.setCycleCount(100000000);
        rotateTransition6.setAutoReverse(false);

        rotateTransition6.play();

        // create Background
        Background background = new Background(background_fill);

        btnTest.setOnAction(e ->{
            stage.close();
            display();
        });


        Button exit_button=new Button();
        Image exit_image = new Image("ques.png", exit_button.getWidth(), exit_button.getHeight(), false, true, true);
        BackgroundImage exit_bImage = new BackgroundImage(exit_image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(exit_button.getWidth(), exit_button.getHeight(), true, true, true, false));



        Background exit_backGround = new Background(exit_bImage);
        exit_button.setBackground(exit_backGround);
        exit_button.setLayoutX(520);
        exit_button.setLayoutY(500);
        exit_button.setPrefSize(66,66);
        exit_button.setOnAction(e->{
            exit();
        });
        // set background
        root.setBackground(background);
        root.getChildren().addAll(button,label,imageView1,label2,imageView2,label3,label4,btnTest
                                ,imageView4,imageView5,imageView6,button3);


        Scene scene=new Scene(root);
        stage.setScene(scene);


        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

