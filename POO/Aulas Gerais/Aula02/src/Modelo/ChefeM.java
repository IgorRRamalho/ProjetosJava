package Modelo;

public class ChefeM extends EmpregadoM{
    private float salario;
    
    
    
    public ChefeM(int rf, String dataContratação, float salario) {
        super(rf, dataContratação);
        this.salario = salario;
    }



    public float getSalario() {
        return salario;
    }



    public void setSalario(float salario) {
        this.salario = salario;
    }



    @Override
    public float salario() {
        return salario;
    }

    
}
