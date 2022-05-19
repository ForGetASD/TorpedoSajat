
package torpedoegyszem;

import java.util.Random;

public class Hajo {
    private int[] pozicio = new int[3];

    public Hajo(){
        
    }
    
    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }
    
    public int[] feltolt(){
        int[] tomb = new int[3];
        Random rnd = new Random();
        int hajohelye = rnd.nextInt((7-3)+1)+1;
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = hajohelye+i;
        }
        return tomb;
    }
    
    public String talalat(int poz){
        return "talált";
    }
}
