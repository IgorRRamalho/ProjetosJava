package Modelo;

public class ColaboradorM {

    private int id;
    private String nome, CPF;
    private float salario;
    
    
    
    
    public ColaboradorM(int id, String nome, String CPF, float salario) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCPF() {
        return CPF;
    }



    public void setCPF(String cPF) {
        CPF = cPF;
    }



    public float getSalario() {
        return salario;
    }



    public void setSalario(float salario) {
        this.salario = salario;
    }


    public float salario(){
        return this.salario=1320;
    }

    
    public float salario(float beneficio){
        //Adicionando um valor (500 reais) referente a família
        return this.salario=this.salario+500;
    }
    
    /**
     * @param beneficio
     * @param PlanoDeSaude
     * @return
     */
    public float salario(float beneficio, float PlanoDeSaude){
        return this.salario=this.salario+beneficio+PlanoDeSaude;
    }



}




