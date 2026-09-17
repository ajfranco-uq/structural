package pattern.adapter.notificacion.problema;

public class SMS {

    public void mandarSMS(String telefono, String mensaje) {

        System.out.println(
            "SMS enviado al número " + telefono
        );

        System.out.println(
            "Mensaje: " + mensaje
        );
    }
}