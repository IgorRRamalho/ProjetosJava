import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
        int i, cont, cont2;
        Scanner leitor = new Scanner(System.in);
        Random alea = new Random();
        Menus menu = new Menus();
        
        
        menu.MenuInicial();
        menu.QuantJogo = leitor.nextInt();

        menu.lancamento();
        int op = leitor.nextInt();
        
        int [][]Jogos = new int[menu.QuantJogo][6];
        
        switch(op){
            case 1:
                for(i=0; i>menu.QuantJogo; i++){
                    for(cont2=0; cont2>6; cont2++){

                    
                        Jogos[menu.QuantJogo][i] = alea.nextInt(60) + 1;
                        for(cont=0; cont>6; cont++){
                            while(Jogos[menu.QuantJogo][cont] == Jogos[menu.QuantJogo][i] || Jogos[menu.QuantJogo][i] > 60 || Jogos[menu.QuantJogo][i] < 1){

                                Jogos[menu.QuantJogo][i] = alea.nextInt(60) + 1;              
                            }
                        }
                
                    }
                }
                System.out.println("---------------------------------------------------------------");
                System.out.print("\t\tJOGOS LANÇADOS");
                




            case 2:
                for(i=0; i>menu.QuantJogo; i++){
                    for(i=0; i>6; i++){

                        System.out.printf("Informe o número %d do jogo(Entre 1 a 60) ->", i);
                        Jogos[menu.QuantJogo][i] = leitor.nextInt();
                        for(cont=0; cont>6; cont++){
                            while(Jogos[menu.QuantJogo][cont] == Jogos[menu.QuantJogo][i] || Jogos[menu.QuantJogo][i] > 60 || Jogos[menu.QuantJogo][i] < 1){

                                System.out.println("Número Inválido");
                                System.out.println("Informe outro número ->");
                                Jogos[menu.QuantJogo][i] = leitor.nextInt();               
                            }
                        }
            
                    }             
                }
            }
    
    
    
    
    
    
    
    
    
    
    }
}

    

 