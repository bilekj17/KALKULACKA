package com.example.kalkulacka;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private TextArea textArea;
    @FXML
    private Button jedna;
    @FXML
    private Button dva;
    @FXML
    private Button tri;
    @FXML
    private Button ctyri;
    @FXML
    private Button pet;
    @FXML
    private Button sest;
    @FXML
    private Button sedm;
    @FXML
    private Button osm;
    @FXML
    private Button devet;
    @FXML
    private Button nula;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button krat;
    @FXML
    private Button deleno;

    @FXML
    protected void ontlacitkoClicked(ActionEvent event) {
        String text = ((Button) event.getSource()).getText();
        String doplnovani = textArea.getText();
        textArea.setText(doplnovani+text);
    }
    @FXML
    protected void znaminkaClicked(ActionEvent event) {

    }
}