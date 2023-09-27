package ListaCircular;

public class TipoNo{
	public int info;
	public TipoNo prox, ant;

	
	public TipoNo(){}
	
	
	

	public int getInfo() {
        return info;
    }




    public void setInfo(int info) {
        this.info = info;
    }




    public TipoNo getProx() {
        return prox;
    }




    public void setProx(TipoNo prox) {
        this.prox = prox;
    }




    public TipoNo getAnt() {
        return ant;
    }




    public void setAnt(TipoNo ant) {
        this.ant = ant;
    }



    public void LimpTela(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	
}