package logic;

/**
 *
 * @author felipe.correia
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConnection {
    
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://localhost:1433/PROGWEB_PROJETO";
    private static final String USER = "root";
    private static final String PASS = "";
    
    
    public static Connection getSQLConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao criar a conexão!", ex);
        }
    }
    
    public static void closeConnection(Connection conn){
        if(conn != null){        
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

