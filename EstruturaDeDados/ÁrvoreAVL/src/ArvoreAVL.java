public class ArvoreAVL {
    tipoNo raiz;

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
        tipoNo x = y.esq;
        tipoNo T2 = x.dir;

        x.dir = y;
        y.esq = T2;

        y.alt = Math.max(alt(y.esq), alt(y.dir)) + 1;
        x.alt = Math.max(alt(x.esq), alt(x.dir)) + 1;

        return x;
    }

    // Função para realizar a rotação simples à esquerda
    private tipoNo esqSimples(tipoNo x) {
        tipoNo y = x.dir;
        tipoNo T2 = y.esq;

        y.esq = x;
        x.dir = T2;

        x.alt = Math.max(alt(x.esq), alt(x.dir)) + 1;
        y.alt = Math.max(alt(y.esq), alt(y.dir)) + 1;

        return y;
    }

    // Função para inserir um nó na árvore AVL
    public tipoNo inserir(tipoNo no, int info) {
        if (no == null)
            return new tipoNo(info);

        if (info < no.info)
            no.esq = inserir(no.esq, info);
        else if (info > no.info)
            no.dir = inserir(no.dir, info);
        else
            return no;

        no.alt = 1 + Math.max(alt(no.esq), alt(no.dir));

        int equilibrio = getEquilibrio(no);

        if (equilibrio > 1 && info < no.esq.info)
            return dirSimples(no);

        if (equilibrio < -1 && info > no.dir.info)
            return esqSimples(no);

        if (equilibrio > 1 && info > no.esq.info) {
            no.esq = esqSimples(no.esq);
            return dirSimples(no);
        }

        if (equilibrio < -1 && info < no.dir.info) {
            no.dir = dirSimples(no.dir);
            return esqSimples(no);
        }

        return no;
    }

    // Função para remover um nó da árvore AVL
    public tipoNo remover(tipoNo no, int info) {
        if (no == null)
            return no;

        if (info < no.info)
            no.esq = remover(no.esq, info);
        else if (info > no.info)
            no.dir = remover(no.dir, info);
        else {
            // Nó com apenas um filho ou nenhum filho
            if ((no.esq == null) || (no.dir == null)) {
                tipoNo temp = null;
                if (temp == no.esq)
                    temp = no.dir;
                else
                    temp = no.esq;

                // Caso sem filho
                if (temp == null) {
                    temp = no;
                    no = null;
                } else // Caso com um filho
                    no = temp;
            } else {
                // Nó com dois filhos: obter o sucessor in-order (menor valor na subárvore
                // direita)
                tipoNo temp = minNo(no.dir);

                // Copiar o conteúdo do sucessor para este nó
                no.info = temp.info;

                // Remover o sucessor
                no.dir = remover(no.dir, temp.info);
            }
        }
        
        // Se a árvore tinha apenas um nó, então retorna
        if (no == null)
            return no;

        // Atualizar a altura do nó atual
        no.alt = Math.max(alt(no.esq), alt(no.dir)) + 1;

        // Obter o fator de equilíbrio deste nó para verificar se houve desequilíbrio
        int equilibrio = getEquilibrio(no);

        // 4 casos de desequilíbrio

        // Rotação à direita simples
        if (equilibrio > 1 && getEquilibrio(no.esq) >= 0)
            return dirSimples(no);

        // Rotação à esquerda simples
        if (equilibrio < -1 && getEquilibrio(no.dir) <= 0)
            return esqSimples(no);

        // Rotação à esquerda-direita (rotação à esquerda no filho esquerdo e, em
        // seguida, rotação à direita no nó atual)
        if (equilibrio > 1 && getEquilibrio(no.esq) < 0) {
            no.esq = esqSimples(no.esq);
            return dirSimples(no);
        }

        // Rotação à direita-esquerda (rotação à direita no filho direito e, em
        // seguida, rotação à esquerda no nó atual)
        if (equilibrio < -1 && getEquilibrio(no.dir) > 0) {
            no.dir = dirSimples(no.dir);
            return esqSimples(no);
        }

        return no;
    }

    // Função auxiliar para encontrar o nó com o valor mínimo em uma árvore
    private tipoNo minNo(tipoNo no) {
        tipoNo noAtual = no;
        while (noAtual.esq != null)
            noAtual = noAtual.esq;
        return noAtual;
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
