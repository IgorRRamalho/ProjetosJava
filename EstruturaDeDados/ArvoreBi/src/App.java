import java.util.ArrayList;
import java.util.Scanner;

public class App {

    Scanner leitor = new Scanner(System.in);
    
    int val, op;
    public Arvore raiz, folha, aux, aux2, raiz2;
    ArrayList<Integer> Nums = new ArrayList<Integer>();
    boolean test = true;

    public void menu() {

        op = 0;

    
        while (op != -1) {
            System.out.println("\n**********************MENU**********************");
            System.out.println("1-Inserir\t2-Buscar\n3-Remover\t-1-Sair\n");
            System.out.print("Opção:");
            op = leitor.nextInt();

            switch (op) {

                case 1:

                    System.out.print("\nDigite o número a ser inserido->");
                    val = leitor.nextInt();
                    LimpTela();
                    Inserir(val);
                    break;

                case 2:
                    System.out.println("Digite o número a ser buscado->");
                    val = leitor.nextInt();
                    break;

                case 3:
                    System.out.println("Digite o número a ser removido->");
                    val = leitor.nextInt();

                case -1:
                    System.out.println("SAINDO ");
                    break;

                case 4:
                    Imprimir();
                    break;

                default:
                    LimpTela();
                    System.out.println("OPCÃO ERRADA");
                    break;
            }
        }
    }

    public Arvore Inserir(Arvore No,int valor) {

        if (Veri(valor)) {
            test = true;
            Arvore aux;

            if (raiz == null) {
                raiz = new Arvore(valor);  
                return raiz;  
            } else {
                aux = raiz;
                folha = new Arvore(valor);
                
                while (test) {
                    

                    if (valor > aux.getInfo()) {
                        if (aux.getDir() == null) {
                            raiz.setDir(folha);
                            
                        } else {
                            aux = aux.getDir();
                        }

                    } else if (valor < aux.getInfo()) {
                        if (aux.getEsq() == null) {
                            raiz.setEsq(folha);
                            
                        } else {
                            aux = aux.getEsq();
                        }
                    }
                }
            }

            System.out.println("-------------INSERIDO COM SUCESSO-----------------");
        }

    }

    public void Buscar(int valor) {

    }

    public boolean Veri(int valor) {
        boolean bole;

        if (Nums.contains(valor)) {
            System.out.println("********** NÚMERO JÁ INSERIDO NA ÁRVORE **********");
            bole = false;
        } else {
            Nums.add(valor);
            bole = true;
        }

        return bole;
    }

    public void ImprimirConjunto(Arvore folha){
        if(folha != null){
             System.out.println("NÓ->" + raiz.getInfo());  
            if (raiz.getDir() != null) {
                System.out.println("DIREITA->" + aux.getInfo());
            }
            if (raiz.getEsq() != null) {
                System.out.println("ESQUERDA->" + aux2.getInfo());
            }

        }
    }

    public void Imprimir() {
        
        raiz2 = raiz;
        aux = raiz.getDir();
        aux2 = raiz.getEsq();
        System.out.println("RAIZ->" + raiz.getInfo());  
            if (raiz.getDir() != null) {
                System.out.println("DIREITA->" + aux.getInfo());
            }
            if (raiz.getEsq() != null) {
                System.out.println("ESQUERDA->" + aux2.getInfo());
            }

        test = true;

        while (test) {

            System.out.println("CENTRAL ->" + aux.getInfo());
            if (aux.getDir() != null) {
                System.out.println("DIREITA->" + aux.getDir().getInfo());
                
            }
            if (aux.getEsq() != null) {
                System.out.println("ESQUERDA->" + aux.getEsq().getInfo());
            }

            System.out.println("CENTRAL ->" + aux2.getInfo());
            if (aux2.getDir() != null) {
                System.out.println("DIREITA->" + aux2.getDir().getInfo());
            }
            if (aux2.getEsq() != null) {
                System.out.println("ESQUERDA->" + aux2.getEsq().getInfo());
            }

        }

    }




    public void LimpTela(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void main(String[] args) throws Exception {
        App c = new App();

        c.menu();

    }

}
