
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.monitoramento;

/**
 *
 * @author vitoria
 */
public class monitoramentoDAO {
    public static void main(String args[]){
        monitoramento m = new monitoramento();
        new monitoramentoDAO().create(35 ,"84", "31", 16 , "13");
                
    }
    public int create(int idmonitoramento , String cpu, String mips, int idLatencia ,String monitoramentocol){
        try(Connection conn = new ConectaDB_MySQL().getConexao()){
            String sql = " INSERT INTO monitoramento( idmonitoramento ,cpu , mips , idLatencia , monitoramentocol) "
                    + " VALUES ( ? , ? , ? , ? , ?);";
            PreparedStatement comando = conn.prepareStatement(sql);
//            comando = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setInt(1, idmonitoramento);
            comando.setString(2, cpu);
            comando.setString(3, mips);
            comando.setInt(4, idLatencia);
            comando.setString(5, monitoramentocol);
            
            comando.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
}
