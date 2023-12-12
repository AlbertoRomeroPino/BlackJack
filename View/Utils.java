package View;

import java.util.Scanner;

public class Utils {

    public static int readInt() {
        int n;
        Scanner teclado = new Scanner(System.in);
        return n = teclado.nextInt();
    }

    public static String readString() {
        String n;
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextLine();
        return n;
    }

}