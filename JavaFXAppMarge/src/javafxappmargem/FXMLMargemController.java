/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxappmargem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.entity.Produto;

/**
 *
 * @author zaurizimm
 */
public class FXMLMargemController {
//public class FXMLMargemController implements Initializable {
    
    @FXML
    private TextField tfNome;
    
    @FXML
    private Button btCalcular;

    @FXML
    private TextField tfValor;

    @FXML
    private TextField tfTaxa;

    @FXML
    private TextField tfResultado;

    @FXML
    void handleButtonAction(ActionEvent event) {
        Produto produto = new Produto();
        produto.setNome(tfNome.getText());
        produto.setPrecoCusto(Float.parseFloat(tfValor.getText()));
        produto.setMargemLucro(Float.parseFloat(tfTaxa.getText()));
        
        //float resultado = produto.calcularPrecoVenda();
        //tfResultado.setText(Float.toString(resultado));
        tfResultado.setText(Float.toString(produto.calcularPrecoVenda()));
    } 
}
