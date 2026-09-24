package pattern.proxy.problem;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Andrés", true);

        ServicioPelicula servicio = new ServicioPeliculaReal();

        if (usuario.isAutenticado()) {
            servicio.obtenerInformacion();
        } else {
            System.out.println("Acceso denegado.");
        }
    }

//    El cliente tiene que conocer y controlar las reglas de acceso al servicio.

//    Si mañana necesitamos agregar:
//    * registrar cada acceso,
//    * validar diferentes tipos de usuarios,
//    * verificar permisos,
//    * controlar sesiones,
//    * crear el servicio solamente cuando sea necesario,
//    * el Main comenzaría a llenarse de lógica relacionada con el acceso.
}