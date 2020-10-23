package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DiciplinasHandler {

    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://18.231.167.221/faculdade";
//    static final String DB_URL = "jdbc:mariadb://18.231.167.221/faculdade?user=alpoo?password=password";

    //  Credenciais do banco
    static final String USER = "alpoo";
    static final String PASS = "password";

    public void cadastrarDiciplina(){
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

            String sql = "INSERT INTO diciplinas VALUES("
                    + "'Matemática'"
                    + "80"
                    + "4"
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
}
