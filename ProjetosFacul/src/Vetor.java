
import java.util.Scanner;


public class Vetor {
       public static void main(String[] args) {
         
         Scanner leitor = new Scanner(System.in);
         
         float soma = 0;
         
         System.out.println("Informe quantos números inteiros vai querer->");
         int quant = leitor.nextInt();
        
       
         int[] vetor = new int[quant];
        
         for(int i=0; i<quant; i++){
             System.out.println("Digite o valor inteiro positivo");
             vetor[i] = leitor.nextInt();
         }
         for(int cont=0; cont<quant; cont++){   
             soma += vetor[cont];  
             
         }
            double result = soma / (double)quant;
           System.out.printf("O resultado da média é ->" + result);
   
        }
}

                                                       