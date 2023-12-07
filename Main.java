import Controller.MainController;
import Model.Player;

public class Main {
    public static void main(String[] args) {
        MainController.main () ;

        System.out.println("");
        System.out.println("Comprobación de llegar al final");
        System.out.println("----------------------");
        Player i = new Player();
        System.out.println(i.getNombre());
    }
}
// En View en el catch no se si me falta algo o si eso compruebalo en clase

// get = conseguir
// set = colocar