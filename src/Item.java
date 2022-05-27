
public class Item {
    private String nombre;
    private int precio;
    private Object tipo;

    public Item(String nombre, int precio, Object tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
}
