
package model;

/**
 *
 * @author vitoria
 */
public class peso {
    private int idpeso;
    private int pesoCache;
    private int pesoArm;
    private int pesoBat;
    private int pesoRam;
    private int pesoMIPS;
    private int pesoCPU;
    private String idcoletor;

    public peso(int idpeso, int pesoCache, int pesoArm, int pesoBat, int pesoRam, int pesoMIPS, int pesoCPU, String idcoletor) {
        this.idpeso = idpeso;
        this.pesoCache = pesoCache;
        this.pesoArm = pesoArm;
        this.pesoBat = pesoBat;
        this.pesoRam = pesoRam;
        this.pesoMIPS = pesoMIPS;
        this.pesoCPU = pesoCPU;
        this.idcoletor = idcoletor;
    }


    public peso(){
        
    }

    public int getIdpeso() {
        return idpeso;
    }

    public void setIdpeso(int idpeso) {
        this.idpeso = idpeso;
    }
    
    public int getPesoCache() {
        return pesoCache;
    }

    public void setPesoCache(int pesoCache) {
        this.pesoCache = pesoCache;
    }

    public int getPesoArm() {
        return pesoArm;
    }

    public void setPesoArm(int pesoArm) {
        this.pesoArm = pesoArm;
    }

    public int getPesoBat() {
        return pesoBat;
    }

    public void setPesoBat(int pesoBat) {
        this.pesoBat = pesoBat;
    }
    
    public int getPesoRam() {
        return pesoRam;
    }

    public void setPesoRam(int pesoRam) {
        this.pesoRam = pesoRam;
    }
    
    public int getPesoMIPS() {
        return pesoMIPS;
    }

    public void setPesoMIPS(int pesoMIPS) {
        this.pesoMIPS = pesoMIPS;
    }

    public int getPesoCPU() {
        return pesoCPU;
    }

    public void setPesoCPU(int pesoCPU) {
        this.pesoCPU = pesoCPU;
    }

    public String getIdcoletor() {
        return idcoletor;
    }

    public void setIdcoletor(String idcoletor) {
        this.idcoletor = idcoletor;
    }
    
}
