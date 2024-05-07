package co.uniquindio.co;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import co.uniquindio.Logica.Cliente;
import co.uniquindio.Logica.Consecionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class RegistrarseController {
    private Consecionario consecionario = new Consecionario();
    private Cliente cliente;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker Calendar;

    @FXML
    private TextField Txapellido;

    @FXML
    private TextField Txcodigo;

    @FXML
    private TextField Txnombre;

    @FXML
    private Button btregresar;

    @FXML
    private Button btsiguiente;

    @FXML
    void Regresar(ActionEvent event) throws IOException {
        App.setRoot("inicio");

    }

    @FXML
    public void Siguiente(ActionEvent event) {
        String nombre = Txnombre.getText();
        String apellido = Txapellido.getText();
        LocalDate localDate = Calendar.getValue();
        String id = Txcodigo.getText();

    }

    @FXML
    void initialize() {

    }

}
