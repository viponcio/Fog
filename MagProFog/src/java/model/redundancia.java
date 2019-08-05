
package model;

/**
 *
 * @author vitoria
 */
public class redundancia {
    private int idredundancia;
    private String coletor;
    private int latencia;

    public redundancia(int idredundancia, String coletor, int latencia) {
        this.idredundancia = idredundancia;
        this.coletor = coletor;
        this.latencia = latencia;
    }

    public redundancia(){
        
    }
    
    public int getIdredundancia() {
        return idredundancia;
    }

    public void setIdredundancia(int idredundancia) {
        this.idredundancia = idredundancia;
    }

    public String getColetor() {
        return coletor;
    }

    public void setColetor(String coletor) {
        this.coletor = coletor;
    }

    public int getLatencia() {
        return latencia;
    }

    public void setLatencia(int latencia) {
        this.latencia = latencia;
    }

    
}
