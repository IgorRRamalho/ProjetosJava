import java.util.Scanner;


public class Menus {

    
   int MenuAbrirmesa, i, ExcluirItem, MenuVerificarMesa, MesaEscolhida, MenuPedidoMesa, CodigoCard, opconfirmar, opFecharMesa, MesaFechar,  ConfirmFecharMesa, soma, QuantExc;
   int QuantidadeComida;
   float TotalItem;
   float []TotalMesa = new float[10];
   Scanner leitor = new Scanner(System.in);
   int[] mesas = new int[11];
   ajuda util = new ajuda();
   String [][]nomes = new String[27][1]; 
   float [][]CPQ = new float[27][12];


    
   
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
                System.out.println("---------------------------------------------------------------");
                System.out.println("\t\t\tABRIR MESA");
                System.out.println("---------------------------------------------------------------");
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
                        
                if(soma>=10){
                        util.limpatela();
                        System.out.println("\t\t\n NÃO HÁ MESAS DISPONÍVEIS");
                        menuinicial();
                        break;
                        
                    }
                
            case 2:
                VerificarMesa();
                break;
            

            case 3:
                MenuFecharMesa();
                break;
            
   
        }
        
    }


    void Abrirmesa(){   
        soma = 0;
        System.out.println("\t\n\n1. Indicar uma mesa para ser aberta.\t\t2. Retornal ao Menu Inicial\n");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Escolha uma opção->");
        MenuAbrirmesa = leitor.nextInt();

        switch(MenuAbrirmesa){
            case 1:
                           
                System.out.println("---------------------------------------------------------------\n");   
                System.out.print("Indique o número da mesa que deseja abrir ->");
                MesaEscolhida = leitor.nextInt();
                if (mesas[MesaEscolhida] == 1){
                    util.limpatela();
                    System.out.println("---------------------------------------------------------------\n");
                    System.out.println("\t\tMESA "+ MesaEscolhida +" INDISPONÍVEL");
                    System.out.println("---------------------------------------------------------------\n");
                    Abrirmesa();
                    
                }
                if (mesas[MesaEscolhida] == 0){
                    mesas[MesaEscolhida] = 1;
                    System.out.println("\n\t\tMESA "+ MesaEscolhida + " ABERTA!");
                    menuinicial();           
                }
                break;
            case 2:
                util.limpatela();
                menuinicial();
                break;
         
     }               

    }

    void VerificarMesa(){
        
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\t\tVERIFICAR MESA");
        System.out.println("---------------------------------------------------------------");     
        System.out.println("\t1. Informe o número da mesa\n\t2. Retornar ao Menu inicial");
        System.out.println("---------------------------------------------------------------");     
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
                System.out.print("Informe o numero da mesa ou digite 0 para retornar ao menu anterior ->");
                MesaEscolhida = leitor.nextInt();

                if(MesaEscolhida== 0){
                    util.limpatela();
                    VerificarMesa();
                }
                if(mesas[MesaEscolhida] == 0){
                    util.limpatela();
                    System.out.println("\t\tMESA INVÁLIDA");
                    VerificarMesa();
                }
                if(mesas[MesaEscolhida] == 1){
                   PedidoMesa();
                }
            case 2:
                util.limpatela();
                menuinicial();
    }
    }

    void PedidoMesa(){
        util.limpatela();
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\t\tMENU PEDIDOS");
        System.out.println("---------------------------------------------------------------");  
        System.out.println("\t1. Fazer pedido de item do cardápio\n\t2. Cancelar pedido de item do cardápio\n\t3. Verificar itens pedidos\n\t4. Retornar ao Menu Inicial");
        System.out.println("---------------------------------------------------------------");  
        System.out.print("\nEscolha uma opção->");
        MenuPedidoMesa = leitor.nextInt();

        switch(MenuPedidoMesa){
            case 1:
                DigiteCod();
                break;
   
            case 2:
                util.limpatela();
                System.out.printf("\t\tITENS PEDIDOS NA MESA %d\n", MesaEscolhida);
                System.out.println("---------------------------------------------------------------------------------------\n");
                System.out.println("Codigo                      Item                      Quantidade");
                
                for(i=0; i<27; i++){
                    if(CPQ[i][(MesaEscolhida + 2)] != 0){
                        System.out.printf("\n%.0f                %s                %.0f", CPQ[i][0], nomes[i][0], CPQ[i][(MesaEscolhida + 2)] );
                    }        
                }
                System.out.print("\n\nQual item deseja excluir(Código) ? ->");
                ExcluirItem = leitor.nextInt();             
                Excluir();
             
 
            case 3:
                MostraPedidos();
                break;

            case 4: 
                util.limpatela();
                menuinicial();
                break;
                
        }
    }
    
    void DigiteCod(){
        util.limpatela();
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\t\tFAZER PEDIDO DE ITEM DO CARDÁPIO");
        System.out.println("---------------------------------------------------------------");     
        System.out.print("\nDigite o código do item do cardápio ou informe 0 para retornar ao menu anterior ->");
        CodigoCard = leitor.nextInt();
            
            if(CodigoCard == 0){
                PedidoMesa();
                
            }
            
            else{
               Cardapio();
               DigiteCod();
               
            }
            
        }

    void Confirmar(){
            System.out.println("\nEste é o item que deseja?");
            System.out.println("\t1. Sim\n\t2. Não\n\t");
            System.out.print("Escolha uma opção->");
            opconfirmar = leitor.nextInt();
    
            switch(opconfirmar){
                case 1:
                System.out.println("\n---------------------------------------------------------------");
                System.out.print("\nInforme a quantidade do item escolhido ->");
                QuantidadeComida = leitor.nextInt();
                CadastroQuant();
                break;
                   
                   
                case 2:
                DigiteCod();
                break;
    
    
            }
        }


      
        
        void Cardapio(){

            nomes[0][0] = "File de frango grelhado";
            nomes[1][0] = "Iscas de frango";
            nomes[2][0] = "Iscas de carne";
            nomes[3][0] = "Bife acebolado";
            nomes[4][0] = "File de frango a milanesa";
            nomes[5][0] = "File a parmegiana";
            nomes[6][0] = "Ceasar salad";
            nomes[7][0] = "Espaguete ao alho e oleo";
            nomes[8][0] = "Panqueca de carne";
            nomes[9][0] = "Panqueca de queijo";
            nomes[10][0] = "Suco de laranja(500ml)";
            nomes[11][0] = "Suco de abacaxi(500ml)";
            nomes[12][0] = "Suco de maracuja(500ml)";
            nomes[13][0] = "Agua(500ml)";
            nomes[14][0] = "Coca-cola(350ml)";
            nomes[15][0] = "Guarana antartica(350ml)";
            nomes[16][0] = "Fanta(350ml)";
            nomes[17][0] = "Fatia de pudim";
            nomes[18][0] = "Fatia Cheesecake";
            nomes[19][0] = "Bola de sorvete";
            nomes[20][0] = "Calabresa acebolada";
            nomes[21][0] = "Frango a passarinho";
            nomes[22][0] = "Batata frita";
            nomes[23][0] = "Porcao extra de arroz";
            nomes[24][0] = "Porcao extra de feijao";
            nomes[25][0] = "Adicional de ovo frito";
            nomes[26][0] = "Adicional de bacon";  

            CPQ[0][0] = 101;
            CPQ[0][1] = 16.50f;
    
            CPQ[1][0] = 102;
            CPQ[1][1] = 22.35f;
    
            CPQ[2][0] = 103;
            CPQ[2][1] = 22.35f;
    
            CPQ[3][0] = 104;
            CPQ[3][1] = 26.99f;
    
            CPQ[4][0] = 105;
            CPQ[4][1] = 28.99f;
    
            CPQ[5][0] = 106;
            CPQ[5][1] = 35.50f;
    
            CPQ[6][0] = 107;
            CPQ[6][1] = 0;
    
            CPQ[7][0] = 108;
            CPQ[7][1] = 15.00f;
    
            CPQ[8][0] = 109;
            CPQ[8][1] = 19.99f;
    
            CPQ[9][0] = 110;
            CPQ[9][1] = 19.99f;
    
            CPQ[10][0] = 201;
            CPQ[10][1] = 7.00f;
    
            CPQ[11][0] = 202;
            CPQ[11][1] = 7.00f;
    
            CPQ[12][0] = 203;
            CPQ[12][1] = 7.00f;
    
            CPQ[13][0] = 204;
            CPQ[13][1] = 4.50f;
    
            CPQ[14][0] = 205;
            CPQ[14][1] = 5.50f;
    
            CPQ[15][0] = 206;
            CPQ[15][1] = 5.50f;
    
            CPQ[16][0] = 207;
            CPQ[16][1] = 5.50f;
    
            CPQ[17][0] = 301;
            CPQ[17][1] = 8.90f;
    
            CPQ[18][0] = 302;
            CPQ[18][1] = 12.00f;
    
            CPQ[19][0] = 303;
            CPQ[19][1] = 5.50f;
    
            CPQ[20][0] = 401;
            CPQ[20][1] = 35.00f;
    
            CPQ[21][0] = 402;
            CPQ[21][1] = 40.00f;
    
            CPQ[22][0] = 403;
            CPQ[22][1] = 22.50f;
    
            CPQ[23][0] = 404;
            CPQ[23][1] = 5.00f;
    
            CPQ[24][0] = 405;
            CPQ[24][1] = 5.00f;
    
            CPQ[25][0] = 406;
            CPQ[25][1] = 3.99f;
    
            CPQ[26][0] = 407;
            CPQ[26][1] = 3.99f;
            
            
            switch(CodigoCard){
                case 101:
                    System.out.println("---------------------------------------------------------------");  
                    System.out.print("\t\t"+ nomes[0][0]);       
                    System.out.println("\n---------------------------------------------------------------");      
                    Confirmar();
                    break;
                    
    
                case 102:
                    System.out.println("---------------------------------------------------------------");  
                    System.out.print("\t\t"+nomes[1][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                   
                
                case 103:
                    System.out.println("---------------------------------------------------------------");  
                    System.out.printf("\t\t"+nomes[2][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                    
                
                case 104:
                    System.out.println("---------------------------------------------------------------");   
                    System.out.printf("\t\t"+nomes[3][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                   
                
                case 105:
                    System.out.println("---------------------------------------------------------------");  
                    System.out.printf("\t\t"+nomes[4][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
               
                case 106:
                    System.out.println("---------------------------------------------------------------");  
                    System.out.printf("\t\t"+nomes[5][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                    
                
                case 107:
                    System.out.println("---------------------------------------------------------------");  
                    System.out.printf("\t\t"+nomes[6][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                    
        
                case 108:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[7][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                
                case 109:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.print("\t\t"+nomes[8][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 110:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.print("\t\t"+nomes[9][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 201:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[10][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 202:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[11][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 203:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[12][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 204:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[13][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 205:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[14][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 206:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[15][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 207:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[16][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 301:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[17][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 302:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[18][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
    
                case 303:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[19][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                        Confirmar();
                    break;
    
                case 401:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[20][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 402:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[21][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 403:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[22][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 404:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[23][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 405:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[24][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 406:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[25][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
                
                case 407:
                    System.out.println("---------------------------------------------------------------");      
                    System.out.printf("\t\t"+nomes[26][0]);
                    System.out.println("\n---------------------------------------------------------------");  
                    Confirmar();
                    break;
    
            }
        }

        void CadastroQuant(){
            switch(CodigoCard){
                case 101:
                    CPQ[0][MesaEscolhida + 2] += QuantidadeComida;
                    break;
            
                case 102:
                    CPQ[1][MesaEscolhida + 2] += QuantidadeComida;
                    break;    
                
                case 103:
                    CPQ[2][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 104:
                    CPQ[3][MesaEscolhida + 2] += QuantidadeComida;
                    break;    
                
                case 105:
                    CPQ[4][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 106:
                    CPQ[5][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 107:
                    CPQ[6][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 108:
                    CPQ[7][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 109:
                    CPQ[8][MesaEscolhida + 2] += QuantidadeComida;   
                    break; 
                
                case 110:
                    CPQ[9][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 201:
                    CPQ[10][MesaEscolhida +2] += QuantidadeComida;  
                    break;  
                
                case 202:
                    CPQ[11][MesaEscolhida + 2] += QuantidadeComida;   
                    break; 
                
                case 203:
                    CPQ[12][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 204:
                    CPQ[13][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 205:
                    CPQ[14][MesaEscolhida + 2] += QuantidadeComida; 
                    break;   
                
                case 206:
                    CPQ[15][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 207:
                    CPQ[16][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
                
                case 301:
                    CPQ[17][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 302:
                    CPQ[18][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
    
                case 303:
                    CPQ[19][MesaEscolhida + 2] += QuantidadeComida;   
                    break; 
    
                case 401:
                    CPQ[20][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 402:
                    CPQ[21][MesaEscolhida + 2] += QuantidadeComida;    
                    break;

                case 403:
                    CPQ[22][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
                
                case 404:
                    CPQ[23][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 405:
                    CPQ[24][MesaEscolhida + 2] += QuantidadeComida;   

                
                case 406:
                    CPQ[25][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 407:
                    CPQ[26][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
    
            }
        }

    void Excluir(){

            switch(ExcluirItem){
                case 101:
                    if(CPQ[0][(MesaEscolhida + 2)] > 1){
                        System.out.println("---------------------------------------------------------------\n");      
                        System.out.printf("Quantos pedidos de %s deseja cancelar? ->",  nomes[0][0]);
                        QuantExc = leitor.nextInt();
                            if(QuantExc > CPQ[0][MesaEscolhida + 2]){
                                System.out.print("Valor Inválido");
                                VerificarMesa();
                               
                            }
                            CPQ[0][(MesaEscolhida + 2)] -= QuantExc;
                            PedidoMesa();
                    }
                    CPQ[0][(MesaEscolhida + 2)] -= 1;
                    PedidoMesa();
                    break;
            
    
                case 102:
                    if(CPQ[1][(MesaEscolhida + 2)] > 0){
                        System.out.println("---------------------------------------------------------------\n");  
                        System.out.printf("Quantos pedidos de %s deseja cancelar? ->", nomes[1][0]);
                        QuantExc = leitor.nextInt();
                            if(QuantExc > CPQ[1][MesaEscolhida + 2]){
                                System.out.print("Valor Inválido");
                                VerificarMesa(); 
                            }
                            CPQ[1][(MesaEscolhida + 2)] -= QuantExc;
                            PedidoMesa();
                    }
                    CPQ[1][(MesaEscolhida + 2)] -= 1;
                    PedidoMesa();
                    break;
                
                case 103:
                    if(CPQ[2][(MesaEscolhida + 2)] > 0){
                        System.out.println("---------------------------------------------------------------\n");  
                        System.out.printf("Quantos pedidos de %s deseja cancelar? ->", nomes[2][0]);
                        QuantExc = leitor.nextInt();
                            if(QuantExc > CPQ[2][MesaEscolhida + 2]){
                                System.out.print("Valor Inválido");
                                VerificarMesa();
                                CPQ[2][(MesaEscolhida + 2)] -= QuantExc;
                                PedidoMesa();
                                
                            }
                    } 
                    CPQ[2][(MesaEscolhida + 2)] -= 1;
                    PedidoMesa();
                    break;
                
                case 104:
                    if(CPQ[3][(MesaEscolhida + 2)] > 0){
                        System.out.println("---------------------------------------------------------------\n");  
                        System.out.printf("Quantos pedidos de %s deseja cancelar? ->", nomes[3][0]);
                        QuantExc = leitor.nextInt();
                            if(QuantExc > CPQ[3][MesaEscolhida + 2]){
                                System.out.print("Valor Inválido");
                                VerificarMesa();      
                                CPQ[3][(MesaEscolhida + 2)] -= QuantExc;
                                PedidoMesa();     
                            }
                    }
                    CPQ[3][(MesaEscolhida + 2)] -= 1;
                    PedidoMesa();
                    break;
                    
                case 105:
                    if(CPQ[4][(MesaEscolhida + 2)] > 0){
                        System.out.println("---------------------------------------------------------------\n");  
                        System.out.printf("Quantos pedidos de %s deseja cancelar? ->", nomes[4][0]);
                        QuantExc = leitor.nextInt();
                            if(QuantExc > CPQ[4][MesaEscolhida + 2]){
                                System.out.print("Valor Inválido");
                                VerificarMesa();
                                CPQ[4][(MesaEscolhida + 2)] -= QuantExc;
                                PedidoMesa();                            
                            }
                    }
                    CPQ[3][(MesaEscolhida + 2)] -= 1;
                    PedidoMesa();
                    break;
                
                case 106:
                    CPQ[5][MesaEscolhida + 2] += QuantidadeComida;   
                    break; 
                
                case 107:
                    CPQ[6][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
                
                case 108:
                    CPQ[7][MesaEscolhida + 2] += QuantidadeComida;   
                    break; 
                
                case 109:
                    CPQ[8][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
                
                case 110:
                    CPQ[9][MesaEscolhida + 2] += QuantidadeComida;
                    break;    
                
                case 201:
                    CPQ[10][MesaEscolhida +2] += QuantidadeComida;    
                    break;
                
                case 202:
                    CPQ[12][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 203:
                    CPQ[13][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
                
                case 204:
                    CPQ[14][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
                
                case 205:
                    CPQ[15][MesaEscolhida + 2] += QuantidadeComida;    
                    break;

                case 206:
                    CPQ[16][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
                
                case 207:
                    CPQ[17][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
                
                case 301:
                    CPQ[18][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 302:
                    CPQ[19][MesaEscolhida + 2] += QuantidadeComida; 
                    break;   
    
                case 303:
                    CPQ[20][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
    
                case 401:
                    CPQ[21][MesaEscolhida + 2] += QuantidadeComida;  
                    break;  
                
                case 402:
                    CPQ[22][MesaEscolhida + 2] += QuantidadeComida; 
                    break;
                
                case 403:
                    CPQ[23][MesaEscolhida + 2] += QuantidadeComida;   
                    break; 
                
                case 404:
                    CPQ[24][MesaEscolhida + 2] += QuantidadeComida; 
                    break;   
                
                case 405:
                    CPQ[25][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
                
                case 406:
                    CPQ[26][MesaEscolhida + 2] += QuantidadeComida;    
                    break;

                case 407:
                    CPQ[27][MesaEscolhida + 2] += QuantidadeComida;    
                    break;
    
            }
        }
        String presssiona;
    void MostraPedidos(){
            util.limpatela();
            TotalMesa[MesaEscolhida] = 0;
            System.out.printf("\t\t\tITENS PEDIDOS NA MESA %d\n", MesaEscolhida);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Codigo           Item                           Preço               Quantidade               Total do Item");                                                                                
            for(i=0; i<27; i++){
                if(CPQ[i][MesaEscolhida + 2] != 0){
                    TotalItem = CPQ[i][1] * CPQ[i][MesaEscolhida + 2];
                    TotalMesa[MesaEscolhida] += TotalItem;
                    System.out.printf("\n%.0f           %s                           %.2f               %.0f               %.2f", CPQ[i][0], nomes[i][0], CPQ[i][1], CPQ[i][MesaEscolhida + 2], TotalItem);
                
                }    
            }
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("\n\nTOTAL DA MESA --> %.2f", TotalMesa[MesaEscolhida]);  
            System.out.println("\n\n\t\tPressione uma tecla para retornar ao Menu Inicial");
            leitor.nextLine();
            leitor.nextLine();
            util.limpatela();
            menuinicial();
        
    
        }

    void MenuFecharMesa(){
            util.limpatela();
            System.out.println("\n---------------------------------------------------------------");
            System.out.println("\t\tFECHAR MESA");
            System.out.println("---------------------------------------------------------------");    
            System.out.print("\t1. Informar mesa que deseja fechar.\n\t2. Retornar ao Menu Inicial.\n");
            System.out.println("---------------------------------------------------------------");  
            System.out.print("\nEscolha uma opção->");
            opFecharMesa = leitor.nextInt();
    
                switch(opFecharMesa){
                    case 1:
                        util.limpatela();  
                        System.out.print("Mesas Abertas ->");   
                        for(int i=1; i<11; i++){
        
        
                            if(mesas[i] == 1){
                            System.out.print(i + " - ");
                            }  
                        }
                        System.out.println("\n-----------------------------------------------------------------------------------------\n");   
                        System.out.print("Informe o número da mesa que deseja fechar ou informe 0 para retornar ao menu anterior ->");
                        MesaEscolhida = leitor.nextInt();
    
                        if(MesaEscolhida == 0){
                            MenuFecharMesa();
                        }
                        if(mesas[MesaEscolhida] == 0){
                            MenuFecharMesa();
                        }
                        else{
                            System.out.println("\n-----------------------------------------------------------------------------------------\n");   
                            System.out.println("Tem certeza que deseja fechar a mesa "+ MesaEscolhida+"?");
                            System.out.println("\n\t1. Sim\n\t2. Não\n\t");
                            System.out.println("-----------------------------------------------------------------------------------------\n");   
                            System.out.print("Escolha uma opção->");
                            ConfirmFecharMesa = leitor.nextInt();
    
                                switch(ConfirmFecharMesa){
                                    case 1:
                                        mesas[MesaEscolhida] = 0;
                                       
                                        System.out.println("\t\t\tMESA "+ MesaEscolhida +" FECHADA\n\n");
                                        MostraPedidos();
                                        for(i = 0; i<27; i++){
                                            CPQ[i][MesaEscolhida + 2] = 0;
                                        }
                                        break;
                                    case 2: 
                                        util.limpatela();
                                        MenuFecharMesa();
                                        break;
    
                                }
                            }
                    case 2:
                        util.limpatela();
                        menuinicial();
                        
    
                }
        }


}


   
 
   
   
   
   
   
   
   
  