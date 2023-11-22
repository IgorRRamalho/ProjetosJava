package Modelo;

public class HistoricoM {
    private int alunoId;
    private int materiaId;
    private float prova1;
    private float prova2;
    private int faltas;

    public HistoricoM(int alunoId, int materiaId, float prova1, float prova2, int faltas) {
        this.alunoId = alunoId;
        this.materiaId = materiaId;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.faltas = faltas;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }



    
}
