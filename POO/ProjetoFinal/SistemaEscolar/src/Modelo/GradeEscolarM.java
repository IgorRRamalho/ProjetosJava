package Modelo;

public class GradeEscolarM {
    
  private int alunoId;
    private int materiaId;

    public GradeEscolarM(int alunoId, int materiaId) {
        this.alunoId = alunoId;
        this.materiaId = materiaId;
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
    

}