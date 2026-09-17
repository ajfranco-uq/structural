package pattern.facade.booking.solution;

// ============================================================
// SUBSISTEMA: CLIENTE
// ============================================================

import java.util.ArrayList;
import java.util.List;

class Cliente {

    private List<String> clientes = new ArrayList<>();

    public boolean existe(String nombre) {
        return clientes.contains(nombre);
    }

    public void registrar(String nombre) {

        if (!existe(nombre)) {
            clientes.add(nombre);
            System.out.println("Cliente registrado: " + nombre);
        }
    }
}