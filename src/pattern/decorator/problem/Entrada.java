package pattern.decorator.problem;

public class Entrada {

    private String tipo;
    private double precio;

    private boolean incluyeCrispetas;
    private boolean incluyeBebida;
    private boolean incluyeGafas3D;

    public Entrada(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public double calcularPrecio() {

        double precioFinal = precio;

        if (incluyeCrispetas) {
            precioFinal += 8000;
        }

        if (incluyeBebida) {
            precioFinal += 5000;
        }

        if (incluyeGafas3D) {
            precioFinal += 4000;
        }

        return precioFinal;
    }

    public String descripcion() {

        String descripcion = tipo;

        if (incluyeCrispetas) {
            descripcion += " + Crispetas";
        }

        if (incluyeBebida) {
            descripcion += " + Bebida";
        }

        if (incluyeGafas3D) {
            descripcion += " + Gafas 3D";
        }

        return descripcion;
    }

    public void agregarCrispetas() {
        incluyeCrispetas = true;
    }

    public void agregarBebida() {
        incluyeBebida = true;
    }

    public void agregarGafas3D() {
        incluyeGafas3D = true;
    }
}