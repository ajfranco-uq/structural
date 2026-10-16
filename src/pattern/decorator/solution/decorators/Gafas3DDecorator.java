package pattern.decorator.solution.decorators;

import pattern.decorator.solution.Entrada;

public class Gafas3DDecorator extends EntradaDecorator{
    public Gafas3DDecorator(Entrada entrada) {
        super(entrada);
    }

    @Override
    public double calcularPrecio() {
        return entrada.calcularPrecio() + 3500;
    }

    @Override
    public String descripcion() {
        return entrada.descripcion() + " + Gafas 3D";
    }
}
