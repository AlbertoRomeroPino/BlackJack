package Controller;

import Model.Card;
import Model.Deck;
import Model.Player;
import View.Utils;
import View.Vista;

public class MainController {
    private Deck deck;
    private Player[] jugador;

    public MainController(){
        this.deck = new Deck();
    }

    public void Start() {


        //Empezar == Numero de jugadores
        Vista.saludo();
        int nPlayer = Vista.readHome();

        //reglas del jogo
        Vista.Rules();


        if (nPlayer == 1) {
            Vista.insertName(1);
            jugador = new Player[nPlayer+1];
            onePlayer(jugador);


            //juego
            Vista.inprimirNombre(jugador[0]);        //sout("Aquí puedes ver su mano")

            for (int i = 0; i<2; i++) {
                dealInitialHands();

            }
            for (Player player : jugador) {
                Vista.inprimirNombre(player);
                System.out.println(player.mostrarMano());
            }

        }

    }

    /**
     * Insertar un usuario porque es el jugador solitario
     */
    public  void onePlayer(Player[] jugador) {
        jugador[0] = new Player();
        jugador[0].setNombre(Utils.readString());

        //crear IA
        jugador[1] = new Player();
        jugador[1].setNombre("IA");

    }

    private void dealInitialHands() {
        for (Player player : jugador) {
            Vista.inprimirNombre(player);
            for (int i = 0; i < 2; i++) {
                Card newCard = deck.getRamdomCard();
                player.addCard(newCard);
            }
        }
    }

}
