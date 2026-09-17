package pattern.adapter.notificacion.solucion.adapter;

// ADAPTER

import pattern.adapter.notificacion.solucion.adaptee.Gmail;
import pattern.adapter.notificacion.solucion.Notificador;

public class NotificadorGmailAdapter implements Notificador {

    private Gmail gmail;

    public NotificadorGmailAdapter(Gmail gmail) {
        this.gmail = gmail;
    }

    @Override
    public void enviar(String destinatario, String mensaje) {

        String asunto = "Notificación del sistema";

        // El Adapter transforma:
        // enviar(destinatario, mensaje)
        // en:
        // sendEmail(correo, asunto, contenido)

        gmail.sendEmail(destinatario, asunto, mensaje);
    }
}