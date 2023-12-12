package View;

import Model.Player;

public class Vista {
    public static void saludo() {
        System.out.println("Bienvenido al casino.");
        System.out.println();
        System.out.println("¿Cuantos jugadores sois? tienen que ser al menos 1 maximo 4 : ");
    }

    public static int readHome() {
        int n = 0;
        boolean vuelta1 = true;

        do {
            if (vuelta1 == false) {
                System.out.println("Por favor introduzca una cantidad de jugadores entre 1 y 4");
            }
            try {
                n = Utils.readInt();
            } catch (Exception e) {
                //Creo que me falta algo pero no lo se !¡
                System.out.println("No es valido insertar letras introduzca un numero");
                System.out.println("\n");
            }
            vuelta1 = false;
        } while (n <= 0 || n > 4);

        return n;
    }

    public static void insertName(int nPlayer) {

        System.out.println("Introduzca el nombre del jugador " + (nPlayer));
    }
    public static void inprimirNombre(Player jugador){
        System.out.println(jugador.getNombre() );
    }

    public static void Rules() {
        System.out.println("Deseas refrescar las reglas [S si, cualquier otro no]");
        String R = Utils.readString();
        if (R == "S" || R == "s") {
            System.out.println("Cada palo va desde el as(1) hasta el 10 y el J, Q y K");
            System.out.println("El As se mostrara como 1 y su valor es tanto 1 como 11. Esto dependera si su valor se pasa de 21");
            System.out.println("J, Q y K que son los numeros 11, 12 y 13 tendran un valor de 10");
            System.out.println("El ganador es el que mas se acerque a 21 sin pasarse. Si sale As y (J o Q o K) se considera :");
            System.out.println("BLACK JACK     esto significa que solo te pueden igualar con la misma mano");
            System.out.println("Esto solo puede salir en las 2 primeras cartas si tienes mas de 2 no se podria hacer BLACK JACK");
        }
    }


}
