package com.mycompany.assignment1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PrimaryController {

    private ImageView myImageView; 
    
    @FXML
    private Label label;
    
    @FXML
    private TextField display;
    
      @FXML
    private Button Malawi;

    @FXML
    private Button Australia;

    @FXML
    private Button Transnistria;

    @FXML
    private Button Clear;

    @FXML
    private Button Lesotho;

    @FXML
    private Button Armenia;
    
     @FXML
     Parent root;
     
    @FXML
    private Rectangle Rect1;

    @FXML
    private Rectangle Rect2;

    @FXML
    private Rectangle Rect3;

    @FXML
    void lesotho(ActionEvent event) {
         
            Rect1.setFill(Color.BLUE);
            Rect2.setFill(Color.WHITE);
            Rect3.setFill(Color.GREEN);
         
}
    @FXML
    void malawi(ActionEvent event){
       
            Rect1.setFill(Color.BLACK);
            Rect2.setFill(Color.RED);
            Rect3.setFill(Color.GREEN);
         
    }
   
    @FXML
    void transnistria(ActionEvent event) {
        
            Rect1.setFill(Color.RED);
            Rect2.setFill(Color.LIME);
            Rect3.setFill(Color.RED);
    }

    @FXML
    void armenia(ActionEvent event) {
         
            Rect1.setFill(Color.RED);
            Rect2.setFill(Color.BLUE);
            Rect3.setFill(Color.ORANGE);
    }
     @FXML
    void argentina(ActionEvent event) {
       
            Rect1.setFill(Color.SKYBLUE);
            Rect2.setFill(Color.WHITE);
            Rect3.setFill(Color.SKYBLUE);
    }

 @FXML
    void clear(ActionEvent event) {
          Rect1.setFill(Color.WHITE);
          Rect2.setFill(Color.WHITE);
          Rect3.setFill(Color.WHITE);
          
    }
    
    }

