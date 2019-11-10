package tamagochi;
import java.util.Scanner;

public class Juego {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre;
        nombre = pedirNombre();
        
        Tamagochi tamagochi = new Tamagochi(nombre);
        Tablero tablero = new Tablero();
        
        tablero.pintar(tamagochi);

    }
    
    public static String pedirNombre(){
        System.out.println("¿ Como quieres llamar al tamagochi ?");
        String tamagochiName = teclado.nextLine();//teclado.nextLine();
        return tamagochiName;
    }
    
}