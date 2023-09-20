package Modelo;

public class PorComissao extends EmpregadoM{

    
    private int vendas;
    private float ValorFixo, comissao, salario;
    
    public PorComissao(int rf, String dataContratação, int vendas, float valorFixo, float comissao) {
        super(rf, dataContratação);
        this.vendas = vendas;
        ValorFixo = valorFixo;
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public float getValorFixo() {
        return ValorFixo;
    }

    public void setValorFixo(float valorFixo) {
        ValorFixo = valorFixo;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float salario(){
        return(ValorFixo+comissao)*vendas;
    }



    
    
}
