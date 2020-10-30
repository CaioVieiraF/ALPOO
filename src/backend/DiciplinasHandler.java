package backend;

import javax.swing.*;
import java.sql.*;
import java.util.Arrays;

public class DiciplinasHandler {

    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost:3306/faculdade";
//    static final String DB_URL = "jdbc:mariadb://18.231.167.221/faculdade?user=alpoo?password=password";

    //  Credenciais do banco
    static final String USER = "alpoo";
    static final String PASS = "password";

    public void cadastrarDiciplina(JTextField nmDisciplina, JTextField cargaHoraria, int selection){
        Connection conn = null;
        Statement stmt = null;
        try {
            // Registro do driver
            Class.forName(JDBC_DRIVER);

            // Abrindo conexão
            System.out.println("Conectando com o banco de dados...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Conectado com sucesso");

            // Queries
            System.out.println("Inserindo dados na tabela ...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO diciplinas"
                    + "VALUES("
                    + nmDisciplina.getText() + ","
                    + cargaHoraria.getText() + ","
                    + selection
                    + ");";

            stmt.executeUpdate(sql);
        } catch (Exception se) {
            se.printStackTrace();
        }
        finally {
            // Fechando conexões
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException ignored) {

            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public void getDiciplinas(Diciplina[] returnVal){
        Connection conn = null;
        Statement stmt = null;
        try {
            // Registro do driver
            Class.forName(JDBC_DRIVER);

            // Abrindo conexão
            System.out.println("Conectando com o banco de dados...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Conectado com sucesso");

            // Queries
            System.out.println("Inserindo dados na tabela ...");
            stmt = conn.createStatement();

            String sql = "SELECT * FROM diciplinas ORDER BY nome";

            ResultSet diciplinasQuery =  stmt.executeQuery(sql);
            Diciplina[] diciplinas = {};

            while(diciplinasQuery.next()){
                Diciplina diciplina = new Diciplina();

                diciplina.cargaHoraria = diciplinasQuery.getInt("carga_horaria");
                diciplina.id = diciplinasQuery.getInt("id");
                diciplina.dias = diciplinasQuery.getInt("dias");
                diciplina.nome = diciplinasQuery.getString("nome");

                diciplinas = Arrays.copyOf(diciplinas, diciplinas.length + 1);
                diciplinas[diciplinas.length - 1] = diciplina;
            }

            returnVal = diciplinas;
        } catch (Exception se) {
            se.printStackTrace();
        }
        finally {
            // Fechando conexões
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException ignored) {

            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}