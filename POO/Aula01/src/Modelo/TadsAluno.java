package Modelo;
public class TadsAluno {
    public static void main(String[] args) throws Exception {
        

        AlunoM alex=new AlunoM(191807, "07341691166", "IGOR ROSA RAMALHO", 18, 'M', 2);

         alex.setRa(1);
        alex.setCpf("111.222.333-44");
        alex.setCodCurso(01);
        alex.setIdade(20);
        alex.setNome("Humano");
        alex.setSexo('H');

        
       
        System.out.println(alex.getIdade());

        

    }
}
