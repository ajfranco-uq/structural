package pattern.composite.problem2;

public abstract class ElementoMusical {

    protected String nombre;
    protected TipoElemento tipo;

    public ElementoMusical(String nombre, TipoElemento tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoElemento getTipo() {
        return tipo;
    }
}