package Modelo;

public class ProcessoPrefeitura{

    private int Registro;
    private boolean Aprovado;
    private String Data;
    private String OBS;
    private boolean Financiamento;
    Alvará Alvara = new Alvará(Registro, Registro, Registro, OBS, Data, Registro, Registro);
    Arquitetonico Arquitetonico = new Arquitetonico(Registro, Registro, Registro, Data, Registro, Registro, Registro);
    
    public ProcessoPrefeitura(int registro, boolean aprovado, String data, String oBS, boolean financiamento,
            Alvará alvara, Modelo.Arquitetonico arquitetonico) {
        Registro = registro;
        Aprovado = aprovado;
        Data = data;
        OBS = oBS;
        Financiamento = financiamento;
        Alvara = alvara;
        Arquitetonico = arquitetonico;
    }

    public int getRegistro() {
        return Registro;
    }

    public void setRegistro(int registro) {
        Registro = registro;
    }

    public boolean isAprovado() {
        return Aprovado;
    }

    public void setAprovado(boolean aprovado) {
        Aprovado = aprovado;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getOBS() {
        return OBS;
    }

    public void setOBS(String oBS) {
        OBS = oBS;
    }

    public boolean isFinanciamento() {
        return Financiamento;
    }

    public void setFinanciamento(boolean financiamento) {
        Financiamento = financiamento;
    }

    public Alvará getAlvara() {
        return Alvara;
    }

    public void setAlvara(Alvará alvara) {
        Alvara = alvara;
    }

    public Arquitetonico getArquitetonico() {
        return Arquitetonico;
    }

    public void setArquitetonico(Arquitetonico arquitetonico) {
        Arquitetonico = arquitetonico;
    }

    public void AberturaProcesso(){
        if(this.isFinanciamento()==false){
            this.setOBS("O mesmo encontra-se em fase de definição.");
           
        }else{
            this.setOBS("Valor do Financiamento deve ser informado em até 30 dias após registro do processo.");
           
        }
    }



     public void ImpressãoProcesso(){
        System.out.println("-------------------Processo-------------------");
        System.out.println("Registro->"+ getRegistro());
        System.out.println("Aprovado->"+ Aprovado);
        System.out.println("Data->"+ getData());
        System.out.println("OBS->"+ getOBS());
        System.out.println("Financiamento->"+ Financiamento);
        Alvara.ImpressãoAlvara();
        Arquitetonico.impressaoArquitetonico();
    }



    


}
