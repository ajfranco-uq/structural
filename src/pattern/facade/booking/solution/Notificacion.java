package pattern.facade.booking.solution;

// ============================================================
// SUBSISTEMA: NOTIFICACIÓN
// ============================================================

import java.time.LocalDate;

class Notificacion {

    public void enviarConfirmacion(
            String nombre,
            int numeroReserva,
            int habitacion,
            LocalDate entrada,
            LocalDate salida,
            double total) {

        System.out.println();
        System.out.println("===== CONFIRMACIÓN =====");
        System.out.println("Cliente: " + nombre);
        System.out.println("Reserva: #" + numeroReserva);
        System.out.println("Habitación: " + habitacion);
        System.out.println("Entrada: " + entrada);
        System.out.println("Salida: " + salida);
        System.out.println("Total: $" + total);
        System.out.println("========================");
    }
}