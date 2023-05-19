import java.util.Scanner;

public class cardapio {

    int CodigoCard, QuantExc;
    
    Menus cardapio = new Menus();
    String [][]nomes = new String[27][1]; 
    float [][]CPQ = new float[27][12]; 
   
   
    
   
   
   
    void Cardapio(){

        switch(CodigoCard){
            case 101:
                System.out.printf(nomes[0][0]);
                cardapio.Confirmar();
                

            case 102:
                System.out.printf(nomes[1][0]);
                cardapio.Confirmar();
               
            
            case 103:
               System.out.printf(nomes[2][0]);
                cardapio.Confirmar();
                
            
            case 104:
                 System.out.printf(nomes[3][0]);
                cardapio.Confirmar();
               
            
            case 105:
                System.out.printf(nomes[4][0]);
                cardapio.Confirmar();
           
            case 106:
                System.out.printf(nomes[5][0]);
                cardapio.Confirmar();
                
            
            case 107:
                System.out.printf(nomes[6][0]);
                cardapio.Confirmar();
                
    
            case 108:
                System.out.printf(nomes[7][0]);
                cardapio.Confirmar();
                
            
            case 109:
                System.out.printf(nomes[8][0]);
                cardapio.Confirmar();
                
            
            case 110:
                System.out.printf(nomes[9][0]);
                cardapio.Confirmar();
                
            
            case 201:
                System.out.printf(nomes[10][0]);
                cardapio.Confirmar();
                
            
            case 202:
                System.out.printf(nomes[11][0]);
                cardapio.Confirmar();
                
            
            case 203:
                System.out.printf(nomes[12][0]);
                cardapio.Confirmar();
                
            
            case 204:
                System.out.printf(nomes[13][0]);
                cardapio.Confirmar();
                
            
            case 205:
                System.out.printf(nomes[14][0]);
                cardapio.Confirmar();
                
            
            case 206:
                System.out.printf(nomes[15][0]);
                cardapio.Confirmar();
                
            
            case 207:
                System.out.printf(nomes[16][0]);
                cardapio.Confirmar();
                
            
            case 301:
                System.out.printf(nomes[17][0]);
                cardapio.Confirmar();
                
            
            case 302:
                System.out.printf(nomes[18][0]);
                cardapio.Confirmar();
                

            case 303:
                System.out.printf(nomes[19][0]);
                cardapio.Confirmar();
                

            case 401:
                System.out.printf(nomes[20][0]);
                cardapio.Confirmar();
                
            
            case 402:
                System.out.printf(nomes[21][0]);
                cardapio.Confirmar();
                
            
            case 403:
                System.out.printf(nomes[22][0]);
                cardapio.Confirmar();
                
            
            case 404:
                System.out.printf(nomes[23][0]);
                cardapio.Confirmar();
                
            
            case 405:
                System.out.printf(nomes[24][0]);
                cardapio.Confirmar();
                
            
            case 406:
                System.out.printf(nomes[25][0]);
                cardapio.Confirmar();
                
            
            case 407:
                System.out.printf(nomes[26][0]);
                cardapio.Confirmar();


        }
    }



    void menuCardapio(){
        System.out.println("---------------------------------------------------------------");
        System.out.printf("\t\tCardápio");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("\tPratos\n");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Codigo                      Item                      Preço(R$)");
        System.out.println("101                Filé de frango grelhado                16,50");
        System.out.println("102                    Iscas de frango                    22,35");
        System.out.println("103                    Iscas de carne                     22,35");
        System.out.println("104                    Bife acebolado                     26,99");
        System.out.println("105               File de frango a milanesa               28,99");
        System.out.println("106                   File a parmegiana                   35,50");
        System.out.println("107                     Ceasar salad                      16,50");
        System.out.println("108                Espaguete ao alho e oleo               15,00");
        System.out.println("109                   Panqueca de carne                   19,99");
        System.out.println("110                   Panqueca de queijo                  19,99");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("\tBebidas\n");
        System.out.println("---------------------------------------------------------------");
        System.out.println("201                  Suco de laranja(500ml)                7,00");
        System.out.println("202                  Suco de abacaxi(500ml)                7,00");
        System.out.println("203                  Suco de maracuja(500ml)               7,00");
        System.out.println("204                       Agua(500ml)                      4,50");
        System.out.println("205                    Coca-cola(350ml)                    5,50");
        System.out.println("206                 Guarana antartica(350ml)               5,50");
        System.out.println("207                       Fanta(350ml)                     5,50");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("\tSobremesa\n");
        System.out.println("---------------------------------------------------------------");
        System.out.println("301                     Fatia de pudim                     8,90");
        System.out.println("302                    Fatia cheesecake                   12,00");
        System.out.println("303                     Bola de sorvete                    5,50");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("\tPorcoes\n");
        System.out.println("---------------------------------------------------------------");
        System.out.println("401                   Calabresa acebolada                 35,00");
        System.out.println("402                   Frango a passarinho                 40,00");
        System.out.println("403                      Batata frita                     22,50");
        System.out.println("404                  Porcao extra de arroz                 5,00");
        System.out.println("405                  Porcao extra de feijao                5,00");
        System.out.println("406                  Adicional de ovo frito                3,99");
        System.out.println("406                    Adicional de bacon                  3,99");
        System.out.println("---------------------------------------------------------------");


    }

