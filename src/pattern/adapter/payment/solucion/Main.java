package pattern.adapter.payment.solucion;

public class Main {

    public static void main(String[] args) {

        // Creamos el servicio externo
        PayPal paypal = new PayPal();

        // Creamos el Adapter
        Pago pagoPayPalAdapter = new PagoPayPalAdapter(paypal);

        // Creamos la tienda
        Tienda tienda = new Tienda();

        // La tienda trabaja con Pago,
        // no necesita conocer directamente a PayPal.
        tienda.comprar(pagoPayPalAdapter, 150000);
    }
}