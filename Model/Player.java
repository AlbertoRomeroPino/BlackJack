package Model;

public class Player {
    private String nombre;

    public Player(String nombre){
        this.nombre = nombre;
    }
    public Player(){
        this.nombre = "Donquijote Doflamingo";
    }

    public static void mano (){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
