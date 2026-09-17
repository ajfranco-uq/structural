package pattern.adapter.payment.solucion;// Adapter
// Convierte la interfaz de PayPal a la interfaz
// que nuestro sistema espera: Pago.

public class PagoPayPalAdapter implements Pago {

    private PayPal paypal;

    public PagoPayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    // Nuestro sistema llama realizarPago()
    // El Adapter traduce esa llamada a pagarConPayPal()
    @Override
    public void realizarPago(double monto) {

        paypal.pagarConPayPal(monto);
    }
}