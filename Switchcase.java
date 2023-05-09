
import java.util.Scanner;


public class Switchcase {
    public static void main(String[] args) {
 
     Scanner leitor = new Scanner(System.in);
     
     float desconto, parcelas, valorF = 0, valorparcela, valor;
     int escolha;
     
     
     System.out.println("1 - A vista - Desconto negociável de (0% até 10% no valor da compra)");
     System.out.println("2 - Prazo, em 2, 3 ou 4 vezes - Juros de 5% no valor da compra");
     System.out.println("3 - Prazo, em 5, 6 ou 7 vezes - Juros de 10% no valor da compra");
     System.out.println("4 - Prazo, em 8, 9 ou 10 vezes - Juros de 15% no valor da compra");
     System.out.println("5 - Prazo, em 11 ou 12 vezes - Juros de 20% no valor da compra");
     System.out.println("\nInforme a forma de pagamento -> ");   
     escolha = leitor.nextInt();
     
     System.out.println("\nInforme o valor da compra -> ");  
     valor = leitor.nextFloat();
   
     
     switch(escolha){
         case 1:
             System.out.println("Informe a porcentagem do desconto ->");
             desconto = leitor.nextInt();
             valorF = valor - (valor * (desconto/100));
             System.out.printf("O valor total a ser pago é -> %.2f", valorF);
             break;
         case 2:
             System.out.println("Informe a quantidade de parcelas ->");
             parcelas = leitor.nextInt();
             valorF = (float) (valor + (valor * 0.5));
             valorparcela = valorF/parcelas;
             System.out.printf("O total pago será de %.2f reais em %.1f parcelas de %.2f reais", valorF, parcelas, valorparcela);
             break;
         case 3:
             System.out.println("Informe a quantidade de parcelas ->");
             parcelas = leitor.nextInt();
             valorF = (float) (valor + (0.10 * valor));
             valorparcela = valorF/parcelas;
             System.out.printf("O total pago será de %.2f reais em %.1f parcelas de %.2f reais", valorF, parcelas, valorparcela);
             break;
         case 4:
             System.out.println("Informe a quantidade de parcelas ->");
             parcelas = leitor.nextInt();
             valorF = (float) (valor + (0.15 * valor));
             valorparcela = valorF/parcelas;
             System.out.printf("O total pago será de %.2f reais em %.1f parcelas de %.2f reais", valorF, parcelas, valorparcela);
             break;
         case 5:
             System.out.println("Informe a quantidade de parcelas ->");
             parcelas = leitor.nextInt();
             valorF = (float) (valor + (0.20 * valor));
             valorparcela = valorF/parcelas;
             System.out.printf("O total pago será de %.2f reais em %.1f parcelas de %.2f reais", valorF, parcelas, valorparcela);
             break;
             
             
     }
    
}

    
}
