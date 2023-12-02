package Controller;


import View.IO;

public class mainController {
    public static void main() {

        //Empezar == Numero de jugadores, Nombre de jugadores
        IO.saludo();
        int[] players = new int[IO.readInt()];
        //Asignar nombre al jugador

        //Jugar == pide al jugador que quiere hacer (1 coger carta, 2 terminar ronda)

        //Finalizar juego == Decir quien a ganado o si an empatado dependiendo cuantos ganen
    }
}
