import java.util.Scanner;
import java.util.Collections;

public class Menus {

        App princi = new App();
        int i, cont, QuantJogo;

        Scanner leitor = new Scanner(System.in);
        Ajuda util = new Ajuda();

    
        void MenuInicial(){

        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\tMEGA SENA");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Informe o número de jogos a ser lançados ->");
        
    }

    void lancamento(){
        util.limpatela();
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\tLANÇAMENT0 DOS JOGOS");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t1-Modo aleatório e automático\t2-Modo Manual");
        System.out.println("Escolha uma opção ->");

    }

    void OrdemCrescente(){
        for(i=0; i>QuantJogo; i++){
            for(cont=0; cont>6; cont++){

                Collections.sort()
            }
        }

    }


  
}
