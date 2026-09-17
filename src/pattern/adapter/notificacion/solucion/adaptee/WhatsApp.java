package pattern.adapter.notificacion.solucion.adaptee;
// ADAPTEE
// Simula una API externa de WhatsApp.
//
// No podemos modificar esta clase.
// Su método tiene una interfaz diferente a Notificador.

public class WhatsApp {

    public void enviarMensaje(String numero, String texto) {
        System.out.println("WhatsApp enviado a " + numero);
        System.out.println("Mensaje: " + texto
        );
    }
}