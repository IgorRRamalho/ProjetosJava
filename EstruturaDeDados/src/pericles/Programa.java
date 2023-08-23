
package pericles;

public class Programa {
    public static void menu(){    
        System.out.println("\n*** Menu ***");
        System.out.println("1 - Inserir na Fila");
        System.out.println("2 - Remover da Fila - FILO");
        System.out.println("3 - Remover da fila - FIFO"); 
        System.out.println("4 - Remover da fila - Escolha do Usuário"); 
        System.out.println("5 - Imprimir"); 
        System.out.println("6 - Sair\n");
    }
    
    public static void main(String[] args) {
        int opcao=0;
        Fila F = new Fila();
                
        while(opcao != 6){
            menu();
            opcao = Input.readInt("Digite a opcao: ");
            
            switch(opcao){
                case 1:
                    F.insere();
                    break;
                    
                
                case 2:
                    F.filo();
                    break;
                    
                case 3:
                    F.removefifo();
                    break;
                
                case 4:
                    F.removeesc();
                    break;
                
                case 5:
                    F.imprime();
                    break;
          
                case 6:
                    System.out.println("\nSaindo...\n");   
                    break;       
                                
            }
        }   
    } 
    
}
