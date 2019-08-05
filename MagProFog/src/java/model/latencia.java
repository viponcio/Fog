
package model;

/**
 *
 * @author vitoria
 */
public class latencia {
    private int idlatencia;
    private float Fogx;
    private float Fogn;
    private float distancia;

    public latencia(int idlatencia, float Fogx, float Fogn, float distancia) {
        this.idlatencia = idlatencia;
        this.Fogx = Fogx;
        this.Fogn = Fogn;
        this.distancia = distancia;
    }

    public latencia(){
        
    }
    
    public int getIdlatencia() {
        return idlatencia;
    }

    public void setIdlatencia(int idlatencia) {
        this.idlatencia = idlatencia;
    }

    public float getFogx() {
        return Fogx;
    }

    public void setFogx(float Fogx) {
        this.Fogx = Fogx;
    }

    public float getFogn() {
        return Fogn;
    }

    public void setFogn(float Fogn) {
        this.Fogn = Fogn;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    
    
    
}
