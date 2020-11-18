package zombis;

/**
 *
 * @author gmora
 */
public class CortoAlcance extends Armas{
    private int rango = 5; 
    private int sonido = 1;
    private int dano = 0;
    
    public CortoAlcance(int alcance, int daño, int ruido, int rango,int sonido,int dano) {
        super(alcance, daño, ruido);
        this.rango= this.rango + getAlcance();
        this.sonido = this.sonido + getRuido();
        this.dano = getDano();
    }
    public int GetRango(){
        return rango;
    }
    public int GetSonido(){
        return sonido;
    }
    public int Getdano(){
        return dano;
    }

    
}
