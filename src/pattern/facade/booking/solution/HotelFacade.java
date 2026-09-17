package pattern.facade.booking.solution;

// ============================================================
// FACADE
// ============================================================

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class HotelFacade {

    private Habitaciones habitaciones;
    private Cliente cliente;
    private Pago pago;
    private Notificacion notificacion;

    public HotelFacade() {

        habitaciones = new Habitaciones();
        cliente = new Cliente();
        pago = new Pago();
        notificacion = new Notificacion();
    }

    public void reservarHabitacion(String nombre, int numeroHabitacion, LocalDate entrada, LocalDate salida, double abono) {

        // Buscar la habitación
        Habitacion habitacion =
                habitaciones.buscarHabitacion(numeroHabitacion);

        if (habitacion == null) {
            System.out.println("La habitación no existe.");
            return;
        }

        // Verificar disponibilidad
        if (!habitaciones.estaDisponible(
                numeroHabitacion,
                entrada,
                salida)) {

            System.out.println("La habitación no está disponible.");
            return;
        }

        // Registrar cliente
        cliente.registrar(nombre);

        // Calcular noches
        long noches =
                ChronoUnit.DAYS.between(entrada, salida);

        // Obtener precio REAL de la habitación
        double precioPorNoche =
                habitacion.getPrecioPorNoche();

        // Calcular valor total
        double total =
                noches * precioPorNoche;

        // Calcular saldo pendiente
        double saldoPendiente =
                total - abono;

        if (abono <= 0) {
            System.out.println("El abono debe ser mayor que $0.");
            return;
        }

        if (abono > total) {
            System.out.println(
                    "El abono no puede superar el valor de la reserva."
            );
            return;
        }

        System.out.println("Habitación: " + numeroHabitacion);
        System.out.println("Precio por noche: $" + precioPorNoche);
        System.out.println("Noches: " + noches);
        System.out.println("Total: $" + total);
        System.out.println("Abono: $" + abono);
        System.out.println("Saldo pendiente: $" + saldoPendiente);

        // Registrar reserva
        Reserva reserva = new Reserva(nombre, numeroHabitacion, entrada, salida);

        habitaciones.agregarReserva(reserva);

        // Confirmación
        notificacion.enviarConfirmacion(nombre, reserva.getNumero(), numeroHabitacion, entrada, salida, total);

        System.out.println("Reserva realizada correctamente.");
    }
}