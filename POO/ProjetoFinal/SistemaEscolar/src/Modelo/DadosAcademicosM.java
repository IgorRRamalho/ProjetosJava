package Modelo;

public class DadosAcademicosM {
    private int alunoId;
    private int cursoId;

    public DadosAcademicosM(int alunoId, int cursoId) {
        this.alunoId = alunoId;
        this.cursoId = cursoId;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }
    

    
}

