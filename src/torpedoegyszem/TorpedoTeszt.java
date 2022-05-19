package torpedoegyszem;

import java.util.Scanner;

public class TorpedoTeszt {

    public static void main(String[] args) {
        Hajo hajo = new Hajo();
        hajo.feltolt();
        //System.out.println(hajo.feltolt()[0]);
    }
    
    public static String tesztLoves(int poz){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg hová szeretne lőni: ");
        poz = sc.nextInt();
        
        return "";
    }
}