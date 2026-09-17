package pattern.adapter.notificacion.problema;

public class Main {

    public static void main(String[] args) {

        WhatsApp whatsapp = new WhatsApp();
        SMS sms = new SMS();
        Gmail gmail = new Gmail();

        SistemaPedidos sistema =
                new SistemaPedidos(
                    whatsapp,
                    sms,
                    gmail
                );

        sistema.enviarPorWhatsApp(
            "3001234567",
            "Su pedido ha sido enviado."
        );

        sistema.enviarPorSMS(
            "3109876543",
            "Su pedido está listo."
        );

        sistema.enviarPorGmail(
            "cliente@gmail.com",
            "Su pedido ha sido entregado."
        );
    }
}