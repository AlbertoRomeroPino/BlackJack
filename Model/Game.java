package Model;

import View.IO;

import java.util.Arrays;
import java.util.Objects;

public class Game {

    private Deck[] deck;
    private int turn;
    private Player jugadores;

    public Deck[] getDeck() {
        return deck;
    }

    public void setDeck(Deck[] deck) {
        this.deck = deck;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public Player getJugadores() {
        return jugadores;
    }

    public void setJugadores(Player jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return turn == game.turn && Arrays.equals(deck, game.deck) && Objects.equals(jugadores, game.jugadores);
    }

    @Override
    public String toString() {
        return "Game{" +
                "deck=" + Arrays.toString(deck) +
                ", turn=" + turn +
                ", jugadores=" + jugadores +
                '}';
    }

    public  void gameSolitario(Player jugadores) {


    }

    public static int gameCompetitivo(Player[] jugadores, int nPlayer) {
        int n = 0;
        return n;
    }
}

