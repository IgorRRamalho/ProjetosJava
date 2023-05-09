public class Media {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
       
        System.out.print("Escreva o nome do aluno -->");
        String nome = leitor.nextLine();
        System.out.printf("O nome do aluno é --> %s\n", nome);
      
        System.out.print("Digite a nota do aluno na primeira prova -->");
        float prova1 = leitor.nextFloat();
        System.out.printf("\nA nota do Aluno %s foi --> %.2f", nome , prova1);
        
         System.out.print("\nDigite a nota do aluno na segunda prova -->");
        float prova2 = leitor.nextFloat();
        System.out.printf("\nA nota do Aluno %s foi --> %.2f", nome , prova2);
        
         System.out.print("\nDigite a nota do aluno na terceira prova -->");
        float prova3 = leitor.nextFloat();
        System.out.printf("\nA nota do Aluno %s foi --> %.2f", nome , prova3);
        
        System.out.print("\nDigite a nota do aluno na quarta prova -->");
        float prova4 = leitor.nextFloat();
        System.out.printf("\nA nota do Aluno %s foi --> %.2f", nome , prova4);
        
        
        System.out.printf("\n A média das notas foi de --> %f", ((prova1+prova2+prova3+prova4)/4));
    }
}
        