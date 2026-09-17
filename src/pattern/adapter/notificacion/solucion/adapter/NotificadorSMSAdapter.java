package pattern.adapter.notificacion.solucion.adapter;

// ADAPTER

import pattern.adapter.notificacion.solucion.Notificador;
import pattern.adapter.notificacion.solucion.adaptee.SMS;

public class NotificadorSMSAdapter implements Notificador {

    private final SMS sms;

    public NotificadorSMSAdapter(SMS sms) {
        this.sms = sms;
    }

    @Override
    public void enviar(String destinatario, String mensaje) {

        // Traducimos nuestra interfaz
        // a la interfaz del servicio SMS.

        sms.mandarSMS(destinatario, mensaje);
    }
}