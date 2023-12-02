package Model;
// shuflle = Baraja = todas las cartas con sus respectivos palos
import java.util.Arrays;

public class Deck {
    private int[] shuflle = new int[4];

    public int[] getShuflle() {
        return shuflle;
    }

    public void setShuflle(int[] shuflle) {
        this.shuflle = shuflle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Arrays.equals(shuflle, deck.shuflle);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "shuflle=" + Arrays.toString(shuflle) +
                '}';
    }
}
