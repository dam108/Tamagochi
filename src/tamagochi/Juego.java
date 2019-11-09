package tamagochi;
import java.util.Scanner;

public class Juego {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre;
        
        System.out.println("Ha nacido un nuevo Tamagochi ¿como quieres llamarlo?");
        nombre = teclado.nextLine();
        
        // creamos las instancias necesarias para que el tamagochi este vivo
        Tamagochi tamagochi = new Tamagochi(nombre);
        EstadoTama estado = new EstadoTama();
        Tablero tablero = new Tablero();

    }
    
}

