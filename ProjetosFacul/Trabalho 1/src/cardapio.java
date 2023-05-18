public class cardapio {

    int CodigoCard;
    Menus cardapio = new Menus();
    String [][]Nomes = new String[27][1]; 
    int [][]CPQ = new int[27][12]; 
   
   
    
   
   
   
    void Cardapio(){

        switch(CodigoCard){
            case 101:
          
            cardapio.Confirmar();

            case 102:
                cardapio.Confirmar();
            
            case 103:
                cardapio.Confirmar();
            
            case 104:
                cardapio.Confirmar();
            
            case 105:
                cardapio.Confirmar();
            
            case 106:
                cardapio.Confirmar();
            
            case 107:
                cardapio.Confirmar();
            
            case 108:
                cardapio.Confirmar();
            
            case 109:
                cardapio.Confirmar();
            
            case 110:
                cardapio.Confirmar();
            
            case 201:
                cardapio.Confirmar();
            
            case 202:
                cardapio.Confirmar();
            
            case 203:
                cardapio.Confirmar();
            
            case 204:
                cardapio.Confirmar();
            
            case 205:
                cardapio.Confirmar();
            
            case 206:
                cardapio.Confirmar();
            
            case 207:
                cardapio.Confirmar();
            
            case 301:
                cardapio.Confirmar();
            
            case 302:
                cardapio.Confirmar();

            case 303:
                cardapio.Confirmar();

            case 401:
                cardapio.Confirmar();
            
            case 402:
                cardapio.Confirmar();
            
            case 403:
                cardapio.Confirmar();
            
            case 404:
                cardapio.Confirmar();
            
            case 405:
                cardapio.Confirmar();
            
            case 406:
                cardapio.Confirmar();
            
            case 407:
                cardapio.Confirmar();


        }
    }
    void menuCardapio(){
        System.out.println("---------------------------------------------------------------");
        System.out.printf("\t\tCardápio");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("")
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
