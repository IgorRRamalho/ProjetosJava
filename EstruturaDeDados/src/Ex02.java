import java.io.File;
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
        ArrayList<String> palavra = new ArrayList<String>();
        // Declarando objeto meuArquivo da classe File
        File meuArquivo = new File("ProjetosJava-1\\EstruturaDeDados\\src\\jogodaforca\\palavras.txt");
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
        for (int i = 0; i<linhasArquivo.size();i++){
            palavra.add(linhasArquivo.get(NumE));
        }
        
        int tamanho = palavra.size();
        int lcertas = 0;
        boolean teste = false;
        while(!teste){
            System.out.printf("Digite uma letra ->");
            String letra = leitor.nextLine();
            if(palavra.contains(letra)){
                System.out.printf("Acertou a letra %s", letra);
                lcertas++;
            }
            if(lcertas==tamanho){
                System.out.printf("\nACERTOU TODAS AS LETRAS\nA PALAVRA ERA"+ palavra.get(NumE));
                teste=true;
            }
            else{
                System.out.printf("Letra errada");
            }

       }

    }
}
