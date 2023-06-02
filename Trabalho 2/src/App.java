import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int QuantJogo;
        Scanner leitor = new Scanner(System.in);
        Menus menu = new Menus();
        
        
        menu.MenuInicial();
        QuantJogo = leitor.nextInt();

    }
}
 