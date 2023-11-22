package Modelo;

public abstract class EmpregadoM {
    

    private int rf;
    private String DataContratação;
   
   
    public EmpregadoM(int rf, String dataContratação) {
        this.rf = rf;
        DataContratação = dataContratação;
    }


    public int getRf() {
        return rf;
    }


    public void setRf(int rf) {
        this.rf = rf;
    }


    public String getDataContratação() {
        return DataContratação;
    }


    public void setDataContratação(String dataContratação) {
        DataContratação = dataContratação;
    }

    public abstract float salario();

    
}
