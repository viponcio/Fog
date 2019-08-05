package model;

/**
 *
 * @author vitoria
 */
public class coletor {
    private String nomeFog;
    private String CPU;
    private String MIPS;
    private String RAM;
    private String BAT;
    private String CORE;
    private String DISC;
    private String CACHE;

    public coletor(String nomeFog , String CPU , String MIPS , String RAM , String BAT , String CORE , String DISC , String CACHE) {
        this.nomeFog = nomeFog;
        this.CPU = CPU;
        this.MIPS = MIPS;
        this.RAM = RAM;
        this.BAT = BAT;
        this.CORE = CORE;
        this.DISC = DISC;
        this.CACHE = CACHE;
    }
    
    public coletor(){
        
    }

    public String getNomeFog() {
        return nomeFog;
    }

    public void setNomeFog(String nomeFog) {
        this.nomeFog = nomeFog;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMIPS() {
        return MIPS;
    }

    public void setMIPS(String MIPS) {
        this.MIPS = MIPS;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getBAT() {
        return BAT;
    }

    public void setBAT(String BAT) {
        this.BAT = BAT;
    }

    public String getCORE() {
        return CORE;
    }

    public void setCORE(String CORE) {
        this.CORE = CORE;
    }

    public String getDISC() {
        return DISC;
    }

    public void setDISC(String DISC) {
        this.DISC = DISC;
    }

    public String getCACHE() {
        return CACHE;
    }

    public void setCACHE(String CACHE) {
        this.CACHE = CACHE;
    }

    
    
     
}
