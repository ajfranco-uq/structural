package pattern.adapter.payment.problema;

public class Main {

    public static void main(String[] args) {
        ExternalPayPal paypal = new ExternalPayPal();

        paypal.pagarConPayPal(150000);
    }
}
