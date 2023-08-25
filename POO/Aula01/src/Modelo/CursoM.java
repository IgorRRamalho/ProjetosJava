package Modelo;

public class CursoM {
    private String nome;
    private char turno;
    private int grade;
    private int CargaHoraria;
    private int HorasComp;

    


    public CursoM(String nome, char turno, int grade, int cargaHoraria, int horasComp) {
        this.nome = nome;
        this.turno = turno;
        this.grade = grade;
        this.CargaHoraria = cargaHoraria;
        this.HorasComp = horasComp;
    }

  

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public char getTurno() {
        return turno;
    }



    public void setTurno(char turno) {
        this.turno = turno;
    }



    public int getGrade() {
        return grade;
    }



    public void setGrade(int grade) {
        this.grade = grade;
    }



    public int getCargaHoraria() {
        return CargaHoraria;
    }



    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }



    public int getHorasComp() {
        return HorasComp;
    }



    public void setHorasComp(int horasComp) {
        HorasComp = horasComp;
    }



    public void ImprimeCurso() {

        System.out.println("--------------------DADOS DO CURSO--------------------");
        System.out.println("NOME->" + getTurno());
        System.out.println("TURNO->" + getTurno());
        System.out.println("GRADE->" + getGrade());
        System.out.println("CARGA HORÁRIA->" + getCargaHoraria());
        System.out.println("HORAS ATIVIDADES COMPLEMENTARES->" + getHorasComp());

      
    }


}


