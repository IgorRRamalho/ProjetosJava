package P1.src;

import java.util.Scanner;

public class ex3 {

    int op;
    Scanner leitor = new Scanner(System.in);
    Lista No = new Lista();
    public Lista cabecaRo, cabecaCi, cabecaRodCid;
    
    
    public void menu() {
        while (op != -1){
            System.out.print("\n**********************MENU**********************");
            System.out.println("\n(1)INSERIR RODOVIA\t(2)INSERIR CIDADE \n(3)RETORNA RODOVIAS EM CIDADES\t(4)VERIFICAR CRUZAMENTOS\n(-1)SAIR");
            System.out.print("\nOPÇÃO->");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nINSIRA A RODOVIA-> ");
                    String rod = leitor.next();
                    No.LimpTela();
                    criaRodovia(rod);
                    
                    break;

                case 2:
                    No.LimpTela();
                    System.out.println("--------------------INSERIR CIDADES EM RODOVIAS--------------------");
                    

                    System.out.print("\nDigite a Rodovia ->");
                    String rodo = leitor.next();
                    leitor.nextLine();
                    System.out.print("\nDigite a Cidade ->");
                    String Cida = leitor.nextLine();
                    
                    insereCidade(rodo, Cida);
                    break;

                case 3:
                    leitor.nextLine();
                    System.out.print("\nINSIRA A CIDADE-> ");
                    String cida = leitor.nextLine();
                    rodoviasCidade(cida);
                    break;

                case 4:
                    System.out.print("\nDigite a Rodovia 1 ->");
                    String rodo1 = leitor.next();
                    leitor.nextLine();
                    System.out.print("\nDigite a Rodovia 2 ->");
                    String rodo2 = leitor.nextLine();

                    boolean ver = Cruzamento(rodo1, rodo2);

                    if(ver){
                        System.out.println("----------AS RODOVIAS SE CRUZAM----------");
                    }else{
                        System.out.println("----------AS RODOVIAS NÃO SE CRUZAM----------");
                    }
                    break;
                
                case -1:
                    System.out.println("SAINDO ");
                    break;

                default:
                    No.LimpTela();
                    System.out.println("OPCÃO ERRADA");
                    break;
            }
        }
    }

    
    public void insereCidade(String nomeRodovia, String nomeCidade){
        boolean teste = true;
        
        Lista aux = cabecaRo, auxCi;
        String rodovia = aux.getRodovia();
        
        while(!aux.getRodovia().equalsIgnoreCase(nomeRodovia)){
            aux = aux.getProx();
            rodovia = aux.getRodovia();
        }
        

            if(aux.getCidades() == null){
                Lista cabecaCi = new Lista();
                cabecaCi.setCidade(nomeCidade);
                cabecaCi.setAnt(null);
                cabecaCi.setProx(null);
                aux.setCidades(cabecaCi);

            }else{
                auxCi = aux.getCidades();

                while(auxCi.getProx() != null){
                    auxCi = auxCi.getProx();
                }
                Lista novaCi = new Lista();
                novaCi.setCidade(nomeCidade);
                novaCi.setProx(null);
                novaCi.setAnt(auxCi);
                auxCi.setProx(novaCi);
                }
       

    }


    public void rodoviasCidade(String nomeCidade){
        Lista auxRo, auxCi;
        cabecaRodCid = null;
        auxRo = cabecaRo;

        int quantRo, quantCi;
        quantRo = getTamanhoNo(cabecaRo);
        
        for(int i=0; i<quantRo; i++){
            
            quantCi = getTamanhoNo(auxRo.getCidades());
            auxCi = auxRo.getCidades();
            if(getTamanhoNo(auxRo.getCidades()) == 0){
                auxRo = auxRo.getProx();

            }else{
                for(int cont=0; cont<quantCi; cont++){
                    
                    if(auxCi.getCidade().equalsIgnoreCase(nomeCidade)){

                        
                        if(cabecaRodCid == null){
                            cabecaRodCid = new Lista();
                        
                            cabecaRodCid.setRodovia(auxRo.getRodovia());
                            cabecaRodCid.setProx(null);

                            auxCi = auxCi.getProx();
                        }else{

                            Lista novaCid = new Lista(), aux3;
    
                            novaCid.setRodovia(auxRo.getRodovia());
                            novaCid.setProx(null);
                            aux3 = cabecaRodCid;

                            while(aux3.getProx() != null){

                                aux3 = aux3.getProx();
                            }
                            aux3.setProx(novaCid);
                            auxCi = auxCi.getProx();
                        }
                    }else{

                        auxCi = auxCi.getProx();
                    }
    
                }
                auxRo = auxRo.getProx();
            }
            

        }

        imprimeRod();
    }

    public void imprimeRod() {
        Lista aux = cabecaRodCid;
        int i;

    
        if (cabecaRodCid == null) {
            System.out.println("-------------------------SEM RODOVIAS NESSE CIDADE-------------------------");
        }else{
            if(cabecaRodCid != null){
                System.out.print("RODOVIAS: ");
                for(i =0; i<getTamanhoNo(cabecaRodCid); i++){
                    System.out.print(aux.getRodovia() + " ");
                    aux = aux.getProx();
                }
                System.out.println("");
            }
        }
    }

        
    private int getTamanhoNo(Lista cabeca){
        if(cabeca != null){
            Lista aux;
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

      

    public void criaRodovia(String rodovia){
        if(cabecaRo == null) {
            cabecaRo = new Lista();
            cabecaRo.setRodovia(rodovia);
            cabecaRo.setProx(null);
            cabecaRo.setCidades(null);
            cabecaRo.setAnt(null);
            
            
        }else{
            Lista aux, novoRo, novoCi;
            aux = cabecaRo;

            novoRo = new Lista();
            novoRo.setRodovia(rodovia);
            novoRo.setCidades(null);
           

            while(aux.getProx() != null){
                aux = aux.getProx();
            }

            aux.setProx(novoRo);
            novoRo.setProx(null);
            
        }
        System.out.println("Rodovia " + rodovia + " inserida com sucesso! ");

    }


public boolean Cruzamento(String nomeRodovia1, String nomeRodovia2){
    
    Lista aux = cabecaRo, aux2=cabecaRo;
    boolean teste = false;
    
    
    while(!aux.getRodovia().equalsIgnoreCase(nomeRodovia1)){
        aux = aux.getProx();
    }

    
    while(!aux2.getRodovia().equalsIgnoreCase(nomeRodovia2)){
        aux2 = aux2.getProx();
    }

    Lista auxCi1 = aux.getCidades(), auxCi2;
    int tama1 = getTamanhoNo(auxCi1);
    for(int i =0; i<tama1; i++){
        auxCi2 = aux2.getCidades();
        int tama2 = getTamanhoNo(auxCi2);
         for(int cont = 0; cont<tama2; cont++){
            if(auxCi1.getCidade().equalsIgnoreCase(auxCi2.getCidade())){
                teste = true;
            }
            auxCi2 = auxCi2.getProx();
        }
        auxCi1 = auxCi1.getProx();
    }

    return teste;

}


public static void main(String[] args) throws Exception {

    ex3 clas = new ex3();

    clas.menu();
}
    
}
