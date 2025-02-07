import java.util.Scanner;

/**
 * @author Ana
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fecha = scanner.nextLine().split("-");
        if (fecha[0].length() != 4 || fecha[1].length() != 2 || fecha[2].length() != 2) {
            System.out.println("Formato de fecha incorrecto. Formato correcto: YYYY-MM-DD");
        } else {
            boolean fechaCorrecta = true;

            int año = Integer.parseInt(fecha[0]);
            if (año < 0 || año > 2025) {
                System.out.println("El año es un número entre 0 y 2025");
                fechaCorrecta = false;
            }

            int mes = Integer.parseInt(fecha[1]);
            if (mes < 1 || mes > 12) {
                System.out.println("El mes es un número entre 1 y 12");
                fechaCorrecta = false;
            }

            int dia = Integer.parseInt(fecha[2]);
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 1 || dia > 31) ||
                    (mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
                System.out.println("El día introducido no es posible dentro del mes " + mes);
                fechaCorrecta = false;
            }

            if (fechaCorrecta) {
                System.out.println(fecha[2] + "/" + fecha[1] + "/" + fecha[0]);
            }
        }
    }
}
