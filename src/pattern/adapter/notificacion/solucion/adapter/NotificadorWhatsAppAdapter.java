package pattern.adapter.notificacion.solucion.adapter;
// ADAPTER
//
// Convierte la interfaz de WhatsApp
// a la interfaz Notificador.

import pattern.adapter.notificacion.solucion.Notificador;
import pattern.adapter.notificacion.solucion.adaptee.WhatsApp;

public class NotificadorWhatsAppAdapter implements Notificador {

    private final WhatsApp whatsapp;

    public NotificadorWhatsAppAdapter(WhatsApp whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Override
    public void enviar(String destinatario, String mensaje) {

        // Traducimos la llamada:

        // Nuestro sistema:
        // enviar(destinatario, mensaje)

        // WhatsApp:
        // enviarMensaje(numero, texto)

        whatsapp.enviarMensaje(destinatario, mensaje);
    }
}