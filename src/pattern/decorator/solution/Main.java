package pattern.decorator.solution;

import pattern.decorator.solution.decorators.BebidaDecorator;
import pattern.decorator.solution.decorators.CrispetasDecorator;

public class Main {

    public static void main(String[] args) {

        // 1. Creamos la entrada básica
        Entrada entrada = new EntradaNormal();

        System.out.println(entrada.descripcion());
        System.out.println("Precio: $" + entrada.calcularPrecio());

        // 2. Agregamos crispetas
        entrada = new CrispetasDecorator(entrada);

        System.out.println("\n" + entrada.descripcion());
        System.out.println("Precio: $" + entrada.calcularPrecio());

        // 3. Agregamos una bebida
        entrada = new BebidaDecorator(entrada);

        System.out.println("\n" + entrada.descripcion());
        System.out.println("Precio: $" + entrada.calcularPrecio());

        // 4. Y podemos agregar más si se desea
        // entrada = new Gafas3DDecorator(entrada);

        // System.out.println("\n" + entrada.descripcion());
        // System.out.println("Precio: $" + entrada.calcularPrecio());
    }
}