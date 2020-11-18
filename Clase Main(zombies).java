package zombis;

/**
 *
 * @author gmora
 */
public class Zombis {
    int vida;
    int dano;
    boolean ruido;
    int vision;
    public Zombis(int vida,int dano,boolean ruido,int vision){
        this.vida=150;
        this.dano=40;
        this.ruido=true;
        this.vision=30;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje1 persona = new Personaje1(0,0,0,0,0,0,false,0);
        persona.mostrar(); 
    }

    public int getHp(){
        return vida;
    }
    public int getdamage(){
        return dano;
    }
    public boolean getSound(){
       return ruido;
    }
    public int getVis(){
        return vision;
    }
    
    
    
}
