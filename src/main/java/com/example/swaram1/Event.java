package com.example.swaram1;


import animatefx.animation.FadeIn;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Event extends Application {
    Stage Windows;
    GridPane tickgp=new GridPane();
    Scene ticksc = new Scene(tickgp, 1540.0, 835.0);
    Label tick;
    Label ticnm;
    Label ticcls;
    Label ticseat;
    Label ticflino;
    Label ticfrom;
    Label ticto;

    Label ticprice;
    Label lblUname ;

    ComboBox cbo2 = new ComboBox();

    ComboBox cbo5 = new ComboBox();

    ComboBox<String> cb=new ComboBox<>();

    TextField te3=new TextField();

    TextField te1=new TextField();

    TextField te4=new TextField();

    GridPane paygp = new GridPane();
    Scene payscene;

    TextField t1;
    PasswordField p;
    Label loghomtxt = new Label();
    String UserName;
    Integer User_Id = 1;
    GridPane logingp = new GridPane();
    GridPane signupgp = new GridPane();

    TextField tfUserName;
    TextField tfPhone;
    TextField tfEmailId;
    PasswordField pf;
    PasswordField cpf;

    DatabaseConnection dbConnection;
    Connection connectDB;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    TextField bt1;
    ComboBox cbo1;
    TextField bt5;

    TextField bt6;

    Label bl6 = new Label("EMAIL : ");

    Label blt4 = new Label("YEAR  : ");
    Label bl5 = new Label("COLLEGE :");
    Label bl2 = new Label("USER NAME :");
    Label title, title1;
    Label screen, screen1, one,one1, two,two1,three1, three,four1, four, five,five1, six,six1, seven,seven1, eight,eight1, nine,nine1, ten,ten1;
    Label f1, f2,f3,f4;
    Label event,event1, time,time1, tickets,tickets1, total,total1, seats,seats1, event_ans,event_ans1, time_ans,time_ans1, tickets_ans,tickets_ans1, total_ans,total_ans1, seats_ans,seats_ans1, available,available1, sold,sold1, selected,selected1;
    Button book, b_available, b_sold, b_selected,book1,b_available1,b_sold1,b_selected1;

    Button r1c1, r1c2, r1c3, r1c4, r1c5, r1c6, r1c7, r1c8, r1c9, r1c10;
    Button r2c1, r2c2, r2c3, r2c4, r2c5, r2c6, r2c7, r2c8, r2c9, r2c10;
    Button r4c1, r4c2, r4c3, r4c4, r4c5, r4c6, r4c7, r4c8, r4c9, r4c10;
    Button r5c1, r5c2, r5c3, r5c4, r5c5, r5c6, r5c7, r5c8, r5c9, r5c10;
    Button r6c1, r6c2, r6c3, r6c4, r6c5, r6c6, r6c7, r6c8, r6c9, r6c10;
    Button r7c1, r7c2, r7c3, r7c4, r7c5, r7c6, r7c7, r7c8, r7c9, r7c10;
    Button r8c1, r8c2, r8c3, r8c4, r8c5, r8c6, r8c7, r8c8, r8c9, r8c10;
    Button r9c1, r9c2, r9c3, r9c4, r9c5, r9c6, r9c7, r9c8, r9c9, r9c10;
    Button r10c1, r10c2, r10c3, r10c4, r10c5, r10c6, r10c7, r10c8, r10c9, r10c10;

    String grey = "-fx-background-color:#B2BEB5";
    String green = "-fx-background-color:#32CD32";

    String[] btn = {"r1c1", "r1c2", "r1c3", "r1c4", "r1c5", "r1c6", "r1c7", "r1c8", "r1c9", "r1c10", "r2c1", "r2c2", "r2c3", "r2c4", "r2c5", "r2c6", "r2c7", "r2c8", "r2c9", "r2c10", "r4c1", "r4c2", "r4c3", "r4c4", "r4c5", "r4c6", "r4c7", "r4c8", "r4c9", "r4c10", "r5c1", "r5c2", "r5c3", "r5c4", "r5c5", "r5c6", "r5c7", "r5c8", "r5c9", "r5c10", "r6c1", "r6c2", "r6c3", "r6c4", "r6c5", "r6c6", "r6c7", "r6c8", "r6c9", "r6c10", "r7c1", "r7c2", "r7c3", "r7c4", "r7c5", "r7c6", "r7c7", "r7c8", "r7c9", "r7c10", "r8c1", "r8c2", "r8c3", "r8c4", "r8c5", "r8c6", "r8c7", "r8c8", "r8c9", "r8c10", "r9c1", "r9c2", "r9c3", "r9c4", "r9c5", "r9c6", "r9c7", "r9c8", "r9c9", "r9c10", "r10c1", "r10c2", "r10c3", "r10c4", "r10c5", "r10c6", "r10c7", "r10c8", "r10c9", "r10c10"};
    String[] btn_clr = {grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey, grey};
    Button[] all_btn = {r1c1, r1c2, r1c3, r1c4, r1c5, r1c6, r1c7, r1c8, r1c9, r1c10, r2c1, r2c2, r2c3, r2c4, r2c5, r2c6, r2c7, r2c8, r2c9, r2c10, r4c1, r4c2, r4c3, r4c4, r4c5, r4c6, r4c7, r4c8, r4c9, r4c10, r5c1, r5c2, r5c3, r5c4, r5c5, r5c6, r5c7, r5c8, r5c9, r5c10, r6c1, r6c2, r6c3, r6c4, r6c5, r6c6, r6c7, r6c8, r6c9, r6c10, r7c1, r7c2, r7c3, r7c4, r7c5, r7c6, r7c7, r7c8, r7c9, r7c10, r8c1, r8c2, r8c3, r8c4, r8c5, r8c6, r8c7, r8c8, r8c9, r8c10, r9c1, r9c2, r9c3, r9c4, r9c5, r9c6, r9c7, r9c8, r9c9, r9c10, r10c1, r10c2, r10c3, r10c4, r10c5, r10c6, r10c7, r10c8, r10c9, r10c10};
    Button[] selected_btn = new Button[90];

    String seats_val = "";
    int ticket = 0;
    int amount = 0;
    int count = 0;

    String clr;

    Stage window;


    public void setDisplay(Button b, int indx) {
        //get current color of button
        clr = btn_clr[indx];
        //if button is grey colored, then goes to this statement
        //this statement used to order a seat
        if (clr == grey) {
            b.setStyle(green);
            btn_clr[indx] = green;
            ticket++;
            if (indx < 100) {
                amount += 250;
                total_ans.setText(": Rs. " + amount);
            }
            //in last row seat should 20 $
            else {
                amount += 20;
                total_ans.setText(": Rs. " + amount);
            }
            tickets_ans.setText(": " + ticket);
            selected_btn[indx] = b;
            seats_val = ": ";
            for (int i = 0; i < 90; i++) {
                if (selected_btn[i] != null) {
                    seats_val += (btn[i] + " ");
                }
            }
            seats_ans.setText(seats_val);
        }
        //if button color is green, go to this statement
        //this statement used to remove order
        else if (clr == green) {
            b.setStyle(grey);
            btn_clr[indx] = grey;
            ticket--;
            if (indx < 90) {
                amount -= 250;
                total_ans.setText(": Rs. " + amount);
            }
            //in last row seat should 20 $
            else {
                amount -= 20;
                total_ans.setText(": Rs. " + amount);
            }
            tickets_ans.setText(": " + ticket);
            selected_btn[indx] = null;
            seats_val = ": ";
            for (int i = 0; i < 90; i++) {
                if (selected_btn[i] != null) {
                    seats_val += (btn[i] + " ");
                }
            }
            seats_ans.setText(seats_val);
        }

    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Windows = primaryStage;

//        -----------------------------------------LOGIN PAGE-------------------------------------------------------

        Scene logscene = new Scene(logingp, 1540, 835);
        FileInputStream input1 = new FileInputStream("images/blurcc.png");
        Image himage = new Image(input1);
        BackgroundImage backgroundimage = new BackgroundImage(himage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(new BackgroundImage[]{backgroundimage});
        logingp.setBackground(background);

        logingp.setHgap(18.0);
        logingp.setVgap(18.0);
        logingp.setAlignment(Pos.CENTER);

        Label st = new Label("S W A R A M");
        st.setFont(Font.font("Italic", 30.0));

        st.setStyle("-fx-font-weight: bold");
        st.setTextFill(Color.SALMON);
        st.setTextAlignment(TextAlignment.CENTER);

        KeyFrame kfP2 = new KeyFrame(Duration.seconds(1), new KeyValue(st.textFillProperty(), Color.PALEGOLDENROD));
        Timeline TIMER2 = new Timeline();
        TIMER2.getKeyFrames().add(kfP2);
        TIMER2.setCycleCount(Animation.INDEFINITE);          // Label Blinking
        TIMER2.setAutoReverse(true);
        TIMER2.play();
        logingp.addRow(0, st);
        st.setTranslateX(90);
        st.setTranslateY(-50);

        Label t = new Label("LOGIN");
        t.setFont(Font.font("SanSerif", 20.0));

        t.setStyle("-fx-font-weight: bold");
        t.setTextFill(Color.RED);
        t.setTextAlignment(TextAlignment.CENTER);
        logingp.addRow(1, t);
        t.setTranslateX(0);
        t.setTranslateY(0);
        Label nm = new Label("USER NAME :");
        nm.setFont(Font.font("SanSerif", 20.0));
        nm.setTextFill(Color.BLACK);
        nm.setStyle("-fx-font-weight: bold");
        t1 = new TextField();
        t1.setPromptText("Enter Username");
        Pattern loginpattern = Pattern.compile("[a-zA-Z.]*");
        UnaryOperator<TextFormatter.Change> loginfilter = (c) -> {
            return loginpattern.matcher(c.getControlNewText()).matches() ? c : null;
        };
        TextFormatter<String> loginformatter = new TextFormatter(loginfilter);
        t1.setTextFormatter(loginformatter);
        logingp.addRow(2, nm, t1);
        Label pass = new Label("PASSWORD :");
        pass.setFont(Font.font("SanSerif", 20.0));
        pass.setTextFill(Color.BLACK);
        pass.setStyle("-fx-font-weight: bold");
        p = new PasswordField();
        p.setPromptText("Your password");
        logingp.addRow(3, pass, p);
        final Button btnlogin = new Button("LOGIN");
        btnlogin.setFont(Font.font("SanSerif", 15.0));
        btnlogin.setStyle("-fx-background-color: #deb887");
        //btnlogin.setStyle("-fx-text-fill: #0000ff");
        btnlogin.setTranslateX(10.0);
        btnlogin.setTranslateY(20.0);

        final Button signup = new Button("SIGN UP");
        signup.setFont(Font.font("SanSerif", 15.0));
        signup.setStyle("-fx-background-color: #deb887");
        signup.setTranslateX(30.0);
        signup.setTranslateY(20.0);
        logingp.addRow(4, btnlogin, signup);

        signupgp.setHgap(20.0);
        signupgp.setVgap(20.0);


        signupgp.setAlignment(Pos.CENTER);

//        -------------------------------------------SIGNUP PAGE--------------------------------------

        FileInputStream input2 = new FileInputStream("images/blurcc.png");
        Image image = new Image(input2);
        BackgroundImage backgroundimage3 = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background3 = new Background(new BackgroundImage[]{backgroundimage3});
        signupgp.setBackground(background3);
        Label l0 = new Label("USER DETAILS :  ");
        l0.setFont(Font.font("SanSerif", 20.0));
        l0.setTextFill(Color.RED);
        l0.setStyle("-fx-font-weight: bold");
        signupgp.addRow(0, l0);
        Label l1 = new Label("NAME  : ");
        l1.setFont(Font.font("SanSerif", 20.0));
        l1.setTextFill(Color.BLACK);
        l1.setStyle("-fx-font-weight: bold");
        tfUserName = new TextField();
        tfUserName.setPromptText("Your Name");
        Pattern pattern = Pattern.compile("[a-zA-Z.]*");
        UnaryOperator<TextFormatter.Change> filter = (c) -> {
            return pattern.matcher(c.getControlNewText()).matches() ? c : null;
        };
        TextFormatter<String> formatter = new TextFormatter(filter);
        tfUserName.setTextFormatter(formatter);
        Label l2 = new Label("PHONE NUMBER  : ");
        l2.setFont(Font.font("SanSerif", 20.0));
        l2.setTextFill(Color.BLACK);
        l2.setStyle("-fx-font-weight: bold");
        tfPhone = new TextField();
        tfPhone.setPromptText("Your PhoneNumber");
        tfPhone.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    Event.this.tfPhone.setText(newValue.replaceAll("[^\\d]", ""));
                }

            }
        });
        new Label("\n");
        signupgp.addRow(1, l1, tfUserName);
        signupgp.addRow(2, l2, tfPhone);
        Label l10 = new Label("EMAIL ID  : ");
        l10.setFont(Font.font("SanSerif", 20.0));
        l10.setTextFill(Color.BLACK);
        l10.setStyle("-fx-font-weight: bold");
        tfEmailId = new TextField();
        tfEmailId.setPromptText("Your Email id");
        new Label("\n");
        signupgp.addRow(3, l10, tfEmailId);
        Label l11 = new Label("PASSWORD  : ");
        l11.setFont(Font.font("SanSerif", 20.0));
        l11.setTextFill(Color.BLACK);
        l11.setStyle("-fx-font-weight: bold");
        pf = new PasswordField();
        pf.setPromptText("Your password");
        signupgp.addRow(4, l11, pf);
        Label l12 = new Label("CONFIRM PASSWORD : ");
        l12.setFont(Font.font("SanSerif", 20.0));
        l12.setTextFill(Color.BLACK);
        l12.setStyle("-fx-font-weight: bold");
        cpf = new PasswordField();
        cpf.setPromptText("Your password");
        new Label("\n");
        signupgp.addRow(5, l12, cpf);
        Button res1 = new Button("RESET");
        res1.setFont(Font.font("SanSerif", 15.0));
        res1.setStyle("-fx-background-color: #deb887");
        res1.setTranslateX(50.0);
        res1.setTranslateY(.0);
        signupgp.addRow(6, res1);
        Button signup2 = new Button("SIGN UP");
        signup2.setFont(Font.font("SanSerif", 15.0));
        signup2.setStyle("-fx-background-color: #deb887");
        signup2.setTranslateX(10.0);
        signup2.setTranslateY(0.0);
        signupgp.addRow(6, signup2);
