package pattern.adapter.notificacion.problema;

public class Gmail {

    public void enviarCorreo(
            String destinatario,
            String asunto,
            String contenido) {

        System.out.println(
            "Correo enviado a " + destinatario
        );

        System.out.println(
            "Asunto: " + asunto
        );

        System.out.println(
            "Contenido: " + contenido
        );
    }
}