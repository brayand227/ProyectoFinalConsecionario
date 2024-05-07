package co.uniquindio.Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Consecionario {
    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    private Map<String, Cliente> clientes;

    public Consecionario() {
        clientes = new HashMap<>();
    }

    public void agregarCliente(String nombre, String apellido, LocalDate date, Cargo cargo, String id) {
        Cliente cliente = new Cliente(nombre, apellido, date, id);
        if (validarCliente(cliente) == false) {
            clientes.put(id, cliente);
        }

    }

    public boolean validarCliente(Cliente cliente) {
        String id = cliente.getId();
        boolean centinela = false;
        if (clientes.containsKey(id)) {
            centinela = true;
        }

        return centinela;
    }

}
