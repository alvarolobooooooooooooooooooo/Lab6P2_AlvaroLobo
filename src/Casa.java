
public class Casa {
    private String nombre;
    private int tamano;
    private int costo;
    private int cordX;
    private int cordY;

    public Casa(String nombre, int tamano, int costo, int cordX, int cordY) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.costo = costo;
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCordX() {
        return cordX;
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    @Override
    public String toString() {
        return "Casa{" + "nombre=" + nombre + ", tamano=" + tamano + ", costo=" + costo + ", cordX=" + cordX + ", cordY=" + cordY + '}';
    }


    
    
}
