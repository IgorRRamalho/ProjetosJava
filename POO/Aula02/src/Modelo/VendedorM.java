package Modelo;

public class VendedorM extends ColaboradorM{
    
    private float comissao, salVendedor;
    private int qdadeVendas;
    
    public VendedorM(int id, String nome, String CPF, float salario, float comissao, float salVendedor,
            int qdadeVendas) {
        super(id, nome, CPF, salario);
        this.comissao = comissao;
        this.salVendedor = salVendedor;
        this.qdadeVendas = qdadeVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getSalVendedor() {
        return salVendedor;
    }

    public void setSalVendedor(float salVendedor) {
        this.salVendedor = salVendedor;
    }

    public int getQdadeVendas() {
        return qdadeVendas;
    }

    public void setQdadeVendas(int qdadeVendas) {
        this.qdadeVendas = qdadeVendas;
    }

    /**
     * @return
     */
    public float salario(){
        return this.salVendedor=1320+this.comissao;
    }

    

    
    
    
   
    
    
    
    
    
    
    
}

