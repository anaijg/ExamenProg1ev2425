import java.util.Scanner;

/**
 * @author Ana
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero = scanner.nextLine();
        int[] contadores = new int[10];
        while (numero.length() < 10) {
            if (numero.length() < 10) {
                System.out.println("El número debe tener al menos 10 cifras.");
                numero = scanner.nextLine();
            }
        }
        for (char cifra : numero.toCharArray()) {
            switch (cifra) {
                case '0' -> contadores[0]++;
                case '1' -> contadores[1]++;
                case '2' -> contadores[2]++;
                case '3' -> contadores[3]++;
                case '4' -> contadores[4]++;
                case '5' -> contadores[5]++;
                case '6' -> contadores[6]++;
                case '7' -> contadores[7]++;
                case '8' -> contadores[8]++;
                case '9' -> contadores[9]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (contadores[i] != 0)
                System.out.print("#" + i + " = " + contadores[i] + " ");
        }
    }
}

