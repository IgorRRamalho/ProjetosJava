package Controle;

/* caio nicch
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alexsandro
 */
public class BancoDeDados {
    //Objeto de COnexão com BD
    public Connection conect;
    // Objeto de Consulta SQL
    public Statement state;
    // Objeto com dados SQL
    
    private ResultSet result;

    public void abrirConexao(){
       try
       {
        Class.forName("org.postgresql.Driver");
        conect = DriverManager.getConnection(
               "jdbc:postgresql://localhost:5432/tads","postgres", "1009");
        System.out.println("Conectado ao PostGreSQL++.");        
        }catch(Exception e){
            System.out.println("Falha ao tentar a conexão");
            e.printStackTrace();
        }
       
       try{
           state = conect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);      
       }catch(Exception e){
           System.out.println("Falha no Cursor de Execução");
           e.printStackTrace();
       }
    }
     public Connection getConnection(){
        return conect;
    }
     
    public Statement getStatement(){
        return state;
    }
    
    public void fecharConexao(){
        if(conect != null){
            try{
                conect.close();
                System.out.println("Conexão Postgres FECHADA");
            }catch(SQLException erro){
                erro.printStackTrace();
            }
        }
    }
}
