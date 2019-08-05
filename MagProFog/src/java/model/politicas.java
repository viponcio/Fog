
package model;

/**
 *
 * @author vitoria
 */
public class politicas {
    private int idpolitica;
    private String mips;
    private String cpu;

    public politicas(int idpolitica, String mips, String cpu) {
        this.idpolitica = idpolitica;
        this.mips = mips;
        this.cpu = cpu;
    }
    
    public politicas(){
        
    }

    public int getIdpolitica() {
        return idpolitica;
    }

    public void setIdpolitica(int idpolitica) {
        this.idpolitica = idpolitica;
    }

    public String getMips() {
        return mips;
    }

    public void setMips(String mips) {
        this.mips = mips;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    
    
}
