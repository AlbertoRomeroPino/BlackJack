package View;

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
                n = IO.readInt();
            } catch (Exception e) {
                //Creo que me falta algo pero no lo se !¡
                System.out.println("No es valido insertar letras introduzca un numero");
                System.out.println("\n");
            }
            vuelta1 = false;
        } while (n <= 0 || n > 4);

        return n;
    }

    public static void insertName(int nPlayer){

        System.out.println("Introduzca el nombre del jugador " + (nPlayer));
    }
    public static void Rules() {
        System.out.println("Cada palo va desde el as hasta el 10 y el J, Q y K");
        System.out.println();
    }


}
