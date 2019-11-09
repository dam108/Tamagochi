package tamagochi;

public class EstadoTama {
    private boolean contento, cansado,limpio, vivo;
    private final int MAX_ES = 10, MIN_ES = 0;

    
    /* CONSTRUCTOR*/
    EstadoTama() {
        contento = true;
        cansado = false;
        limpio = true;
        vivo = true;
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
