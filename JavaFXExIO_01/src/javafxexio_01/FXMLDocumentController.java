/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxexio_01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author YyY
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lbNomeSobrenome;
    
    @FXML
    private TextField tfNome;
    
    @FXML
    private TextField tfSobrenome;
      
    @FXML
    private Button btButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
//        label.setText("Hello World!");
    }
    
    @FXML
    private void handleBtConfirmarAction(ActionEvent event) {
        String nomeSobrenome = tfNome.getText() + " " + tfSobrenome.getText();
        lbNomeSobrenome.setText(nomeSobrenome);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
