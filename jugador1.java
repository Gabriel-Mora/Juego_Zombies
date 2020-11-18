package zombis;

/**
 *
 * @author gmora
 */
public class Personaje1 extends Personajes{
   private int rango_mov = 10;
   private boolean escalar;
   private int may_rango_ataque = 5 ;

    public Personaje1(int vida, int ataque, int nivel, int vision,int movimiento,int rango_mov,boolean escalar,int may_rango) {
    super(vida, ataque, nivel, vision,movimiento);
    this.rango_mov= this.rango_mov + getMov();
    this.may_rango_ataque = may_rango_ataque;
    this.escalar=true;
    }

   public void mostrar(){
       System.out.println("La vida del Personaje 1 es: "+ getVida()+"\nEl ataque del Personaje es: "+
              getAtaque()+"\nEl Nivel del Jugador es: "+getNivel()+"\nLa vision del jugador es: "+getVision());
   }
   public int getRango_mov(){
       return rango_mov;
   }
   public boolean getescalar(){
       return escalar;
   }
   public int getRango(){
       return may_rango_ataque;
   }
   
}
