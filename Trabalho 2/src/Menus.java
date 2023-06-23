import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.html.HTMLDocument.BlockElement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Menus {

    TrabalhoT2 princi = new TrabalhoT2();
    int i, cont, QuantJogo, NumEsc, ver, g;
    Scanner leitor = new Scanner(System.in);
    Ajuda util = new Ajuda();
    List<List<Integer>> Sorteio = new ArrayList<>();  
    List<Integer> NumSorteio = new ArrayList<>();   
    List<List<Integer>> JogosLançados = new ArrayList<>();
    List<String> quadra = new ArrayList<>();
    List<String> quina = new ArrayList<>();
    List<String> sena = new ArrayList<>();
    
    Random alea = new Random();    
    StringBuilder linha = new StringBuilder();
    int acertos[]= new int[200];
    int posição[]= new int[acertos.length];
        
     
    //Menu incial
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

        //Switch para poder fazer as escolhas das opções do menu
        switch(opMain){
            case 1:
                Lançamento();
                break;
                

            case 2:
            if(ver == 0){
                util.limpatela();
                System.out.println("---------------------------------------------------------");
                System.out.print("\t\tNÃO HÁ JOGOS LANÇADOS\n");
                MenuInicial();
            }
            else{
                MostrarJogos();
            }
                break;

            case 3:
                Sorteio();
                break;

            case 4:
                if(ver == 0){
                    util.limpatela();
                    System.out.println("---------------------------------------------------------");
                    System.out.print("\t\tNÃO HÁ JOGOS LANÇADOS\n");
                    MenuInicial();
                }
                else{
                VerificarAcertos();
                }
                break;

            case 5: 
                MostrarGanhadores();
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
    //Metodo para fazer o lançamento dos jogos.
    void Lançamento(){
        ver = 1;
        LimpJogos();
        util.limpatela();
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\tLANÇAMENT0 DOS JOGOS");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Informe o número de jogos a ser lançados ->");
        QuantJogo = leitor.nextInt();

        //Contar as quantidades de jogos
        for(int cont2 =0 ; cont2 < QuantJogo; cont2++){
            System.out.println("\nJogo " + (cont2 + 1) + ":");
            List<Integer> Jogos = new ArrayList<>();
          

            System.out.println("Escolha uma opção para lançar os números do jogo:");
            System.out.println("\n\t1-Modo Manual\t2-Modo aleatório e automático\n");
        
            System.out.print("Escolha uma opção ->");
            int opmodo = leitor.nextInt();
            leitor.nextLine(); 

    
            //Colocando os numeros de jogos de modo manual.
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
                
              //Colocando os numeros de jogos de forma aleátoria.     
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
        
    //Método para salvar os jogos que foram lançados.
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
    
    
    //Método para poder mostrar os jogos que foram mostrados.
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
    
    //Método para fazer o sorteio dos jogos.
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
    
    //Salando o sorteio.
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
    
    
    //Verificando os acertos do sorteio.
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
                            acertos[i]+= 1;
                        }
                        break;
                    }
                }           
            } 
            i++;  
        }
       
        //Ordenando os jogos lançados.
        for (i = 1; i < acertos.length; i++) {
            for (int j = 0; j < i; j++) {
                if (acertos[i] > acertos[j]) {
                    int temp = acertos[i]; 
                    List<Integer> tempi = JogosLançados.get(i);  
                    List<Integer> tempj = JogosLançados.get(j);  
   
                    JogosLançados.set(i, tempj);
                    acertos[i] = acertos[j];
                   
                    JogosLançados.set(j, tempi); 
                    acertos[j] = temp;
                }
            }
        }
        
        //Salvando os resultados dos jogos
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

    //Limpando o sorteio para realizar novamente.
    void LimpSort() {
        Sorteio.clear();
        NumSorteio.clear();

        for(i=0; i<QuantJogo; i++){
            acertos[i] = 0;
        }
    }
    
    //Limoando os jogos para realizar os jogos novamente.
    void LimpJogos() {
        JogosLançados.clear();
        List<Integer> Jogos = new ArrayList<>();
        Jogos.clear();
        for(i=0; i<QuantJogo; i++){
            acertos[i] = 0;
        }
         
    }
   

    void MostrarGanhadores(){

        for(i=0; i<acertos.length; i++){
            
             if(acertos[i] == 5){
            
                quina.add(JogosLançados.get(i).stream().map(Object::toString).collect(Collectors.joining(" ")));
                System.out.print(quina);
            }
            if(acertos[i] == 6){
                
                sena.add(JogosLançados.get(i).stream().map(Object::toString).collect(Collectors.joining(" ")));
                System.out.print(sena);
            }
            if(acertos[i] == 4){            
                quadra.add(JogosLançados.get(i).stream().map(Object::toString).collect(Collectors.joining(" ")));
                System.out.print(quadra);
            }        
        }
          util.limpatela();
            System.out.print("----------------------- GANHADORES -----------------------\n");
            System.out.println("Ganhadores QUADRA: "+quadra);
            System.out.println("Ganhadores QUINA: "+quina);
            System.out.println("Ganhadores SENA: "+sena);
            System.out.print("-----------------------------------------------------------");
            System.out.println("\n\tPRESSIONE ALGUMA TECLA E ENTER PARA VOLTAR A MENU INICIAL");
            leitor.nextLine();
            leitor.nextLine();
            util.limpatela();
            MenuInicial();
            
       
    }

       

 
    
}










    
    
    
    
    
    
    
    
    
                            
                         



