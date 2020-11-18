package zombis;

/**
 *
 * @author gmora
 */
public class Personaje3 extends Personajes{
    private boolean doblxp;
    private boolean doblcura;
    private boolean arma_ini;
    
    public Personaje3(int vida, int ataque, int nivel, int vision, int movimiento,boolean doblxp,boolean doblcura,boolean arma_ini) {
    super(vida, ataque, nivel, vision, movimiento);
    this.doblxp=true;
    this.doblcura=true;
    this.arma_ini=true;
    }
    
    public boolean GetDoblexp(){
        return doblxp;
    }
    public boolean doblcura(){
        return doblcura;
    }
    public boolean arma_ini(){
        return arma_ini;
    }
    
    
}
