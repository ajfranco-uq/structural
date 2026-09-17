package pattern.facade.booking.solution;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// ============================================================
// SUBSISTEMA: HABITACIONES
// ============================================================

class Habitaciones {

    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public Habitaciones() {
        habitaciones.add(new Habitacion(101, 100000));
        habitaciones.add(new Habitacion(205, 150000));
        habitaciones.add(new Habitacion(301, 200000));
    }

    public Habitacion buscarHabitacion(int numero) {

        for (Habitacion habitacion : habitaciones) {

            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }

        return null;
    }

    public boolean estaDisponible(
            int numeroHabitacion,
            LocalDate entrada,
            LocalDate salida) {

        for (Reserva reserva : reservas) {

            if (reserva.getNumeroHabitacion() == numeroHabitacion) {

                boolean hayTraslape = entrada.isBefore(reserva.getSalida())
                                && salida.isAfter(reserva.getEntrada());

                if (hayTraslape) {
                    return false;
                }
            }
        }

        return true;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
}