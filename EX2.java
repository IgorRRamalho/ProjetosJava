
import java.util.Scanner;


public class EX2 {
     public static void main(String[] args) {
 
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite as duas notas do aluno ->");
    float nota1 = leitor.nextFloat();
    float nota2 = leitor.nextFloat();
    
    float media = (nota1+nota2)/2;
    
    if(media>=7){
        System.out.printf("Voce foi aprovado");
}
    else if(media>=4 && media<7){
        System.out.printf("Voce esta de exame");
    }
    else{
        System.out.printf("Voce esta reprovado");
    }
   
     }
}