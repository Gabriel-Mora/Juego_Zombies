package zombis;

/**
 *
 * @author gmora
 */
public class Peronsaje2 extends Personajes {
    Armas arma = new Armas(0,0,0);
    private boolean dobleAcc;
    private boolean evitar;
    private int dobleDano;
    public Peronsaje2(int vida, int ataque, int nivel, int vision, int movimiento,boolean dobleAcc, boolean evitar, int dobleDano) {
    super(vida, ataque, nivel, vision, movimiento);
    this.dobleAcc = true;
    this.evitar = true;
    this.dobleDano = arma.getDano()*2;
    }
    public boolean getDobleAcc(){
       return dobleAcc;
   }
    public boolean getEvitar(){
       return evitar;
   }
   public int dobleDano(){
       return dobleDano;
   }
    
    
}
