package pattern.facade.booking.problem;

class Pago {

    public boolean realizarPago(double valor) {
        System.out.println("Procesando pago de $" + valor);
        return true;
    }
}