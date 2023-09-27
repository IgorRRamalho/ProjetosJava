package ListaCircular;

import java.util.Scanner;




public class ListaEmC {

    Scanner leitor = new Scanner(System.in);
    int tamanho;
    int tes = 0, op;
    
    public TipoNo cabeca, cabeca2, cabeca3;
    TipoNo util = new TipoNo();

    public void menu() {
        while (op != -1){
    
                System.out.println("\n(1)INSERE\t(2)REMOVE\n(3)IMPRIMIR\t(-1)SAIR");
           
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
            cabeca = new TipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(cabeca);
            cabeca.setAnt(cabeca);
            this.tamanho++;
            
        }else{
           TipoNo novo = new TipoNo();
           TipoNo aux = cabeca.getAnt();
           novo.setInfo(info);
        

           novo.setProx(aux.getProx());
           aux.setProx(novo);
           cabeca.setAnt(novo);

        }
        System.out.println("Elemento " + info + " inserido com sucesso! ");
    }

    public void imprime() {
        TipoNo aux = cabeca, aux3;
        int i=0;
        if (cabeca == null) {
            System.out.println("-------------------------Listas Vazia-------------------------");
        }else{
            if(cabeca != null){
                System.out.print("Lista 1: ");
                while(aux.getProx() != cabeca){
                    i++;
                    if(i == 1){
                        aux3 = aux.getAnt();
                        System.out.println("\nULTIMO VALOR->"+ aux3.getInfo());
                    }
                    System.out.print(aux.getInfo() + " ");
                    aux = aux.getProx();
                    
                }
                System.out.print(aux.getInfo() + " ");
                aux3 = aux.getProx();
                System.out.println("\n PRIMEIRO VALOR->"+ aux3.getInfo());
            
            }
           
        }
    }

    public void removeFinal(){
        TipoNo impri;
       
        if(cabeca == null){
            System.out.println("-------------------------Lista Vazia-------------------------");
        }else if(getTamanho()== 1){
            cabeca = null;
            this.tamanho--;
        }else{
            TipoNo aux = cabeca;
            while(aux.getProx() != null){
                aux = aux.getProx();
            }
            impri = aux;
            aux = aux.getAnt();
            aux.setProx(cabeca);
            cabeca.setAnt(aux);
            
            System.out.println("Elemento "+ impri.getInfo() +" removido com sucesso! ");
            aux.setProx(null);
            this.tamanho--;
            System.out.println(getTamanho());
         
        }
    }

    private int getTamanho() {
        return tamanho;
    }

    private int getTamanhoNo(TipoNo cabeca){
        if(cabeca != null){
            TipoNo aux;
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
    

    public static void main(String[] args) throws Exception {

        ListaEmC clas = new ListaEmC();

        clas.menu();
    }
    
}