//        Label l13 = new Label("OR");
//        l13.setFont(Font.font("SanSerif", 20.0));
//        l13.setTextFill(Color.RED);
//        l13.setStyle("-fx-font-weight: bold");
//        l13.setTranslateX(170.0);
//        l13.setTranslateY(0.0);
//        signupgp.addRow(7, l13);
        Button gback = new Button("BACK");
        gback.setFont(Font.font("SanSerif", 15.0));
        gback.setStyle("-fx-background-color: #FF3C3C");
        gback.setTranslateX(80.0);
        gback.setTranslateY(-380.0);
        signupgp.addRow(6, gback);


        DropShadow shadow = new DropShadow();
        btnlogin.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        btnlogin.setEffect(shadow);
                    }
                });
        btnlogin.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        btnlogin.setEffect(null);
                    }
                });
        signup.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        signup.setEffect(shadow);
                    }
                });
        signup.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        signup.setEffect(null);
                    }
                });
        signup2.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        signup2.setEffect(shadow);
                    }
                });
        signup2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        signup2.setEffect(null);
                    }
                });
        gback.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        gback.setEffect(shadow);
                    }
                });
        gback.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        gback.setEffect(null);
                    }
                });
        res1.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        res1.setEffect(shadow);
                    }
                });
        res1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        res1.setEffect(null);
                    }
                });


        Scene signupsc = new Scene(signupgp, 1540, 835);
        signup.setOnAction((e) -> {

            Windows.setScene(signupsc);


        });
        gback.setOnAction((e) -> {
            tfUserName.clear();
            tfPhone.clear();

            tfEmailId.clear();
            pf.clear();
            cpf.clear();
            Windows.setScene(logscene);


        });
        res1.setOnAction((e) -> {


            this.tfUserName.clear();
            this.tfPhone.clear();
            this.tfEmailId.clear();
            this.pf.clear();
            this.cpf.clear();
        });


        signup2.setOnAction((e) -> {
            if (signup_validateFields() && signequals() & validatePassword() & validateEmail()) {

                registerUser();

                tfUserName.clear();
                tfPhone.clear();

                tfEmailId.clear();
                pf.clear();
                cpf.clear();

                Windows.setScene(logscene);

            }

        });
//--------------------------------------------------------HOME PAGE----------------------------------
        GridPane hmgrid = new GridPane();


        Label txt = new Label();
        txt.setText("S W A R A M  2K23 \uD83C\uDFA4 ♫ ");
        txt.setFont(Font.font("Sanserif", 60.0));
        txt.setTextFill(Color.BEIGE);
        txt.setTranslateX(100.0);
        txt.setTranslateY(110.0);
        hmgrid.addRow(1, new Node[]{txt});
        KeyFrame kfP = new KeyFrame(Duration.seconds(1), new KeyValue(txt.textFillProperty(), Color.RED));
        Timeline TIMER = new Timeline();
        TIMER.getKeyFrames().add(kfP);
        TIMER.setCycleCount(Animation.INDEFINITE);          // Label Blinking
        TIMER.setAutoReverse(true);
        TIMER.play();


        FlowPane hmfp = new FlowPane();
        BackgroundFill background_fill = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);
        Background background1 = new Background(new BackgroundFill[]{background_fill});
        hmfp.setBackground(background1);
        hmfp.setPrefWidth(200);

        loghomtxt.setFont(Font.font("SanSerif", 75.0));
        loghomtxt.setTranslateX(10.0);
        loghomtxt.setTranslateY(50.0);
        loghomtxt.setFont(Font.font("Sanserif", 30.0));
        loghomtxt.setTextFill(Color.BISQUE);
        hmfp.getChildren().add(loghomtxt);

        Button bookb1 = new Button("BOOK TICKETS");
        bookb1.setStyle("-fx-background-color: #FFD700");
        bookb1.setAlignment(Pos.BOTTOM_CENTER);
        bookb1.setTranslateX(0);
        bookb1.setTranslateY(200);
        bookb1.setPrefWidth(200);
        bookb1.setPrefHeight(20);
        hmfp.getChildren().add(bookb1);


        Button gal = new Button("GALLERY");
        gal.setStyle("-fx-background-color: #FFD700");
        gal.setAlignment(Pos.BOTTOM_CENTER);
        gal.setTranslateX(0);
        gal.setTranslateY(250);
        gal.setPrefWidth(200);
        gal.setPrefHeight(20);
        hmfp.getChildren().add(gal);



        Button canb = new Button("CANCELLATION");
        canb.setStyle("-fx-background-color: #FFD700");
        canb.setAlignment(Pos.BOTTOM_CENTER);
        canb.setTranslateX(0);
        canb.setTranslateY(300);
        canb.setPrefWidth(200);
        canb.setPrefHeight(20);
        hmfp.getChildren().add(canb);

        Button sigot = new Button(" \uD83D\uDD19     SIGN OUT");
        sigot.setStyle("-fx-background-color: #F18409");
        sigot.setAlignment(Pos.BOTTOM_CENTER);
        sigot.setTranslateX(0);
        sigot.setTranslateY(350);
        sigot.setPrefWidth(200);
        sigot.setPrefHeight(20);
        hmfp.getChildren().add(sigot);
        sigot.setOnAction((e) -> {
            Windows.setScene(logscene);
        });
//        canb.setOnAction((e) -> {
//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setTitle("Mode Of Payment - NetBanking");
//            alert.setHeaderText((String) null);
//            alert.setContentText("Transaction Successful");
//            alert.showAndWait();
//        });


