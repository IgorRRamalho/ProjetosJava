package Aluno;

import Controle.AlunoC;
import Controle.AlunoPosGradC;
import Modelo.AlunoM;
import Modelo.AlunoPosGradM;
import Modelo.CursoM;

public class TadsAluno {
    public static void main(String[] args) throws Exception {
        

        
        
        CursoM tads= new CursoM("TADS", 'N', 6, 1000, 180);
        CursoM ec= new CursoM("Eng Comp", 'M', 8, 1000, 220);
        
       // AlunoM alex=new AlunoM(191807, "07341691166", "IGOR ROSA RAMALHO", 18, 'M', 2, tads);
       // AlunoM jao= new AlunoM(191807, "07341691166", "IGOR ROXO RAMALHO", 18, 'M', 2, ec);
        //AlunoC controleAluno = new AlunoC();
        AlunoPosGradC controlePos = new AlunoPosGradC();
       

    
        AlunoPosGradM aluno1 = new AlunoPosGradM(191807, "07341691166", "Igor", 18, 'M', 2, tads, "Pedro", 'S', 2015, 2, 'S');
      
        controlePos.RemoveAluPos(191807);

        controlePos.ListaGeralAlunoPosGradM();

        

    }
}
