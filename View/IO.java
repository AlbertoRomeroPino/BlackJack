package View;

import java.util.Scanner;

public class IO {
    public static void saludo() {
        System.out.println("Bienvenido al casino.");
        System.out.println();
        System.out.println("¿Cuantos jugadores sois? tienen que ser al menos 1 maximo 10 : ");

    }

    public static int readInt() {
        int n = 0;
        Scanner teclado = new Scanner(System.in);
        boolean vuelta1 = true;

        do {
            if (vuelta1 == false) {
                System.out.println("Por favor introduzca una cantidad de jugadores entre 1 y 10");
            }
            try {
                n = teclado.nextInt();
            } catch (Exception e) {
                teclado.nextLine();
                System.out.println("No es valido insertar letras introduzca un numero");
                System.out.println("\n");
            }
            vuelta1 = false;
        } while (n <= 0 || n > 10);

        return n;
    }
}
