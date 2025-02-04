import java.util.Scanner;

/**
 * @author Ana
 *
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperatura = scanner.nextInt();
        if (temperatura > 100) {
            System.out.println("No se ha introducido ninguna temperatura inferior a 100.");
        }
        int maxima = temperatura;
        int contador = 0;
        while (temperatura < 100) {
            if (temperatura < 100 && maxima < temperatura) {
                maxima = temperatura;
                contador++;
            } else if (temperatura >= 100 && contador == 0) {
                System.out.println("No se ha introducido ninguna temperatura inferior a 100.");
            }
            temperatura = scanner.nextInt();
        }
        if (contador > 0) {
            System.out.println(maxima);
        }
    }
}
