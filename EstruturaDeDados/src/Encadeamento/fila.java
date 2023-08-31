package Encadeamento;
public class fila{

    public tipoNo cabeca;
    fila(){
        System.out.println("Criando fila...(construtor fila)");
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


    public void removeInicio(){
        if(cabeca!=null){
            int valor=cabeca.getInfo();
            System.out.println("Elemento "+valor+" removido com sucesso! ");
            cabeca=cabeca.getProx();
            this.tamanho--;
	    }
    }

    int tamanho;


	public int getTamanho(){
		return this.tamanho;
	}


  public void insereInicio(int info){
        tipoNo aux,novo;

        if(cabeca == null){
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
            this.tamanho++;

        }else{
            aux = cabeca;
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(aux);
            this.tamanho++;

        }
    }

    public void removeFinal(){
        if(cabeca == null){
            System.out.println("-------------------------Lista Vazia-------------------------");
        }else if(getTamanho()== 1){
            cabeca = null;
            this.tamanho--;
        }else{
            tipoNo aux = cabeca;
            tipoNo ult;
            for(int i =0; i<getTamanho()-2; i++){
                aux = aux.getProx();
            }
            tipoNo p;
            p = aux.getProx();
            System.out.println("Elemento "+ p.getInfo() +" removido com sucesso! ");
            aux.setProx(null);
            
            this.tamanho--;
         
        }
        }





    public void imprime(){
        tipoNo aux = cabeca;
        if(getTamanho() == 0){
            System.out.println("-------------------------Lista Vazia-------------------------");
        }else{
            System.out.println("Impressao: ");
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
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



    public void InserirPos(int esc, int pos){
        if(cabeca == null || getTamanho() == 0){
            System.out.println("\n-------------------------Lista Vazia-------------------------");
        }else if(pos>getTamanho()){
        System.out.println("\n-------------------------Posição Inválida-------------------------");
        }else{
        
        tipoNo aux = cabeca;
        tipoNo aux2 = cabeca;
        tipoNo valor = new tipoNo();
        valor.setInfo(esc);
        for(int i=0; i<pos-2; i++){
            aux = aux.getProx();
        }
        aux2 = aux.getProx();
        aux.setProx(valor);
        aux = aux.getProx();
        aux.setProx(aux2);
        }
    }


    public void menu(){
        int valor,opcao=0;
        System.out.print("\n------------ Menu ------------\n");
        while(opcao!=-1){
            opcao = Input.readInt("\nDigite a opcao: \n(1) Insere Inicio \n(2) Insere Fim \n(3) Remove Inicio \n(4) Remove Fim \n(5) Imprime\n(6) Remover Escolhido\n(7) Inserir Posição\n(-1) Sair \nOpcao: ");
            switch(opcao){
                case 1:
                    valor = Input.readInt("Valor: ");
                    insereInicio(valor);
                    break;

                case 2:
                    valor = Input.readInt("Valor: ");
                    insereFinal(valor);
                    break;

                case 3:
                    removeInicio();
                    break;

                case 4:
                    removeFinal();
                    break;

                case 5:
                    imprime();
                    break;

                case 6:
                    System.out.println("-----------------------------------");
                    imprime();
                    if(getTamanho() == 0){
                        break;
                    }
                    int esc = Input.readInt("Insira o valor a ser removido: ");
                    removeresc(esc);
                    break;

                case 7:
                    esc = Input.readInt("Insira o valor a ser colocado: ");
                    int pos = Input.readInt("Digite a posição desejada ->");
                    InserirPos(esc, pos);
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

    public static void main(String args[]){
        System.out.println("\n************ Lista Encadeada Din�mica ************\n");
        fila F = new fila();
        F.menu();
        System.out.println("\n************ Fim programa ************\n");
    }
}