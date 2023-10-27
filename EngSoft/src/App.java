import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    int op;
    Scanner leitor = new Scanner(System.in);
    util util = new util();

    public void menu() {

        while (op != -1) {

            System.out.print("\n**********************MENU**********************");
            System.out.println("\n(1)COMPRAR PRODUTO\t(2)DAR BAIXA NO ESTOQUE\n(-1)SAIR");
            System.out.print("\nOPÇÃO->");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    ComprarProd();
                    break;

                case 2:
                    baixaEstoque();
                    break;
            }
        }
    }

    public void ComprarProd() {
        boolean teste = false;
        int Quant = 0, CodProd = 0;
        leitor.nextLine();
        do {
            System.out.print("\n Informe o código do produto e a quantidade separados por vírgula ->");
            String input = leitor.nextLine();

            String[] info = input.split(",");

            if (info.length == 2) {
                CodProd = Integer.parseInt(info[0]);
                Quant = Integer.parseInt(info[1]);
            }

            teste = false;
            System.out.println("qut ->" + Quant);
            if (CodProd < 0 || CodProd > 5) {
                util.LimpTela();
                System.out.println("\nCÓDIGO INVÁLIDO");
                teste = true;
            }

        } while (teste);
        util.LimpTela();
        System.out.println("Código do produto: " + CodProd);
        System.out.println("Quantidade: " + Quant);

        atualizarEstoque(CodProd, Quant);
        util.LimpTela();
        System.out.println("PRODUTO COMPRADO");
    }

    public static void atualizarEstoque(int codigoProduto, int quantidadeVendida) {
        String arquivoCSV = "produtos.csv";
        String linha;
        StringBuilder novoConteúdo = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            br.readLine();
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                int codigo = Integer.parseInt(partes[0].trim()); 
                int quantidadeEstoque = Integer.parseInt(partes[2].trim()); 

                if (codigo == codigoProduto) {
                    quantidadeEstoque -= quantidadeVendida;
                    if (quantidadeEstoque < 0) {
                        quantidadeEstoque = 0; 
                    }

                    partes[2] = Integer.toString(quantidadeEstoque);
                }

                novoConteúdo.append(String.join(";", partes)).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        try (FileWriter fw = new FileWriter(arquivoCSV)) {
            fw.write("id;nome;quantidade_estoque\n");
            fw.write(novoConteúdo.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void baixaEstoque() {

        boolean teste = false;
        int CodProd = 0;
        String input;
        leitor.nextLine();
        do {
            System.out.print("\n Informe os códigos dos produtos separados por vírgula ->");
            input = leitor.nextLine();

            teste = false;
            if (CodProd < 0 || CodProd > 5) {
                util.LimpTela();
                System.out.println("\nCÓDIGO INVÁLIDO");
                teste = true;
            }

        } while (teste);
        util.LimpTela();
        System.out.println("Códigos do produtos: " + input);

        String arquivoCSV = "produtos.csv";
        String codigosProdutos = input;

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivoCSV));
            StringBuilder arquivoAtualizado = new StringBuilder();
            String linha;

            String[] codigosParaAtualizar = codigosProdutos.split(",");
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 3) {
                    String codigo = partes[0];
                    String nome = partes[1];
                    String quantidadeEstoque = partes[2];

                    if (containsCode(codigo, codigosParaAtualizar)) {
                        int estoqueAtual = Integer.parseInt(quantidadeEstoque);
                        if (estoqueAtual > 0) {
                            int novoEstoque = estoqueAtual - 1;
                            arquivoAtualizado.append(codigo).append(";").append(nome).append(";").append(novoEstoque)
                                    .append("\n");
                        } else {
                            System.out.println("Produto fora de estoque: " + codigo);
                            arquivoAtualizado.append(linha).append("\n");
                        }
                    } else {
                        arquivoAtualizado.append(linha).append("\n");
                    }
                } else {
                    arquivoAtualizado.append(linha).append("\n");
                }
            }

            leitor.close();

            FileWriter escritor = new FileWriter(arquivoCSV);
            escritor.write(arquivoAtualizado.toString());
            escritor.close();

            System.out.println("Estoque atualizado!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     public static boolean containsCode(String code, String[] codes) {
        for (String c : codes) {
            if (c.equals(code)) {
                return true;
            }
        }
        return false;
    }
   

    public static void main(String[] args) throws Exception {

        App controle = new App();

        controle.menu();
    }
}
