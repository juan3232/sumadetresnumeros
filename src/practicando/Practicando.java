package practicando;

import java.util.Scanner;

/**
 *
 * @author juanluishernandez
 */
public class Practicando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float Numero1, Numero2, Numero3, suma, resta, mul, div;
        System.out.println("diguite tres numero porfavor");

        Numero1 = entrada.nextFloat();
        Numero2 = entrada.nextFloat();
        Numero3 = entrada.nextFloat();

        suma = Numero1 + Numero2 + Numero3;
        resta = Numero1 - Numero2 - Numero3;
        mul = Numero1 * Numero2 * Numero3;
        div = Numero1 / Numero2 / Numero3;
        
        System.out.println("La suma de los tres numeros son  ------>"+suma);
        System.out.println("La resta de los tres numeros son ------>"+resta);
        System.out.println("La multiplicacion de los tres numeros son ----->"+mul);
        System.out.println("La division de los tres numeros son ------>"+div);
    }

}
