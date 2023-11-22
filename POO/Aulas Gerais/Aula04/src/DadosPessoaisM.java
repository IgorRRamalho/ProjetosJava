public class DadosPessoaisM {

    private int rg;
    private String pnome;
    private char sexo;
    private String dataNascimento;
    
    
    
    public DadosPessoaisM(int rg, String pnome, char sexo, String dataNascimento) {
        this.rg = rg;
        this.pnome = pnome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }
    
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public String getPnome() {
        return pnome;
    }
    public void setPnome(String pnome) {
        this.pnome = pnome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    
}
