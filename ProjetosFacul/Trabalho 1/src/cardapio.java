public class cardapio {

    int CodigoCard;
    Menus cardapio = new Menus()
    
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
        System.out.printf("\tPratos\n");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Codigo                      Item                      Preço(R$)");
        System.out.println("101                Filé de frango grelhado                16,50");
        System.out.println("102                    Iscas de frango                    22,35");
        System.out.println("103                    Iscas de carne                     22,35");
        System.out.println("104                    Bife acebolado                     26,99");
    }
    
}
/*Ao digitar o código o aplicativo deve mostrar o nome do item e
apresentar a mensagem “Este é o item que deseja?” indicando “1 – para Sim” e “2 –
para Não”. */