package Modelo;

import java.util.Date;

public class CursoM {
    private int cursoId;
    private String nomeCurso;
    private String turno;
    private Date dataCriacao;
    private int notaMec;
    private int quantSemestres;
    private int minEducacaoId;
    private Date anoAltGrade;
    private int tcc;
    private int creditos;
    private int horasComplementares;
    private int semestres;

    public CursoM(int cursoId, String nomeCurso, String turno, Date dataCriacao, int notaMec, int quantSemestres, int minEducacaoId,
                 Date anoAltGrade, int tcc, int creditos, int horasComplementares, int semestres) {
        this.cursoId = cursoId;
        this.nomeCurso = nomeCurso;
        this.turno = turno;
        this.dataCriacao = dataCriacao;
        this.notaMec = notaMec;
        this.quantSemestres = quantSemestres;
        this.minEducacaoId = minEducacaoId;
        this.anoAltGrade = anoAltGrade;
        this.tcc = tcc;
        this.creditos = creditos;
        this.horasComplementares = horasComplementares;
        this.semestres = semestres;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getNotaMec() {
        return notaMec;
    }

    public void setNotaMec(int notaMec) {
        this.notaMec = notaMec;
    }

    public int getQuantSemestres() {
        return quantSemestres;
    }

    public void setQuantSemestres(int quantSemestres) {
        this.quantSemestres = quantSemestres;
    }

    public int getMinEducacaoId() {
        return minEducacaoId;
    }

    public void setMinEducacaoId(int minEducacaoId) {
        this.minEducacaoId = minEducacaoId;
    }

    public Date getAnoAltGrade() {
        return anoAltGrade;
    }

    public void setAnoAltGrade(Date anoAltGrade) {
        this.anoAltGrade = anoAltGrade;
    }

    public int getTcc() {
        return tcc;
    }

    public void setTcc(int tcc) {
        this.tcc = tcc;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHorasComplementares() {
        return horasComplementares;
    }

    public void setHorasComplementares(int horasComplementares) {
        this.horasComplementares = horasComplementares;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }
    


    
}

