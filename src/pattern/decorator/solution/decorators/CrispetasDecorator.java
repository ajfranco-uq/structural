package pattern.decorator.solution.decorators;


import pattern.decorator.solution.Entrada;

public class CrispetasDecorator extends EntradaDecorator {

    public CrispetasDecorator(Entrada entrada) {
        super(entrada);
    }

    @Override
    public double calcularPrecio() {
        return entrada.calcularPrecio() + 8000;
    }

    @Override
    public String descripcion() {
        return entrada.descripcion() + " + Crispetas";
    }
}