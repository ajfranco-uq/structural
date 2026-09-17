package pattern.adapter.payment.solucion;// Adaptee
// Es una clase externa que queremos utilizar,
// pero su método tiene una interfaz diferente.

public class PayPal {

    public void pagarConPayPal(double valor) {

        System.out.println(
            "Procesando pago de $" + valor + " mediante PayPal"
        );
    }
}