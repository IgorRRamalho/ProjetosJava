package P1.src;

public class Lista {

    
	public Lista prox, ant, cidades;
    public String rodovia, cidade;

	
	public Lista(){}
	
	
	
	public String getRodovia() {
        return rodovia;
    }



    public void setRodovia(String rodovia) {
        this.rodovia = rodovia;
    }




    public String getCidade() {
        return cidade;
    }



    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



	public Lista getAnt() {
        return ant;
    }


    public void setAnt(Lista ant) {
        this.ant = ant;
    }


    public void setProx(Lista prox){
		this.prox=prox;
	}
	

	public Lista getProx(){
		return prox;
	}

    public void LimpTela(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}



    public void setCidades(Lista cidades) {
        this.cidades = cidades;
    }



    public Lista getCidades() {
        return cidades;
    }




    
}
