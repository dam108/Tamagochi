package tamagochi;

public class Tamagochi {
    private int energia, hambre, suciedad, felicidad, exp, nivel;
    public String nombre;
    private final int MAX_EXP = 50, MIN_EXP = 0, MAX_LVL = 40, MIN_LVL = 0, MAX_ES = 10, MIN_ES = 0;
    private boolean contento, cansado,limpio, vivo;
    
    /* CONSTRUCTOR*/
    Tamagochi(String n){
        nombre = n;
        energia = 10;
        hambre = 5;
        suciedad = 0;
        felicidad = 10;
        exp = 0;
        nivel = 0;
        contento = true;
        cansado = false;
        limpio = true;
        vivo = true;
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
    
    public void setContento(boolean contento) {
        this.contento = contento;
    }

    public void setCansado(boolean cansado) {
        this.cansado = cansado;
    }

    public void setLimpio(boolean limpio) {
        this.limpio = limpio;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isContento(){
        return contento;
    }

    public boolean isCansado() {
        return cansado;
    }

    public boolean isLimpio() {
        return limpio;
    }

    public boolean isVivo() {
        return vivo;
    }
    
}
