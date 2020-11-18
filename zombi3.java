package zombis;

/**
 *
 * @author gmora
 */
public class Zombi3 extends Zombis{
    private int doble_vision;
    public Zombi3(int vida,int dano, boolean ruido, int vision,int doble_vision){
        super(vida, dano, ruido, vision);
        this.doble_vision= getVis()*2;
    }
    public int Getvision(){
        return doble_vision;
        
    }
}
