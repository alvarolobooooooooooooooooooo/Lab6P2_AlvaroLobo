
import java.util.ArrayList;


public class Cuenta {
    private String nombre;
    private String pass;
    private int dinero;
    private boolean socio;
    private ArrayList <Item> items = new ArrayList();
    private ArrayList <Casa> casas = new ArrayList();

    public Cuenta(String nombre, String pass, int dinero, boolean socio) {
        this.nombre = nombre;
        this.pass = pass;
        this.dinero = dinero;
        this.socio = socio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", pass=" + pass + ", dinero=" + dinero + ", socio=" + socio + ", items=" + items + ", casas=" + casas + '}';
    }

    


    
}
