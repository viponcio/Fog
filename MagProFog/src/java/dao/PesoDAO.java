
package dao;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.peso;

/*
 * @author vitoria
 */
public class PesoDAO {
    public static void main(String args[]){
//        peso p = new peso();
//        
//        p.setIdpeso(2);
//        p.setPesoCache(5);
//        p.setPesoCache(5);
//        p.setPesoArm(5);
//        p.setPesoBat(5);
//        p.setPesoRam(5);
//        p.setPesoMIPS(5);
//        p.setPesoCPU(5);
//        p.setIdcoletor("11");
//        new PesoDAO().create(p);
        
//        new PesoDAO().create(1,1, 1, 1, 1, 1, 1, "1");
    }

    public boolean create(peso p){
        try(Connection conn=new ConectaDB_MySQL().getConexao()){
            String sql = " INSERT INTO peso( idpeso, pesoCache , pesoArm , pesoBat, pesoRam , pesoMIPS , pesoCPU , idcoletor ) "
                    + " VALUES (?, ? , ? ,? , ? , ? , ? , ? ) ";
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setInt(1, p.getIdpeso());
            pre.setInt(2, p.getPesoCache());
            pre.setInt(3, p.getPesoArm());
            pre.setInt(4, p.getPesoBat());
            pre.setInt(5, p.getPesoRam());
            pre.setInt(6, p.getPesoMIPS());
            pre.setInt(7, p.getPesoCPU());
            pre.setString(8, p.getIdcoletor());
            
            
            System.out.println("entrou aqui");
            if(pre.executeUpdate()>0){
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        } 
        return false;
    }
    
    
    public int create(int idpeso,int pesoCache, int pesoArm, int pesoBat , int pesoRam , int pesoMIPS, int pesoCPU, String idcoletor){
        try(Connection conn = new ConectaDB_MySQL().getConexao()){
            String sql = " INSERT INTO peso(idpeso , pesoCache , pesoArm , pesoBat , pesoRam , pesoMIPS , pesoCPU , idcoletor ) "
                    + " VALUES ( ? ,? , ? , ? , ? , ? , ? , ?);";
            PreparedStatement comando = conn.prepareStatement(sql);
//            comando = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setInt(1, idpeso);
            comando.setInt(2, pesoCache);
            comando.setInt(3,pesoArm );
            comando.setInt(4, pesoBat);
            comando.setInt(5, pesoRam);
            comando.setInt(6, pesoMIPS);
            comando.setInt(7, pesoCPU);
            comando.setString(8, idcoletor);
            
            comando.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
}
