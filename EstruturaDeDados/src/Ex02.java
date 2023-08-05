import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Random alea = new Random();   
        int NumE; 
        
    
        
        // Declarando o leitor
        Scanner leitorArquivo = null;
        // Declarar uma ArrayList para receber as linhas do arquivo
        ArrayList<String> linhasArquivo = new ArrayList<String>();
        char[] palavra = null;
        // Declarando objeto meuArquivo da classe File
        File meuArquivo = new File("C:\\GitHub\\ProjetosJava\\EstruturaDeDados\\src\\jogodaforca\\palavras.txt");
        //Fazendo a leitura
        try{
            // Instanciando leitorArquivo
            leitorArquivo = new Scanner(meuArquivo);
            while(leitorArquivo.hasNext()){
                linhasArquivo.add(leitorArquivo.nextLine());
            }
        }
        catch(Exception e){
            System.out.println("Erro ao ler o arquivo:");
            System.out.println(e.getMessage());
        }
        finally{
            if(leitorArquivo!=null)
                leitorArquivo.close();
        }

        NumE = alea.nextInt(10);
        // Imprimindo o conteúdo do arquivo
       
            palavra = (linhasArquivo.get(0)).toCharArray();
        
        
        
        int tamanho = palavra.length;
        int lcertas = 0, i;
        boolean teste = false;
        while(!teste){
            Reader leia = new InputStreamReader(System.in);
            System.out.printf("\nDigite uma letra ->");
            int testealou = leitor.nextInt();
            int letra = leia.read(palavra);
            char letrA = (char) letra;
            
                for(i=0; i<palavra.length; i++){
                    if(letrA == palavra[i]){
                    System.out.printf("\nAcertou a letra %s", letra);
                    lcertas++;
                    palavra[i] = 0;
                    }
                }
                if(lcertas==tamanho){
                    System.out.printf("\nACERTOU TODAS AS LETRAS\nA PALAVRA ERA"+ linhasArquivo.get(NumE));
                    teste=true;
                    
                }
                if(letra != palavra[i]){
                    System.out.printf("\nLetra errada");
                }
            }

    }

}

