import java.util.ArrayList;
import java.util.Scanner;

public class App {

    Scanner leitor = new Scanner(System.in);

    public int val, op;
    public Arvore raiz, folha, aux, aux2, raiz2;
    ArrayList<Integer> Nums = new ArrayList<Integer>();
    boolean test = true, a = true;

    public void menu() {

        op = 0;

        while (op != -1) {
            System.out.println("\n**********************MENU**********************");
            System.out.println("1-Inserir\t2-Buscar\n3-Remover\t4-Imprimir\n-1-Sair\n");
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
                    Buscar();
                    if (a) {
                        System.out.println("--------VALOR NÃO ENCONTRADO--------");
                    }
                    break;

                case 3:
                    System.out.println("Digite o número a ser removido->");
                    val = leitor.nextInt();
                    Remover();
                    break;

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

    public void Inserir(int valor) {

        if (Veri(valor)) {
            test = true;
            Arvore aux;
            if (raiz == null) {
                raiz = new Arvore(valor);
                Nums.add(valor);

            } else {

                aux = raiz;
                folha = new Arvore(valor);

                while (test) {

                    if (valor > aux.getInfo()) {
                        if (aux.getDir() == null) {
                            aux.setDir(folha);
                            test = false;
                            Nums.add(valor);

                        } else {
                            aux = aux.getDir();
                        }

                    } else if (valor < aux.getInfo()) {

                        if (aux.getEsq() == null) {

                            aux.setEsq(folha);
                            Nums.add(valor);
                            test = false;

                        } else {
                            aux = aux.getEsq();
                        }
                    }
                }
            }

            System.out.println("-------------INSERIDO COM SUCESSO-----------------");
        }

    }

    public void AndarArvore(Arvore folha) {

        if (folha != null) {
            if (folha.getInfo() == val) {

                System.out.println("VALOR ENCOTRADO ->" + folha.getInfo());
                a = false;
                if (folha.getDir() != null) {
                    System.out.println("VALOR DA DIRETA DO VALOR BUSCADO->" + folha.getDir().getInfo());
                } else {
                    System.out.println("- NÃO TEM VALOR A DIRETA -");
                }
                if (folha.getEsq() != null) {
                    System.out.println("VALOR DA ESQUERDA DO VALOR BUSCADO->" + folha.getEsq().getInfo());
                } else {
                    System.out.println("- NÃO TEM VALOR A ESQUERDA -");
                }
            }
            AndarArvore(folha.getDir());
            AndarArvore(folha.getEsq());
        }
    }

    public void Buscar() {
        System.out.print("Digite o número a ser buscado->");
        val = leitor.nextInt();
        AndarArvore(raiz);
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

    public void andarRemover(Arvore folha) {

        if (folha != null) {
            if (folha.getInfo() > val) {

                andarRemover(folha.getEsq());

            } else if (folha.getInfo() < val) {

                andarRemover(folha.getDir());
            } else if (folha.getInfo() == val) {
                if (folha.getDir() != null) {
                    aux = folha.getDir();
                }
                if (folha.getEsq() != null) {
                    aux2 = folha.getEsq();

                }

            }

        }
    }

    public void andarUmAntes(Arvore folha) {
        if (folha != null) {
            if (folha.getDir().getInfo() == val) {
                if (aux != null) {

                    folha.setDir(aux);
                }
                if (aux2 != null) {

                    aux.getEsq().setEsq(aux2);
                }

            } else if (folha.getEsq().getInfo() == val) {

                if (aux != null) {
                    folha.setEsq(aux);
                }
                if (aux2 != null) {
                    aux.getEsq().setEsq(aux2);
                }

            } else {

                if(val == raiz.getInfo()){
                    System.out.println("===== A RAIZ NÃO PODE SER REMOVIDA=======");
                }else if(Nums.contains(val)){
                    andarUmAntes(folha.getDir());
                    andarUmAntes(folha.getEsq());
                    Nums.remove(val);

                }else{
                    System.out.println("------VALOR INVÁLIDO---------");
                }
            
                

            }

        }

    }

    public void Remover() {
        andarRemover(raiz);
        andarUmAntes(raiz);

    }

    public void ImprimirConjunto(Arvore folha) {

        if (folha != null) {

            ImprimirConjunto(folha.getDir());
            ImprimirConjunto(folha.getEsq());

            System.out.println("FOLHA->" + folha.getInfo());

        }
    }

    public void Imprimir() {
        System.out.println("RAIZ ->" + raiz.getInfo());
        ImprimirConjunto(raiz);

    }

    public void LimpTela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void main(String[] args) throws Exception {
        App c = new App();

        c.menu();

    }

}
