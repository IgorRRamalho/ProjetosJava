package Modelo;

import Controle.AlunoC;

public class TadsAluno {
    public static void main(String[] args) throws Exception {
        

        AlunoM alex=new AlunoM(191807, "07341691166", "IGOR ROSA RAMALHO", 18, 'M', 2);
        AlunoM jao= new AlunoM(191807, "07341691166", "IGOR ROXO RAMALHO", 18, 'M', 2);
        AlunoC controle = new AlunoC();

        
       
        System.out.println(alex.getIdade());
        
        controle.InsereAlunoM(alex);
        controle.InsereAlunoM(jao);
        controle.ListaGeralAlunoM();
        

    }
}
