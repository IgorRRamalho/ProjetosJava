package ListasEncadeadas;
public class tipoNo{
	public int info;
	public tipoNo prox, ant;

	
	public tipoNo(){}
	
	
	
	public tipoNo getUlt() {
		return ult;
	}



	public void setUlt(tipoNo ult) {
		this.ult = ult;
	}



	public tipoNo getPri() {
		return pri;
	}



	public void setPri(tipoNo pri) {
		this.pri = pri;
	}



	public void setInfo(int info){
		this.info=info;
	}

	public void setProx(tipoNo prox){
		this.prox=prox;
	}
	
	public int getInfo(){
		return info;
	}
	public tipoNo getProx(){
		return prox;
	}

	
	public tipoNo getAnt() {
		return ant;
	}


	public void setAnt(tipoNo ant) {
		this.ant = ant;
	}

	public void LimpTela(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	
}