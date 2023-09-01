package Controle;

import java.util.ArrayList;

import Modelo.AlunoM;
import Modelo.AlunoPosGradM;

public class AlunoPosGradC extends AlunoC{
    
    
    public ArrayList<AlunoPosGradM> vetAlunoPos;
    

    public AlunoPosGradC(){

        vetAlunoPos=new ArrayList<AlunoPosGradM>();

    }
    
    
    public void insereAlunoPosGrad(AlunoPosGradM aluno){
        vetAlunoPos.add(aluno);
    }


    public void ListaGeralAlunoPosGradM(){
        for(AlunoM dados: vetAlunoPos){
            dados.ImprimeAtrbutos();
        }
    }


    public void BuscaPorRAPos(int ra){
        for(int i=0; i < vetAlunoPos.size(); i++){
            if(ra == vetAlunoPos.get(i).getRa()){

                System.out.println(" "+vetAlunoPos.get(i).getRa());
            }
        }
    }

    public void RemoveAluPos (int ra){
        for(int i=0; i < vetAlunoPos.size(); i++){
            if(ra == vetAlunoPos.get(i).getRa()){
                vetAlunoPos.remove(i);
            }
        }
    }


}
