
import java.io.PrintStream;
import java.util.Scanner;


public class vamover {
       public static void main(String[] args) {
         
         Scanner leitor = new Scanner(System.in);
         
         System.out.println("Informe dois números inteiros ->");
         int num1 = leitor.nextInt();
         int num2 = leitor.nextInt();
         
         if(num1==num2){
            System.out.printf("Os números são iguais");
         }
         else if(num1>num2){
             System.out.printf("%d é maior que %d", num1, num2);
         }
         else{
             System.out.printf("%d é maior que %d", num2, num1);
         }
         
     
         int resto = num1%num2;
                 
         System.out.printf("%d [e multiplo de %d?\n\t%s", num1, num2, (resto==0)?"Sim":"Não");
         
                 
                 
    
}
}

    

