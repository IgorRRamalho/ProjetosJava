package Modelo;

import java.math.BigDecimal;
import java.util.Date;

public class DocPagamentoM {
    private int docId;
    private int sitDoc;
    private BigDecimal valor;
    private Date emissao;
    private Date vencimento;

    public DocPagamentoM(int docId, int sitDoc, BigDecimal valor, Date emissao, Date vencimento) {
        this.docId = docId;
        this.sitDoc = sitDoc;
        this.valor = valor;
        this.emissao = emissao;
        this.vencimento = vencimento;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public int getSitDoc() {
        return sitDoc;
    }

    public void setSitDoc(int sitDoc) {
        this.sitDoc = sitDoc;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getEmissao() {
        return emissao;
    }

    public void setEmissao(Date emissao) {
        this.emissao = emissao;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }
    

}

