public class cardapio {

    int CodigoCard;
    Menus cardapio = new Menus();
    String [][]Nomes = new String[27][1]; 
    int [][]CPQ = new int[27][12]; 
   
   
    
   
   
   
    void Cardapio(){

        switch(CodigoCard){
            case 101:
                cardapio.Confirmar();
                System.out.printf(nomes[0][0]);

            case 102:
                cardapio.Confirmar();
                System.out.printf(nomes[1][0]);
            
            case 103:
                cardapio.Confirmar();
                System.out.printf(nomes[2][0]);
            
            case 104:
                cardapio.Confirmar();
                System.out.printf(nomes[3][0]);
            
            case 105:
                cardapio.Confirmar();
                System.out.printf(nomes[4][0]);
            
            case 106:
                cardapio.Confirmar();
                System.out.printf(nomes[5][0]);
            
            case 107:
                cardapio.Confirmar();
                System.out.printf(nomes[6][0]);
            
            case 108:
                cardapio.Confirmar()
                System.out.printf(nomes[7][0]);
            
            case 109:
                cardapio.Confirmar();
                System.out.printf(nomes[8][0]);
            
            case 110:
                cardapio.Confirmar();
                System.out.printf(nomes[9][0]);
            
            case 201:
                cardapio.Confirmar();
                System.out.printf(nomes[10][0]);
            
            case 202:
                cardapio.Confirmar();
                System.out.printf(nomes[11][0]);
            
            case 203:
                cardapio.Confirmar();
                System.out.printf(nomes[12][0]);
            
            case 204:
                cardapio.Confirmar();
                System.out.printf(nomes[13][0]);
            
            case 205:
                cardapio.Confirmar();
                System.out.printf(nomes[14][0]);
            
            case 206:
                cardapio.Confirmar();
                System.out.printf(nomes[15][0]);
            
            case 207:
                cardapio.Confirmar();
                System.out.printf(nomes[16][0]);
            
            case 301:
                cardapio.Confirmar();
                System.out.printf(nomes[17][0]);
            
            case 302:
                cardapio.Confirmar();
                System.out.printf(nomes[18][0]);

            case 303:
                cardapio.Confirmar();
                System.out.printf(nomes[19][0]);

            case 401:
                cardapio.Confirmar();
                System.out.printf(nomes[20][0]);
            
            case 402:
                cardapio.Confirmar();
                System.out.printf(nomes[21][0]);
            
            case 403:
                cardapio.Confirmar();
                System.out.printf(nomes[22][0]);
            
            case 404:
                cardapio.Confirmar();
                System.out.printf(nomes[23][0]);
            
            case 405:
                cardapio.Confirmar();
                System.out.printf(nomes[24][0]);
            
            case 406:
                cardapio.Confirmar();
                System.out.printf(nomes[25][0]);
            
            case 407:
                cardapio.Confirmar();
                System.out.printf(nomes[26][0]);


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
    
public class cardapio {

    int CodigoCard;
    Menus cardapio = new Menus();
    String [][]nomes = new String[27][1]; 
    int [][]CQP = new int[27][12];

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
        
    }
  


   
    void Cardapio(){

        switch(CodigoCard){
            case 101:
                cardapio.Confirmar();
                System.out.printf(nomes[0][0]);

            case 102:
                cardapio.Confirmar();
                System.out.printf(nomes[1][0]);
            
            case 103:
                cardapio.Confirmar();
                System.out.printf(nomes[2][0]);
            
            case 104:
                cardapio.Confirmar();
                System.out.printf(nomes[3][0]);
            
            case 105:
                cardapio.Confirmar();
                System.out.printf(nomes[4][0]);
            
            case 106:
                cardapio.Confirmar();
                System.out.printf(nomes[5][0]);
            
            case 107:
                cardapio.Confirmar();
                System.out.printf(nomes[6][0]);
            
            case 108:
                cardapio.Confirmar()
                System.out.printf(nomes[7][0]);
            
            case 109:
                cardapio.Confirmar();
                System.out.printf(nomes[8][0]);
            
            case 110:
                cardapio.Confirmar();
                System.out.printf(nomes[9][0]);
            
            case 201:
                cardapio.Confirmar();
                System.out.printf(nomes[10][0]);
            
            case 202:
                cardapio.Confirmar();
                System.out.printf(nomes[11][0]);
            
            case 203:
                cardapio.Confirmar();
                System.out.printf(nomes[12][0]);
            
            case 204:
                cardapio.Confirmar();
                System.out.printf(nomes[13][0]);
            
            case 205:
                cardapio.Confirmar();
                System.out.printf(nomes[14][0]);
            
            case 206:
                cardapio.Confirmar();
                System.out.printf(nomes[15][0]);
            
            case 207:
                cardapio.Confirmar();
                System.out.printf(nomes[16][0]);
            
            case 301:
                cardapio.Confirmar();
                System.out.printf(nomes[17][0]);
            
            case 302:
                cardapio.Confirmar();
                System.out.printf(nomes[18][0]);

            case 303:
                cardapio.Confirmar();
                System.out.printf(nomes[19][0]);

            case 401:
                cardapio.Confirmar();
                System.out.printf(nomes[20][0]);
            
            case 402:
                cardapio.Confirmar();
                System.out.printf(nomes[21][0]);
            
            case 403:
                cardapio.Confirmar();
                System.out.printf(nomes[22][0]);
            
            case 404:
                cardapio.Confirmar();
                System.out.printf(nomes[23][0]);
            
            case 405:
                cardapio.Confirmar();
                System.out.printf(nomes[24][0]);
            
            case 406:
                cardapio.Confirmar();
                System.out.printf(nomes[25][0]);
            
            case 407:
                cardapio.Confirmar();
                System.out.printf(nomes[26][0]);


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
    


    void CadastroQuant(){
        switch(CodigoCard){
            case 101:
                CPQ[0][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;
        

            case 102:
                CPQ[1][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 103:
                CPQ[2][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 104:
                CPQ[3][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 105:
                CPQ[4][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 106:
                CPQ[5][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 107:
                CPQ[6][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 108:
                CPQ[7][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 109:
                CPQ[8][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 110:
                CPQ[9][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 201:
                CPQ[10][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 202:
                CPQ[12][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 203:
                CPQ[13][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 204:
                CPQ[14][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 205:
                CPQ[15][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 206:
                CPQ[16][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 207:
                CPQ[17][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 301:
                CPQ[18][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 302:
                CPQ[19][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    

            case 303:
                CPQ[20][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    

            case 401:
                CPQ[21][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 402:
                CPQ[22][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 403:
                CPQ[23][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 404:
                CPQ[24][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 405:
                CPQ[25][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 406:
                CPQ[26][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    
            
            case 407:
                CPQ[27][cardapio.MesaEscolhida + 1] += cardapio.QuantidadeComida;    

        }
        


    }

/*Ao digitar o código o aplicativo deve mostrar o nome do item e
apresentar a mensagem “Este é o item que deseja?” indicando “1 – para Sim” e “2 –
para Não”. */
}

