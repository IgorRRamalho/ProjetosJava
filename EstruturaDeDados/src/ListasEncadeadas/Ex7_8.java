package ListasEncadeadas;

import java.util.Scanner;

public class Ex7_8 {
    
    //EXERCÍCIOS 7 E 8

    Scanner leitor = new Scanner(System.in);
    int tamanho;
    int tes = 0, op;
    
    public tipoNo cabeca, cabeca2, cabeca3;
    tipoNo util = new tipoNo();

    public void menu() {
        while (op != -1){
            System.out.print("\n**********************MENU**********************");
            if(cabeca == null && cabeca2==null){
                 System.out.println("\n(1)INSERE\t(-1)SAIR");
            }else if(cabeca != null && cabeca2 == null && getTamanhoNo(cabeca)>1){
                 System.out.println("\n(1) INSERE\t(2)REMOVE\n(3)IMPRIMR\t(4)Dividir Lista\n(-1)SAIR");
            }else if(cabeca != null && cabeca2 == null && getTamanhoNo(cabeca)==1){
                System.out.println("\n(1)INSERE\t(2)REMOVE\n(3)IMPRIMR\t(-1)SAIR");
            }else if(cabeca2 != null && cabeca != null){
                System.out.println("\n(3)IMPRIMR\t(5)Separar Impar\n(-1)SAIR");
            }
            System.out.print("\nOPÇÃO->");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    System.out.print("DIGITE O VALOR DESEJADO ->");
                    int valor = leitor.nextInt();
                    util.LimpTela();
                    insereFinal(valor);
                    break;

                case 2:
                    util.LimpTela();
                    removeFinal();
                    break;

                case 3:
                    util.LimpTela();
                    imprime();
                    break;

                case 4:
                    System.out.print("\nDIGITE A POSIÇÃO ->");
                    int pos = leitor.nextInt();
                    util.LimpTela();
                    divLista(pos);
                    break;
                
                case 5:
                    util.LimpTela();
                    SepaI();
                    SepaP();
                    break;

                case -1:
                    System.out.println("SAINDO ");
                    break;

                default:
                    util.LimpTela();
                    System.out.println("OPCÃO ERRADA");
                    break;
            }
        }
    }

    public void insereFinal(int info) {
        if(cabeca == null) {
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
            cabeca.setAnt(null);
            this.tamanho++;
        }else{
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
        }else{
            if(cabeca != null){
                System.out.print("Lista 1: ");
                for(i =0; i<getTamanhoNo(cabeca); i++){
                    System.out.print(aux.getInfo() + " ");
                    aux = aux.getProx();
                }
                System.out.println("");
            }
            if(cabeca2 != null){
                System.out.print("Lista 2: ");
                 for(i =0; i<getTamanhoNo(cabeca2); i++){
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
        if(cabeca != null){
            tipoNo aux;
        int cont =0;
        aux = cabeca;
        while(aux.getProx() != null){
            aux = aux.getProx();
            cont++;
        }
        cont++;
        return cont;
        }else{
            return 0;
        }
    }
    

    public void SepaI() {
        tipoNo aux, aux2, aux3, pos, ant;
        aux = cabeca;
        aux2 = cabeca2;
        int i;
        int teste=0;
        
       int tamanhoC = getTamanhoNo(cabeca);
        for(i=1; i<=tamanhoC; i++){
            teste++;
            if(aux.getInfo()%2 != 0){
                if(aux.getAnt() == null){
                    if(getTamanhoNo(cabeca) == 1){
                        while(aux2.getProx() != null){
                        aux2 = aux2.getProx();   
                        }
                        aux2.setProx(aux);
                        cabeca = null;
                    }else{
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
                        aux3.setAnt(aux2);
                        aux3.setProx(null);
                        cabeca.setAnt(null);
                    }
                }else{
                    aux2=cabeca2;
                    while(aux2.getProx() != null){
                        aux2 = aux2.getProx();
                    }
                    aux2.setProx(aux);
                    aux3 = aux;
                    if(teste < tamanhoC){
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
                 aux = aux.getProx();
                }
            } 
        }
    }

    public void SepaP(){
        tipoNo aux, aux2, aux3, pos, ant;
        aux = cabeca2;
        aux2 = cabeca;    
        
        int i;
        int teste=0;
        
        int tamanhoC = getTamanhoNo(cabeca2);
        for(i=1; i<=tamanhoC; i++){
            teste++;

            if(aux.getInfo()%2 == 0){
                if(aux.getAnt() == null){  
                    if(getTamanhoNo(cabeca2) == 1){
                        while(aux2.getProx() != null){
                        aux2 = aux2.getProx();      
                    }
                    aux2.setProx(aux);
                    cabeca2 = null;
                    }else{
                        aux2=cabeca;
                        if(cabeca != null){
                            while(aux2.getProx() != null){       
                                aux2 = aux2.getProx();
                            }
            
                        aux2.setProx(aux);
                        aux3 = aux; 
                        if(teste != tamanhoC){
                            aux = aux.getProx();
                        }
                            
                        cabeca2 = aux3.getProx();
                        aux3.setAnt(aux2);
                        aux3.setProx(null);
                        cabeca2.setAnt(null);
            
                        }else{
                            cabeca = aux;
                            aux3 = aux; 
                            if(teste != tamanhoC){
                                aux = aux.getProx();
                            }
                        
                            cabeca2 = aux3.getProx();
                            aux3.setAnt(aux2);
                            aux3.setProx(null);
                            cabeca2.setAnt(null);
                        }
                     
                    }
                    
                }else{
                    aux2=cabeca;
                    while(aux2.getProx() != null){
                        aux2 = aux2.getProx();
                    }
                    aux2.setProx(aux);
                    aux3 = aux;
                    if(teste < tamanhoC){
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
                    aux = aux.getProx();
                }
            }
             
        }

        System.out.println("-----------------SEPARAÇÃO DOS IMPARES E PARES CONCLUIDA-----------------");
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
