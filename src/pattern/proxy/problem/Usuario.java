package pattern.proxy.problem;

public class Usuario {

    private String nombre;
    private boolean autenticado;

    public Usuario(String nombre, boolean autenticado) {
        this.nombre = nombre;
        this.autenticado = autenticado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAutenticado() {
        return autenticado;
    }
}