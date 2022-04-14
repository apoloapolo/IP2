package com.example.testefxintellij;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HelloController {
    @FXML
    private TextField txtFNome;

    @FXML
    private TextField txtFEndereco;

    @FXML
    private TextField txtFResumo;

    @FXML
    private TextArea txtADescricao;

    @FXML
    private DatePicker dtP1;

    @FXML
    private DatePicker dtP2;

    @FXML
    protected void onOKButtonClick() {
        System.out.println("O botão OK foi pressionado");
    }

    @FXML
    protected void onPeriodoButtonClick() {
        LocalDate data1 = dtP1.getValue();
        LocalDate data2 = dtP2.getValue();
        long diferenca = data1.until(data2, ChronoUnit.DAYS);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("For You");
        alert.setHeaderText("Período em dias");
        alert.setContentText("Período Calculado: " + String.valueOf(diferenca));
        alert.showAndWait();
    }
}