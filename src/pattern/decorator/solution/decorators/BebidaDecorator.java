package pattern.decorator.solution.decorators;

import pattern.decorator.solution.Entrada;

public class BebidaDecorator extends EntradaDecorator {

    public BebidaDecorator(Entrada entrada) {
        super(entrada);
    }

    @Override
    public double calcularPrecio() {
        return entrada.calcularPrecio() + 5000;
    }

    @Override
    public String descripcion() {
        return entrada.descripcion() + " + Bebida";
    }
}