
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.politicas;

/**
 *
 * @author vitoria
 */
public class politicasDAO {
    public static void main(String args[]){
        politicas p = new politicas();
        new politicasDAO().create(6,"2", "15");
    }
    public int create(int idpolitica, String mips, String cpu){
        try(Connection conn = new ConectaDB_MySQL().getConexao()){
            String sql = " INSERT INTO politicas( idpolitica , mips , cpu ) "
                    + " VALUES ( ? , ? , ?);";
            PreparedStatement comando = conn.prepareStatement(sql);
//            comando = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setInt(1, idpolitica);
            comando.setString(2, mips);
            comando.setString(3, cpu);
            
            comando.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
}
