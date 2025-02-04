import java.util.Arrays;
import java.util.Random;

/**
 * @author Ana
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-15, 16);
        }

        int suma = 0;
        int multiplosde5 = 0 ;
        for (int elemento: array) {
            suma += elemento;
            if (elemento % 5 == 0) {
                multiplosde5++;
            }
        }
        System.out.println("Suma de todos los elementos del array: " + suma);

        System.out.println("El array contiene " + multiplosde5 + " múltiplos de 5.");

        Arrays.sort(array);
        System.out.println("Array ordenado: ");
        System.out.println(Arrays.toString(array));

        int[] alReves = new int[array.length];
        int indice = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            alReves[indice] = array[i];
            indice++;
        }
        System.out.println("Array al revés: ");
        System.out.println(Arrays.toString(alReves));
    }
}
