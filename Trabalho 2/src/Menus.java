import java.util.Scanner;
import java.util.Set;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Menus {

    TrabalhoT2 princi = new TrabalhoT2();
    int i, cont, QuantJogo, NumEsc;
    Scanner leitor = new Scanner(System.in);
    Ajuda util = new Ajuda();
    List<List<Integer>> Sorteio = new ArrayList<>();  
    List<Integer> NumSorteio = new ArrayList<>();   
    List<List<Integer>> JogosLançados = new ArrayList<>();
    Random alea = new Random();    
    StringBuilder linha = new StringBuilder();
    int acertos[]= new int[200];
        
     
    
    void MenuInicial(){
        System.out.println("----------------------- MEGA SENA -----------------------");
        System.out.println("1. Lançar jogos");
        System.out.println("2. Mostrar jogos lançados");
        System.out.println("3. Realizar sorteio");
        System.out.println("4. Verificar acertos");
        System.out.println("5. Mostrar ganhadores");
        System.out.println("6. Informações sobre o Programa");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção ->");
        int opMain = leitor.nextInt();

        switch(opMain){
            case 1:
                Lançamento();
                break;
                

            case 2:
                MostrarJogos();
                break;

            case 3:
                Sorteio();
                break;

            case 4:
                VerificarAcertos();
                break;

            case 6:
                util.limpatela();
                System.out.println("*----------------------------------------------- INFORMAÇÕES -----------------------------------------------*\n");
                System.out.println("1. Ao realizar um sorteio já tendo feito algum, será apagado o sorteio anteiror e substituido pelo novo");
                System.out.println("2. Ao lançar jogos já tendo lançado algum, será apagado o jogo anterior e substituido pelo novo");
                System.out.println("3. É possível lançar vários novos jogos e verificar os acertos com o mesmo sorteio");
                System.out.println("4. É possível sortear várias vezes e verificar os acertos com o mesmo jogo lançado");
                System.out.println("\n*---------------------- PROGRAMA FEITO POR IGOR ROSA E IURY GABRIEL PARA TRABALHO T2 -----------------------*");
                System.out.println("\n\t\tPRESSIONE ALGUMA TECLA E ENTER PARA VOLTAR A MENU INICIAL");
                leitor.nextLine();
                leitor.nextLine();
                util.limpatela();
                MenuInicial();
                break;
            
                case 0:
                break;

            default:
                util.limpatela();
                MenuInicial();
                break;
            
        }

    }

    void Lançamento(){
        LimpJogos();
        util.limpatela();
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\tLANÇAMENT0 DOS JOGOS");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Informe o número de jogos a ser lançados ->");
        QuantJogo = leitor.nextInt();

        for(int cont2 =0 ; cont2 < QuantJogo; cont2++){
            System.out.println("\nJogo " + (cont2 + 1) + ":");
            List<Integer> Jogos = new ArrayList<>();
          

            System.out.println("Escolha uma opção para lançar os números do jogo:");
            System.out.println("\n\t1-Modo Manual\t2-Modo aleatório e automático\n");
        
            System.out.print("Escolha uma opção ->");
            int opmodo = leitor.nextInt();
            leitor.nextLine(); 

    

            if (opmodo == 1){              
                    for(i=0; i<6; i++){
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
                        Jogos.add(NumEsc);                  
                    }
                
                       
            } else if (opmodo == 2){       
                Set<Integer> NumeroAleatorio = new HashSet<>();         
                while(NumeroAleatorio.size() < 6){               
                    NumEsc = alea.nextInt(60) + 1;
                    NumeroAleatorio.add(NumEsc);                  
                }              
                Jogos.addAll(NumeroAleatorio);
            }                        
            Collections.sort(Jogos);     
            JogosLançados.add(Jogos); 
            
        }
        SalvarJogo();
             
    }
        
    
    void SalvarJogo(){
        try(BufferedWriter Buff = new BufferedWriter(new FileWriter("Lancados.txt"))){
            for(List<Integer> Jogos : JogosLançados){
                StringBuilder linha = new StringBuilder();
                for(int num : Jogos){
                    linha.append(num).append(" ");
                }
                Buff.write(linha.toString().trim());
                Buff.flush();
                Buff.newLine();
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.print("\t\tJOGOS LANÇADOS E REGISTRADOS NO ARQUIVO\n");
            MenuInicial();
            
        }catch (IOException e){
            System.out.println("Ocorreu um erro ao salvar os jogos lançados.");

        } 
    }   
    
    
    
    void MostrarJogos(){
        System.out.print("\n----------JOGOS LANÇADOS----------\n");
        for(List<Integer> Jogos : JogosLançados){
            for(int num : Jogos){
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
        MenuInicial();
        }
    
    
    void Sorteio(){
        LimpSort();
        
        Set<Integer> NumeroAleatorio2 = new HashSet<>();       
        while(NumeroAleatorio2.size() < 6){
            NumEsc = alea.nextInt(60) + 1;
            NumeroAleatorio2.add(NumEsc);
        }
        NumSorteio.addAll(NumeroAleatorio2);
        Collections.sort(NumSorteio); 
        Sorteio.add(NumSorteio); 
        SalvarSorteio();
    }
    
    void SalvarSorteio(){       
        File arquivo = new File("Sorteio.txt");
        arquivo.delete();
        try(BufferedWriter Buff = new BufferedWriter(new FileWriter("Sorteio.txt"))){
            for(List<Integer> NumSorteio : Sorteio){
                linha.setLength(0);
                System.out.println("\n----------------------------------------------------------");
                System.out.println("NÚMEROS SORTEADOS:");
                for(int num : NumSorteio){
                    System.out.print(num+" ");
                    linha.append(num).append(" ");
                }
                System.out.println();
                Buff.write(linha.toString().trim());
                Buff.flush();
                Buff.newLine();
            }
            MenuInicial();
            
        }catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o sorteios lançados.");

        } 

    }
    
    

    void VerificarAcertos(){
        int i=0;
        cont=0;
        for(List<Integer> Jogos : JogosLançados){            
            for(int num : Jogos){
                boolean temAcerto = false;
                for (List<Integer> sorteio : Sorteio) {
                    if (sorteio.contains(num)) {
                        temAcerto = true;
                        if (temAcerto) {
                            acertos[i] += 1;
                        }
                        break;
                    }
                }           
            } 
            i++;  
        }    
              
        
        try(BufferedWriter Buff = new BufferedWriter(new FileWriter("Resultado.txt"))){
            for(List<Integer> Jogos : JogosLançados){

                StringBuilder linha = new StringBuilder();
                for(int num : Jogos){
                    linha.append(num).append(" ");
                }
                linha.append("->").append(acertos[cont]+ " acertos");
                cont++;
                Buff.write(linha.toString().trim());
                Buff.flush();
                Buff.newLine();
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.print("\t\tACERTOS LANÇADOS E REGISTRADOS NO ARQUIVO\n");
            MenuInicial();
            
        }catch (IOException e){
            System.out.println("Ocorreu um erro ao salvar os resultados.");

        }
          
    }


    void LimpSort() {
        Sorteio.clear();
        NumSorteio.clear();

        for(i=0; i<QuantJogo; i++){
            acertos[i] = 0;
        }
    }

    void LimpJogos() {
        JogosLançados.clear();
        List<Integer> Jogos = new ArrayList<>();
        Jogos.clear();
        for(i=0; i<QuantJogo; i++){
            acertos[i] = 0;
        }
        

    }
   

}





    
    
    
    
    
    
    
    
    
                            
                         



