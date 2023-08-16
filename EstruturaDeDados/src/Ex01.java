import java.util.Scanner;


public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);


        int na, i, p;
        System.out.println("--------------------------------");
        System.out.print("Número de alunos ->");
        na = leitor.nextInt();
        float notas[]= new float[na];
        float temp[]= new float[na];


        for(i=0; i<na; i++){
            System.out.println("\n--------------------------------");
            System.out.printf("ALUNO %d",i+1);
            temp[0] = 0;
            temp[1] = 0;
            for(p=0; p<2; p++){
              
                System.out.printf("\nNota do aluno na prova %d ->",p+1);
                temp[p] = leitor.nextFloat();              
            }
            notas[i] = (temp[0] + temp[1])/2;
        }

        for(i=0; i<na; i++){
            if(notas[i]>=6){
                System.out.printf("\nO aluno %d foi acima da média(%.2f)", i+1, notas[i]);
            }
        }
    }
}
