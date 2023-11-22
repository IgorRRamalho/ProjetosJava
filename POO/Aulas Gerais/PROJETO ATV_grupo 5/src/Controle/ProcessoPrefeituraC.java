package Controle;

import java.util.ArrayList;

import Modelo.Alvará;
import Modelo.Arquitetonico;
import Modelo.ProcessoPrefeitura;

public class ProcessoPrefeituraC {
   
   public ArrayList<ProcessoPrefeitura> CadProcesso;
    
   public void CadastroProcesso(ProcessoPrefeitura processoPrefeitura){
        CadProcesso.add(processoPrefeitura);
        
      }

    public void BuscaProcesso(int Registro){
        for(int i=0;i<=CadProcesso.size();i++){
            if(CadProcesso.get(i).getRegistro()==Registro){
                CadProcesso.get(i).ImpressãoProcesso();
                
            }
        }
        
    }
   

   public static void main(String[] args) throws Exception {

    ProcessoPrefeituraC controle = new ProcessoPrefeituraC();
    
    Arquitetonico testeArq = new Arquitetonico(10, -10, (float) 23.5, "1:25", 69, 17, 20);
    Alvará Alves = new Alvará(13, 24, 123456, "Sobrado", "Giovaina", -10, 49);
    ProcessoPrefeitura teste = new ProcessoPrefeitura(1, true, "10/09/2004", null, false, Alves, testeArq);

    Alves.ValidaArea();
    Alves.ImpressãoAlvara();
    teste.AberturaProcesso();
    teste.ImpressãoProcesso();
    controle.CadastroProcesso(teste);
    controle.BuscaProcesso(1);
   

    




    }
}
