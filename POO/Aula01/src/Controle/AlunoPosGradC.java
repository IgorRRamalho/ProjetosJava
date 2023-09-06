package Controle;

import java.util.ArrayList;

import Modelo.AlunoM;
import Modelo.AlunoPosGradM;

public class AlunoPosGradC extends AlunoC{
    
    
    public ArrayList<AlunoPosGradM> vetAluno;
    

    public AlunoPosGradC(){

        vetAluno=new ArrayList<AlunoPosGradM>();

    }
    
    
    public void insereAlunoPosGrad(AlunoPosGradM aluno){
        vetAluno.add(aluno);
    }


    public void ListaGeralAlunoPosGradM(){
        for(AlunoM dados: vetAluno){
            dados.ImprimeAtrbutos();
        }
    }


    public void BuscaPorRAPos(int ra){
        for(int i=0; i < vetAluno.size(); i++){
            if(ra == vetAluno.get(i).getRa()){

                System.out.println(" "+vetAluno.get(i).getRa());
            }
        }
    }

    public void RemoveAluPos (int ra){
        for(int i=0; i < vetAluno.size(); i++){
            if(ra == vetAluno.get(i).getRa()){
                vetAluno.remove(i);
            }
        }
    }


}
