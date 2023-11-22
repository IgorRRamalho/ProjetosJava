package Modelo;

public class MateriasCursoM {
    private int cursoId;
    private int materiaId;

    public MateriasCursoM(int cursoId, int materiaId) {
        this.cursoId = cursoId;
        this.materiaId = materiaId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }
    

}

