import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {
        int[] mesas = new int[11];
        Menus menu = new Menus();
        ajuda util = new ajuda();
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int MenuAbrirmesa = 0;
        int pw = 0;
        
        do{
        menu.menuinicial();
        int MenuInicial = leitor.nextInt();
        
       switch(MenuInicial){
            
            case 1:
            util.limpatela();    
            System.out.print("Mesas Disponíveis ->");   
                for(int i=1; i<11; i++){
                    soma += mesas[i];
                    if(mesas[i] == 0){
                        System.out.print(i + " - ");
                    }  
                }
                if(soma<10){
                    menu.Abrirmesa();
                    MenuAbrirmesa = leitor.nextInt();
                }
                        
                if(soma==10){
                        util.limpatela();
                        System.out.println("\t\t\n NÃO HÁ MESAS DISPONÍVEIS");
                        menu.Abrirmesa();
                        MenuAbrirmesa = leitor.nextInt();
                    }
                    
                    
               
                switch(MenuAbrirmesa){
                        case 1:
                            System.out.println("---------------------------------------------------------------\n");   
                            System.out.print("Indique o número da mesa que deseja abrir ->");
                            int MesaEscolhida = leitor.nextInt();
                            if (mesas[MesaEscolhida] == 1){
                                System.out.println("\n\t\tMESA "+ MesaEscolhida +" INDISPONÍVEL");
                                menu.Abrirmesa();
                                MenuAbrirmesa = leitor.nextInt();
                                
                            }
                            if (mesas[MesaEscolhida] == 0){
                                mesas[MesaEscolhida] = 1;
                                System.out.println("\n\t\tMESA "+ MesaEscolhida + " ABERTA!");
                                continue;
                            }

                        case 2:
                            util.limpatela();
                            continue;
                            
                 }               
                        
        }
    } while(pw == 0);

           

       
    }
}
