package Model;

import java.util.Objects;

public class Player {
    private String nombre;
    private int cardUser;

    //Constructores
    public Player(String nombre, int card){
        this.nombre = nombre;
        cardUser=card;
    }
    public Player(){
        this("",0);
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCardUser() {
        return cardUser;
    }

    public void setCardUser(int cardUser) {
        this.cardUser = cardUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return cardUser == player.cardUser && Objects.equals(nombre, player.nombre);
    }

    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                ", cardUser=" + cardUser +
                '}';
    }
}
