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
            if (!t.isHambriento())System.out.print("Sin hambre, ");
            else System.out.print("Hambriento, ");
            if (t.isCansado())System.out.print("Cansado y ");
            else System.out.print("Descansado y ");
            if (t.isLimpio())System.out.print("Limpio.");
            else System.out.print("Sucio.");
            System.out.println("\n");
            
            if (t.isContento() && !t.isCansado() && t.isLimpio() ){
                System.out.println(t.getNombre()+" Esta perfecto! ");
                System.out.println(".....  ~~~  .....");
                System.out.println(".....  o o   ....");
                System.out.println(".... (  _  ) ....");
                System.out.println("...... \""+" "+"\" ......");
                System.out.println("\n");
            }
            else {
                System.out.println(t.getNombre()+" requiere atencion! ");
                System.out.println(".....  ~~~  .....");
                System.out.println(".....  # #   ....");
                System.out.println(".... (  _  ) ....");
                System.out.println("...... \""+" "+"\" ......");
                System.out.println("\n");
            }
            
            System.out.print("Su Energia es "+t.getEnergia()+", su Hambre es "+t.getHambre());
            System.out.print(", su Felicidad es "+t.getFelicidad());
            System.out.print(", su Suciedad es "+t.getSuciedad());
            System.out.print(", su Experiencia es "+t.getExp());
            System.out.print(" y su Nivel es "+t.getNivel());
            System.out.println("\n");
            
        }

    } // fin pintar();
    
    public void pintarAccion(Tamagochi t,int opcion){
        
        if (opcion == 1){
            System.out.println("-------------------------------");
            System.out.println("Acabas de jugar con "+t.getNombre()+" aumenta la felicidad, el hambre y la suciedad , disminuye la energia.");  
        }
        if (opcion == 2){
            System.out.println("-------------------------------");
            System.out.println("Acabas de dar de comer a "+t.getNombre()+" aumenta la energia, la felicidad y la suciedad , disminuye el hambre.");  
        }
        if (opcion == 3){
            System.out.println("-------------------------------");
            System.out.println("Acabas de limpiar a "+t.getNombre()+" aumenta la felicidad y el hambre, desminuye la energia y la suciedad.");  
        }
        if (opcion == 4){
            System.out.println("-------------------------------");
            System.out.println("Acabas de dormir a "+t.getNombre()+" aumenta la felicidad, el hambre, la energia y la suciedad.");  
        }
        if (opcion == 5){
            System.out.println("-------------------------------");
            System.out.println("Acabas de matar a "+t.getNombre()+".");
        }
 
    } // fin pintarAccion();
}     // fin class
