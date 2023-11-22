package Modelo;

public class MateriasM {
    private int materiaId;
    private String nomeMateria;

    public MateriasM(int materiaId, String nomeMateria) {
        this.materiaId = materiaId;
        this.nomeMateria = nomeMateria;
    
    }

    public int getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    

}