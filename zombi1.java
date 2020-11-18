package zombis;
/**
 *
 * @author gmora
 */

        
public class Zombi1 extends Zombis{
    private int doble_vida;
    public Zombi1(int vida,int dano, boolean ruido, int vision,int doble_vida){
        super(vida, dano, ruido, vision);
        this.doble_vida= getHp()*2;
    }
    
   public int getdoble(){
    return doble_vida;
   }

   
    
}
