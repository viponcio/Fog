
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.latencia;


/**
 *
 * @author vitoria
 */
public class latenciaDAO {
    public static void main(String args[]){
        latencia l = new latencia();
        new latenciaDAO().create(16, 1, 21, 15);
    }
    public int create(int idlatencia, float Fogx, float Fogn, float distancia){
        try(Connection conn = new ConectaDB_MySQL().getConexao()){
            String sql = " INSERT INTO latencia( idlatencia , Fogx , Fogn , distancia ) "
                    + " VALUES ( ? , ? , ? ,? );";
            PreparedStatement comando = conn.prepareStatement(sql);
//            comando = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setInt(1, idlatencia);
            comando.setFloat(2, Fogx);
            comando.setFloat(3, Fogn);
            comando.setFloat(4, distancia);
            
            comando.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
}
