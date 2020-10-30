package backend;

import javax.swing.*;
import java.sql.*;
import java.util.Arrays;

public class DiciplinasHandler {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/faculdade";
//    static final String DB_URL = "jdbc:mariadb://18.231.167.221/faculdade?user=alpoo?password=password";

    //  Credenciais do banco
    static final String USER = "root";
    static final String PASS = "root";

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

            String sql = "INSERT INTO disciplinas "
                    + "VALUES(default,'"
                    + nmDisciplina.getText() + "',"
                    + cargaHoraria.getText() + ","
                    + selection
                    + ");";

            stmt.executeUpdate(sql);
            System.out.println("Inserido com sucesso!");
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

    public Diciplina[] getDiciplinas(){
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
            System.out.println("Coletando dados na tabela ...");
            stmt = conn.createStatement();

            String sql = "SELECT * FROM disciplinas ORDER BY nome";

            ResultSet diciplinasQuery =  stmt.executeQuery(sql);
            Diciplina[] diciplinas = {};

            while(diciplinasQuery.next()){
                Diciplina diciplina = new Diciplina();

                diciplina.cargaHoraria = diciplinasQuery.getInt("carga");
                diciplina.id = diciplinasQuery.getInt("id");
                diciplina.dias = diciplinasQuery.getInt("dia");
                diciplina.nome = diciplinasQuery.getString("nome");

                diciplinas = Arrays.copyOf(diciplinas, diciplinas.length + 1);
                diciplinas[diciplinas.length - 1] = diciplina;
            }

            return diciplinas;
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
        return null;
    }

    public Diciplina[] getDiciplinas(String nome){
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
            System.out.println("Coletando dados na tabela ...");
            stmt = conn.createStatement();

            String sql = "SELECT * FROM disciplinas WHERE nome like '%" +nome + "%' ORDER BY nome";

            ResultSet diciplinasQuery =  stmt.executeQuery(sql);
            Diciplina[] diciplinas = {};

            while(diciplinasQuery.next()){
                Diciplina diciplina = new Diciplina();

                diciplina.cargaHoraria = diciplinasQuery.getInt("carga");
                diciplina.id = diciplinasQuery.getInt("id");
                diciplina.dias = diciplinasQuery.getInt("dia");
                diciplina.nome = diciplinasQuery.getString("nome");

                diciplinas = Arrays.copyOf(diciplinas, diciplinas.length + 1);
                diciplinas[diciplinas.length - 1] = diciplina;
            }

            return diciplinas;
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
        return null;
    }
}
