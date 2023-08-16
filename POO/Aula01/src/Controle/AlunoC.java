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



}










