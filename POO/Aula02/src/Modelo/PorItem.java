package Modelo;

public class PorItem extends EmpregadoM {
    
    private float ValorPProducao, salario;
    private int qdadeProduzida;
    
    public PorItem(int rf, String dataContratação, float valorPProducao, int qdadeProduzida) {
        super(rf, dataContratação);
        ValorPProducao = valorPProducao;
        this.qdadeProduzida = qdadeProduzida;
    }

    public float getValorPProducao() {
        return ValorPProducao;
    }

    public void setValorPProducao(float valorPProducao) {
        ValorPProducao = valorPProducao;
    }

    public int getQdadeProduzida() {
        return qdadeProduzida;
    }

    public void setQdadeProduzida(int qdadeProduzida) {
        this.qdadeProduzida = qdadeProduzida;
    }

    public float salario(){
        return ValorPProducao*qdadeProduzida;
    }


    

}
