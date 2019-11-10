package tamagochi;

public class Tamagochi {
    private int energia, hambre, suciedad, felicidad, exp, nivel;
    public String nombre;
    private final int MAX_EXP = 100, gain_EXP = 50, MAX_LVL = 40, MIN_LVL = 1;
    private boolean contento, cansado,limpio, vivo, hambriento, flagMuerteEstados, flagMuerteNivelMax; 
    
    /* CONSTRUCTOR */
    
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
        hambriento = false;
        vivo = true;
        flagMuerteEstados = false;
        flagMuerteNivelMax = false;
    }

    /* ACIONES */
    public void updateEstado(){
        
        if(this.energia < 0) this.cansado = true;
        else this.cansado = false;
        if(this.hambre >10 ) this.hambriento = true;
        else this.hambriento = false;
        if (this.suciedad > 10) this.limpio = false;
        else this.limpio = true;
        if(this.felicidad <  0) this.contento = false;
        else this.contento = true;
        
        if ( this.contento == false && this.cansado == true && this.limpio == false && this.hambriento == true){
            flagMuerteEstados = true;
            this.vivo = false;
        }
        if (this.nivel > MAX_LVL ){
            flagMuerteNivelMax = true;
            this.vivo = false;
        }
    }
    
    public void jugar(){
        this.setFelicidad(this.getFelicidad() + 1);
        this.setEnergia(this.getEnergia()- 5);
        this.setHambre(this.getHambre() + 2);
        this.setSuciedad(this.getSuciedad() + 4);
        this.aumetarExpNivel();
    }
    
    public void comer(){
        this.setFelicidad(this.getFelicidad() - 5);
        this.setEnergia(this.getEnergia()+ 2);
        this.setHambre(this.getHambre() - 4);
        this.setSuciedad(this.getSuciedad() + 2);
        this.aumetarExpNivel();
    }
    
    public void limpiar(){
        this.setFelicidad(this.getFelicidad() - 3);
        this.setEnergia(this.getEnergia()- 5);
        this.setHambre(this.getHambre() + 3);
        this.setSuciedad(0);
        this.aumetarExpNivel();
    }
    
    public void dormir(){
        this.setFelicidad(this.getFelicidad() + 1);
        this.setEnergia(10);
        this.setHambre(this.getHambre() + 3);
        this.setSuciedad(this.getSuciedad() + 2);
        this.aumetarExpNivel();
    }
    
    public void matar(){
        this.setVivo(false);
    }
    
    public void aumetarExpNivel(){
        this.setExp(this.getExp()+gain_EXP);
        if (this.getExp() == MAX_EXP){
            this.setNivel(this.getNivel()+ MIN_LVL);
            this.setExp(0);
        }
    }

    /* FIN ACCIONES*/    
    
    /* Getters y Setters*/
    
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
    
    public void setHambriento(boolean hambriento) {
        this.hambriento = hambriento;
    }

    public boolean isHambriento() {
        return hambriento;
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
    
    public boolean isMuerteEstados(){
        return flagMuerteEstados;
    }
    
    public boolean isMuerteEdad(){
        return flagMuerteNivelMax;
    }
    
    /* Fin Getters y Setters*/
} // fin class