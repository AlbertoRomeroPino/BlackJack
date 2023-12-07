package Controller;


import Model.Game;
import Model.Player;
import View.IO;
import View.Vista;

public class MainController {
    public static void main() {
        //reglas del jogo

        //Empezar == Numero de jugadores
        Vista.saludo();
        int nPlayer = Vista.readHome();

        if (nPlayer == 1) {
            Vista.insertName(1);
            onePlayer();
        } else {
            for (int i = 1; i <= nPlayer; i++) {
                Vista.insertName(i);
                morePlayer(nPlayer, i);
            }
        }

        //Jugar == pide al jugador que quiere hacer (1 coger carta, 2 terminar ronda)
        Game.partida(nPlayer);
        //Finalizar juego == Decir quien a ganado o si an empatado dependiendo cuantos ganen
    }

    /**
     * Insertar un usuario porque es el jugador solitario
     */
    public static void onePlayer() {
        Player player = new Player(IO.readString());
    }

    /**
     * Inserta los nombres de los jugadores en la clase players
     * @param nPlayer El numero de jugadores que van a ponerse nombres
     * @param i Contador que viene para poder almacenar todos los jugadores
     */
    public static void morePlayer(int nPlayer, int i) {
        Player[] players = new Player[nPlayer];

        players[i - 1] = new Player();
        players[i - 1].setNombre(IO.readString());
    }

}
