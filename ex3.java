
import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {
 
   
     Scanner leitor = new Scanner(System.in);
     
     System.out.println("Escreva tres valores de comprimento(a,b,c) ->");
     float a = leitor.nextFloat();
     float b = leitor.nextFloat();
     float c = leitor.nextFloat();
     
     if(a==b && c==a){
         System.out.printf("O triangulo é equilatero");
     }
     else if(a!=b && c!=a){
         System.out.printf("O triangulo é escaleno");
     }
     else{
         System.out.printf("O triangulo é isósceles");
     }
}
    
}
