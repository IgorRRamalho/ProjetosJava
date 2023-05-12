import java.util.Scanner;

public class Menus {

   int MenuAbrirmesa;
   Scanner leitor = new Scanner(System.in);
   int[] mesas = new int[11];
   ajuda util = new ajuda();
   int soma = 0;
   
   
    void menuinicial(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\tRESTAURANTE DOIS IRMÃOS");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t1. Abrir mesa\n\t2. Verificar mesa\n\t3. Fechar mesa");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Escolha uma opção->");
        int MenuInicial = leitor.nextInt();

        switch(MenuInicial){
            
            case 1:
            util.limpatela();    
            System.out.print("Mesas Disponíveis ->");   
                for(int i=1; i<11; i++){
                    soma +=mesas[i];
    
                    if(mesas[i] == 0){
                        System.out.print(i + " - ");
                    }  
                }
                if(soma<10){
                    Abrirmesa();
                   
                }
                        
                if(soma==10){
                        util.limpatela();
                        System.out.println("\t\t\n NÃO HÁ MESAS DISPONÍVEIS");
                        Abrirmesa();
                        
                    }
   
        }
        
    }


    void Abrirmesa(){
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\t1. Indicar uma mesa para ser aberta.\n\t2. Retornal ao Menu Inicial\n");
        System.out.print("Escolha uma opção->");
        MenuAbrirmesa = leitor.nextInt();

        switch(MenuAbrirmesa){
            case 1:
                System.out.println("---------------------------------------------------------------\n");   
                System.out.print("Indique o número da mesa que deseja abrir ->");
                int MesaEscolhida = leitor.nextInt();
                if (mesas[MesaEscolhida] == 1){
                    System.out.println("\n\t\tMESA "+ MesaEscolhida +" INDISPONÍVEL");
                   Abrirmesa();
                    
                }
                if (mesas[MesaEscolhida] == 0){
                    mesas[MesaEscolhida] = 1;
                    System.out.println("\n\t\tMESA "+ MesaEscolhida + " ABERTA!");
                    menuinicial();
                    
                }

            case 2:
                util.limpatela();
                menuinicial();
                
                
     }               

    }

    




}
    

