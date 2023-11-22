package Modelo;
public class Alvará {
    
    
    private int Processo, Número, CREA, NúmeroPavimento;
    private String Tipo, RespTecnico;
    private float Área;

    
    
    public Alvará(int processo, int número, int cREA, String tipo, String respTecnico, float área, int númeroPavimento) {
        this.Processo = processo;
        this.Número = número;
        this.CREA = cREA;
        this.Tipo = tipo;
        this.RespTecnico = respTecnico;
        this.Área = área;
        this.NúmeroPavimento = númeroPavimento;
    }

    

    public int getProcesso() {
        return Processo;
    }


    public void setProcesso(int processo) {
        Processo = processo;
    }




    public int getNúmero() {
        return Número;
    }



    public void setNúmero(int número) {
        Número = número;
    }


    public int getCREA() {
        return CREA;
    }


    public void setCREA(int cREA) {
        CREA = cREA;
    }


    public String getTipo(){
        return Tipo;
    }


    public void setTipo(String tipo) {
        Tipo = tipo;
    }


    public String getRespTecnico() {
        return RespTecnico;
    }



    public void setRespTecnico(String respTecnico) {
        RespTecnico = respTecnico;
    }


    public float getÁrea() {
        return Área;
    }


    public void setÁrea(float área) {
        Área = área;
    }

    public int getNúmeroPavimento() {
        return NúmeroPavimento;
    }

    public void setNúmeroPavimento(int númeroPavimento) {
        NúmeroPavimento = númeroPavimento;
    }

    public void ImpressãoAlvara(){
        System.out.println("-------------------ALVARÁ-------------------");
        System.out.println("Processo->"+ getProcesso());
        System.out.println("Tipo->"+ getTipo());
        System.out.println("Número->"+ getNúmero());
        System.out.println("Número Pavimento->"+ getNúmeroPavimento());
        System.out.println("Área->"+ getÁrea());
        System.out.println("Resp Técnico->"+ getRespTecnico());
        System.out.println("CREA/CAU->"+ getCREA());
    }



    public void ValidaArea(){
        if(this.getÁrea()<=0){
            if(this.getTipo() == "Terrea"){
                System.out.println("Terrea: tamanho minimo de 40m2.");
                this.setÁrea(40);
            }if(this.getTipo()=="Sobrado"){
                System.out.println("Sobrado: tamanho minimo de 120m2.");
                this.setÁrea(120);
            }else if(this.getTipo()=="Predio"){
                System.out.println("Predio: tamanho minimo de 400m2.");
                this.setÁrea(400);
            }
        }
    }



}