    void matrizItensCardapio(){

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
    }
        


    void CadastroQuant(){
        switch(CodigoCard){
            case 101:
                CPQ[0][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;
        

            case 102:
                CPQ[1][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 103:
                CPQ[2][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 104:
                CPQ[3][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 105:
                CPQ[4][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 106:
                CPQ[5][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 107:
                CPQ[6][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 108:
                CPQ[7][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 109:
                CPQ[8][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 110:
                CPQ[9][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 201:
                CPQ[10][cardapio.MesaEscolhida +2] += cardapio.QuantidadeComida;    
            
            case 202:
                CPQ[12][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 203:
                CPQ[13][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 204:
                CPQ[14][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 205:
                CPQ[15][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 206:
                CPQ[16][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 207:
                CPQ[17][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 301:
                CPQ[18][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 302:
                CPQ[19][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    

            case 303:
                CPQ[20][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    

            case 401:
                CPQ[21][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 402:
                CPQ[22][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 403:
                CPQ[23][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 404:
                CPQ[24][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 405:
                CPQ[25][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 406:
                CPQ[26][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 407:
                CPQ[27][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    

        }
    }
        
   
   
   
   
   
    void Excluir(){

        switch(cardapio.ExcluirItem){
            case 101:
                if(CPQ[0][cardapio.MesaEscolhida + 2] > 1){
                    System.out.print("Quantos pedidos de %s deseja cancelar ? ");
                    QuantExc = cardapio.leitor.nextInt();
                        if(QuantExc > CPQ[0][cardapio.MesaEscolhida + 2]){
                            System.out.print("Valor Inválido");
                            cardapio.VerificarMesa();
                        }
                }
        

            case 102:
            if(CPQ[1][cardapio.MesaEscolhida + 2] > 1){
                System.out.print("Quantos pedidos de %s deseja cancelar ? ");
                QuantExc = cardapio.leitor.nextInt();
                    if(QuantExc > CPQ[1][cardapio.MesaEscolhida + 2]){
                        System.out.print("Valor Inválido");
                        cardapio.VerificarMesa();
                    }
            }
            case 103:
            if(CPQ[2][cardapio.MesaEscolhida + 2] > 1){
                System.out.print("Quantos pedidos de %s deseja cancelar ? ");
                QuantExc = cardapio.leitor.nextInt();
                    if(QuantExc > CPQ[2][cardapio.MesaEscolhida + 2]){
                        System.out.print("Valor Inválido");
                        cardapio.VerificarMesa();
                    }
            } 
            
            case 104:
            if(CPQ[3][cardapio.MesaEscolhida + 2] > 1){
                System.out.print("Quantos pedidos de %s deseja cancelar ? ");
                QuantExc = cardapio.leitor.nextInt();
                    if(QuantExc > CPQ[3][cardapio.MesaEscolhida + 2]){
                        System.out.print("Valor Inválido");
                        cardapio.VerificarMesa();
                    }
            }
            
            case 105:
            if(CPQ[4][cardapio.MesaEscolhida + 2] > 1){
                System.out.print("Quantos pedidos de %s deseja cancelar ? ");
                QuantExc = cardapio.leitor.nextInt();
                    if(QuantExc > CPQ[4][cardapio.MesaEscolhida + 2]){
                        System.out.print("Valor Inválido");
                        cardapio.VerificarMesa();
                    }
            }
            
            case 106:
                CPQ[5][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 107:
                CPQ[6][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 108:
                CPQ[7][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 109:
                CPQ[8][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 110:
                CPQ[9][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 201:
                CPQ[10][cardapio.MesaEscolhida +2] += cardapio.QuantidadeComida;    
            
            case 202:
                CPQ[12][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 203:
                CPQ[13][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 204:
                CPQ[14][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 205:
                CPQ[15][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 206:
                CPQ[16][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 207:
                CPQ[17][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 301:
                CPQ[18][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 302:
                CPQ[19][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    

            case 303:
                CPQ[20][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    

            case 401:
                CPQ[21][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 402:
                CPQ[22][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 403:
                CPQ[23][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 404:
                CPQ[24][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 405:
                CPQ[25][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 406:
                CPQ[26][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    
            
            case 407:
                CPQ[27][cardapio.MesaEscolhida + 2] += cardapio.QuantidadeComida;    

        }
    }
}

