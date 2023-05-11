import java.util.Scanner;

public class AulaCV{
    Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        
        Caneta c1 = new Caneta();
 
        c1.pedindoinfo();

        c1.status();
        int cons = 0;
        while(cons == 0){
            
            System.out.print("\t1- Rabisar com a caneta\t\t2-Tampar a caneta\n\t3-Fechar a caneta\t\t4- Sair das opções");
            System.out.print("Escolha a opção desejada ->");
            int op = leitor.nextInt();
            switch(op){
                case 1:
                    c1.rabiscar();
                    break;
                case 2:
                    c1.tampar();
                    break;
                case 3:
                    c1.destamapar();
                    break;
                case 4:
                    op = 1;
                    break;
            }
        }

    }
}



