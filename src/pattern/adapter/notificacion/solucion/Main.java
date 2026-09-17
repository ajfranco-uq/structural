package pattern.adapter.notificacion.solucion;

import pattern.adapter.notificacion.solucion.adaptee.Gmail;
import pattern.adapter.notificacion.solucion.adaptee.SMS;
import pattern.adapter.notificacion.solucion.adaptee.WhatsApp;
import pattern.adapter.notificacion.solucion.adapter.NotificadorGmailAdapter;
import pattern.adapter.notificacion.solucion.adapter.NotificadorSMSAdapter;
import pattern.adapter.notificacion.solucion.adapter.NotificadorWhatsAppAdapter;

public class Main {

    public static void main(String[] args) {

        // ---------------------------------
        // WHATSAPP
        // ---------------------------------

        WhatsApp whatsapp = new WhatsApp();

        Notificador whatsappAdapter = new NotificadorWhatsAppAdapter(whatsapp);

        SistemaPedidos sistemaWhatsApp = new SistemaPedidos(whatsappAdapter);

        sistemaWhatsApp.enviarAvisoPedido("3001234567", "Su pedido ha sido enviado.");


        System.out.println("\n--------------------\n");


        // ---------------------------------
        // SMS
        // ---------------------------------

        SMS sms = new SMS();

        Notificador smsAdapter = new NotificadorSMSAdapter(sms);

        SistemaPedidos sistemaSMS = new SistemaPedidos(smsAdapter);

        sistemaSMS.enviarAvisoPedido("3109876543", "Su pedido está listo.");


        System.out.println("\n--------------------\n");


        // ---------------------------------
        // GMAIL
        // ---------------------------------

        Gmail gmail = new Gmail();

        Notificador gmailAdapter = new NotificadorGmailAdapter(gmail);

        SistemaPedidos sistemaEmail = new SistemaPedidos(gmailAdapter);

        sistemaEmail.enviarAvisoPedido("cliente@gmail.com", "Su pedido ha sido entregado.");


        // TODO: Que pasa si luego se quiere agregar otro medio de notifiación? -> Agregar Telegram
    }
}