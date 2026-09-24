package pattern.decorator.solution.decorators;

import pattern.decorator.solution.Entrada;

abstract class EntradaDecorator implements Entrada {
    protected Entrada entrada;
    public EntradaDecorator(Entrada entrada) {
        this.entrada = entrada;
    }

    @Override
    public double calcularPrecio() {
        return entrada.calcularPrecio();
    }

    @Override
    public String descripcion() {
        return entrada.descripcion();
    }
}