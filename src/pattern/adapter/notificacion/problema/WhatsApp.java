package pattern.adapter.notificacion.problema;

public class WhatsApp {

    public void enviarMensaje(String numero, String texto) {

        System.out.println(
            "WhatsApp enviado a " + numero
        );

        System.out.println(
            "Mensaje: " + texto
        );
    }
}