package pattern.facade.onlineshop.solution;

import pattern.facade.onlineshop.Factura;
import pattern.facade.onlineshop.Envio;
import pattern.facade.onlineshop.Inventario;
import pattern.facade.onlineshop.Pago;

class TiendaFacade {

    private Inventario inventario;
    private Pago pago;
    private Envio envio;
    private Factura factura;

    public TiendaFacade() {
        inventario = new Inventario();
        pago = new Pago();
        envio = new Envio();
        factura = new Factura();
    }

    public void realizarCompra() {

        if (!inventario.verificarProducto()) {
            System.out.println("Producto no disponible");
            return;
        }

        if (!pago.procesarPago()) {
            System.out.println("Pago rechazado");
            return;
        }

        envio.crearEnvio();
        factura.generarFactura();

        System.out.println("Compra realizada correctamente");
    }
}