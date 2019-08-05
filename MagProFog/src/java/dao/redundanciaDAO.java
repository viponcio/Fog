
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.redundancia;

/**
 *NÃO ESTA FINALIZADO POIS TEM UMA CHAVE EXTRANGEIRA
 * @author vitoria
 */
public class redundanciaDAO {
    public static void main(String args[]){
        redundancia p = new redundancia();
        new redundanciaDAO().create(16, "1", 16);
                
    }
    public int create(int idredundancia, String coletor, int latencia){
        try(Connection conn = new ConectaDB_MySQL().getConexao()){
            String sql = " INSERT INTO redundancia( idredundancia , coletor , latencia) "
                    + " VALUES ( ? , ? , ?);";
            PreparedStatement comando = conn.prepareStatement(sql);
//            comando = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setInt(1, idredundancia);
            comando.setString(2, coletor);
            comando.setInt(3, latencia);
            
            comando.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
}
