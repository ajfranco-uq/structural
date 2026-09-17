package pattern.adapter.notificacion.problema;

//El código funciona, pero SistemaPedidos está acoplado directamente a WhatsApp, SMS y Gmail.

public class SistemaPedidos {

    private WhatsApp whatsapp;
    private SMS sms;
    private Gmail gmail;

    public SistemaPedidos(WhatsApp whatsapp, SMS sms, Gmail gmail) {

        this.whatsapp = whatsapp;
        this.sms = sms;
        this.gmail = gmail;
    }

    public void enviarPorWhatsApp(String numero, String mensaje) {

        whatsapp.enviarMensaje(
            numero,
            mensaje
        );
    }

    public void enviarPorSMS(String telefono, String mensaje) {

        sms.mandarSMS(
            telefono,
            mensaje
        );
    }

    public void enviarPorGmail(String correo, String mensaje) {

        String asunto = "Notificación del sistema";

        gmail.enviarCorreo(
            correo,
            asunto,
            mensaje
        );
    }

    // Que pasa si luego se quiere agregar otro medio de notifiación? -> Agregar Telegram
}