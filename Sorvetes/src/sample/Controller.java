package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
//public class Controller implements Initializable {

    @FXML
    private ImageView miGeladinho;

    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private ComboBox<String> cmbSabor;

    @FXML
    private ComboBox<String> cmbQuantidade;

    @FXML
    private ComboBox<String> cmbAçai;

    @FXML
    private ComboBox<String> cmbCobertura;

    @FXML
    private ComboBox<String> cmbComplemento;

    @FXML
    private ComboBox<String> cmbBebidas;

    @FXML
    private ComboBox<String> cmbOutros;

    public Controller() {
    }

    @FXML
    private void initialize () {
        String OpçãoSabor [] = {"Abacaxi R$00,⁰⁰", "Chocolate R$00,⁰⁰", "Creme R$00,⁰⁰", "Limão R$00,⁰⁰", "Morango R$00,⁰⁰"};
        String OpçãoQuantidade [] = {"01", "02", "03", "04", "05"};
        String OpçãoAçai [] = {"01", "02", "03", "04" , "05"};
        String OpçãoCobertura [] = {"Caramelo R$00,⁰⁰", "Chocolate R$00,⁰⁰", "Doce de Leite R$00,⁰⁰", "Leite em Pó R$00,⁰⁰", "Menta R$00,⁰⁰"};
        String OpçãoComplemento [] = {"Cereja R$00,⁰⁰", "Frutas Cristalizadas R$00,⁰⁰", "Marshmallow R$00,⁰⁰", "Uva Passas R$00,⁰⁰"};
        String OpçãoOutros [] = {"Agua/c R$00,⁰⁰" , "Agua/s R$00,⁰⁰" , "Coca-Cola R$00,⁰⁰" , "Fanta R$00,⁰⁰" , "Sprit R$00,⁰⁰" ,};
        String OpçãoBebidas [] = {"01" , "02", "03", "04", "05"};

        ObservableList saborListOpção = FXCollections.observableArrayList(OpçãoSabor);
        cmbSabor.setItems(saborListOpção);
        ObservableList quantidadeListOpção = FXCollections.observableArrayList(OpçãoQuantidade);
        cmbQuantidade.setItems(quantidadeListOpção);
        ObservableList AçaiListOpção = FXCollections.observableArrayList(OpçãoAçai);
        cmbAçai.setItems(AçaiListOpção);
        ObservableList coberturaListOpção = FXCollections.observableArrayList(OpçãoCobertura);
        cmbCobertura.setItems(coberturaListOpção);
        ObservableList complementoListOpção = FXCollections.observableArrayList(OpçãoComplemento);
        cmbComplemento.setItems(complementoListOpção);
        ObservableList OutrosListOpção = FXCollections.observableArrayList(OpçãoOutros);
        cmbOutros.setItems(OutrosListOpção);
        ObservableList BebidasListOpção = FXCollections.observableArrayList(OpçãoBebidas);
        cmbBebidas.setItems(BebidasListOpção);
    }
    @FXML
    void anchorcenter(MouseEvent event) {

    }


    //@Override
    //public void initialize(URL url, ResourceBundle resourceBundle) {

      //  Image image;
       // ImageView imageView;

        //image = new Image("GGGG.png", 20, 20, true, true);
        //imageView = new ImageView(image);
        // miGeladinho.setGraphic(imageView);
    }



