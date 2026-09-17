package pattern.adapter.payment.solucion;// Cliente
// La tienda solamente conoce la interfaz Pago.
// No necesita saber cómo funciona PayPal.

public class Tienda {

    public void comprar(Pago pago, double monto) {

        System.out.println("Iniciando compra...");

        pago.realizarPago(monto);

        System.out.println("Compra finalizada.");
    }
}