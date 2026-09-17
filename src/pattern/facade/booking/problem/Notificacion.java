package pattern.facade.booking.problem;

class Notificacion {

    public void enviarConfirmacion(String nombre, int numeroReserva) {
        System.out.println(
            "Enviando confirmación a " + nombre +
            ". Reserva #" + numeroReserva
        );
    }
}