//        Scene scene = new Scene(hmgrid, 320, 240);
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene1 = new Scene(fxmlLoader.load(), 320, 240);

        BorderPane hmborder = new BorderPane();
        hmborder.setCenter(hmgrid);

        hmborder.setLeft(hmfp);

        FileInputStream input4 = new FileInputStream("images/Homei.png");
        Image himage4 = new Image(input4);
        BackgroundImage backgroundimage4 = new BackgroundImage(himage4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background4 = new Background(new BackgroundImage[]{backgroundimage4});
        hmborder.setBackground(background4);

        Scene hmscene = new Scene(hmborder, 1540.0, 835.0);


//-------------------------------------Book page-----------------------------------


        GridPane bgr = new GridPane();
        FileInputStream binput = new FileInputStream("D://bblur.png");
        Image bimage = new Image(binput);
        BackgroundImage cbackgroundimage = new BackgroundImage(bimage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background cbackground = new Background(new BackgroundImage[]{cbackgroundimage});
        bgr.setBackground(cbackground);

        bgr.setHgap(18.0);
        bgr.setVgap(18.0);
        bgr.setAlignment(Pos.CENTER);

        Label bl1 = new Label("BOOKING DETAILS : ");
        bl1.setFont(Font.font("SanSerif", 25.0));
        bl1.setStyle("-fx-font-weight: bold");
        bl1.setTextFill(Color.RED);
        bl1.setTextAlignment(TextAlignment.CENTER);
        bgr.addRow(0, bl1);


        bl2.setFont(Font.font("SanSerif", 20.0));
        bl2.setTextFill(Color.BLACK);
        bl2.setStyle("-fx-font-weight: bold");
        bt1 = new TextField();
        bt1.setPromptText("Enter Username");
        Pattern loginpattern1 = Pattern.compile("[a-zA-Z]*");
        UnaryOperator<TextFormatter.Change> loginfilter1 = (c) -> {
            return loginpattern1.matcher(c.getControlNewText()).matches() ? c : null;
        };
        TextFormatter<String> loginformatter1 = new TextFormatter(loginfilter1);
        bt1.setTextFormatter(loginformatter1);
        bt1.setTranslateX(-60.0);
        bt1.setTranslateY(0.0);
        bgr.addRow(1, bl2, bt1);


        blt4.setFont(Font.font("SanSerif", 20.0));
        blt4.setTextFill(Color.BLACK);
        blt4.setStyle("-fx-font-weight: bold");
        ObservableList<Node> fPaneControls3 = bgr.getChildren();
        cbo1 = new ComboBox();
        cbo1.setPromptText("Select year  ");
        cbo1.setPrefSize(150.0, 20.0);
        ObservableList cboItems = this.cbo1.getItems();

        for (int i = 1; i < 5; ++i) {
            cboItems.add(i);
        }

        fPaneControls3.add(cbo1);
        cbo1.setVisibleRowCount(2);
        bgr.addRow(2, blt4);
        cbo1.setTranslateX(200.0);
        cbo1.setTranslateY(100.0);


        bl5.setFont(Font.font("SanSerif", 20.0));
        bl5.setTextFill(Color.BLACK);
        bl5.setStyle("-fx-font-weight: bold");
        bt5 = new TextField();
        bt5.setPromptText("Enter collegename");
        Pattern loginpattern2 = Pattern.compile("[a-zA-Z]*");
        UnaryOperator<TextFormatter.Change> loginfilter2 = (c) -> {
            return loginpattern2.matcher(c.getControlNewText()).matches() ? c : null;
        };
        TextFormatter<String> loginformatter2 = new TextFormatter(loginfilter2);
        bt5.setTextFormatter(loginformatter2);
        bt5.setTranslateX(-60.0);
        bt5.setTranslateY(0.0);
        bgr.addRow(3, bl5, bt5);

        bl6.setFont(Font.font("SanSerif", 20.0));
        bl6.setTextFill(Color.BLACK);
        bl6.setStyle("-fx-font-weight: bold");
//        bl6.setTranslateX(175.0);
//        bl6.setTranslateY(-5.0);
        bt6 = new TextField();
        bt6.setPromptText("Enter EmailId");
        bt6.setTranslateX(-60.0);
        bt6.setTranslateY(-5.0);

        bgr.addRow(4, bl6, bt6);



        Button nw = new Button("   BACK   ");
        nw.setFont(Font.font("SanSerif", 15.0));
        nw.setStyle("-fx-background-color: #ff0000");
        nw.setTranslateX(50.0);
        nw.setTranslateY(0.0);
        bgr.addRow(5, nw);



        Button md = new Button("    BOOK    ");
        md.setFont(Font.font("SanSerif", 15.0));
        md.setStyle("-fx-background-color: #deb887");
        md.setTranslateX(-60.0);
        md.setTranslateY(0.0);
        bgr.addRow(5, md);

        Scene bookscene = new Scene(bgr, 1540, 835);
//        -------------------------------------SEAT Booking----------------------------------


        title = new Label("CONVENTION CENTRE");
        title.setPrefSize(500, 80);
        title.setAlignment(Pos.CENTER);
        title.setFont(new Font("Lucida Sans Unicode", 25));

        //design screen label
        screen = new Label("STAGE");
        screen.setStyle("-fx-background-color: #FFA500");
        screen.setPrefSize(348, 35);
        screen.setAlignment(Pos.CENTER);
        screen.setFont(new Font("Verdana", 15));
        screen.setTextFill(Color.rgb(255, 255, 255));
        f1 = new Label("");
        f1.setPrefSize(15, 35);

        int[] label_btn = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //design buttons in initially
        for (int i = 0; i < 90; i++) {
            all_btn[i] = new Button(label_btn[i] + "");
            all_btn[i].setPrefSize(30, 35);
            all_btn[i].setStyle(grey);
            all_btn[i].setTextFill(Color.rgb(255, 255, 255));
        }

        one = new Label("1");
        one.setPrefSize(15, 35);

        two = new Label("2");
        two.setPrefSize(15, 35);

        three = new Label(" ");
        three.setPrefSize(10, 15);

        four = new Label("3");
        four.setPrefSize(15, 35);

        five = new Label("4");
        five.setPrefSize(15, 35);

        six = new Label("5");
        six.setPrefSize(15, 35);

        seven = new Label("6");
        seven.setPrefSize(15, 35);

        eight = new Label("7");
        eight.setPrefSize(15, 35);

        nine = new Label("8");
        nine.setPrefSize(15, 35);

        ten = new Label("9");
        ten.setPrefSize(15, 35);
        f2 = new Label(" ");
        f2.setPrefSize(65, 35);

        HBox hb1 = new HBox();
        HBox hb2 = new HBox();
        HBox hb3 = new HBox();
        HBox hb4 = new HBox();
        HBox hb5 = new HBox();
        HBox hb6 = new HBox();
        HBox hb7 = new HBox();
        HBox hb8 = new HBox();
        HBox hb9 = new HBox();
        HBox hb10 = new HBox();

        //grouping rows
        hb1.getChildren().addAll(one, all_btn[0], all_btn[1], all_btn[2], all_btn[3], all_btn[4], all_btn[5], all_btn[6], all_btn[7], all_btn[8], all_btn[9]);
        hb1.setSpacing(5);
        hb1.setPadding(new Insets(5, 5, 5, 20));

        hb2.getChildren().addAll(two, all_btn[10], all_btn[11], all_btn[12], all_btn[13], all_btn[14], all_btn[15], all_btn[16], all_btn[17], all_btn[18], all_btn[19]);
        hb2.setSpacing(5);
        hb2.setPadding(new Insets(5, 5, 5, 20));

        hb3.getChildren().add(three);
        hb3.setSpacing(5);
        hb3.setPadding(new Insets(5, 45, 5, 20));

        hb4.getChildren().addAll(four, all_btn[20], all_btn[21], all_btn[22], all_btn[23], all_btn[24], all_btn[25], all_btn[26], all_btn[27], all_btn[28], all_btn[29]);
        hb4.setSpacing(5);
        hb4.setPadding(new Insets(5, 45, 5, 20));

        hb5.getChildren().addAll(five, all_btn[30], all_btn[31], all_btn[32], all_btn[33], all_btn[34], all_btn[35], all_btn[36], all_btn[37], all_btn[38], all_btn[39]);
        hb5.setSpacing(5);
        hb5.setPadding(new Insets(5, 45, 5, 20));

        hb6.getChildren().addAll(six, all_btn[40], all_btn[41], all_btn[42], all_btn[43], all_btn[44], all_btn[45], all_btn[46], all_btn[47], all_btn[48], all_btn[49]);
        hb6.setSpacing(5);
        hb6.setPadding(new Insets(5, 45, 5, 20));

        hb7.getChildren().addAll(seven, all_btn[50], all_btn[51], all_btn[52], all_btn[53], all_btn[54], all_btn[55], all_btn[56], all_btn[57], all_btn[58], all_btn[59]);
        hb7.setSpacing(5);
        hb7.setPadding(new Insets(5, 45, 5, 20));

        hb8.getChildren().addAll(eight, all_btn[60], all_btn[61], all_btn[62], all_btn[63], all_btn[64], all_btn[65], all_btn[66], all_btn[67], all_btn[68], all_btn[69]);
        hb8.setSpacing(5);
        hb8.setPadding(new Insets(5, 45, 5, 20));

        hb9.getChildren().addAll(nine, all_btn[70], all_btn[71], all_btn[72], all_btn[73], all_btn[74], all_btn[75], all_btn[76], all_btn[77], all_btn[78], all_btn[79]);
        hb9.setSpacing(5);
        hb9.setPadding(new Insets(5, 45, 5, 20));

//        hb10.getChildren().addAll(ten,all_btn[80],all_btn[81],all_btn[82],all_btn[83],all_btn[84],all_btn[85],all_btn[86],all_btn[87],all_btn[88],all_btn[89]);
//        hb10.setSpacing(5);
//        hb10.setPadding(new Insets(5,45,5,20));

        HBox scn = new HBox();
        scn.getChildren().addAll(f1, screen);
        scn.setSpacing(5);
        scn.setPadding(new Insets(5, 10, 20, 20));

        //grouping left side of design
        VBox vb1 = new VBox();
        vb1.setAlignment(Pos.CENTER);
        vb1.setMinSize(430, 0);
        vb1.getChildren().addAll(scn, hb1, hb2, hb3, hb4, hb5, hb6, hb7, hb8, hb9);

        //event handling to buttons
        all_btn[0].setOnAction(e -> setDisplay(all_btn[0], 0));
        all_btn[1].setOnAction(e -> setDisplay(all_btn[1], 1));
        all_btn[2].setOnAction(e -> setDisplay(all_btn[2], 2));
        all_btn[3].setOnAction(e -> setDisplay(all_btn[3], 3));
        all_btn[4].setOnAction(e -> setDisplay(all_btn[4], 4));
        all_btn[5].setOnAction(e -> setDisplay(all_btn[5], 5));
        all_btn[6].setOnAction(e -> setDisplay(all_btn[6], 6));
        all_btn[7].setOnAction(e -> setDisplay(all_btn[7], 7));
        all_btn[8].setOnAction(e -> setDisplay(all_btn[8], 8));
        all_btn[9].setOnAction(e -> setDisplay(all_btn[9], 9));
        all_btn[10].setOnAction(e -> setDisplay(all_btn[10], 10));
        all_btn[11].setOnAction(e -> setDisplay(all_btn[11], 11));
        all_btn[12].setOnAction(e -> setDisplay(all_btn[12], 12));
        all_btn[13].setOnAction(e -> setDisplay(all_btn[13], 13));
        all_btn[14].setOnAction(e -> setDisplay(all_btn[14], 14));
        all_btn[15].setOnAction(e -> setDisplay(all_btn[15], 15));
        all_btn[16].setOnAction(e -> setDisplay(all_btn[16], 16));
        all_btn[17].setOnAction(e -> setDisplay(all_btn[17], 17));
        all_btn[18].setOnAction(e -> setDisplay(all_btn[18], 18));
        all_btn[19].setOnAction(e -> setDisplay(all_btn[19], 19));
        all_btn[20].setOnAction(e -> setDisplay(all_btn[20], 20));
        all_btn[21].setOnAction(e -> setDisplay(all_btn[21], 21));
        all_btn[22].setOnAction(e -> setDisplay(all_btn[22], 22));
        all_btn[23].setOnAction(e -> setDisplay(all_btn[23], 23));
        all_btn[24].setOnAction(e -> setDisplay(all_btn[24], 24));
        all_btn[25].setOnAction(e -> setDisplay(all_btn[25], 25));
        all_btn[26].setOnAction(e -> setDisplay(all_btn[26], 26));
        all_btn[27].setOnAction(e -> setDisplay(all_btn[27], 27));
        all_btn[28].setOnAction(e -> setDisplay(all_btn[28], 28));
        all_btn[29].setOnAction(e -> setDisplay(all_btn[29], 29));
        all_btn[30].setOnAction(e -> setDisplay(all_btn[30], 30));
        all_btn[31].setOnAction(e -> setDisplay(all_btn[31], 31));
        all_btn[32].setOnAction(e -> setDisplay(all_btn[32], 32));
        all_btn[33].setOnAction(e -> setDisplay(all_btn[33], 33));
        all_btn[34].setOnAction(e -> setDisplay(all_btn[34], 34));
        all_btn[35].setOnAction(e -> setDisplay(all_btn[35], 35));
        all_btn[36].setOnAction(e -> setDisplay(all_btn[36], 36));
        all_btn[37].setOnAction(e -> setDisplay(all_btn[37], 37));
        all_btn[38].setOnAction(e -> setDisplay(all_btn[38], 38));
        all_btn[39].setOnAction(e -> setDisplay(all_btn[39], 39));
        all_btn[40].setOnAction(e -> setDisplay(all_btn[40], 40));
        all_btn[41].setOnAction(e -> setDisplay(all_btn[41], 41));
        all_btn[42].setOnAction(e -> setDisplay(all_btn[42], 42));
        all_btn[43].setOnAction(e -> setDisplay(all_btn[43], 43));
        all_btn[44].setOnAction(e -> setDisplay(all_btn[44], 44));
        all_btn[45].setOnAction(e -> setDisplay(all_btn[45], 45));
        all_btn[46].setOnAction(e -> setDisplay(all_btn[46], 46));
        all_btn[47].setOnAction(e -> setDisplay(all_btn[47], 47));
        all_btn[48].setOnAction(e -> setDisplay(all_btn[48], 48));
        all_btn[49].setOnAction(e -> setDisplay(all_btn[49], 49));
        all_btn[50].setOnAction(e -> setDisplay(all_btn[50], 50));
        all_btn[51].setOnAction(e -> setDisplay(all_btn[51], 51));
        all_btn[52].setOnAction(e -> setDisplay(all_btn[52], 52));
        all_btn[53].setOnAction(e -> setDisplay(all_btn[53], 53));
        all_btn[54].setOnAction(e -> setDisplay(all_btn[54], 54));
        all_btn[55].setOnAction(e -> setDisplay(all_btn[55], 55));
        all_btn[56].setOnAction(e -> setDisplay(all_btn[56], 56));
        all_btn[57].setOnAction(e -> setDisplay(all_btn[57], 57));
        all_btn[58].setOnAction(e -> setDisplay(all_btn[58], 58));
        all_btn[59].setOnAction(e -> setDisplay(all_btn[59], 59));
        all_btn[60].setOnAction(e -> setDisplay(all_btn[60], 60));
        all_btn[61].setOnAction(e -> setDisplay(all_btn[61], 61));
        all_btn[62].setOnAction(e -> setDisplay(all_btn[62], 62));
        all_btn[63].setOnAction(e -> setDisplay(all_btn[63], 63));
        all_btn[64].setOnAction(e -> setDisplay(all_btn[64], 64));
        all_btn[65].setOnAction(e -> setDisplay(all_btn[65], 65));
        all_btn[66].setOnAction(e -> setDisplay(all_btn[66], 66));
        all_btn[67].setOnAction(e -> setDisplay(all_btn[67], 67));
        all_btn[68].setOnAction(e -> setDisplay(all_btn[68], 68));
        all_btn[69].setOnAction(e -> setDisplay(all_btn[69], 69));
        all_btn[70].setOnAction(e -> setDisplay(all_btn[70], 70));
        all_btn[71].setOnAction(e -> setDisplay(all_btn[71], 71));
        all_btn[72].setOnAction(e -> setDisplay(all_btn[72], 72));
        all_btn[73].setOnAction(e -> setDisplay(all_btn[73], 73));
        all_btn[74].setOnAction(e -> setDisplay(all_btn[74], 74));
        all_btn[75].setOnAction(e -> setDisplay(all_btn[75], 75));
        all_btn[76].setOnAction(e -> setDisplay(all_btn[76], 76));
        all_btn[77].setOnAction(e -> setDisplay(all_btn[77], 77));
        all_btn[78].setOnAction(e -> setDisplay(all_btn[78], 78));
        all_btn[79].setOnAction(e -> setDisplay(all_btn[79], 79));
        all_btn[80].setOnAction(e -> setDisplay(all_btn[80], 80));
        all_btn[81].setOnAction(e -> setDisplay(all_btn[81], 81));
        all_btn[82].setOnAction(e -> setDisplay(all_btn[82], 82));
        all_btn[83].setOnAction(e -> setDisplay(all_btn[83], 83));
        all_btn[84].setOnAction(e -> setDisplay(all_btn[84], 84));
        all_btn[85].setOnAction(e -> setDisplay(all_btn[85], 85));
        all_btn[86].setOnAction(e -> setDisplay(all_btn[86], 86));
        all_btn[87].setOnAction(e -> setDisplay(all_btn[87], 87));
        all_btn[88].setOnAction(e -> setDisplay(all_btn[88], 88));
        all_btn[89].setOnAction(e -> setDisplay(all_btn[89], 89));

        event = new Label("Event");
        event.setFont(new Font("Verdana", 14));
        event.setTextFill(Color.rgb(255, 165, 0));
        event.setPrefSize(70, 25);

        time = new Label("Time");
        time.setFont(new Font("Verdana", 14));
        time.setTextFill(Color.rgb(255, 165, 0));
        time.setPrefSize(70, 25);

        tickets = new Label("Tickets");
        tickets.setFont(new Font("Verdana", 14));
        tickets.setTextFill(Color.rgb(255, 165, 0));
        tickets.setPrefSize(70, 25);

        total = new Label("Total");
        total.setFont(new Font("Verdana", 14));
        total.setTextFill(Color.rgb(255, 165, 0));
        total.setPrefSize(70, 25);

        seats = new Label("Seats");
        seats.setFont(new Font("Verdana", 14));
        seats.setTextFill(Color.rgb(255, 165, 0));
        seats.setPrefSize(70, 25);

        event_ans = new Label(": SWARAM2K23");
        event_ans.setFont(new Font("Verdana", 14));
        event_ans.setPrefSize(200, 25);

        time_ans = new Label(": August 12, 10:30");
        time_ans.setFont(new Font("Verdana", 14));
        time_ans.setPrefSize(500, 25);

        tickets_ans = new Label(": 0");
        tickets_ans.setFont(new Font("Verdana", 14));
        tickets_ans.setPrefSize(200, 25);

        total_ans = new Label(": Rs. 0");
        total_ans.setFont(new Font("Verdana", 14));
        total_ans.setPrefSize(200, 25);

        seats_ans = new Label(": ");
        seats_ans.setFont(new Font("Verdana", 14));
        seats_ans.setPrefSize(2200, 25);

        //customize book now button
        book = new Button("Book now");
        book.setStyle("-fx-background-color: #FFA500");
        book.setTextFill(Color.rgb(255, 255, 255));
        book.setFont(new Font("Verdana", 14));
        book.setPadding(new Insets(8, 8, 8, 8));
        //handle event in book now button
        book.setOnAction(e -> {
            for (int i = 0; i < 90; i++) {
                if (selected_btn[i] != null) {
                    selected_btn[i].setStyle("-fx-background-color:#EE4B2B");
                    //after sold a seat, remove event handle part corresponding button
                    selected_btn[i].setOnAction(f -> {
                    });
                }
            }
            SaveTicketDetails();
            tickets_ans.setText(": 0");
            total_ans.setText(": Rs. 0");
            seats_ans.setText(": ");
            seats_val = ": ";
            count += ticket;
            //when after all seats were booked, disable book now button
            if (count == all_btn.length) {
                book.setDisable(true);
            }
            ticket = 0;
            amount = 0;
            Button[] temp_btn = new Button[90];
            selected_btn = temp_btn;

            Windows.setScene(payscene);
        });

        b_available = new Button();
        b_available.setStyle("-fx-background-color:#B2BEB5");
        b_available.setPrefSize(30, 35);

        b_sold = new Button();
        b_sold.setStyle("-fx-background-color:#EE4B2B");
        b_sold.setPrefSize(30, 35);

        b_selected = new Button();
        b_selected.setStyle("-fx-background-color:#32CD32");
        b_selected.setPrefSize(30, 35);

        available = new Label("Available");
        available.setFont(new Font("Verdana", 14));
        available.setAlignment(Pos.CENTER_LEFT);
        available.setPadding(new Insets(7, 50, 5, 3));

        sold = new Label("Sold");
        sold.setFont(new Font("Verdana", 14));
        sold.setAlignment(Pos.CENTER_LEFT);
        sold.setPadding(new Insets(7, 50, 5, 3));

        selected = new Label("Selected");
        selected.setFont(new Font("Verdana", 14));
        selected.setAlignment(Pos.CENTER_LEFT);
        selected.setPadding(new Insets(7, 50, 5, 3));

        //grouping right hand side in showing screen
        VBox temp1 = new VBox();
        temp1.getChildren().addAll(event, time, tickets, total, seats);
        temp1.setMinSize(70, 0);

        VBox temp2 = new VBox();
        temp2.getChildren().addAll(event_ans, time_ans, tickets_ans, total_ans, seats_ans);
        temp2.setMinSize(70, 0);

        HBox h1 = new HBox();
        h1.getChildren().addAll(temp1, temp2);
        h1.setPadding(new Insets(5, 5, 5, 5));
        h1.setSpacing(10);

        HBox h6 = new HBox();
        h6.getChildren().add(book);
        h6.setPadding(new Insets(20, 5, 20, 5));
        h6.setSpacing(10);

        HBox h7 = new HBox();
        h7.getChildren().addAll(b_available, available);
        h7.setPadding(new Insets(5, 5, 5, 5));
        h7.setSpacing(10);

        HBox h8 = new HBox();
        h8.getChildren().addAll(b_sold, sold);
        h8.setPadding(new Insets(5, 5, 5, 5));
        h8.setSpacing(10);

        HBox h9 = new HBox();
        h9.getChildren().addAll(b_selected, selected);
        h9.setPadding(new Insets(5, 5, 5, 5));
        h9.setSpacing(10);

        //separate left and right side using separator
        Separator s = new Separator();
        s.setOrientation(Orientation.VERTICAL);
        s.setMinSize(20, 0);

        VBox vb2 = new VBox();
        vb2.getChildren().addAll(h1, h6, h7, h8, h9);
        vb2.setMaxSize(2500, 2500);

        HBox mainHB = new HBox();
        mainHB.getChildren().addAll(vb1, s, vb2);

        VBox mainVB = new VBox();
        mainVB.setAlignment(Pos.CENTER);
        mainVB.getChildren().addAll(title, mainHB);



        //set scene and show
        Scene sc1 = new Scene(mainVB, 1540, 835);

        bookb1.setOnAction((e) -> {
            Windows.setScene(bookscene);
        });
//---------------------------------------------------Booking2 starts------------------------------------------------
//        title1 = new Label("BALCONY");
//        title1.setPrefSize(500, 80);
//        title1.setAlignment(Pos.CENTER);
//        title1.setFont(new Font("Lucida Sans Unicode", 25));
//
//        //design screen1 label
//        screen1 = new Label("STAGE");
//        screen1.setStyle("-fx-background-color: #FFA500");
//        screen1.setPrefSize(348, 35);
//        screen1.setAlignment(Pos.CENTER);
//        screen1.setFont(new Font("Verdana", 15));
//        screen1.setTextFill(Color.rgb(255, 255, 255));
//        f3 = new Label("");
//        f3.setPrefSize(15, 35);
//
//        int[] label_btn1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        //design buttons in initially
//        for (int i = 0; i < 90; i++) {
//            all_btn1[i] = new Button(label_btn1[i] + "");
//            all_btn1[i].setPrefSize(30, 35);
//            all_btn1[i].setStyle(grey);
//            all_btn1[i].setTextFill(Color.rgb(255, 255, 255));
//        }
//
//        one1 = new Label("1");
//        one1.setPrefSize(15, 35);
//
//        two1 = new Label("2");
//        two1.setPrefSize(15, 35);
//
//        three1 = new Label(" ");
//        three1.setPrefSize(10, 15);
//
//        four1 = new Label("3");
//        four1.setPrefSize(15, 35);
//
//        five1 = new Label("4");
//        five1.setPrefSize(15, 35);
//
//        six1 = new Label("5");
//        six1.setPrefSize(15, 35);
//
//        seven1 = new Label("6");
//        seven1.setPrefSize(15, 35);
//
//        eight1 = new Label("7");
//        eight1.setPrefSize(15, 35);
//
//        nine1 = new Label("8");
//        nine1.setPrefSize(15, 35);
//
//        ten1 = new Label("9");
//        ten1.setPrefSize(15, 35);
//        f4 = new Label(" ");
//        f4.setPrefSize(65, 35);
//
//        HBox hb11 = new HBox();
//        HBox hb21 = new HBox();
//        HBox hb31 = new HBox();
//        HBox hb41 = new HBox();
//        HBox hb51 = new HBox();
//        HBox hb61 = new HBox();
//        HBox hb71 = new HBox();
//        HBox hb81 = new HBox();
//        HBox hb91 = new HBox();
//        HBox hb110 = new HBox();
//
//        //grouping rows
//        hb11.getChildren().addAll(one1, all_btn1[0], all_btn1[1], all_btn1[2], all_btn1[3], all_btn1[4], all_btn1[5], all_btn1[6], all_btn1[7], all_btn1[8], all_btn1[9]);
//        hb11.setSpacing(5);
//        hb11.setPadding(new Insets(5, 5, 5, 20));
//
//        hb21.getChildren().addAll(two1, all_btn1[10], all_btn1[11], all_btn1[12], all_btn1[13], all_btn1[14], all_btn1[15], all_btn1[16], all_btn1[17], all_btn1[18], all_btn1[19]);
//        hb21.setSpacing(5);
//        hb21.setPadding(new Insets(5, 5, 5, 20));
//
//        hb31.getChildren().add(three1);
//        hb31.setSpacing(5);
//        hb31.setPadding(new Insets(5, 45, 5, 20));
//
//        hb41.getChildren().addAll(four1, all_btn1[20], all_btn1[21], all_btn1[22], all_btn1[23], all_btn1[24], all_btn1[25], all_btn1[26], all_btn1[27], all_btn1[28], all_btn1[29]);
//        hb41.setSpacing(5);
//        hb41.setPadding(new Insets(5, 45, 5, 20));
//
//        hb51.getChildren().addAll(five1, all_btn1[30], all_btn1[31], all_btn1[32], all_btn1[33], all_btn1[34], all_btn1[35], all_btn1[36], all_btn1[37], all_btn1[38], all_btn1[39]);
//        hb51.setSpacing(5);
//        hb51.setPadding(new Insets(5, 45, 5, 20));
//
//        hb61.getChildren().addAll(six1, all_btn1[40], all_btn1[41], all_btn1[42], all_btn1[43], all_btn1[44], all_btn1[45], all_btn1[46], all_btn1[47], all_btn1[48], all_btn1[49]);
//        hb61.setSpacing(5);
//        hb61.setPadding(new Insets(5, 45, 5, 20));
//
//        hb71.getChildren().addAll(seven1, all_btn1[50], all_btn1[51], all_btn1[52], all_btn1[53], all_btn1[54], all_btn1[55], all_btn1[56], all_btn1[57], all_btn1[58], all_btn1[59]);
//        hb71.setSpacing(5);
//        hb71.setPadding(new Insets(5, 45, 5, 20));
//
//        hb81.getChildren().addAll(eight1, all_btn1[60], all_btn1[61], all_btn1[62], all_btn1[63], all_btn1[64], all_btn1[65], all_btn1[66], all_btn1[67], all_btn1[68], all_btn1[69]);
//        hb81.setSpacing(5);
//        hb81.setPadding(new Insets(5, 45, 5, 20));
//
//        hb91.getChildren().addAll(nine1, all_btn1[70], all_btn1[71], all_btn1[72], all_btn1[73], all_btn1[74], all_btn1[75], all_btn1[76], all_btn1[77], all_btn1[78], all_btn1[79]);
//        hb91.setSpacing(5);
//        hb91.setPadding(new Insets(5, 45, 5, 20));
//
////        hb110.getChildren().addAll(ten1,all_btn1[80],all_btn1[81],all_btn1[82],all_btn1[83],all_btn1[84],all_btn1[85],all_btn1[86],all_btn1[87],all_btn1[88],all_btn1[89]);
////        hb110.setSpacing(5);
////        hb110.setPadding(new Insets(5,45,5,20));
//
//        HBox scn2 = new HBox();
//        scn2.getChildren().addAll(f3, screen1);
//        scn2.setSpacing(5);
//        scn2.setPadding(new Insets(5, 10, 20, 20));
//
//        //grouping left side of design
//        VBox vb21 = new VBox();
//        vb21.setAlignment(Pos.CENTER);
//        vb21.setMinSize(430, 0);
//        vb21.getChildren().addAll(scn2, hb11, hb21, hb31, hb41, hb51, hb61, hb71, hb81, hb91);
//
//        //event1 handling to buttons
//        all_btn1[0].setOnAction(e -> setDisplay(all_btn1[0], 0));
//        all_btn1[1].setOnAction(e -> setDisplay(all_btn1[1], 1));
//        all_btn1[2].setOnAction(e -> setDisplay(all_btn1[2], 2));
//        all_btn1[3].setOnAction(e -> setDisplay(all_btn1[3], 3));
//        all_btn1[4].setOnAction(e -> setDisplay(all_btn1[4], 4));
//        all_btn1[5].setOnAction(e -> setDisplay(all_btn1[5], 5));
//        all_btn1[6].setOnAction(e -> setDisplay(all_btn1[6], 6));
//        all_btn1[7].setOnAction(e -> setDisplay(all_btn1[7], 7));
//        all_btn1[8].setOnAction(e -> setDisplay(all_btn1[8], 8));
//        all_btn1[9].setOnAction(e -> setDisplay(all_btn1[9], 9));
//        all_btn1[10].setOnAction(e -> setDisplay(all_btn1[10], 10));
//        all_btn1[11].setOnAction(e -> setDisplay(all_btn1[11], 11));
//        all_btn1[12].setOnAction(e -> setDisplay(all_btn1[12], 12));
//        all_btn1[13].setOnAction(e -> setDisplay(all_btn1[13], 13));
//        all_btn1[14].setOnAction(e -> setDisplay(all_btn1[14], 14));
//        all_btn1[15].setOnAction(e -> setDisplay(all_btn1[15], 15));
//        all_btn1[16].setOnAction(e -> setDisplay(all_btn1[16], 16));
//        all_btn1[17].setOnAction(e -> setDisplay(all_btn1[17], 17));
//        all_btn1[18].setOnAction(e -> setDisplay(all_btn1[18], 18));
//        all_btn1[19].setOnAction(e -> setDisplay(all_btn1[19], 19));
//        all_btn1[20].setOnAction(e -> setDisplay(all_btn1[20], 20));
//        all_btn1[21].setOnAction(e -> setDisplay(all_btn1[21], 21));
//        all_btn1[22].setOnAction(e -> setDisplay(all_btn1[22], 22));
//        all_btn1[23].setOnAction(e -> setDisplay(all_btn1[23], 23));
//        all_btn1[24].setOnAction(e -> setDisplay(all_btn1[24], 24));
//        all_btn1[25].setOnAction(e -> setDisplay(all_btn1[25], 25));
//        all_btn1[26].setOnAction(e -> setDisplay(all_btn1[26], 26));
//        all_btn1[27].setOnAction(e -> setDisplay(all_btn1[27], 27));
//        all_btn1[28].setOnAction(e -> setDisplay(all_btn1[28], 28));
//        all_btn1[29].setOnAction(e -> setDisplay(all_btn1[29], 29));
//        all_btn1[30].setOnAction(e -> setDisplay(all_btn1[30], 30));
//        all_btn1[31].setOnAction(e -> setDisplay(all_btn1[31], 31));
//        all_btn1[32].setOnAction(e -> setDisplay(all_btn1[32], 32));
//        all_btn1[33].setOnAction(e -> setDisplay(all_btn1[33], 33));
//        all_btn1[34].setOnAction(e -> setDisplay(all_btn1[34], 34));
//        all_btn1[35].setOnAction(e -> setDisplay(all_btn1[35], 35));
//        all_btn1[36].setOnAction(e -> setDisplay(all_btn1[36], 36));
//        all_btn1[37].setOnAction(e -> setDisplay(all_btn1[37], 37));
//        all_btn1[38].setOnAction(e -> setDisplay(all_btn1[38], 38));
//        all_btn1[39].setOnAction(e -> setDisplay(all_btn1[39], 39));
//        all_btn1[40].setOnAction(e -> setDisplay(all_btn1[40], 40));
//        all_btn1[41].setOnAction(e -> setDisplay(all_btn1[41], 41));
//        all_btn1[42].setOnAction(e -> setDisplay(all_btn1[42], 42));
//        all_btn1[43].setOnAction(e -> setDisplay(all_btn1[43], 43));
//        all_btn1[44].setOnAction(e -> setDisplay(all_btn1[44], 44));
//        all_btn1[45].setOnAction(e -> setDisplay(all_btn1[45], 45));
//        all_btn1[46].setOnAction(e -> setDisplay(all_btn1[46], 46));
//        all_btn1[47].setOnAction(e -> setDisplay(all_btn1[47], 47));
//        all_btn1[48].setOnAction(e -> setDisplay(all_btn1[48], 48));
//        all_btn1[49].setOnAction(e -> setDisplay(all_btn1[49], 49));
//        all_btn1[50].setOnAction(e -> setDisplay(all_btn1[50], 50));
//        all_btn1[51].setOnAction(e -> setDisplay(all_btn1[51], 51));
//        all_btn1[52].setOnAction(e -> setDisplay(all_btn1[52], 52));
//        all_btn1[53].setOnAction(e -> setDisplay(all_btn1[53], 53));
//        all_btn1[54].setOnAction(e -> setDisplay(all_btn1[54], 54));
//        all_btn1[55].setOnAction(e -> setDisplay(all_btn1[55], 55));
//        all_btn1[56].setOnAction(e -> setDisplay(all_btn1[56], 56));
//        all_btn1[57].setOnAction(e -> setDisplay(all_btn1[57], 57));
//        all_btn1[58].setOnAction(e -> setDisplay(all_btn1[58], 58));
//        all_btn1[59].setOnAction(e -> setDisplay(all_btn1[59], 59));
//        all_btn1[60].setOnAction(e -> setDisplay(all_btn1[60], 60));
//        all_btn1[61].setOnAction(e -> setDisplay(all_btn1[61], 61));
//        all_btn1[62].setOnAction(e -> setDisplay(all_btn1[62], 62));
//        all_btn1[63].setOnAction(e -> setDisplay(all_btn1[63], 63));
//        all_btn1[64].setOnAction(e -> setDisplay(all_btn1[64], 64));
//        all_btn1[65].setOnAction(e -> setDisplay(all_btn1[65], 65));
//        all_btn1[66].setOnAction(e -> setDisplay(all_btn1[66], 66));
//        all_btn1[67].setOnAction(e -> setDisplay(all_btn1[67], 67));
//        all_btn1[68].setOnAction(e -> setDisplay(all_btn1[68], 68));
//        all_btn1[69].setOnAction(e -> setDisplay(all_btn1[69], 69));
//        all_btn1[70].setOnAction(e -> setDisplay(all_btn1[70], 70));
//        all_btn1[71].setOnAction(e -> setDisplay(all_btn1[71], 71));
//        all_btn1[72].setOnAction(e -> setDisplay(all_btn1[72], 72));
//        all_btn1[73].setOnAction(e -> setDisplay(all_btn1[73], 73));
//        all_btn1[74].setOnAction(e -> setDisplay(all_btn1[74], 74));
//        all_btn1[75].setOnAction(e -> setDisplay(all_btn1[75], 75));
//        all_btn1[76].setOnAction(e -> setDisplay(all_btn1[76], 76));
//        all_btn1[77].setOnAction(e -> setDisplay(all_btn1[77], 77));
//        all_btn1[78].setOnAction(e -> setDisplay(all_btn1[78], 78));
//        all_btn1[79].setOnAction(e -> setDisplay(all_btn1[79], 79));
//        all_btn1[80].setOnAction(e -> setDisplay(all_btn1[80], 80));
//        all_btn1[81].setOnAction(e -> setDisplay(all_btn1[81], 81));
//        all_btn1[82].setOnAction(e -> setDisplay(all_btn1[82], 82));
//        all_btn1[83].setOnAction(e -> setDisplay(all_btn1[83], 83));
//        all_btn1[84].setOnAction(e -> setDisplay(all_btn1[84], 84));
//        all_btn1[85].setOnAction(e -> setDisplay(all_btn1[85], 85));
//        all_btn1[86].setOnAction(e -> setDisplay(all_btn1[86], 86));
//        all_btn1[87].setOnAction(e -> setDisplay(all_btn1[87], 87));
//        all_btn1[88].setOnAction(e -> setDisplay(all_btn1[88], 88));
//        all_btn1[89].setOnAction(e -> setDisplay(all_btn1[89], 89));
//
//
//        event1 = new Label("Event1");
//        event1.setFont(new Font("Verdana", 14));
//        event1.setTextFill(Color.rgb(255, 165, 0));
//        event1.setPrefSize(70, 25);
//
//        time1 = new Label("Time1");
//        time1.setFont(new Font("Verdana", 14));
//        time1.setTextFill(Color.rgb(255, 165, 0));
//        time1.setPrefSize(70, 25);
//
//        ticket1s1 = new Label("Ticket1s1");
//        ticket1s1.setFont(new Font("Verdana", 14));
//        ticket1s1.setTextFill(Color.rgb(255, 165, 0));
//        ticket1s1.setPrefSize(70, 25);
//
//        total1 = new Label("Total1");
//        total1.setFont(new Font("Verdana", 14));
//        total1.setTextFill(Color.rgb(255, 165, 0));
//        total1.setPrefSize(70, 25);
//
//        seats1 = new Label("Seats1");
//        seats1.setFont(new Font("Verdana", 14));
//        seats1.setTextFill(Color.rgb(255, 165, 0));
//        seats1.setPrefSize(70, 25);
//
//        event1_ans = new Label(": SWARAM2K23");
//        event1_ans.setFont(new Font("Verdana", 14));
//        event1_ans.setPrefSize(200, 25);
//
//        time1_ans = new Label(": August 12, 10:30");
//        time1_ans.setFont(new Font("Verdana", 14));
//        time1_ans.setPrefSize(500, 25);
//
//        ticket1s1_ans = new Label(": 0");
//        ticket1s1_ans.setFont(new Font("Verdana", 14));
//        ticket1s1_ans.setPrefSize(200, 25);
//
//        total1_ans = new Label(": Rs. 0");
//        total1_ans.setFont(new Font("Verdana", 14));
//        total1_ans.setPrefSize(200, 25);
//
//        seats1_ans = new Label(": ");
//        seats1_ans.setFont(new Font("Verdana", 14));
//        seats1_ans.setPrefSize(2200, 25);
//
//        //customize book1 now button
//        book1 = new Button("Book1 now");
//        book1.setStyle("-fx-background-color: #FFA500");
//        book1.setTextFill(Color.rgb(255, 255, 255));
//        book1.setFont(new Font("Verdana", 14));
//        book1.setPadding(new Insets(8, 8, 8, 8));
//        //handle event1 in book1 now button
//        book1.setOnAction(e -> {
//            for (int i = 0; i < 90; i++) {
//                if (selected1_btn1[i] != null) {
//                    selected1_btn1[i].setStyle("-fx-background-color:#EE4B2B");
//                    //after sold1 a seat, remove event1 handle part corresponding button
//                    selected1_btn1[i].setOnAction(f -> {
//                    });
//                }
//            }
//            ticket1s1_ans.setText(": 0");
//            total1_ans.setText(": Rs. 0");
//            seats1_ans.setText(": ");
//            seats1_val = ": ";
//            count1 += ticket1;
//            //when after all seats1 were book1ed, disable book1 now button
//            if (count1 == all_btn1.length) {
//                book1.setDisable(true);
//            }
//            ticket1 = 0;
//            amount1 = 0;
//            Button[] temp_btn = new Button[90];
//            selected1_btn1 = temp_btn;
//        });
//
//        b_available11 = new Button();
//        b_available11.setStyle("-fx-background-color:#B2BEB5");
//        b_available11.setPrefSize(30, 35);
//
//        b_sold11 = new Button();
//        b_sold11.setStyle("-fx-background-color:#EE4B2B");
//        b_sold11.setPrefSize(30, 35);
//
//        b_selected11 = new Button();
//        b_selected11.setStyle("-fx-background-color:#32CD32");
//        b_selected11.setPrefSize(30, 35);
//
//        available1 = new Label("Available1");
//        available1.setFont(new Font("Verdana", 14));
//        available1.setAlignment(Pos.CENTER_LEFT);
//        available1.setPadding(new Insets(7, 50, 5, 3));
//
//        sold1 = new Label("Sold1");
//        sold1.setFont(new Font("Verdana", 14));
//        sold1.setAlignment(Pos.CENTER_LEFT);
//        sold1.setPadding(new Insets(7, 50, 5, 3));
//
//        selected1 = new Label("Selected1");
//        selected1.setFont(new Font("Verdana", 14));
//        selected1.setAlignment(Pos.CENTER_LEFT);
//        selected1.setPadding(new Insets(7, 50, 5, 3));
//
//        //grouping right hand side in showing screen1
//        VBox temp3 = new VBox();
//        temp3.getChildren().addAll(event1, time1, ticket1s1, total1, seats1);
//        temp3.setMinSize(70, 0);
//
//        VBox temp4 = new VBox();
//        temp4.getChildren().addAll(event1_ans, time1_ans, ticket1s1_ans, total1_ans, seats1_ans);
//        temp4.setMinSize(70, 0);
//
//        HBox h11 = new HBox();
//        h11.getChildren().addAll(temp3, temp4);
//        h11.setPadding(new Insets(5, 5, 5, 5));
//        h11.setSpacing(10);
//
//        HBox h61 = new HBox();
//        h61.getChildren().add(book1);
//        h61.setPadding(new Insets(20, 5, 20, 5));
//        h61.setSpacing(10);
//
//        HBox h71 = new HBox();
//        h71.getChildren().addAll(b_available11, available1);
//        h71.setPadding(new Insets(5, 5, 5, 5));
//        h71.setSpacing(10);
//
//        HBox h81 = new HBox();
//        h81.getChildren().addAll(b_sold11, sold1);
//        h81.setPadding(new Insets(5, 5, 5, 5));
//        h81.setSpacing(10);
//
//        HBox h91 = new HBox();
//        h91.getChildren().addAll(b_selected11, selected1);
//        h91.setPadding(new Insets(5, 5, 5, 5));
//        h91.setSpacing(10);
//
//        //separate left and right side using separator
//        Separator s1 = new Separator();
//        s1.setOrientation(Orientation.VERTICAL);
//        s1.setMinSize(20, 0);
//
//        VBox vb21 = new VBox();
//        vb21.getChildren().addAll(h11, h61, h71, h81, h91);
//        vb21.setMaxSize(2500, 2500);
//
//        HBox mainHB1 = new HBox();
//        mainHB1.getChildren().addAll(vb21, s1, vb21);
//
//        VBox mainVB1 = new VBox();
//        mainVB1.setAlignment(Pos.CENTER);
//        mainVB1.getChildren().addAll(title1, mainHB1);
//
//        //set scene and show
//        Scene sc11 = new Scene(mainVB1, 770, 610);
//
//        book1b1.setOnAction((e) -> {
//            Windows.setScene(book1scene);
//        });


//-----------------------------------------------------Cancellation--------------------------








                GridPane gr=new GridPane();

                gr.setHgap(18);
                gr.setVgap(10);



                gr.setAlignment(Pos.CENTER);

                FileInputStream input5 = new FileInputStream("images/bblur.png");
                Image image5 = new Image(input5);
                BackgroundImage backgroundimage5 = new BackgroundImage(image5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
                Background background5 = new Background(backgroundimage5);
                gr.setBackground(background5);

                Label zt=new Label("CANCELLATION DETAILS");
                zt.setFont(Font.font("SanSerif", 20.0));
                zt.setStyle("-fx-font-weight: bold");
                zt.setTextFill(Color.RED);
                zt.setTextAlignment(TextAlignment.RIGHT);
                gr.getChildren().add(0,zt);

                Label lt1=new Label("NAME : ");
                lt1.setFont(Font.font("SanSerif", 20.0));
                lt1.setTextFill(Color.BLACK);
                lt1.setStyle("-fx-font-weight: bold");

                te1.setPromptText("Enter Name");
                gr.addRow(1,lt1,te1);

                Label lt2=new Label("COLLEGE  : ");
                lt2.setFont(Font.font("SanSerif", 20.0));
                lt2.setTextFill(Color.BLACK);
                lt2.setStyle("-fx-font-weight: bold");
                te3.setPromptText("Enter College");
                gr.addRow(2,lt2,te3);



                Label lt3=new Label("SEAT NUMBER  : ");
                lt3.setFont(Font.font("SanSerif", 20.0));
                lt3.setTextFill(Color.BLACK);
                lt3.setStyle("-fx-font-weight: bold");


                te4.setPromptText("seat number");


                gr.addRow(3,lt3,te4);

                Label lt4=new Label("DAYS LEFT  : ");
                lt4.setFont(Font.font("SanSerif", 20.0));
                lt4.setTextFill(Color.BLACK);
                lt4.setStyle("-fx-font-weight: bold");

                ObservableList<Node> fPaneControls = gr.getChildren();

                cbo5=new ComboBox();
                cbo5.setPromptText("Select days  ");
                ObservableList cboItems5 = cbo5.getItems();
                for (int i = 1; i < 6; i++) {
                    cboItems5.add(i);
                }
                fPaneControls.add(cbo5);
                cbo5.setVisibleRowCount(3);
                gr.addRow(4,lt4);

                cbo5.setTranslateX(252);
                cbo5.setTranslateY(160);


//        Label lt5=new Label("PASSENGER COUNT  : ");
//        lt5.setTextFill(Color.BLACK);
//        lt5.setStyle("-fx-font-weight: bold");
//
//        ObservableList<Node> fPaneControls1 = gr.getChildren();
//
//
//        cbo2.setPromptText("Select count");
//        ObservableList cboItems1 = cbo2.getItems();
//        for (int i = 1; i < 6; i++) {
//            cboItems1.add(i);
//        }
//        fPaneControls1.add(cbo2);
//        cbo2.setVisibleRowCount(3);
//        gr.addRow(4,lt5);
//        cbo2.setTranslateX(160);
//        cbo2.setTranslateY(134);
                Button bt=new Button("REFUND AMOUNT");
                bt.setFont(Font.font("SanSerif", 15.0));
                bt.setStyle("-fx-background-color: #deb887");
                gr.addRow(5,bt);

                bt.setTranslateX(100);
                bt.setTranslateY(30);

//                DropShadow shadow5 = new DropShadow();
                bt.addEventHandler(MouseEvent.MOUSE_ENTERED,
                        new EventHandler<MouseEvent>() {
                            @Override public void handle(MouseEvent e) {
                                bt.setEffect(shadow);
                            }
                        });
                bt.addEventHandler(MouseEvent.MOUSE_EXITED,
                        new EventHandler<MouseEvent>() {
                            @Override public void handle(MouseEvent e) {
                                bt.setEffect(null);
                            }
                        });

        nw.setOnAction(e ->{
            Windows.setScene(hmscene);

        });



                bt.setOnAction(e ->{
                    if(validateFields()) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Refund payment");
                        alert.setHeaderText((String)null);
                        alert.setContentText("After Verification your amount will be refunded soon");
                        alert.showAndWait();
                        Windows.setScene(hmscene);
                    }
                });

//                BorderPane pane = new BorderPane();
//
//                pane.setCenter(gr);

        Button gback7 = new Button("BACK");
        gback7.setFont(Font.font("SanSerif", 15.0));
        gback7.setStyle("-fx-background-color: #FF3C3C");
        gback7.setTranslateX(150.0);
        gback7.setTranslateY(50.0);
        gr.addRow(6, gback7);
        gback7.setOnAction((e) -> {

            Windows.setScene(hmscene);

        });
                Scene canscene = new Scene(gr, 1540, 835);

        canb.setOnAction((e) -> {

                Windows.setScene(canscene);

        });
//--------------------------------------Gallery----------------------------------------------------------------


                GridPane ggr=new GridPane();
                FileInputStream input6 = new FileInputStream("images/bgfsw(1).jpg");
                Image himage6 = new Image(input6);
                BackgroundImage backgroundimage6 = new BackgroundImage(himage6, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
                Background background6 = new Background(new BackgroundImage[]{backgroundimage6});
                ggr.setBackground(background6);

        Button gback6 = new Button("BACK");
        gback6.setFont(Font.font("SanSerif", 15.0));
        gback6.setStyle("-fx-background-color: #FF3C3C");
        gback6.setTranslateX(20.0);
        gback6.setTranslateY(20.0);
        ggr.addRow(6, gback6);
        gback6.setOnAction((e) -> {

            Windows.setScene(hmscene);

        });

                Scene galsc = new Scene(ggr, 1540, 835);

        gal.setOnAction((e) -> {

            Windows.setScene(galsc);

        });

//----------------------------------------------------Ticket-------------------------------------------------------------------
        tickgp.setAlignment(Pos.CENTER);
        FileInputStream ticinput = new FileInputStream("images/Ticket_swaram.png");
        Image ticimage = new Image(ticinput);
        BackgroundImage ticbackgroundimage = new BackgroundImage(ticimage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background ticbackground = new Background(ticbackgroundimage);
        tickgp.setBackground(ticbackground);

        tickgp.setHgap(18);
        tickgp.setVgap(20);

        tick = new Label("TICKET");
        ticnm = new Label("NAME :");
        ticcls = new Label("COLLEGE :");
        ticseat = new Label("SEAT NO :");
        ticflino = new Label("FLIGHT NO :");
        ticfrom = new Label("FROM :");
        ticto = new Label("TO :");
        ticprice = new Label("TOTAL AMOUNT : ");

//        Label tick = new Label("TICKET");
//        tick.setStyle("-fx-font-weight: bold");
//        tick.setTextFill(Color.RED);
//        tick.setFont(Font.font("Sanserif",20));
//        tick.setTextAlignment(TextAlignment.RIGHT);
//        tickgp.addRow(0,tick);

//        tick.setTranslateX(100);
//        tick.setTranslateY(-50);
        //Get & Set Ticket Details Start


        // Get & Set Ticket Details End

//
//        //Label ticnm = new Label("NAME :"+this.rs.getString("PassengerName"));
        ticnm.setStyle("-fx-font-weight: bold");
        ticnm.setTextFill(Color.BLACK);
        ticnm.setFont(Font.font("Sanserif",20));
        ticnm.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(1,ticnm);
//
//        // Label ticcls = new Label("CLASS :" + this.rs.getString("PassengerClass"));
        ticcls.setStyle("-fx-font-weight: bold");
        ticcls.setTextFill(Color.BLACK);
        ticcls.setFont(Font.font("Sanserif",20));
        ticcls.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(2,ticcls);
//
//        //  Label ticseat = new Label("SEAT NO :" +this.rs.getString("PassengerSeatNo"));
        ticseat.setStyle("-fx-font-weight: bold");
        ticseat.setTextFill(Color.BLACK);
        ticseat.setFont(Font.font("Sanserif",20));
        ticseat.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(3,ticseat);
//
//        // Label ticflino = new Label("FLIGHT NO :" + this.rs.getString("PassengerFlightNo"));
//        ticflino.setStyle("-fx-font-weight: bold");
//        ticflino.setTextFill(Color.BLACK);
//        ticflino.setFont(Font.font("Sanserif",20));
//        ticflino.setTextAlignment(TextAlignment.RIGHT);
//        tickgp.addRow(4,ticflino);
//
//        // Label ticfrom = new Label("FROM :" + this.rs.getString("TravelFrom"));
//        ticfrom.setStyle("-fx-font-weight: bold");
//        ticfrom.setTextFill(Color.BLACK);
//        ticfrom.setFont(Font.font("Sanserif",20));
//        ticfrom.setTextAlignment(TextAlignment.RIGHT);
//        tickgp.addRow(5,ticfrom);
//
//        // Label ticto = new Label("TO :" + this.rs.getString("TravelTo"));
//        ticto.setStyle("-fx-font-weight: bold");
//        ticto.setTextFill(Color.BLACK);
//        ticto.setFont(Font.font("Sanserif",20));
//        ticto.setTextAlignment(TextAlignment.RIGHT);
//        tickgp.addRow(6,ticto);
//
        ticprice.setStyle("-fx-font-weight: bold");
        ticprice.setTextFill(Color.BLACK);
        ticprice.setFont(Font.font("Sanserif",20));
        ticprice.setTextAlignment(TextAlignment.RIGHT);
        tickgp.addRow(7,ticprice);



        Button ticdown=new Button("DOWNLOAD TICKET");
        tickgp.addRow(7,ticdown);
        ticdown.setTranslateX(100);
        ticdown.setTranslateY(30);



        ticdown.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        ticdown.setEffect(shadow);
                    }
                });
        ticdown.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        ticdown.setEffect(null);
                    }
                });
        ticdown.setOnAction(e ->{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("TICKET");
            alert.setHeaderText(null);
            alert.setContentText("Ticket has been Downloaded Successfully");
            alert.showAndWait();
            Integer UserId=0;
//            this.sed.getEditor().clear();
//            this.seo1.setValue("0");
//            this.secbo1.setValue("0");
//
//            this.bookt11.clear();
//            this.bookt12.clear();
//            this.bookcom.setValue("0");
//            this.bookt14.clear();
            Windows.setScene(hmscene);
        });
