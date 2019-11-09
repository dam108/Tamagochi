package tamagochi;

public class Tamagochi {
    private int energia, hambre, suciedad, felicidad, exp, nivel;
    public String nombre;
    private final int MAX_EXP = 50, MIN_EXP = 0, MAX_LVL = 40, MIN_LVL = 0;
    
    /* CONSTRUCTOR*/
    Tamagochi(String n){
        nombre = n;
        energia = 10;
        hambre = 5;
        suciedad = 0;
        felicidad = 10;
        exp = 0;
        nivel = 0;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public void setSuciedad(int suciedad) {
        this.suciedad = suciedad;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public int getHambre() {
        return hambre;
    }

    public int getSuciedad() {
        return suciedad;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public int getExp() {
        return exp;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }
    
}
