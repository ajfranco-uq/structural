package pattern.facade.onlineshop.problem;

import pattern.facade.onlineshop.Envio;
import pattern.facade.onlineshop.Factura;
import pattern.facade.onlineshop.Inventario;
import pattern.facade.onlineshop.Pago;

public class Main {

    public static void main(String[] args) {

        // El cliente debe conocer todos los subsistemas
        Inventario inventario = new Inventario();
        Pago pago = new Pago();
        Envio envio = new Envio();
        Factura factura = new Factura();

        // El cliente debe conocer el orden de las operaciones
        if (inventario.verificarProducto()) {

            if (pago.procesarPago()) {

                envio.crearEnvio();
                factura.generarFactura();

                System.out.println("Compra realizada correctamente");

            } else {
                System.out.println("Pago rechazado");
            }

        } else {
            System.out.println("Producto no disponible");
        }
    }
}