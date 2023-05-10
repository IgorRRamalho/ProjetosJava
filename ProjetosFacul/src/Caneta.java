import java.util.Scanner;

public class Caneta{
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void pedindoinfo(){
        System.out.print("Qual o modelo da caneta ->");
        this.modelo = leitor.nextLine();
        
        System.out.println("Está tampada? ->");
        this.tampada = leitor.nextLine();
        
        System.out.println("Qual a ponta da caneta ->");
        this.ponta = leitor.nextLine();
        
        System.out.println("Qual a carga da caneta ->");
        this.carga = leitor.nextLine();
        
        System.out.println("Qual a cor da caneta ->");
        this.cor = leitor.nextLine();

    }
    
    
    
    void status(){
        System.out.print( "Uma caneta -> "+ this.cor);
        System.out.println("Está tampada? ->" + this.tampada);
        System.out.println("Ponta da caneta ->"+ this.ponta);
        System.out.println("Carga da caneta ->"+ this.carga);
        System.out.println("Modelo da caneta ->"+ this.modelo);
    }
    
    
    void rabiscar(){
    }

    void tampar(){
    }
    
    void destamapar(){
    }
}
