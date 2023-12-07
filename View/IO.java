package View;

import Model.Player;

import java.util.Scanner;

public class IO {

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

    public static boolean readBoolean(String arg) {
        int n;
        boolean x;
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        if (n == 1) {
            x = true;
        } else {
            x = false;
        }
        return x;
    }
}