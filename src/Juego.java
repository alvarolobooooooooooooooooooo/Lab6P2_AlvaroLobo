
public class Juego {
    private String nombre;
    private int costo;
    private int recompensa;
    private int prob;

    public Juego(String nombre, int costo, int recompensa, int prob) {
        this.nombre = nombre;
        this.costo = costo;
        this.recompensa = recompensa;
        this.prob = prob;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public int getProb() {
        return prob;
    }

    public void setProb(int prob) {
        this.prob = prob;
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", costo=" + costo + ", recompensa=" + recompensa + ", prob=" + prob + '}';
    }
    
}
