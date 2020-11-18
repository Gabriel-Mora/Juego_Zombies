package zombis;

/**
 *
 * @author gmora
 */
public class Personajes {
    private int vida;
    private int ataque;
    private int nivel;
    private int vision;
    private int movimiento;
    public Personajes(int vida,int ataque,int nivel, int vision,int movimiento){
        this.vida=200;
        this.ataque=50;
        this.nivel=0;
        this.vision=40;
        this.movimiento = 30;
        
    }
    public void mostrarDatos(){
        System.out.println(vida);
        System.out.println(ataque);
        System.out.println(nivel);
        System.out.println(vision);
        System.out.println(movimiento);
}
    public int getVida(){
        return vida;
    }
    public int getAtaque(){
        return ataque;
    }
    public int getNivel(){
        return nivel;
    }
    public int getVision(){
        return vision;        
    }
    public int getMov(){
        return movimiento;
    }
}



