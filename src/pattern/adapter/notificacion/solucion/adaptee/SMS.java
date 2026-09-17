package pattern.adapter.notificacion.solucion.adaptee;
// ADAPTEE
// Otra API externa.
//
// Nuevamente, su método tiene un nombre diferente.

public class SMS {

    public void mandarSMS(String telefono, String mensaje) {
        System.out.println("SMS enviado al número " + telefono);
        System.out.println("Mensaje: " + mensaje);
    }
}