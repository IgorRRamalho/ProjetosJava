public class pilha {

    pilha CidadesVi, proxCiVi, proxCi;
    int Cidade;


    public pilha(){}


    public pilha getCidadesVi() {
        return CidadesVi;
    }


    public void setCidadesVi(pilha cidadesVi) {
        CidadesVi = cidadesVi;
    }


    public pilha getProxCiVi() {
        return proxCiVi;
    }


    public void setProxCiVi(pilha proxCiVi) {
        this.proxCiVi = proxCiVi;
    }


    public pilha getProxCi() {
        return proxCi;
    }


    public void setProxCi(pilha proxCi) {
        this.proxCi = proxCi;
    }


    public int getCidade() {
        return Cidade;
    }


    public void setCidade(int cidade) {
        Cidade = cidade;
    }
    
}
