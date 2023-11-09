public class ArvoreAVL {
    tipoNo no;

    // Função para obter a altura de um nó
    private int alt(tipoNo no) {
        if (no == null)
            return 0;
        return no.alt;
    }

    // Função para obter o fator de equilíbrio de um nó
    private int getEquilibrio(tipoNo no) {
        if (no == null)
            return 0;
        return alt(no.esq) - alt(no.dir);
    }

    // Função para realizar a rotação simples à direita
    private tipoNo dirSimples(tipoNo y) {
        tipoNo
 x = y.esq;
        tipoNo
 T2 = x.dir;

        x.dir = y;
        y.esq = T2;

        y.alt = Math.max(alt(y.esq), alt(y.dir)) + 1;
        x.alt = Math.max(alt(x.esq), alt(x.dir)) + 1;

        return x;
    }

    // Função para realizar a rotação simples à esquerda
    private tipoNo esqSimples(tipoNo x) {
        tipoNo
 y = x.dir;
        tipoNo
 T2 = y.esq;

        y.esq = x;
        x.dir = T2;

        x.alt = Math.max(alt(x.esq), alt(x.dir)) + 1;
        y.alt = Math.max(alt(y.esq), alt(y.dir)) + 1;

        return y;
    }

    // Função para inserir um nó na árvore AVL
    public tipoNo inserir(tipoNo no, int info) {
        if (no == null)
            return new tipoNo
    (info);

        if (info < no.info)
            no.esq = inserir(no.esq, info);
        else if (info > no.info)
            no.dir = inserir(no.dir, info);
        else
            return no;

        no.alt = 1 + Math.max(alt(no.esq), alt(no.dir));

        int balance = getEquilibrio(no);

        if (balance > 1 && info < no.esq.info)
            return dirSimples(no);

        if (balance < -1 && info > no.dir.info)
            return esqSimples(no);

        if (balance > 1 && info > no.esq.info) {
            no.esq = esqSimples(no.esq);
            return dirSimples(no);
        }

        if (balance < -1 && info < no.dir.info) {
            no.dir = dirSimples(no.dir);
            return esqSimples(no);
        }

        return no;
    }

    // Função para remover um nó da árvore AVL
    public tipoNo remover(tipoNo no, int info) {
        // Implemente a lógica de remoção aqui
        return null;
    }

    // Função para buscar um nó na árvore AVL
    public tipoNo buscar(tipoNo no, int info) {
        if (no == null || no.info == info)
            return no;

        if (info < no.info)
            return buscar(no.esq, info);

        return buscar(no.dir, info);
    }

    // Função para imprimir a árvore AVL (em ordem)
    public void imprimir(tipoNo no) {
        if (no != null) {
            imprimir(no.esq);
            System.out.print(no.info + " ");
            imprimir(no.dir);
        }
    }
}
