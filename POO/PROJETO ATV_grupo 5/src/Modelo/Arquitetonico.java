package Modelo;
public class Arquitetonico {
    private int id;
    private float Area_Terr;
    private float Pavimento_Terreo;
    private float Pavimento_Superior;
    private String Escala;
    private int Resp_Execucao;
    private int Resp_Projeto;



    
    
    public Arquitetonico(int id, float area_Terr, float pavimento_Superior, String escala, int resp_Execucao,
            int resp_Projeto, float pavimento_terreo) {
        this.id = id;
        Area_Terr = area_Terr;
        Pavimento_Superior = pavimento_Superior;
        Escala = escala;
        Resp_Execucao = resp_Execucao;
        Resp_Projeto = resp_Projeto;
        Pavimento_Terreo = pavimento_terreo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getArea_Terr() {
        return Area_Terr;
    }

    public void setArea_Terr(float area_Terr) {
        Area_Terr = area_Terr;
    }

    public float getPavimento_Superior() {
        return Pavimento_Superior;
    }

    public void setPavimento_Superior(float pavimento_Superior) {
        Pavimento_Superior = pavimento_Superior;
    }

    public String getEscala() {
        return Escala;
    }

    public void setEscala(String escala) {
        Escala = escala;
    }

    public int getResp_Execucao() {
        return Resp_Execucao;
    }

    public void setResp_Execucao(int resp_Execucao) {
        Resp_Execucao = resp_Execucao;
    }

    public int getResp_Projeto() {
        return Resp_Projeto;
    }

    public void setResp_Projeto(int resp_Projeto) {
        Resp_Projeto = resp_Projeto;
    }


    public float getPavimento_Terreo() {
        return Pavimento_Terreo;
    }

    public void setPavimento_Terreo(float pavimento_Terreo) {
        Pavimento_Terreo = pavimento_Terreo;
    }

    public void impressaoArquitetonico(){
        System.out.println("-------------------Arquitetonico-------------------");
        System.out.println("Id: "+ getId());
        System.out.println("Área Terreno(m2): "+ getArea_Terr());
        System.out.println("Pavimento Térreo(m2): "+ getPavimento_Terreo());
        System.out.println("Pavimento Surperior: "+ getPavimento_Superior());
        System.out.println("Escala: "+ getEscala());
        System.out.println("Resp. Execução: "+ getResp_Execucao());
        System.out.println("Resp. Projeto: "+ getResp_Projeto());
    }
}
