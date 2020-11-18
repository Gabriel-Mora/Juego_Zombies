package zombis;

/**
 *
 * @author gmora
 */
public class Zombis2 extends Zombis{
    private boolean doble_acc;
    public Zombis2(int vida,int dano, boolean ruido, int vision,int doble_acc){
        super(vida, dano, ruido, vision);
        this.doble_acc= true;
    }
    
    
    public boolean getAcc(){
        return doble_acc;
    }
}
