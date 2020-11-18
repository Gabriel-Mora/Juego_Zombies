package zombis;

/**
 *
 * @author gmora
 */
public class Armas {
    private int alcance;
    private int daño;
    private int ruido;
    
    public Armas(int alcance,int daño,int ruido){
        this.alcance = 30;
        this.daño = 40;
        this.ruido = 0; 
    }

            
    public int getAlcance(){
        return alcance;
    }
    public int getDano(){
        return daño;
    }
    public int getRuido(){
        return ruido;
    }
    
}
