
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.coletor;

/**
 *
 * @author vitoria
 * No Coletor é necessário creat,read
 */
public class ColetorDAO {
    public static void main(String args[]){
        
//        coletor colet = new coletor();
//        new ColetorDAO().create("16","26","36","46","56","66","7","86");
        
        
//        colet.setNomeFog("nome");
//        colet.setCPU("12");
//        colet.setMIPS("2");
//        colet.setRAM("1");
//        colet.setCORE("7");
//        colet.setDISC("5");
//        colet.setCACHE("6");
//        new ColetorDAO().create(colet);
        
    }
    
    public int create(String nomeFog , String CPU , String MIPS , String RAM , String BAT , String CORE , String DISC , String CACHE){
        try(Connection conn = new ConectaDB_MySQL().getConexao()){
            String sql = "INSERT INTO coletor(nomeFog , CPU , MIPS , RAM , BAT , CORE , DISC , CACHE ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ?)";
            PreparedStatement comando = conn.prepareStatement(sql);
//            comando = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, nomeFog);
            comando.setString(2, CPU);
            comando.setString(3, MIPS);
            comando.setString(4, RAM);
            comando.setString(5, BAT);
            comando.setString(6, CORE);
            comando.setString(7, DISC);
            comando.setString(8, CACHE);
            
            comando.execute();
            
//            ResultSet rs = comando.getGeneratedKeys();
//            rs.next();
//            if(rs.getInt(1) >0){
//                return rs.getInt(1);
//            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    
    public boolean create (coletor Coletor){
        try(Connection conn =new ConectaDB_MySQL().getConexao() ){
            String sql = " INSERT INTO coletor(nomeFog , CPU , MIPS , RAM , BAT , CORE , DISC , CACHE ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ?);";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, Coletor.getNomeFog());
            pre.setString(2, Coletor.getCPU());
            pre.setString(3, Coletor.getMIPS());
            pre.setString(4, Coletor.getRAM());
            pre.setString(5, Coletor.getBAT());
            pre.setString(6, Coletor.getCORE());
            pre.setString(7, Coletor.getDISC());
            pre.setString(8, Coletor.getCACHE());
            
            if(pre.executeUpdate()> 0){
                return true;
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(coletor Coletor){
        try(Connection conn = new ConectaDB_MySQL().getConexao()){
            String sql= " UPDATE coletor"
                    + " SET nomeFog = ? , CPU = ? , MIPS = ? , RAM = ? , BAT = ? , CORE = ? , DISC = ? , CACHE = ?"
                    + " WHERE nomeFog = ? ";
        }catch(SQLException e ){
            e.printStackTrace();
        }
        return false;
    }

}
