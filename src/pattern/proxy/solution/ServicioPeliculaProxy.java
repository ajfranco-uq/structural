package pattern.proxy.solution;

public class ServicioPeliculaProxy implements ServicioPelicula {

    private ServicioPeliculaReal servicioReal;
    private boolean autenticado;

    public ServicioPeliculaProxy(boolean autenticado) {
        this.autenticado = autenticado;
    }

    @Override
    public void obtenerInformacion() {

        System.out.println("Verificando acceso...");

        if (!autenticado) {
            System.out.println("Acceso denegado.");
            return;
        }

        System.out.println("Acceso permitido.");

        if (servicioReal == null) {
            servicioReal = new ServicioPeliculaReal();
        }

        servicioReal.obtenerInformacion();
    }
}