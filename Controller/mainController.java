package Controller;


import Model.Game;
import Model.Player;
import View.IO;
import View.View;

public class mainController {
    public static void main() {
    //reglas del jogo

        //Empezar == Numero de jugadores
        View.saludo();
        int nPlayer = View.readHome();
        Game.name(nPlayer);     // Esto comunica con Game y sirve para pasar el numero de jugadores

        //Asignar nombre al jugador

        //Jugar == pide al jugador que quiere hacer (1 coger carta, 2 terminar ronda)

        //Finalizar juego == Decir quien a ganado o si an empatado dependiendo cuantos ganen
    }


}
