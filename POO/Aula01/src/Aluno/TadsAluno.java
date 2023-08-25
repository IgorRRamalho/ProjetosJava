package Aluno;

import Controle.AlunoC;
import Modelo.AlunoM;
import Modelo.CursoM;

public class TadsAluno {
    public static void main(String[] args) throws Exception {
        

        
        
        CursoM tads= new CursoM("TADS", 'N', 6, 1000, 180);
        CursoM ec= new CursoM("Eng Comp", 'M', 8, 1000, 220);
        
        AlunoM alex=new AlunoM(191807, "07341691166", "IGOR ROSA RAMALHO", 18, 'M', 2, tads);
        AlunoM jao= new AlunoM(191807, "07341691166", "IGOR ROXO RAMALHO", 18, 'M', 2, ec);
        AlunoC controle = new AlunoC();

        
       
        
        
        //controle.InsereAlunoM(alex);
        //controle.InsereAlunoM(jao);
        //controle.ListaGeralAlunoM();
        
        controle.BuscaPorRA2(191807);
        

    }
}
