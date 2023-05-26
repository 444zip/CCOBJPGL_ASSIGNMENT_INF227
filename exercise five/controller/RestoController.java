package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class RestoController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;
    
    Dominos dominos = new Dominos();
    BurgerKing burgerking = new BurgerKing();
    DQ dq = new DQ();
    Mcdonalds mcdonalds = new Mcdonalds();
    Wendys wendys = new Wendys();


    public void initialize() {


        dominos.setBestSeller("5 Cheese Pizza");
        dominos.setRate("★★★★★");

        burgerking.setBestSeller("Flame Grill Burger");
        burgerking.setRate("★★★☆☆");

        dq.setBestSeller("Oreo Blizzard Treat");
        dq.setRate("★★★★★");

        mcdonalds.setBestSeller("Crispy Chicken Fillet");
        mcdonalds.setRate("★★★★☆");

        wendys.setBestSeller("Big Bacon Mushroom Melt");
        wendys.setRate("★★★☆☆");

        
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);


        if (sourceButton == btn1) {
            alert.setContentText("Domino's Pizza's bestseller is: " + dominos.getBestSeller() + " with a rate of: " + dominos.getRate());
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("BurgerKing's bestseller is: " + burgerking.getBestSeller() + " with a rate of: " + burgerking.getRate());
        }

        if (sourceButton == btn3) {
            alert.setContentText("DQ's's bestseller is: " + dq.getBestSeller() + " with a rate of: " + dq.getRate());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Mcdonald's bestseller is: " + mcdonalds.getBestSeller() + " with a rate of: " + mcdonalds.getRate());
        }
        if (sourceButton == btn5) {
            alert.setContentText("Wendy's bestseller is: " + wendys.getBestSeller() + " with a rate of: " + wendys.getRate());
        }


        alert.showAndWait();

    }
}
