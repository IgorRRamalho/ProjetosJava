package ListasEncadeadas;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class ListaE {

    Scanner leitor = new Scanner(System.in);
    int tamanho;
    public tipoNo cabeca, cabeca2;
    


    
    
    public int getTamanho() {
        return tamanho;
    }


    public void menu(){
        int valor,opcao=0;
        System.out.print("\n------------ Menu ------------");
        while(opcao!=-1){
           
            System.out.print("\n(1) Inserir Inicio\n(2) Remover Escolhido\n(3) Dividir Lista\n(4) Imprimir\n(5) Concatenar Lista\n(-1) Sair \nOpção: ");
            opcao = leitor.nextInt();
            switch(opcao){
                case 1:
                System.out.print("\nDigite o valor->");
                valor = leitor.nextInt();
                insereInicio(valor);
                break;

                case 2:
                    System.out.print("\nDigite a posição->");
                    valor = leitor.nextInt();    
                    removeresc(valor);
                    break;

                case 3:
                    System.out.print("\nDigite a posição->");
                    valor = leitor.nextInt();    
                    divLista(valor);
                    break;

                case 4:
                    imprime();
                    break;

                case 5:
                    concatenaLista();
                    break;
                
                case -1: //sair
                    System.out.println("Saindo!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;

            }

        }
    }

    public void imprime(){
        tipoNo aux = cabeca;
        tipoNo aux2 = cabeca2;
        if(getTamanho() == 0){
            System.out.println("-------------------------Lista Vazia-------------------------");
        }else if(cabeca2 == null){
            System.out.println("Impressao: ");
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
            System.out.println("");
        }else{
             System.out.println("Impressao: ");
             System.out.print("Lista 1: ");
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
            System.out.println("");
            
            System.out.print("Lista 2: ");
             while (aux2 != null) {
                System.out.print(aux2.getInfo() + " ");
                aux2 = aux2.getProx();
            }
            System.out.println("");

        }
    }


    public void removeresc(int esc){
        tipoNo aux = cabeca;
        boolean test = true;
        for(int i=0; i<getTamanho(); i++){
            int num = aux.getInfo();
            if(num == esc && i == 0){
                test = false;
                removeInicio();
                break;
            }else if(num == esc){
                int valor=aux.getInfo();
                tipoNo prex = aux.getProx();
                aux = cabeca;
                for(int cont = 0; cont<i-1; cont++){
                    aux= aux.getProx();
                }
                
                System.out.println("Elemento "+valor+" removido com sucesso! ");
                aux.setProx(prex);
                test = false;
                this.tamanho--;
            }else{
                aux = aux.getProx();
            } 
        }
        if(getTamanho() == 0){
            System.out.println("-------------------------Lista Vazia-------------------------");
        }else if(test){
            System.out.println("NUMERO INVÁLIDO");
        }

    }


    public void removeInicio(){
        if(cabeca!=null){
            int valor=cabeca.getInfo();
            System.out.println("Elemento "+valor+" removido com sucesso! ");
            cabeca=cabeca.getProx();
            this.tamanho--;
	    }
    }

    public void insereInicio(int info){
        tipoNo aux;

        if(cabeca == null){
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
            this.tamanho++;
            System.out.println("\n------------------Elemento "+info+" ADICIONADO------------------");

        }else{
            aux = cabeca;
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(aux);
            this.tamanho++;
            System.out.print("------------------Elemento "+info+" ADICIONADO------------------");

        }
    }

    public void concatenaLista(){
        if(cabeca2==null){
            System.out.println("-------------------LISTA 2 VAZIA-------------------");

        }else{
        
        
        tipoNo aux;
        aux = cabeca;

        while(aux.getProx() != null){
            aux = aux.getProx();
        
        }

        aux.setProx(cabeca2);
        cabeca2 = null;

        System.out.println("-------------------LISTA CONCATENADA-------------------");
    }        

    }

   public void insereAuto(int valor, tipoNo aux2){

        
        tipoNo cabeca3;
        cabeca3= new tipoNo();
        

        
        cabeca3.setInfo(valor);
        cabeca3.setProx(aux2);

        
   }
   
   
   
    public void criarL3(){
      


        
    }


    public void divLista(int pos){
        tipoNo aux;
        aux=cabeca;
        if(getTamanho()==0){
            System.out.println("-------------------LISTA VAZIA-------------------");
        }else if(getTamanho()<2){
            System.out.println("-------------------TAMANHO INSUFICIENTE-------------------");
        }else{
            cabeca2 = new tipoNo();

            for(int i=0; i<pos-1; i++){
                aux = aux.getProx();
            }
            cabeca2 = aux.getProx();
            aux.setProx(null);

        }

    }



    public static void main(String[] args) throws Exception{

        ListaE clas = new ListaE();

        clas.menu();
    }




}
