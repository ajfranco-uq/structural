package pattern.decorator.solution;

class EntradaNormal implements Entrada {

    @Override
    public double calcularPrecio() {
        return 15000;
    }

    @Override
    public String descripcion() {
        return "Entrada normal";
    }
}