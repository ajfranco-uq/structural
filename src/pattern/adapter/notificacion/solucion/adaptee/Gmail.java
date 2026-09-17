package pattern.adapter.notificacion.solucion.adaptee;
// ADAPTEE
// Servicio externo de correo electrónico.
//
// Tiene una interfaz completamente diferente.

public class Gmail {

    public void sendEmail(String correo, String asunto, String contenido) {

        System.out.println("Correo enviado a " + correo);
        System.out.println("Asunto: " + asunto);
        System.out.println("Contenido: " + contenido);
    }
}