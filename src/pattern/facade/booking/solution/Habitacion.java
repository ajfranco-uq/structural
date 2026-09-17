package pattern.facade.booking.solution;

class Habitacion {

    private int numero;
    private double precioPorNoche;

    public Habitacion(int numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }
}