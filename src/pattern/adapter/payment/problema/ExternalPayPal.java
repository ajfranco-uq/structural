package pattern.adapter.payment.problema;

public class ExternalPayPal {

    public void pagarConPayPal(double valor) {
        System.out.println("Pagando $" + valor + " con PayPal");
    }
}