import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();
        Scanner scanner = new Scanner(System.in);
        int valor;

        while (true) {
            System.out.println("-------------------------MENU-------------------------\n");
            System.out.println("(1)Inserir um nó\t(2)Remover um nó\n(3)Buscar um nó\t\t(4)Imprimir a árvore (em ordem)\n(5)Sair");
            
            System.out.print("\nOPÇÃO->");

            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int info = scanner.nextInt();
                    arvore.raiz = arvore.inserir(arvore.raiz, info);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser removido: ");
                    valor = scanner.nextInt();
                    arvore.raiz = arvore.remover(arvore.raiz, valor);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser buscado: ");
                    valor = scanner.nextInt();
                    tipoNo noEncontrado = arvore.buscar(arvore.raiz, valor);
                    if (noEncontrado != null)
                        System.out.println("tipoNo encontrado: " + noEncontrado.info);
                    else
                        System.out.println("tipoNo não encontrado.");
                    break;
                case 4:
                    System.out.print("Árvore AVL (em ordem): ");
                    arvore.imprimir(arvore.raiz);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
