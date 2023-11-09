import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------MENU-------------------------");
            System.out.println("(1)Inserir um nó\t(2)Remover um nó\n(3)Buscar um nó\t(4)Imprimir a árvore (em ordem)\n(5)Sair");
            
            System.out.print("\nOPÇÃO->");

            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int info = scanner.nextInt();
                    arvore.no = arvore.inserir(arvore.no, info);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser removido: ");
                    int dataToDelete = scanner.nextInt();
                    arvore.no = arvore.remover(arvore.no, dataToDelete);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser buscado: ");
                    int dataToSearch = scanner.nextInt();
                    tipoNo foundNode = arvore.buscar(arvore.no, dataToSearch);
                    if (foundNode != null)
                        System.out.println("tipoNo encontrado: " + foundNode.data);
                    else
                        System.out.println("tipoNo não encontrado.");
                    break;
                case 4:
                    System.out.print("Árvore AVL (em ordem): ");
                    arvore.imprimir(arvore.no);
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
