package ListasEncadeadas;

import java.util.Scanner;

public class Ex7_8 {

    Scanner leitor = new Scanner(System.in);
    int tamanho;
    int tes = 0, op;
    
    public tipoNo cabeca, cabeca2, cabeca3;

    public void menu() {
        
        while (op != -1){
            System.out.println("\n1- INSERE\t2-REMOVE\n 3-IMPRIMR\t 4-Dividir Lista\n 5- Separar Impar\n-1-SAIR");
            System.out.print("OPÇÃO->");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    System.out.print("DIGITE O VALOR DESEJADO ->");
                    int valor = leitor.nextInt();
                    insereFinal(valor);
                    break;

                case 2:
                    removeFinal();
                    break;

                case 3:
                    imprime();
                    break;

                case 4:
                    System.out.print("\nDIGITE A POSIÇÃO ->");
                    int pos = leitor.nextInt();
                    divLista(pos);
                    break;
                
                case 5:
                    SepaI();
                    SepaP();
                    break;

                case -1:
                    System.out.println("SAINDO ");
                    break;

                default:
                    System.out.println("OPCÃO ERRADA");
                    break;
            }
        }
    }

    public void insereFinal(int info) {
        if (cabeca == null) {
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
            cabeca.setAnt(null);
            this.tamanho++;
        } else {
            tipoNo aux, novo;

            novo = new tipoNo();
            novo.setInfo(info);
            novo.setProx(null);

            aux = cabeca;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            novo.setAnt(aux);

            aux.setProx(novo);
            this.tamanho++;
        }

        System.out.println("Elemento " + info + " inserido com sucesso! ");
    }

    public void imprime() {
        tipoNo aux = cabeca, aux2 = cabeca2;
        int i;
        if (cabeca == null  && cabeca2 == null) {
            System.out.println("-------------------------Listas Vazia-------------------------");
        } else {
            if(cabeca != null){
                System.out.println("\nENTROU LISTA 1 IMPRIMIR");
                System.out.println("\nTAMANHO LISTA 2 ->"+ getTamanhoNo(cabeca));
                System.out.print("Lista 1: ");
                for (i =0; i<getTamanhoNo(cabeca); i++) {
                    System.out.print(aux.getInfo() + " ");
                    aux = aux.getProx();
                }
                System.out.println("");
            }
            if(cabeca2 != null){
                System.out.println("\nENTROU LISTA 2 IMPRIMIR");
                System.out.println("\nTAMANHO LISTA 2 ->"+ getTamanhoNo(cabeca2));
                System.out.print("Lista 2: ");
                 
                 for (i =0; i<getTamanhoNo(cabeca2); i++)  {
                    System.out.print(aux2.getInfo() + " ");
                    aux2 = aux2.getProx();
                }
                System.out.println("");
            }
        }
    }

    public void removeFinal(){
        tipoNo impri;
       
        if(cabeca == null){
            System.out.println("-------------------------Lista Vazia-------------------------");
        }else if(getTamanho()== 1){
            cabeca = null;
            this.tamanho--;
        }else{
            tipoNo aux = cabeca;
           
            while(aux.getProx() != null){
                aux = aux.getProx();
            }
            impri = aux;
            aux = aux.getAnt();
            aux.setProx(null);
            
            
            System.out.println("Elemento "+ impri.getInfo() +" removido com sucesso! ");
            aux.setProx(null);
            
            this.tamanho--;
            System.out.println(getTamanho());
         
        }
    }




    private int getTamanho() {
        return tamanho;
    }

    private int getTamanhoNo(tipoNo cabeca){
        tipoNo aux;
        int cont =0;
        aux = cabeca;
        while(aux.getProx() != null){
            aux = aux.getProx();
            cont++;
        }
        cont++;
        return cont;

    }
    
    
    
    
    
    public void SepaI() {
        tipoNo aux, aux2, aux3, pos, ant;
        aux = cabeca;
        aux2 = cabeca2;
        int contador, i;
        int teste=0;
        
    
       int tamanhoC = getTamanhoNo(cabeca);
        for(i=1; i<=tamanhoC; i++){
            System.out.print("\nTAMANHO DO FOR->"+ tamanhoC);
            System.out.println("\nVALOR DO TESTE ->"+ teste);
            teste++;
            

        
             System.out.println("TAMANHO DO NO ->"+ getTamanhoNo(cabeca));
             System.out.println("VALOR DO FOR:"+i);
              System.out.println("VALOR DO AUX ->"+ aux.getInfo());
          

            if(aux.getInfo()%2 != 0){
                 System.out.println(aux.getInfo());
                 System.out.println("ENTROU NO IF DE IMPAR");
                if(aux.getAnt() == null){
                         System.out.println("ENTROU NO IF DE ANTERIOR NULO");
                    if(getTamanhoNo(cabeca) == 1){
                        System.out.println("ENTROU NO IF DE GETAMANHO");
                        while(aux2.getProx() != null){
                        aux2 = aux2.getProx();
                        
                    }
                    aux2.setProx(aux);
                    cabeca = null;
                    }else{
                        System.out.println("PASSOU RETO DO IF TAMANHO IGUAL A 1");
                        aux2=cabeca2;
                        while(aux2.getProx() != null){
                            aux2 = aux2.getProx();
                        }
                        aux2.setProx(aux);
                        aux3 = aux; 
                         if(teste != tamanhoC){
                            aux = aux.getProx();
                            }
                        
                        cabeca = aux3.getProx();
                        System.out.println("ANTERIOR DO AUX-> "+ aux3.getAnt());
                        aux3.setAnt(aux2);
                        aux3.setProx(null);
                        cabeca.setAnt(null);
                     
                    }
                    
                }else{
                     System.out.println("PASSOU DO ANTERIOR NULO");
                     aux2=cabeca2;
                    while(aux2.getProx() != null){
                        aux2 = aux2.getProx();
                    }
                    aux2.setProx(aux);
                    aux3 = aux;
                    System.out.println("VALOR DO TESTE ->"+ teste);
                    if(teste < tamanhoC){
                        System.out.print("PASSOU O AUX DENTRO DO NAO ANTERIRO NULO");
                         aux = aux.getProx();
                    }
                    if(i == tamanhoC){
                        ant = aux3.getAnt();
                        aux3.setAnt(aux2);
                        aux3.setProx(null);
                        ant.setProx(null);

                    }else{

                        pos = aux3.getProx();
                        ant = aux3.getAnt();
                        ant.setProx(pos);
                        pos.setAnt(ant);
                        aux3.setAnt(aux2);
                        aux3.setProx(null);
                        
                    }
                    
                }
            }else{
                System.out.print("\nNÃO É IMPAR");
                System.out.println("\nVALOR DO TESTE ->"+ teste);
                System.out.println("TAMANHO DO NO ->"+ tamanhoC);
                if(teste != tamanhoC){
                    System.out.print("AUX ANDOU");
                 aux = aux.getProx();
                }
            }
            
         System.out.println("\nFINAL DO FOR");
        
         
            
        }
        System.out.println("\nSAIU DO FOR");
        
    }


    public void SepaP(){
        tipoNo aux, aux2, aux3, pos, ant;
        aux = cabeca2;
        aux2 = cabeca;
        int contador, i;
        int teste=0;
        
    
       int tamanhoC = getTamanhoNo(cabeca2);
        for(i=1; i<=tamanhoC; i++){
            System.out.print("\nTAMANHO DO FOR->"+ tamanhoC);
            System.out.println("\nVALOR DO TESTE ->"+ teste);
            teste++;
           

        
             System.out.println("TAMANHO DO NO ->"+ getTamanhoNo(cabeca2));
             System.out.println("VALOR DO FOR:"+i);
              System.out.println("VALOR DO AUX ->"+ aux.getInfo());
          

            if(aux.getInfo()%2 == 0){
                 System.out.println(aux.getInfo());
                 System.out.println("ENTROU NO IF DE PAR");
                if(aux.getAnt() == null){
                         System.out.println("ENTROU NO IF DE ANTERIOR NULO");
                    if(getTamanhoNo(cabeca2) == 1){
                        System.out.println("ENTROU NO IF DE GETAMANHO");
                        while(aux2.getProx() != null){
                        aux2 = aux2.getProx();
                        
                    }
                    aux2.setProx(aux);
                    cabeca2 = null;
                    }else{
                        System.out.println("PASSOU RETO DO IF TAMANHO IGUAL A 1");
                        aux2=cabeca;
                        while(aux2.getProx() != null){
                            aux2 = aux2.getProx();
                        }
                        aux2.setProx(aux);
                        aux3 = aux; 
                         if(teste != tamanhoC){
                            aux = aux.getProx();
                            }
                        
                        cabeca2 = aux3.getProx();
                        System.out.println("ANTERIOR DO AUX-> "+ aux3.getAnt());
                        aux3.setAnt(aux2);
                        aux3.setProx(null);
                        cabeca2.setAnt(null);
                     
                    }
                    
                }else{
                     System.out.println("PASSOU DO ANTERIOR NULO");
                     aux2=cabeca;
                    while(aux2.getProx() != null){
                        aux2 = aux2.getProx();
                    }
                    aux2.setProx(aux);
                    aux3 = aux;
                    System.out.println("VALOR DO TESTE ->"+ teste);
                    if(teste < tamanhoC){
                        System.out.print("PASSOU O AUX DENTRO DO NAO ANTERIRO NULO");
                         aux = aux.getProx();
                    }
                    if(i == tamanhoC){
                        ant = aux3.getAnt();
                        aux3.setAnt(aux2);
                        aux3.setProx(null);
                        ant.setProx(null);

                    }else{

                        pos = aux3.getProx();
                        ant = aux3.getAnt();
                        ant.setProx(pos);
                        pos.setAnt(ant);
                        aux3.setAnt(aux2);
                        aux3.setProx(null);
                        
                    }
                    
                }
            }else{
                if(teste != tamanhoC){
                    System.out.print("AUX ANDOU");
                 aux = aux.getProx();
                }
            }
            
         System.out.println("\nFINAL DO FOR");
        
         
            
        }


    }

    public void divLista(int pos){
        tipoNo aux;
        aux=cabeca;
        if(getTamanho()==0){
            System.out.println("-------------------LISTA VAZIA-------------------");
        }else if(getTamanho()<2){
            System.out.println("-------------------TAMANHO INSUFICIENTE-------------------");
        }else if(pos>getTamanho()){
            System.out.println("-------------------POSIÇÃO INVÁLIDA-------------------");
        }else{


            cabeca2 = new tipoNo();

            for(int i=0; i<pos-1; i++){
                aux = aux.getProx();
            }
            cabeca2 = aux.getProx();
            cabeca2.setAnt(null);
            aux.setProx(null);
            
            System.out.println("-------------------LISTA DIVIDIDA-------------------");

        }
        

    }


   


    public static void main(String[] args) throws Exception {

        Ex7_8 clas = new Ex7_8();

        clas.menu();
    }

}
