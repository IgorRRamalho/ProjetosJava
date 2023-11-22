package Modelo;

public class OrigemM {
    private int alunoId;
    private int historicoEm;
    private int reservista;
    private int compResidencia;
    private String colegioAntigo;
    private int eja;
    private int ensinoTecnico;

    public OrigemM(int alunoId, int historicoEm, int reservista, int compResidencia, String colegioAntigo, int eja, int ensinoTecnico) {
        this.alunoId = alunoId;
        this.historicoEm = historicoEm;
        this.reservista = reservista;
        this.compResidencia = compResidencia;
        this.colegioAntigo = colegioAntigo;
        this.eja = eja;
        this.ensinoTecnico = ensinoTecnico;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getHistoricoEm() {
        return historicoEm;
    }

    public void setHistoricoEm(int historicoEm) {
        this.historicoEm = historicoEm;
    }

    public int getReservista() {
        return reservista;
    }

    public void setReservista(int reservista) {
        this.reservista = reservista;
    }

    public int getCompResidencia() {
        return compResidencia;
    }

    public void setCompResidencia(int compResidencia) {
        this.compResidencia = compResidencia;
    }

    public String getColegioAntigo() {
        return colegioAntigo;
    }

    public void setColegioAntigo(String colegioAntigo) {
        this.colegioAntigo = colegioAntigo;
    }

    public int getEja() {
        return eja;
    }

    public void setEja(int eja) {
        this.eja = eja;
    }

    public int getEnsinoTecnico() {
        return ensinoTecnico;
    }

    public void setEnsinoTecnico(int ensinoTecnico) {
        this.ensinoTecnico = ensinoTecnico;
    }
    

}

