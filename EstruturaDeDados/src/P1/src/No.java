package P1.src;

public class No {


	public int info;
	public No prox, ant;
	
	public No(){}
	
	
	
	public void setInfo(int info){
		this.info=info;
	}

	public No getAnt() {
        return ant;
    }



    public void setAnt(No ant) {
        this.ant = ant;
    }



    public void setProx(No prox){
		this.prox=prox;
	}
	
	public int getInfo(){
		return info;
	}
	public No getProx(){
		return prox;
	}

    public void LimpTela(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}


	
}
    


