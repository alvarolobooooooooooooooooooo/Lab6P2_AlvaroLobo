
import java.awt.Color;


public class Puffle {
    private String nombre;
    private int precio;

    public Puffle(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
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

    @Override
    public String toString() {
        return "Puffle{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
