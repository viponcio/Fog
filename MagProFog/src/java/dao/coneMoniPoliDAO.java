
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.coneMoniPoli;

/**
 *
 * @author vitoria
 */
public class coneMoniPoliDAO {
    public static void main(String args[]){
        coneMoniPoli cmp = new coneMoniPoli();
        new coneMoniPoliDAO().create(3, 35 , 6 );
                
    }
    public int create(int idconeMoniPoli , int idMoni ,int idPoli){
        try(Connection conn = new ConectaDB_MySQL().getConexao()){
            String sql = " INSERT INTO coneMoniPoli( idconeMoniPoli ,idMoni , idPoli ) "
                    + " VALUES ( ? , ? , ? );";
            PreparedStatement comando = conn.prepareStatement(sql);
            comando.setInt(1, idconeMoniPoli);
            comando.setInt(2, idMoni);
            comando.setInt(3, idPoli);
            
            comando.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
}
