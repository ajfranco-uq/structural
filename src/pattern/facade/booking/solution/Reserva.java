package pattern.facade.booking.solution;

// ============================================================
// SUBSISTEMA: RESERVA
// ============================================================

import java.time.LocalDate;

class Reserva {

    private static int siguienteNumero = 1001;

    private int numero;
    private String nombreCliente;
    private int numeroHabitacion;
    private LocalDate entrada;
    private LocalDate salida;

    public Reserva(
            String nombreCliente,
            int numeroHabitacion,
            LocalDate entrada,
            LocalDate salida) {

        this.numero = siguienteNumero++;
        this.nombreCliente = nombreCliente;
        this.numeroHabitacion = numeroHabitacion;
        this.entrada = entrada;
        this.salida = salida;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public LocalDate getSalida() {
        return salida;
    }
}