//        ---------------------------------------PAYMENT------------------------------------------
        paygp.setHgap(100.0);
        paygp.setVgap(50.0);
        paygp.setAlignment(Pos.TOP_CENTER);
        FileInputStream payinput = new FileInputStream("images/bblur.png");
        Image payimage = new Image(payinput);
        BackgroundImage paybackgroundimage = new BackgroundImage(payimage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background paybackground = new Background(new BackgroundImage[]{paybackgroundimage});
        this.paygp.setBackground(paybackground);
        Label nb = new Label("MODE OF PAYMENT");

        nb.setStyle("-fx-font-weight: bold");
        nb.setFont(Font.font("Sanserif", 50.0));
        nb.setTextFill(Color.RED);
        nb.setTranslateX(250.0);
        nb.setTranslateY(0.0);
        this.paygp.addRow(0, new Node[]{nb});
        Image payimg = new Image("D:\\NB.jpg");
        Image payimg1 = new Image("D:\\upi.jpg");
        Image payimg2 = new Image("D:\\dbcard.jpg");
        ImageView payview = new ImageView(payimg);
        ImageView payview1 = new ImageView(payimg1);
        ImageView payview2 = new ImageView(payimg2);
        payview.setFitHeight(80.0);
        payview.setPreserveRatio(true);
        payview1.setFitHeight(80.0);
        payview1.setPreserveRatio(true);
        payview2.setFitHeight(80.0);
        payview2.setPreserveRatio(true);
        final Button paybutton = new Button();
        final Button paybutton1 = new Button();
        final Button paybutton2 = new Button();
        paybutton.setTranslateX(60.0);
        paybutton.setTranslateY(-110.0);
        paybutton1.setTranslateX(-210.0);
        paybutton1.setTranslateY(-110.0);
        paybutton2.setTranslateX(-150.0);
        paybutton2.setTranslateY(-110.0);
        paybutton.setPrefSize(80.0, 80.0);
        paybutton1.setPrefSize(80.0, 80.0);
        paybutton2.setPrefSize(80.0, 80.0);
        paybutton.setGraphic(payview);
        paybutton1.setGraphic(payview1);
        paybutton2.setGraphic(payview2);
        this.paygp.addRow(5, new Node[]{paybutton});
        this.paygp.addRow(5, new Node[]{paybutton1});
        this.paygp.addRow(5, new Node[]{paybutton2});
        this.paygp.setAlignment(Pos.CENTER);
        paybutton.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton.setEffect(shadow);
            }
        });
        paybutton.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton.setEffect((Effect)null);
            }
        });
        paybutton1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton1.setEffect(shadow);
            }
        });
        paybutton1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton1.setEffect((Effect)null);
            }
        });
        paybutton2.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton2.setEffect(shadow);
            }
        });
        paybutton2.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {
                paybutton2.setEffect((Effect)null);
            }
        });
        paybutton.setOnAction((e) -> {
//            SaveTicketDetails();
            getTicketDetails();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Mode Of Payment - NetBanking");
            alert.setHeaderText((String)null);
            alert.setContentText("Transaction Successful");
            alert.showAndWait();
            Windows.setScene(ticksc);
        });
        paybutton1.setOnAction((e) -> {
//            SaveTicketDetails();
            getTicketDetails();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Mode Of Payment - UPI");
            alert.setHeaderText((String)null);
            alert.setContentText("Transaction Successful");
            alert.showAndWait();
            Windows.setScene(ticksc);
        });
        paybutton2.setOnAction((e) -> {
//            SaveTicketDetails();
            getTicketDetails();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Mode Of Payment - Debit/Credit card");
            alert.setHeaderText((String)null);
            alert.setContentText("Transaction Successful");
            alert.showAndWait();
            Windows.setScene(ticksc);
        });
        payscene = new Scene(paygp, 1540.0, 835.0);

