package pattern.adapter.notificacion.solucion.adapter;

import pattern.adapter.notificacion.solucion.Notificador;

public class NotificadorTelegramAdapter implements Notificador {
    @Override
    public void enviar(String destinatario, String mensaje) {
        //Sistema externo telegram -> enviar mensaje
    }
}
