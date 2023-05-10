import java.util.Scanner;

/*
 * Recebendo Dados Teclado
 */

public class Leitor {

    public static void main(String[] args) {
       
        //Intanciando o Objeto Leitor
        Scanner leitor = new Scanner(System.in);
        
        //Recebendo um inteiro pelo teclado 
        int numInt = 0;
        System.out.print ("Informe um número inteiro -->");
        numInt = leitor.nextInt();
        System.out.println("O inteiro informado é --> "+numInt);
        
        //Recebendo um real do tipo double 
        System.out.print("Informe o primeiro real(double)--> ");
        double numReal = leitor.nextDouble();
        System.out.printf("O primeiro real informado é --> %.2f\n", numReal);
        //Recebendo um real do tipo float
        System.out.print("Digite um número real(float)--> ");
        float numReal2 = leitor.nextFloat();
        System.out.println("O número real(float) informado é --> "+numReal2);
        //Recebendo um string
        String frase;
        leitor.nextLine();//Limpando o Buffer do teclado 
        System.out.print("Informe sua frase --> ");
        frase = leitor.nextLine();
        System.out.printf("A frase informada é --> %s", frase);
        //Recebendo um caractere
        System.out.print("Digite um caractere --> ");
        char letra = leitor.nextLine().charAt(0);
        System.out.printf("O caractere digitado foi --> %c\n", letra);
             
          
    }
    
}