//        ------------------------------------------------------------------------------------------------------------
        md.setOnAction((e) -> {
            if (book_validateFields()) {

                Windows.setScene(sc1);
            }
        });


        btnlogin.setOnAction((e) -> {

            if (Login_validateFields() && userCheck()) {
                p.clear();
                t1.clear();
                Windows.setScene(hmscene);
            }

        });

//        book.setOnAction((e) -> {
//            SaveTicketDetails();
//
//        });
//        this.window.setTitle("ARS");
        primaryStage.getIcons().add(new Image("file:images/music-notes.png"));

        Windows.setTitle("KEC EVENT ONLINE TICKET BOOKING APP");
        Windows.setScene(logscene);
        Windows.show();

    }



    public void SaveTicketDetails() {
        try {
            dbConnection = new DatabaseConnection();
            connectDB = dbConnection.getConnection();
            String Name = bt1.getText();
            String Year = cbo1.getSelectionModel().getSelectedItem().toString();
            String College = bt5.getText();
            String Email =bt6.getText();
            String Seats = seats_ans.getText();
            Seats= Seats.replace(':',' ');
            String Price = total_ans.getText();
            Price= Price.replace(':',' ');
            String insertItems = "INSERT INTO ticket_details(Name, Year, College, Email, SeatNo,Price) VALUES('";
            String insertValues = Name + "','" + Year + "','" + College + "','" + Email + "','" + Seats.trim() + "','"+ Price.trim() + "')";
            String insertQry = insertItems + insertValues;
            this.st = this.connectDB.createStatement();
            this.st.executeUpdate(insertQry);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText((String)null);
            alert.setContentText("Ticket has been booked.");
            alert.showAndWait();
        } catch (Exception var16) {
            var16.printStackTrace();
            var16.getCause();
        }

    }

    private boolean validateFields()
    {
        if( te1.getText().isEmpty()){
            te1.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.FadeIn(te1).play();
            return false;
        }else{
            te1.setStyle(null);
        }
        if( te3.getText().isEmpty()){
            te3.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.FadeIn(te3).play();
            return false;
        }else{
            te3.setStyle(null);
        }
        if( te4.getText().isEmpty()){
            te4.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.FadeIn(te4).play();
            return false;
        }else{
            te4.setStyle(null);
        }
        if( cbo5.getSelectionModel().isEmpty()){
            cbo5.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.FadeIn(cbo5).play();
            return false;
        }else{
            cbo5.setStyle(null);
        }


        return true;
    }


    public boolean userCheck() {
        try {
            dbConnection = new DatabaseConnection();
            connectDB = dbConnection.getConnection();
            String var10000 = t1.getText();
            String isUserExistQuery = "Select * from user_details where UserName ='" + var10000 + "' and Password= '" + p.getText() + "'";
            dbConnection = new DatabaseConnection();
            connectDB = dbConnection.getConnection();
            pst = connectDB.prepareStatement(isUserExistQuery);
            rs = pst.executeQuery();
            if (!this.rs.next()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText((String) null);
                alert.setContentText("User Doesn't Exit!");
                alert.showAndWait();
                return false;
            }
//
            UserName = rs.getString("UserName");
            User_Id = rs.getInt("Id");
            Label lblUname = new Label(UserName);
//            Menu unMenu = new Menu("", lblUname);
//            this.loghommenu.getMenus().addAll(new Menu[]{unMenu});
            loghomtxt.setText(" \uD83D\uDC65  " + UserName);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("User Logged In");
            alert.setHeaderText((String) null);
            alert.setContentText("Welcome back " + UserName + "!");
            alert.showAndWait();
        } catch (Exception var5) {
            var5.printStackTrace();
            var5.getCause();
        }

        return true;
    }

    public boolean getTicketDetails() {
        try {
            dbConnection = new DatabaseConnection();
            connectDB = dbConnection.getConnection();
            String isTicketExistQuery = "select * from ticket_details where Name = '"+ bt1.getText() +"' order by Id desc limit 1";
            dbConnection = new DatabaseConnection();
            connectDB = dbConnection.getConnection();
            pst = connectDB.prepareStatement(isTicketExistQuery);
            rs = pst.executeQuery();
            if (!rs.next()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText((String)null);
                alert.setContentText("There is no valid tickets!");
                alert.showAndWait();
                return false;
            }
            ticnm.setText("NAME : " + rs.getString("Name"));
            ticcls.setText("COLLEGE : " +rs.getString("College"));
            ticseat.setText("SEAT NO : " +rs.getString("SeatNo"));
            ticprice.setText("TOTAL AMOUNT : " +rs.getString("Price"));

        } catch (Exception var5) {
            var5.printStackTrace();
            var5.getCause();
        }

        return true;
    }
    private boolean validatePassword() {
        Pattern p = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
        Matcher m = p.matcher(pf.getText());
        if (m.matches()) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Password");
            alert.setHeaderText((String) null);
            alert.setContentText("Password must contain at least one(Digit, Lowercase, UpperCase and Special Character) and length must be between 6 -15");
            alert.showAndWait();
            return false;
        }
    }

    public boolean Login_validateFields() {
        if (t1.getText().isEmpty()) {
            t1.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            new animatefx.animation.FadeIn(t1).play();
            return false;
        } else {
            t1.setStyle((String) null);
            if (p.getText().isEmpty()) {
                p.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                (new FadeIn(p)).play();
                return false;
            } else {
                this.p.setStyle((String) null);
                return true;
            }
        }
    }

    public boolean book_validateFields() {

                if (bt1.getText().isEmpty()) {
                    bt1.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                    new animatefx.animation.FadeIn(bt1).play();
                    return false;
                } else {
                    this.bt1.setStyle((String) null);
                }

        if (this.cbo1.getSelectionModel().isEmpty()) {
            this.cbo1.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            (new FadeIn(this.cbo1)).play();
            return false;
        } else {
            this.cbo1.setStyle((String) null);
        }

                    if (bt5.getText().isEmpty()) {
                        bt5.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                        new animatefx.animation.FadeIn(bt5).play();
                        return false;
                    } else {
                        this.bt5.setStyle((String) null);

                    }
        if (this.bt6.getText().isEmpty()) {
            this.bt6.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
            (new FadeIn(this.bt6)).play();
            return false;
        } else {
            this.bt6.setStyle((String) null);
            return true;
        }
                }



            private boolean validateEmail() {
                Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
                Matcher m = p.matcher(this.tfEmailId.getText());
                if (m.find() && m.group().equals(this.tfEmailId.getText())) {
                    try {
                        String isEmailExistQuery = "Select EmailId from user_details where Email_id= '" + this.tfEmailId.getText() + "'";
                        this.dbConnection = new DatabaseConnection();
                        this.connectDB = this.dbConnection.getConnection();
                        this.pst = this.connectDB.prepareStatement(isEmailExistQuery);
                        this.rs = this.pst.executeQuery();
                        if (this.rs.next()) {
                            Alert alert = new Alert(Alert.AlertType.WARNING);
                            alert.setTitle("User Already Exist");
                            alert.setHeaderText((String) null);
                            alert.setContentText("EmailId Already Exist!");
                            alert.showAndWait();
                            return false;
                        }
                    } catch (Exception var5) {
                        var5.printStackTrace();
                        var5.getCause();
                    }

                    return true;
                } else {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Validate Email");
                    alert.setHeaderText((String) null);
                    alert.setContentText("Please Enter Valid Email");
                    alert.showAndWait();
                    return false;
                }
            }




            public boolean signup_validateFields() {
                if (tfUserName.getText().isEmpty()) {
                    tfUserName.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                    new animatefx.animation.FadeIn(tfUserName).play();
                    return false;
                } else {
                    this.tfUserName.setStyle((String) null);
                    if (this.tfPhone.getText().isEmpty()) {
                        this.tfPhone.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                        (new FadeIn(this.tfPhone)).play();
                        return false;
                    } else {
                        this.tfPhone.setStyle((String) null);

                    }
                    if (this.tfEmailId.getText().isEmpty()) {
                        this.tfEmailId.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                        (new FadeIn(this.tfEmailId)).play();
                        return false;
                    } else {
                        this.tfEmailId.setStyle((String) null);

                    }
                    if (this.pf.getText().isEmpty()) {
                        this.pf.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                        (new FadeIn(this.pf)).play();
                        return false;
                    } else {
                        this.pf.setStyle((String) null);

                    }
                    if (this.cpf.getText().isEmpty()) {
                        this.cpf.setStyle("-fx-border-color:red ;-fx-border-width:2px;");
                        (new FadeIn(this.cpf)).play();
                        return false;
                    } else {
                        this.cpf.setStyle((String) null);
                        return true;
                    }
                }
            }

            public boolean signequals () {
                if (!this.pf.getText().equals(this.cpf.getText())) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Error");
                    alert.setHeaderText((String) null);
                    alert.setContentText("Both the Passwords are not same!");
                    alert.showAndWait();
                    return false;
                } else {
                    return true;
                }
            }
            public void registerUser() {
                try {
                    this.dbConnection = new DatabaseConnection();
                    this.connectDB = this.dbConnection.getConnection();
                    String UserName = this.tfUserName.getText();
                    String PhoneNumber = this.tfPhone.getText();
                    String EmailId = this.tfEmailId.getText();
                    String Password = this.pf.getText();
                    String insertItems = "INSERT INTO user_details(UserName,Phone_number,Email_id,Password) VALUES('";
                    String insertValues = UserName + "','" + PhoneNumber + "','" + EmailId + "','" + Password + "')";
                    String insertQry = insertItems + insertValues;
                    this.st = this.connectDB.createStatement();
                    this.st.executeUpdate(insertQry);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setHeaderText((String) null);
                    alert.setContentText("User has been created.");
                    alert.showAndWait();
                } catch (Exception var16) {
                    var16.printStackTrace();
                    var16.getCause();
                }

            }
        }


