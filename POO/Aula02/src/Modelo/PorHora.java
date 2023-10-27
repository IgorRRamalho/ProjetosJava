package Modelo;

public class PorHora {
    private float valorHora;
    private int horasTrab;
    
    public PorHora(float valorHora, int horasTrab) {
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }


    public float salario(){
        return valorHora*horasTrab;
    }


    
    
}
