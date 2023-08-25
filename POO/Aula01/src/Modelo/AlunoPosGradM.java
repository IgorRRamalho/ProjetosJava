package Modelo;

public class AlunoPosGradM extends AlunoM{

   private String orientador;
   private char BolsaGoverno;
   private int AnoEntrado;
   private int prazo;
   private char tipo;

   public AlunoPosGradM(int ra, String cpf, String nome, int idade, char sexo, int codCurso, CursoM curso,
        String orientador, char bolsaGoverno, int anoEntrado, int prazo, char tipo) {
    super(ra, cpf, nome, idade, sexo, codCurso, curso);
    this.orientador = orientador;
    this.BolsaGoverno = bolsaGoverno;
    this.AnoEntrado = anoEntrado;
    this.prazo = prazo;
    this.tipo = tipo;
}

public String getOrientador() {
    return orientador;
}

public void setOrientador(String orientador) {
    this.orientador = orientador;
}

public char getBolsaGoverno() {
    return BolsaGoverno;
}

public void setBolsaGoverno(char bolsaGoverno) {
    BolsaGoverno = bolsaGoverno;
}

public int getAnoEntrado() {
    return AnoEntrado;
}

public void setAnoEntrado(int anoEntrado) {
    AnoEntrado = anoEntrado;
}

public int getPrazo() {
    return prazo;
}

public void setPrazo(int prazo) {
    this.prazo = prazo;
}

public char getTipo() {
    return tipo;
}

public void setTipo(char tipo) {
    this.tipo = tipo;
}

    public void imprimeAlunoPos(){
        System.out.println("--------------------ALUNO POS GRAD. INFORMAÇÕES--------------------");
        System.out.println("ORIENTADOR: "+ getOrientador());
        System.out.println("BOLSA GOVERNO: "+ getBolsaGoverno());
        System.out.println("ANO ENTRADA: "+ getAnoEntrado());
        System.out.println("PRAZO: "+ getPrazo());
        System.out.println("TIPO: "+ getTipo());

    }
    
}
