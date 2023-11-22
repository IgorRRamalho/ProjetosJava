package Modelo;

import java.util.Date;

public class ParcelasM {
    private int parcelaId;
    private int docId;
    private int alunoId;
    private Date anomesParc;
    private String semestreParc;

    public ParcelasM(int parcelaId, int docId, int alunoId, Date anomesParc, String semestreParc) {
        this.parcelaId = parcelaId;
        this.docId = docId;
        this.alunoId = alunoId;
        this.anomesParc = anomesParc;
        this.semestreParc = semestreParc;
    }

    public int getParcelaId() {
        return parcelaId;
    }

    public void setParcelaId(int parcelaId) {
        this.parcelaId = parcelaId;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public Date getAnomesParc() {
        return anomesParc;
    }

    public void setAnomesParc(Date anomesParc) {
        this.anomesParc = anomesParc;
    }

    public String getSemestreParc() {
        return semestreParc;
    }

    public void setSemestreParc(String semestreParc) {
        this.semestreParc = semestreParc;
    }
    

}
