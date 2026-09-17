package pattern.adapter.payment.solucion;

// Target
// Es la interfaz que nuestro sistema espera utilizar.
public interface Pago {

    void realizarPago(double monto);
}