package co.uniquindio.co;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InicioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btregistrado;

    @FXML
    private Button btregistrarse;

    @FXML
    void Registrado(ActionEvent event) throws IOException {

    }

    @FXML
    void Registrar(ActionEvent event) throws IOException {
        App.setRoot("registrarse");

    }

    @FXML
    void initialize() {

    }

}
