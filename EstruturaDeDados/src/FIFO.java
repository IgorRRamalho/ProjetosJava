import java.util.Scanner;

public class FIFO {
    
    public static void main(String[] args) throws Exception {
        
       int vetor[] = new int[12];
       vetor[11] = 0;
       Boolean ver;
       ver = true;
       Scanner leitor = new Scanner(System.in);
       int res, i, cont;
        i=0;
        cont=0;
       while(ver){
        System.out.print("\n------------------------------MENU------------------------------");
        System.out.println("\n\n\t\tQuer inserir um número?");
        System.out.println("\n1- Adicionar\t2-Remover\t3-Imprimir\t4-Parar");
        System.out.print("\nOPÇÃO->");
        
        res = leitor.nextInt();
        switch(res){
            case 1:
                if(i>=10){
                     for(cont=0; cont<10; cont++){
                        vetor[cont] = vetor[cont+1];

                }
                i--;    

                }
                System.out.print("\nInsira o número->");
                vetor[i] = leitor.nextInt();
                i++;
                break;

            case 2:
                
                System.out.println("NÚMERO "+ vetor[cont]+ "REMOVIDO");
                for(cont=0; cont<11; cont++){
                        vetor[cont] = vetor[cont+1];
                        
                }
                i--;
                break;
                

            case 3:
                for(int conta =0; conta<10; conta++){
                    System.out.println("NÚMERO "+ conta+" ->"+ vetor[conta]);
                }
                break;
            
            case 4:
                System.out.print("\n------------------------------PARANDO PROGRAMA------------------------------");
                ver= false;
                break;

        }

        
        

       }












    }
}
