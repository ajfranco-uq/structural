package pattern.adapter.notificacion.solucion;

// CLIENT
//
// Este código NO conoce WhatsApp, SMS ni Gmail.
//
// Solo conoce la interfaz Notificador.

public class SistemaPedidos {

    private final Notificador notificador;

    public SistemaPedidos(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarAvisoPedido(String cliente, String mensaje) {

        System.out.println("Enviando notificación...");

        notificador.enviar(cliente, mensaje);

        System.out.println("Notificación procesada.");
    }
}