package tamagochi;

public class Tablero {
    
    /* CONSTRUCTOR*/
    Tablero(){
        
    }
    
    public void pintar(Tamagochi t){
        
        System.out.println("-------------------------------");
        if (t.isVivo()){
            System.out.println("El Tamagochi se llama: "+t.getNombre() +".");
            System.out.print("En este momento ");
            System.out.print(t.getNombre()+ " esta ");
            if (t.isContento())System.out.print("Contento, ");
            else System.out.print("Descontento, ");
            if (t.isCansado())System.out.print("Cansado y ");
            else System.out.print("Descansado y ");
            if (t.isLimpio())System.out.print("Limpio.");
            else System.out.print("Sucio.");
            System.out.println("\n\n");
            
            if (t.isContento() && !t.isCansado() && t.isLimpio() ){
                System.out.println(".....  ~~~  .....");
                System.out.println(".....  o o   ....");
                System.out.println(".... (  _  ) ....");
                System.out.println("...... \""+" "+"\" ......");
                System.out.println("\n\n");
            }
            else {
                System.out.println(".....  ~~~  .....");
                System.out.println(".....  # #   ....");
                System.out.println(".... (  _  ) ....");
                System.out.println("...... \""+" "+"\" ......");
                System.out.println("\n\n");
            }
            
            System.out.print("Su Energia es "+t.getEnergia()+", su Hambre es "+t.getHambre());
            System.out.print(", su Felicidad es "+t.getFelicidad());
            System.out.print(", su Suciedad es "+t.getSuciedad());
            System.out.print(", su Experiencia es "+t.getExp());
            System.out.print(" y su Nivel es "+t.getNivel());
            System.out.println("\n\n");
            
        }

    } // fin pintar();
}     // fin class
