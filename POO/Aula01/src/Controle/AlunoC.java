package Controle;
import java.util.ArrayList;
import Modelo.AlunoM;

public class AlunoC {
    
    public ArrayList<AlunoM> vetAluno;
    

    public AlunoC(){

        vetAluno=new ArrayList<AlunoM>();

    }

    public void InsereAlunoM(AlunoM aluno){

        vetAluno.add(aluno);
        
    }

    public void ListaGeralAlunoM(){
        for(AlunoM dados: vetAluno){
            dados.ImprimeAtrbutos();
            
        }
    }

    
    
     public void BuscaPorRA2(int ra){
        System.out.println(ra);
        int i =0;
        for(AlunoM dados: vetAluno){
            i++;
            int raloop = dados.getRa();
            if(raloop == ra){
                System.out.println("---------------------------");
                System.out.println("RA ENCONTRADO");
                System.out.println("RA ->"+ vetAluno.get(i).getRa());
                
                dados.ImprimeAtrbutos();
                
            }else{
                System.out.println("TESTE");
            }

            
        }
    }

}










