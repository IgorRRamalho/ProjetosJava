package P1.src;

import java.util.Scanner;

public class ex1 {

    Scanner leitor = new Scanner(System.in);
    int tamanho, op;
    No util = new No();
    public No cabeca;
   
    public void menu() {
        while (op != -1){
            System.out.print("\n**********************MENU**********************");
            if(cabeca == null){
                 System.out.println("\n(1)INSERE\t(-1)SAIR");
            }else{
                System.out.println("\n(1)INSERE\t(2)REMOVE\n(3)IMPRIMR\t(4) REMOVER PARES\n(-1)SAIR");
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
                    util.LimpTela();
                    RemovePar();
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
        No aux = cabeca;
        int i;
        if (cabeca == null) {
            System.out.println("-------------------------Listas Vazia-------------------------");
        }else{        
                System.out.print("Lista : ");
                for(i =0; i<getTamanhoNo(cabeca); i++){
                    System.out.print(aux.getInfo() + " ");
                    aux = aux.getProx();
                }
                System.out.println("");
            }
        }

        public void removeFinal(){
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
    
    
    
    public void insereFinal(int info) {
        if(cabeca == null) {
            cabeca = new No();
            cabeca.setInfo(info);
            cabeca.setProx(null);
            cabeca.setAnt(null);
            this.tamanho++;
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





    public void RemovePar(){
        No aux, aux2, aux3, pos, ant;
        
        aux = cabeca;    
        int i;
        boolean teste = false;
        int tamanhoC = getTamanhoNo(cabeca);
        if(cabeca == null){
            System.out.println("-------------------------Lista Vazia-------------------------");
        }else{
            for(i=1; i<=tamanhoC; i++){
                if(aux.getInfo()%2 == 0){
                    teste = true;
                    if(getTamanhoNo(cabeca) == 1){
                            cabeca = null;
                    }else if(aux.getProx() == null){
                        ant = aux.getAnt();
                        ant.setProx(null);
                    }else if(aux.getAnt() == null && cabeca.getProx() != null){  
                        cabeca = cabeca.getProx();
                        cabeca.setAnt(null);
                        aux = aux.getProx();
                    }else{
                        ant=aux.getAnt();
                        pos= aux.getProx();
                        
                        ant.setProx(pos);
                        pos.setAnt(ant);
                        aux = aux.getProx();
                        }

                }else{
                        aux = aux.getProx();
                    }
                }
                if(!teste){
                    System.out.println("--------------------NÃO TEM NÚMEROS PARES--------------------");
                }else if(teste){
                    System.out.println("--------------------PARES REMOVIDOS--------------------");
                }
            }
        }

                
    
                     
    

    public static void main(String[] args) throws Exception {

        ex1 clas = new ex1();

        clas.menu();
    }
    
}


  



