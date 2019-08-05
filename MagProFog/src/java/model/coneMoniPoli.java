
package model;
public class coneMoniPoli {
    private int idconeMoniPoli;
    private int idMoni;
    private int idPoli;

    public coneMoniPoli(int idconeMoniPoli, int idMoni, int idPoli) {
        this.idconeMoniPoli = idconeMoniPoli;
        this.idMoni = idMoni;
        this.idPoli = idPoli;
    }

    public coneMoniPoli(){
        
    }
    
    public int getIdconeMoniPoli() {
        return idconeMoniPoli;
    }

    public void setIdconeMoniPoli(int idconeMoniPoli) {
        this.idconeMoniPoli = idconeMoniPoli;
    }

    public int getIdMoni() {
        return idMoni;
    }

    public void setIdMoni(int idMoni) {
        this.idMoni = idMoni;
    }

    public int getIdPoli() {
        return idPoli;
    }

    public void setIdPoli(int idPoli) {
        this.idPoli = idPoli;
    }
    
    
}
