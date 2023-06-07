import java.util.Scanner;
import java.util.Set;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Menus {

        App princi = new App();
        int i, cont, QuantJogo, NumEsc;
        Scanner leitor = new Scanner(System.in);
        Ajuda util = new Ajuda();
        List<Integer> Jogos = new ArrayList<>();
        Set<Integer> NumeroAleatorio = new HashSet<>();
        List<List<Integer>> JogosLançados = new ArrayList<>();
        Random alea = new Random();    
        StringBuilder linha = new StringBuilder();
     
    
        void MenuInicial(){

            System.out.println("----------------------- MEGA SENA -----------------------");
            System.out.println("1. Lançar jogos");
            System.out.println("2. Mostrar jogos lançados");
            System.out.println("3. Realizar sorteio");
            System.out.println("4. Verificar acertos");
            System.out.println("5. Mostrar ganhadores");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
        
        
    
        System.out.print("Informe o número de jogos a ser lançados ->");
        
    }

    void Lançamento(){
        util.limpatela();
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\tLANÇAMENT0 DOS JOGOS");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Informe o número de jogos a ser lançados ->");
        QuantJogo = leitor.nextInt();

        System.out.println("\nJogo " + (i + 1) + ":");

        System.out.println("Escolha uma opção para lançar os números do jogo:");
        System.out.println("\n\t1-Modo Manual\t2-Modo aleatório e automático\n");
       
        System.out.print("Escolha uma opção ->");
        int opmodo = leitor.nextInt();

        switch(opmodo){

            case 1:
                for(cont=0; cont<QuantJogo; cont++){
                    for( i=0; i<6; i++){
                        System.out.println("---------------------------------------------------------------");
                        System.out.print("Digite o número " + (i + 1) + "-> ");
                        NumEsc = leitor.nextInt();
                        if (NumEsc < 1 || NumEsc > 60) {
                            System.out.println("Número inválido. Tente novamente.");
                            i--;
                            continue;
                        }
                        if (Jogos.contains(NumEsc)) {
                            System.out.println("Número já escolhido. Tente novamente.");
                            i--;
                            continue;
                        }
                    
                    }
                }
                Jogos.add(NumEsc);
                Collections.sort(Jogos);     
                JogosLançados.add(Jogos);

                SalvarJogo();

                break;
            case 2:     
            for(cont=0; cont<QuantJogo; cont++){
                for(cont=0; cont<6; cont++){               
                    NumEsc = alea.nextInt(60) + 1;
                    NumeroAleatorio.add(NumEsc);                  
                }         
             }  
             Jogos.addAll(NumeroAleatorio);
             Collections.sort(Jogos);     
             JogosLançados.add(Jogos);

             SalvarJogo();
             break;
        }
        
    }   
    
    void SalvarJogo(){
        try(BufferedWriter Buff = new BufferedWriter(new FileWriter("Lancados.txt"))){
            for(List<Integer> Jogos : JogosLançados){
                linha.setLength(0);
                for(int num : Jogos){
                    linha.append(num).append(" ");
                }
                Buff.write(linha.toString().trim());
                Buff.newLine();
            }
            System.out.println("---------------------------------------------------------------");
            System.out.print("\t\tJOGOS LANÇADOS E REGISTRADOS NO ARQUIVO");
            
        }catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os jogos lançados.");

        } 
        }   
    }
                            
                         



