package logic;

/**
 *
 * @author felipe.correia
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=PROGWEB_PROJETO";
    private static final String USER = "admin";
    private static final String PASS = "admin123";
    
    
    public static Connection getSqlConnection(){
        
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao criar a conexão!", ex);
        }
    }
    
    public static void closeConnection(Connection conn){
        if(conn != null){        
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

