
package model;

/**
 *
 * @author vitoria
 */
public class monitoramento {
    private int idmonitoramento;
    private String cpu;
    private String mips;
    private int idLatencia;
    private String monitoramentocol;

    public monitoramento(int idmonitoramento,String cpu, String mips, int idLatencia, String monitoramentocol) {
        this.idmonitoramento = idmonitoramento;
        this.cpu = cpu;
        this.mips = mips;
        this.idLatencia = idLatencia;
        this.monitoramentocol = monitoramentocol;
    }

    public monitoramento(){
        
    }

    public int getIdmonitoramento() {
        return idmonitoramento;
    }

    public void setIdmonitoramento(int idmonitoramento) {
        this.idmonitoramento = idmonitoramento;
    }
    
    
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMips() {
        return mips;
    }

    public void setMips(String mips) {
        this.mips = mips;
    }

    public int getIdLatencia() {
        return idLatencia;
    }

    public void setIdLatencia(int idLatencia) {
        this.idLatencia = idLatencia;
    }

    public String getMonitoramentocol() {
        return monitoramentocol;
    }

    public void setMonitoramentocol(String monitoramentocol) {
        this.monitoramentocol = monitoramentocol;
    }
    
    
    
}
