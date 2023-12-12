package Model;

import java.util.Objects;

public class Player {
    private String nombre;
    private Card[] mano;

    public Player(String nombre){
        this.nombre = nombre;
        this.mano=new Card[11];
    }
    public Player(){
        this.nombre = "Donquijote Doflamingo";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Card[] getMano() {
        return mano;
    }
    public void addCard(Card nueva){
        boolean insertada = false;
        for(int i=0;i<mano.length&&!insertada;i++){
            if(mano[i]==null){
                mano[i]=nueva;
                insertada=true;
            }
        }
    }
    public void setMano(Card[] mano) {
        this.mano = mano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(nombre, player.nombre);
    }

    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String mostrarMano() {
        StringBuilder manoStr = new StringBuilder("Mano de " + nombre + ": ");
        for (Card carta : mano) {
            if (carta != null) {
                manoStr.append(carta.toString()).append(" ");
            }
        }
        return manoStr.toString();
    }
}
