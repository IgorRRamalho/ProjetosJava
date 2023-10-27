package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {
    // Objeto de Conexão com BD
    public Connection conect;
    // Objeto de Consulta SQL
    public Statement state;
    // Objeto com dados SQL
    private ResultSet result;

    public void abrirConexao() {
        try {
            // Carregue o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabeleça a conexão com o MySQL
            conect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/banco", "root", "igor1010");
            System.out.println("Conectado ao MySQL.");
        } catch (Exception e) {
            System.out.println("Falha ao tentar a conexão");
            e.printStackTrace();
        }

        try {
            state = conect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (Exception e) {
            System.out.println("Falha no Cursor de Execução");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conect;
    }

    public Statement getStatement() {
        return state;
    }

    public void fecharConexao() {
        if (conect != null) {
            try {
                conect.close();
                System.out.println("Conexão MySQL FECHADA");
            } catch (SQLException erro) {
                erro.printStackTrace();
            }
        }
    }
}
