package tamagochi;
import java.util.Scanner;

public class Juego {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean vivo = true;
        int opcion;
        // pedimos el nombre para establecer en el tamagochi
        String nombre;
        nombre = pedirNombre();
        // creamos las instancias de los objetos tamagochi y tablero
        Tamagochi tamagochi = new Tamagochi(nombre);
        Tablero tablero = new Tablero();
        
        do{
            // pintamos el tablero 
            tablero.pintar(tamagochi);
            
            // elegimos una opcion del menu
            opcion = elegirOpcion();
            
            // pasamos opcion y instacia del objeto para que se ejecute cierta opcion
            ejecutarOpcion(opcion, tamagochi, tablero);
            
            // actualizamos los nuevos estados
            tamagochi.updateEstado();
            
            // comprobamos segun el estado si sigue vivo o no 
            vivo = tamagochi.isVivo();
            
            /*debug*/
            //System.out.println(vivo);
            
        } while (vivo);
        
        if (tamagochi.isMuerteEdad()) System.out.println(tamagochi.getNombre()+" ha muerto de viejo.");
        else if (tamagochi.isMuerteEstados()) System.out.println(tamagochi.getNombre()+" ha muerto por que no los has cuidado bien.");
        else System.out.println("No se por que ha muerto" +tamagochi.getNombre());

    } // fin main
    
    public static String pedirNombre(){
        System.out.println("¿ Como quieres llamar al tamagochi ?");
        String tamagochiName = teclado.nextLine();//teclado.nextLine();
        return tamagochiName;
    }
    
    public static int elegirOpcion(){
        System.out.println("¿Que actividad queires realizar?");
        System.out.print("Pulsa 1 para jugar con el. ");
        System.out.print("Pulsa 2 para darle de comer. ");
        System.out.print("Pulsa 3 para limpiarlo. ");
        System.out.print("Pulsa 4 para ponerlo a dormir.");
        System.out.print("Pulsa 5 para matarlo y Salir del juego ");
        System.out.println("");
        return teclado.nextInt();
    }

    public static void ejecutarOpcion(int opcion, Tamagochi t, Tablero ta){
               
        switch(opcion){
            case 1: 
                // animacion del tamagochi jugando
                ta.pintarAccion(t, opcion);
                // setear nuevo estado 
                t.jugar();
                break;
            case 2:
                // animacion del tamagochi jugando
                ta.pintarAccion(t, opcion);
                // setear nuevo estado 
                t.comer();
                break;
            case 3: 
                // animacion del tamagochi jugando
                ta.pintarAccion(t, opcion);
                // setear nuevo estado 
                t.limpiar();
                break;
            case 4: 
                // animacion del tamagochi jugando
                ta.pintarAccion(t, opcion);
                // setear nuevo estado 
                t.dormir();
                break;
            case 5: 
                // animacion del tamagochi jugando
                ta.pintarAccion(t, opcion);
                // setear nuevo estado 
                t.matar();
                break;
        }
        
    } // fin ejecutarOpcion
} // fin class
