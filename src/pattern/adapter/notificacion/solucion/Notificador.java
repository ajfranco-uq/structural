package pattern.adapter.notificacion.solucion;
// TARGET
// Es la interfaz que nuestro sistema conoce y espera utilizar.

public interface Notificador {

    void enviar(String destinatario, String mensaje);
}