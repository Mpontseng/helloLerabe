/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication14;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Lerabe
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
     private Button Outer;

    @FXML
    private Label label;
    
   @FXML
    private Button decrease;

    @FXML
    private TextField display;

    @FXML
    private Button increase;
    
      @FXML
    private Button clear;


        int number;
        int  decreas;
        int increas;
    @FXML
    void Decrease(ActionEvent event) throws IOException {
        
           try{
                number=Integer.parseInt(display.getText());
           }
                catch (NumberFormatException e){
                  Alert error= new Alert(Alert.AlertType.ERROR);
            error.setHeaderText("Plese enter an integer");
       if(error.showAndWait().get()==ButtonType.OK){
                      Stage stage = (Stage)Outer.getScene().getWindow();
       }
                }
                decreas=--number;
                display.setText(String.valueOf(decreas));
    }
    
    @FXML
    void Increase(ActionEvent event)throws IOException {
        try{
                number=Integer.parseInt(display.getText());
        }
        catch (NumberFormatException e){
                  Alert error= new Alert(Alert.AlertType.ERROR);
            error.setHeaderText("Plese enter an integer");
       if(error.showAndWait().get()==ButtonType.OK){
                      Stage stage = (Stage)Outer.getScene().getWindow();
       }
        }
                increas=++number;
                display.setText(String.valueOf(increas));
    }
    
       @FXML
          void clear(ActionEvent event){
              display.setText("");
          }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
