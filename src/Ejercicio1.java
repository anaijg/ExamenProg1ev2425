import java.util.Scanner;

/**
 * @author Ana
 *
 *
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numeros = scanner.nextLine().split(" ");

        int numero1 = Integer.parseInt(numeros[0]);
        int numero2 = Integer.parseInt(numeros[1]);
        int numero3 = Integer.parseInt(numeros[2]);

        if (numero1 >= numero2 && numero1 <= numero3 || numero1 <= numero2 && numero1 >= numero3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
