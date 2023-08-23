
package pericles;

public class Fila {
    public Pessoa vPessoa[];
    public int cont;
    public int qtdPessoa;
    public Fila(){
        int tam = Input.readInt("Digite o tamanho do vetor: ");
        vPessoa = new Pessoa[tam];
    }
    public void insere(){
        if(qtdPessoa<vPessoa.length){
            vPessoa[qtdPessoa++]= new Pessoa();            
            System.out.println("Inserção concluída");
        
        }
        else
            System.out.println("Vetor sem espaço!");
    }
    public void filo(){
        if(qtdPessoa>0){
           qtdPessoa--;
           
        }else{
            System.out.println("\n\tVetor vazio!");
        }
    }
    
     public void removeesc(){
    
        if(qtdPessoa>0){
            int nr = Input.readInt("Qual indice remover ->");
            for(int i=nr;i<qtdPessoa;i++){
                vPessoa[i-1]=vPessoa[i];
            }
            qtdPessoa--;
           
        }else{
            System.out.println("\n\tVetor vazio!");
        }
    }

    public void removefifo(){
        if(qtdPessoa>0){
            for(int i=1;i<qtdPessoa;i++)
                vPessoa[i-1]=vPessoa[i];
            qtdPessoa--;
            System.out.println("Remoção concluída");
        }else{
            System.out.println("Vetor vazio!");
        }
    }
    
    
    public void imprime(){
        for(int i=0;i<qtdPessoa;i++){
            vPessoa[i].imprime();
        }            
    }
}
