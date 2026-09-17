package pattern.facade.booking.problem;

public class Main {

    public static void main(String[] args) {

        String nombre = "Andrés";
        int habitacion = 205;
        int noches = 3;
        double precioPorNoche = 150000;

        Habitaciones habitaciones = new Habitaciones();
        Cliente cliente = new Cliente();
        Pago pago = new Pago();
        Reserva reserva = new Reserva();
        Notificacion notificacion = new Notificacion();

        // 1. Verificar disponibilidad
        if (!habitaciones.verificarDisponibilidad(habitacion)) {
            System.out.println("La habitación no está disponible");
            return;
        }

        // 2. Registrar cliente
        cliente.registrarCliente(nombre);

        // 3. Calcular y realizar el pago
        double total = precioPorNoche * noches;

        if (!pago.realizarPago(total)) {
            System.out.println("No fue posible realizar el pago");
            return;
        }

        // 4. Crear la reserva
        int numeroReserva =
                reserva.crearReserva(nombre, habitacion, noches);

        // 5. Enviar confirmación
        notificacion.enviarConfirmacion(nombre, numeroReserva);

        System.out.println("Reserva realizada correctamente");
    }
}