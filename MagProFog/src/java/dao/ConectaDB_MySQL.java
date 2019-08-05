
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *hostname;127.0.0.1
 * port:3306
 * username:root
 * @author vitoria
 */
public class ConectaDB_MySQL {
    /*    public static void main(String[] args) {
        new ConexaoDB_Postgre().getconexao();
    }

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String HOST = "localhost";
    private static final String PORT = "5432";
    private static final String DB = "estoque";
    private static final String SGBD = "postgresql";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1234";

    private static final String URL = "jdbc" + ":" + SGBD + "://" + HOST + ":" + PORT + "/" + DB;

    public static Connection getconexao() {
        Connection conn = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
    private static final String url="jdbc:mysql://localhost:3306/magprofog?useTimezone=true&serverTimezone=UTC";
    private static final String user = "root";
    private static final String pass = "root";
     
 
    public static void main(String args[]){
        new ConectaDB_MySQL().getConexao();
    }
    
    
    public Connection getConexao(){
        Connection conn = null;
          
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
        }catch (ClassNotFoundException ex) {
            System.out.println(" "+ex);
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
//            ex.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        } 
        return conn;//retorna a conexão
    }
 */
     public static void main(String args[]){
        new ConectaDB_MySQL().getConexao();
    }

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DB = "magprofog";
    private static final String SGBD = "mysql";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String URL = "jdbc" + ":" + SGBD + "://" + HOST + ":" + PORT + "/" + DB + "?useTimezone=true&serverTimezone=UTC";

    public static Connection getConexao() {
        Connection conn = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
    
}
