package Modelo;

public class AlunoM {

    private int ra;
    private String cpf;
    private String nome;
    private int idade;
    private char sexo;
    private int codCurso;
    private CursoM curso;

    public void AlunoM() {
        ra = 0;
        cpf = "";
        nome = "";
        idade = 0;
        sexo = 0;
        codCurso = 0;
        curso=null;
    }

    public AlunoM(int ra, String cpf, String nome, int idade, char sexo, int codCurso, CursoM curso) {
        this.ra = ra;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.codCurso = codCurso;
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra2) {
        this.ra = ra2;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public void ImprimeAtrbutos() {

        System.out.println("-----------------------------------------------------");
        System.out.println("RA->" + getRa());
        System.out.println("CPF->" + getCpf());
        System.out.println("NOME->" + getNome());
        System.out.println("SEXO->" + getSexo());
        System.out.println("IDADE->" + getIdade());
        System.out.println("CURSO->" + getCodCurso());
        this.curso.ImprimeCurso();
    }



}
