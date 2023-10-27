package Empresa;

import java.sql.ResultSet;
import Controle.BancoDeDados;
import Controle.CursoC;
import Modelo.CursoM;
import Visao.CursoV;

public class Empresa {
    public static void main(String[] args) throws Exception {
        

      BancoDeDados db =  new BancoDeDados();

      CursoC controle = new CursoC();
      

  
      CursoV alou = new CursoV();
      alou.setVisible(true);



      

    }
}
