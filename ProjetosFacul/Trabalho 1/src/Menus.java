import java.util.Scanner;

public class Menus {

   int MenuAbrirmesa, i, ExcluirItem, MenuVerificarMesa, MesaEscolhida, MenuPedidoMesa, CodigoCard, opconfirmar, opFecharMesa, MesaFechar,  ConfirmFecharMesa;
   int QuantidadeComida;
   Scanner leitor = new Scanner(System.in);
   int[] mesas = new int[11];
   ajuda util = new ajuda();
   cardapio card = new cardapio();
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
            case 2:
            VerificarMesa();

            case 3:
            MenuFecharMesa();
   
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
                MesaEscolhida = leitor.nextInt();
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
    void VerificarMesa(){
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\t1. Informe o número da mesa\n\t2. Retornar ao Menu inicial\n");
        System.out.print("Escolha uma opção->");
        MenuVerificarMesa= leitor.nextInt();

        switch(MenuVerificarMesa){
            case 1:
                util.limpatela();    
                System.out.print("Mesas Abertas ->");   
                for(int i=1; i<11; i++){
                    soma +=mesas[i];

                if(mesas[i] == 1){
                    System.out.print(i + " - ");
                }  
        }
                System.out.println("\n---------------------------------------------------------------");
                System.out.println("\tInforme o numero da mesa ou digite 0 para retornar ao menu anterior ->\n");
                MesaEscolhida = leitor.nextInt();

                if(MesaEscolhida == 0){
                    VerificarMesa();
                }
                if(mesas[MesaEscolhida] == 0){
                    System.out.println("MESA INVÁLIDA");
                    VerificarMesa();
                }
                if(mesas[MesaEscolhida] == 1){
                   PedidoMesa();
                }
    }
    }
    void PedidoMesa(){
        util.limpatela();
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\t1. Fazer pedido de item do cardápio\n\t2. Cancelar pedido de item do cardápio\n\t3. Verificar itens pedidos\n\t4. Retornar ao Menu Inicial");
        System.out.print("Escolha uma opção->");
        MenuPedidoMesa = leitor.nextInt();

        switch(MenuPedidoMesa){
            case 1:
                DigiteCod();
            

              
            case 2:
                System.out.printf("\tITENS PEDIDOS NA MESA %d\n"+ MesaEscolhida);
                System.out.println("---------------------------------------------------------------");
                System.out.println("Codigo                      Item                      Quantidade");
                for(i=0; i<27; i++){
                    if(card.CPQ[i][MesaEscolhida + 2] != 0){
                        System.out.printf("%d                %s                %d", card.CPQ[i][0], card.nomes[i][0], card.CPQ[i][MesaEscolhida + 2] );
                    }
                System.out.print("Qual item deseja excluir ?");
                ExcluirItem = leitor.nextInt(i);

                    
                }
                

             
        }
   
       

    }

    void DigiteCod(){
        System.out.println("Digite o código do item do cardápio ou informe 0 para retornar ao menu anterior ->");
        card.CodigoCard = leitor.nextInt();
        
        if(card.CodigoCard == 0){
            PedidoMesa();
        }
        else{
           card.Cardapio();
           DigiteCod();
        }
        
    }

    void Confirmar(){
        System.out.println("Este é o item que deseja?");
        System.out.println("\t1. Sim\n\t2. Não\n\t");
        System.out.print("Escolha uma opção->");
        opconfirmar = leitor.nextInt();

        switch(opconfirmar){
            case 1:
                System.out.println("Informe a quantidade do item escolhido ->");
                QuantidadeComida = leitor.nextInt();
                card.CadastroQuant();

               
            case 2:
            DigiteCod();


        }
    }

    void MenuFecharMesa(){
        System.out.println("\t1. Informar mesa que deseja fechar.\n\t2. Retornar ao Menu Inicial.\n\t");
        System.out.print("Escolha uma opção->");
        opFecharMesa = leitor.nextInt();

            switch(opFecharMesa){
                case 1:
                    util.limpatela();  
                    System.out.print("Mesas Abertas ->");   
                    for(int i=1; i<11; i++){
    
    
                    if(mesas[i] == 1){
                        System.out.print(i + " - ");
                    }  
                    System.out.println("---------------------------------------------------------------\n");   
                    System.out.print("Informe o número da mesa que deseja fechar ou informe 0 para retornar ao menu anterior ->");
                    MesaFechar = leitor.nextInt();

                    if(MesaFechar == 0){
                        MenuFecharMesa();
                    }
                    if(mesas[MesaFechar] == 0){
                        MenuFecharMesa();
                    }
                    else{
                        System.out.println("Tem certeza que deseja fechar a mesa "+ MesaEscolhida+"? ->");
                        System.out.println("\t1. Sim\n\t2. Não\n\t");
                        System.out.print("Escolha uma opção->");
                        ConfirmFecharMesa = leitor.nextInt();

                            switch(ConfirmFecharMesa){
                                case 1:
                                System.out.println("MESA "+ MesaEscolhida+" FECHADA IGOR");

                            }
                    }

            }

    }
    
}
}
    

