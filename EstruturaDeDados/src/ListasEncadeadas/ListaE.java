package ListasEncadeadas;

import java.util.Scanner;


public class ListaE {

    Scanner leitor = new Scanner(System.in);
    int tamanho;
    int teste=0;
    public tipoNo cabeca, cabeca2, cabeca3;
    



    
    
    public int getTamanho() {
        return tamanho;
    }


    public void menu(){
        int valor,opcao=0;
        System.out.print("\n------------ Menu ------------");
        while(opcao!=-1){
           
          
            if(cabeca ==null || tamanho<2){
                 System.out.print("\n(5) Inserir Elemento \t(6)Inserir Inicio\t(7) Imprimir\n(-1) Sair \nOpção: ");
            }else if(tamanho > 1 && cabeca2==null){
                 System.out.print("\n(1)Remover Escolhido\t(2) Dividir Lista\n(5) Inserir Elemento \t(6)Inserir Inicio \n(7) Imprimir\n(-1) Sair \nOpção: ");
            }else if(cabeca2 != null){
                 System.out.print("\n(1)Remover Escolhido\t(3)Concatenar Lista \n(4)Criar Lista 3\t(7) Imprimir\n(-1) Sair \nOpção: ");
            }else{
                System.out.println("MENU");
            }
            
            opcao = leitor.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("\nDigite a posição->");
                    valor = leitor.nextInt();    
                    removeresc(valor);
                    break;


                case 2:
                    System.out.print("\nDigite a posição->");
                    valor = leitor.nextInt();    
                    divLista(valor);
                    break;
                 
                case 3:
                    concatenaLista();
                    break;
                   

                case 4:
                    criarL3();
                    break;
                                       

                case 5:
                    System.out.print("\nDigite o valor->");
                    valor = leitor.nextInt();
                    insereFinal(valor);

                    break;

                case 6:
                    System.out.print("\nDigite o valor->");
                    valor = leitor.nextInt();
                    insereInicio(valor);
                    break;

                case 7:
                    imprime();
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
        tipoNo aux3 = cabeca3;
        if(cabeca == null && cabeca2 == null && cabeca3 == null){
            System.out.println("-------------------------Lista Vazia-------------------------");
        }
            
        
        if(cabeca != null){
            System.out.print("Lista 1: ");
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
            System.out.println("");
        }
        if(cabeca2 != null){
              System.out.print("Lista 2: ");
             while (aux2 != null) {
                System.out.print(aux2.getInfo() + " ");
                aux2 = aux2.getProx();
            }
            System.out.println("");
        }
        if(cabeca3 != null){
            System.out.print("Lista 3: ");
             while (aux3 != null) {
                System.out.print(aux3.getInfo() + " ");
                aux3 = aux3.getProx();
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

   public void insereAuto(int info, tipoNo cabeca3){
   
            tipoNo aux,novo;

            novo = new tipoNo();
            novo.setInfo(info);
            novo.setProx(null);

            aux = cabeca3;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(novo);
        
   }
   
   
    public void criarL3(){
        tipoNo aux, aux2;
        aux = cabeca;
       
        aux2 = cabeca2;
        cabeca3 = new tipoNo();
        cabeca3.setInfo(aux.getInfo());
        aux = aux.getProx();
        
        

        if(cabeca == null || cabeca2 == null){
            if(cabeca == null && cabeca2 ==null){
                System.out.println("-------------LISTAS VAZIAS-------------");
            }else if(cabeca == null){
                System.out.println("-------------LISTA 1 VAZIA-------------");
            }else{
                System.out.println("-------------LISTA 2 VAZIA-------------");
            }   
        }

        teste=1;
        

        while(aux != null){
            insereAuto(aux.getInfo(), cabeca3);
            aux = aux.getProx();  
        }

         while(aux2 != null){
            insereAuto(aux2.getInfo(), cabeca3);
            aux2 = aux2.getProx();
        }

        System.out.println("--------------LISTA 3 CRIADA--------------");

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
            aux.setProx(null);
            System.out.println("-------------------LISTA DIVIDIDA-------------------");

        }
        

    }

    public void insereFinal(int info){
        if(cabeca == null){
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);   
            this.tamanho++;
        }else{
            tipoNo aux,novo;

            novo = new tipoNo();
            novo.setInfo(info);
            novo.setProx(null);

            aux = cabeca;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(novo);
            this.tamanho++;
	}

		System.out.println("Elemento "+info+" inserido com sucesso! ");
    }







    public static void main(String[] args) throws Exception{

        ListaE clas = new ListaE();

        clas.menu();
    }
}


