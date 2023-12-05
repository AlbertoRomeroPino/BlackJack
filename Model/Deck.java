package Model;
// shuflle = Barajar = mover las cartas
// 2 arrays una por palo y otro por numero carta

import java.util.Arrays;
import java.util.Random;

public class Deck {

    private Card[] deckOfCards = new Card[52];

    public Card[] getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(Card[] deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public void assingCard() {
        for (int i = 0; i < deckOfCards.length; i++) {
            String[] palos = {"♥", "♠", "♦", "♣"};
            int contador = 0;

            for (String palo : palos) {
                for (int j = 1; j <= 13; j++) {
                    Card joker = new Card(j, palo);
                    deckOfCards[contador] = joker;
                    contador++;
                }
            }
        }
    }

    /**
     * Reparte una carta aleatoriamente
     * @return devuelve la carta aleatoria
     */
    public Card getRamdomCard() {
        Random randon = new Random();
        int randomCard;
        Card joker = new Card();
        do {
            randomCard = randon.nextInt(deckOfCards.length);

        }while (deckOfCards[randomCard] == null);

        joker = deckOfCards[randomCard];
        deckOfCards[randomCard] = null;
        return joker;
    }

}
