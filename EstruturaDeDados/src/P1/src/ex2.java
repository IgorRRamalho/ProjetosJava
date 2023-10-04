package P1.src;

import java.util.Scanner;

public class ex2 {
    
 Scanner leitor = new Scanner(System.in);
    int tamanho, op;
    No util = new No();
    public No cabeca, cabeca2;
   
    public void menu() {
        while (op != -1){
            System.out.print("\n**********************MENU**********************");
            if(cabeca == null && cabeca==null){
                 System.out.println("\n(1)INSERE LISTA 1\t(2)INSERE LISTA 2\n(-1)SAIR");
            }else{
                System.out.println("\n(1)INSERE LISTA 1\t(2)INSERE LISTA 2\n(3)REMOVE LISTA 1\t(4)REMOVE LISTA 2\n(5)IMPRIMIR\t(6)VERIFICAR LISTAS\n(-1)SAIR");
            }
            System.out.print("\nOPÇÃO->");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    System.out.print("DIGITE O VALOR DESEJADO ->");
                    int valor = leitor.nextInt();
                    util.LimpTela();
                    insereFinal1(valor);
                    break;

                case 2:
                    System.out.print("DIGITE O VALOR DESEJADO ->");
                    valor = leitor.nextInt();
                    util.LimpTela();
                    insereFinal2(valor);
                    break;

                case 3:
                    util.LimpTela();
                    removeFinal(cabeca);
                    break;

                case 4:
                    util.LimpTela();
                    removeFinal(cabeca2);
                    break;

                case 5:
                    util.LimpTela();
                    imprime();
                    break;

                case 6:
                    util.LimpTela();
                    Ordenar(cabeca);
                    Ordenar(cabeca2);
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

    public void imprime() {
        No aux = cabeca, aux2 = cabeca2;
        int i;

        System.out.println("CABECA MENU "+ cabeca.getInfo());
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

        public void removeFinal(No cabeca){
            No impri;
           
            if(cabeca == null){
                System.out.println("-------------------------Lista Vazia-------------------------");
            }else if(getTamanhoNo(cabeca)== 1){
                cabeca = null;
                this.tamanho--;
            }else{
                No aux = cabeca;
                while(aux.getProx() != null){
                    aux = aux.getProx();
                }
                impri = aux;
                aux = aux.getAnt();
                aux.setProx(null);
                
                System.out.println("Elemento "+ impri.getInfo() +" removido com sucesso! ");
                aux.setProx(null);
                this.tamanho--;
               
             
            }
        }
    
    
    
    public void insereFinal1(int info) {
        if(cabeca == null) {
            cabeca = new No();
            cabeca.setInfo(info);
            cabeca.setProx(null);
            cabeca.setAnt(null);
            this.tamanho++;
            System.out.println(cabeca.getInfo());
        }else{
            No aux, novo;

            novo = new No();
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

    private int getTamanhoNo(No cabeca){
        if(cabeca != null){
            No aux;
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

    public void insereFinal2(int info) {
        if(cabeca2 == null) {
            cabeca2 = new No();
            cabeca2.setInfo(info);
            cabeca2.setProx(null);
            cabeca2.setAnt(null);
            this.tamanho++;
            System.out.println(cabeca2.getInfo());
        }else{
            No aux, novo;

            novo = new No();
            novo.setInfo(info);
            novo.setProx(null);

            aux = cabeca2;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            novo.setAnt(aux);

            aux.setProx(novo);
            this.tamanho++;
        }
        System.out.println("Elemento " + info + " inserido com sucesso! ");
    }


    public void Ordenar(No cabeca){
        boolean test;
        if(Veri(cabeca)){
            if(cabeca.getProx().getAnt() == cabeca2){

                System.out.println("--------------LISTA 2 NÃO ORDENADA--------------");
            }else{
                System.out.println("--------------LISTA 1 NÃO ORDENADA--------------");
            }
            No aux = cabeca;
            int num, tamanhoC;

            tamanhoC = getTamanhoNo(cabeca);
            for(int i=0; i<tamanhoC; i++){
                aux = cabeca;
                for(int cont=0; cont<tamanhoC; cont++){
                    if(aux.getProx() != null){
                        if(aux.getInfo() > aux.getProx().getInfo()){
                            num = aux.getInfo();
                            aux.setInfo(aux.getProx().getInfo());
                            aux.getProx().setInfo(num);                         
                            aux = aux.getProx();
                        }else{
                            aux = aux.getProx();
                        }
                    }
                }
            }
            if(cabeca.getProx().getAnt() == cabeca2){

                System.out.println("--------------LISTA 2 FOI ORDENADA--------------");
            }else{
                System.out.println("--------------LISTA 1 FOI ORDENADA--------------");
            }
        }else{
             if(cabeca.getProx().getAnt() == cabeca2){
                System.out.println("--------------LISTA 2 ESTÁ ORDENADA--------------");
            }else{
                System.out.println("--------------LISTA 1 ESTÁ ORDENADA--------------");
            }
            
        }
    }
    
    public boolean Veri(No cabeca){
        boolean test = false;
        No aux = cabeca;
        
       
        while(aux.getProx() != null){
            if(aux.getInfo() > aux.getProx().getInfo()){
              test = true;
              aux = aux.getProx();
            }else{
                aux = aux.getProx();
                
            }
        }
        return test;
            
    }

  


    public static void main(String[] args) throws Exception {

        ex2 clas = new ex2();

        clas.menu();
    }

}


