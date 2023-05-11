import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Caneta{
    Scanner leitor = new Scanner(System.in);

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    String estado;
    
    void pedindoinfo(){
        
        
        System.out.print("Está tampada? ->");
        this.tampada = leitor.nextBoolean();
        
        System.out.print("Qual a ponta da caneta ->");
        this.ponta = leitor.nextFloat();
        
        System.out.print("Qual a carga da caneta ->");
        this.carga = leitor.nextInt();
        
        System.out.print("Qual a cor da caneta ->");
        this.cor = leitor.nextLine();
        
        System.out.print("Qual o modelo da caneta ->");
        this.modelo = leitor.nextLine();

        System.out.print("A caneta é nova? ->");
        this.estado = leitor.nextLine();

    }
    
    void status(){
        System.out.println( "------------------xxxxxxxxx----------------xxxxxxxxx----------");
        System.out.println( "Cor da Caneta -> "+ this.cor);
        System.out.println("Está tampada? ->" + this.tampada);
        System.out.println("Ponta da caneta ->"+ this.ponta);
        System.out.println("Carga da caneta ->"+ this.carga);
        System.out.println("Modelo da caneta ->"+ this.modelo);
        System.out.println("A caneta é nova ->"+ this.estado);
    }  
   
    void rabiscar(){
        if(this.tampada== true){
            System.out.println("A caneta está fechada");
        }
        else{
            System.out.println("A caneta está rabiscando");
            carga = carga - 1;
        }
    }

    void tampar(){
        tampada = true;
    }
    
    void destamapar(){
        tampada = false;
    }
}
